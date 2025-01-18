package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;


import net.epitap.degeneracycraft.transport.bus_port.parametor.PortGettingDirection;
import net.epitap.degeneracycraft.transport.bus_port.parametor.PortITickBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.ByteTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public abstract class PortBlockEntityBase extends BlockEntity implements PortITickBlockEntity {
    @Nullable
    public List<Connection> connectionList;
    protected boolean[] extractingSides;
    protected boolean[] disconnectedSides;
    private int invalidateCountdown;

    public PortBlockEntityBase(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
        extractingSides = new boolean[Direction.values().length];
        disconnectedSides = new boolean[Direction.values().length];
    }

    public List<Connection> getConnection() {
        if (level == null) {
            return new ArrayList<>();
        }
        if (connectionList == null) {
            updateList();
            if (connectionList == null) {
                return new ArrayList<>();
            }
        }
        return connectionList;
    }

    public static void detectPortBlock(Level world, BlockPos pos) {
        List<BlockPos> portPositions = new ArrayList<>();
        LinkedList<BlockPos> blockPosList = new LinkedList<>();
        Block block = world.getBlockState(pos).getBlock();
        if (!(block instanceof PortBlockBase portBlock)) {
            return;
        }

        PortBlockEntityBase portBlockBlockEntity = portBlock.getBlockEntity(world, pos);
        if (portBlockBlockEntity != null) {
            for (Direction side : Direction.values()) {
                if (portBlockBlockEntity.portExtracting(side)) {
                    if (!portBlock.enabledConnectTo(world, pos, side)) {
                        portBlockBlockEntity.setPortExtracting(side, false);
                        if (!portBlockBlockEntity.hasReasonToStay()) {
                            portBlock.setHasData(world, pos, false);
                        }
                        portBlockBlockEntity.syncData();
                    }
                }
            }
        }

        portPositions.add(pos);
        addSerialPortList(world, pos, portBlock, portPositions, blockPosList);
        while (blockPosList.size() > 0) {
            BlockPos blockPos = blockPosList.removeFirst();
            block = world.getBlockState(blockPos).getBlock();
            if (block instanceof PortBlockBase) {
                addSerialPortList(world, blockPos, (PortBlockBase) block, portPositions, blockPosList);
            }

        }
        for (BlockPos position : portPositions) {
            BlockEntity te = world.getBlockEntity(position);
            if (!(te instanceof PortBlockEntityBase port)) {
                continue;
            }
            port.connectionList = null;
        }
    }

    private static void addSerialPortList(Level world, BlockPos pos, PortBlockBase portBlock, List<BlockPos> travelPositions, LinkedList<BlockPos> portPos) {
        for (Direction direction : Direction.values()) {
            if (portBlock.portConnected(world, pos, direction)) {
                BlockPos blockPos = pos.relative(direction);
                if (!travelPositions.contains(blockPos) && !portPos.contains(blockPos)) {
                    travelPositions.add(blockPos);
                    portPos.add(blockPos);
                }
            }
        }
    }

    private void updateList() {
        BlockState blockState = getBlockState();
        if (!(blockState.getBlock() instanceof PortBlockBase)) {
            connectionList = null;
            return;
        }
        if (!portExtracting()) {
            connectionList = null;
            return;
        }

        Map<PortGettingDirection, Integer> connections = new HashMap<>();

        Map<BlockPos, Integer> posList = new HashMap<>();
        List<BlockPos> portPositions = new ArrayList<>();

        addPortList(level, worldPosition, posList, portPositions, connections, 1);

        while (posList.size() > 0) {
            Map.Entry<BlockPos, Integer> blockPosIntegerEntry = posList.entrySet().stream().findAny().get();
            addPortList(level, blockPosIntegerEntry.getKey(), posList, portPositions, connections, blockPosIntegerEntry.getValue());
            portPositions.add(blockPosIntegerEntry.getKey());
            posList.remove(blockPosIntegerEntry.getKey());
        }

        connectionList = connections.entrySet().stream().map(entry -> new Connection(entry.getKey().getPos(), entry.getKey().getDirection(), entry.getValue())).collect(Collectors.toList());
    }

    public void addPortList(Level world, BlockPos position, Map<BlockPos, Integer> list, List<BlockPos> travelPositions, Map<PortGettingDirection, Integer> insertPositions, int distance) {
        Block block = world.getBlockState(position).getBlock();
        if (!(block instanceof PortBlockBase portBlock)) {
            return;
        }
        for (Direction direction : Direction.values()) {
            if (portBlock.portConnected(world, position, direction)) {
                BlockPos blockPos = position.relative(direction);
                PortGettingDirection portGettingDirection = new PortGettingDirection(blockPos, direction.getOpposite());
                if (canPortInsertMode(position, direction)) {
                    if (!insertPositions.containsKey(portGettingDirection)) {
                        insertPositions.put(portGettingDirection, distance);
                    } else {
                        if (insertPositions.get(portGettingDirection) > distance) {
                            insertPositions.put(portGettingDirection, distance);
                        }
                    }
                } else {
                    if (!travelPositions.contains(blockPos) && !list.containsKey(blockPos)) {
                        list.put(blockPos, distance + 1);
                    }
                }
            }
        }
    }

    public boolean canPortInsertMode(BlockPos pos, Direction direction) {
        BlockEntity portBlockEntity = level.getBlockEntity(pos);
        if (portBlockEntity instanceof PortBlockEntityBase port) {
            if (port.portExtracting(direction)) {
                return false;
            }
        }

        BlockEntity blockentity = level.getBlockEntity(pos.relative(direction));
        if (blockentity == null) {
            return false;
        }
        if (blockentity instanceof PortBlockEntityBase) {
            return false;
        }
        return canPortInsertMode(blockentity, direction.getOpposite());
    }

    public abstract boolean canPortInsertMode(BlockEntity blockentity, Direction direction);

    @Override
    public void tick() {
        if (invalidateCountdown > 0) {
            invalidateCountdown--;
            if (invalidateCountdown <= 0) {
                connectionList = null;
            }
        }
    }

    public boolean portExtracting(Direction side) {
        return extractingSides[side.get3DDataValue()];
    }

    public boolean portExtracting() {
        for (boolean extract : extractingSides) {
            if (extract) {
                return true;
            }
        }
        return false;
    }

    public boolean hasReasonToStay() {
        if (portExtracting()) {
            return true;
        }
        for (boolean disconnected : disconnectedSides) {
            if (disconnected) {
                return true;
            }
        }
        return false;
    }

    public void setPortExtracting(Direction side, boolean extracting) {
        extractingSides[side.get3DDataValue()] = extracting;
        setChanged();
    }

    public boolean portDisconnected(Direction side) {
        return disconnectedSides[side.get3DDataValue()];
    }

    public void setPortDisconnected(Direction side, boolean disconnected) {
        disconnectedSides[side.get3DDataValue()] = disconnected;
        setChanged();
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        extractingSides = new boolean[Direction.values().length];
        ListTag extractingList = tag.getList("ExtractingSides", Tag.TAG_BYTE);
        if (extractingList.size() >= extractingSides.length) {
            for (int i = 0; i < extractingSides.length; i++) {
                ByteTag byteTag = (ByteTag) extractingList.get(i);
                extractingSides[i] = byteTag.getAsByte() != 0;
            }
        }

        disconnectedSides = new boolean[Direction.values().length];
        ListTag disconnectedList = tag.getList("DisconnectedSides", Tag.TAG_BYTE);
        if (disconnectedList.size() >= disconnectedSides.length) {
            for (int i = 0; i < disconnectedSides.length; i++) {
                ByteTag byteTag = (ByteTag) disconnectedList.get(i);
                disconnectedSides[i] = byteTag.getAsByte() != 0;
            }
        }
        invalidateCountdown = 5;
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);

        ListTag extractingList = new ListTag();
        for (boolean extractingSide : extractingSides) {
            extractingList.add(ByteTag.valueOf(extractingSide));
        }
        tag.put("ExtractingSides", extractingList);

        ListTag disconnectedList = new ListTag();
        for (boolean disconnected : disconnectedSides) {
            disconnectedList.add(ByteTag.valueOf(disconnected));
        }
        tag.put("DisconnectedSides", disconnectedList);
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

//    public void syncData(ServerPlayer player) {
//        player.connection.send(getUpdatePacket());
//    }

    public void syncData() {
        if (level == null || level.isClientSide) {
            return;
        }
        LevelChunk chunk = level.getChunkAt(getBlockPos());
        ((ServerChunkCache) level.getChunkSource()).chunkMap.getPlayers(chunk.getPos(), false).forEach(e -> e.connection.send(getUpdatePacket()));
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag updateTag = super.getUpdateTag();
        saveAdditional(updateTag);
        return updateTag;
    }

    public record Connection(BlockPos pos, Direction direction, int distance) {
        @Override
        public String toString() {
            return "Connection{" +
                    "pos=" + pos +
                    ", direction=" + direction +
                    ", distance=" + distance +
                    '}';
        }
    }
}