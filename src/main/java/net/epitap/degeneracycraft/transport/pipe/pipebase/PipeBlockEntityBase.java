package net.epitap.degeneracycraft.transport.pipe.pipebase;

import net.epitap.degeneracycraft.transport.pipe.parametor.PipeGettingDirection;
import net.epitap.degeneracycraft.transport.pipe.parametor.PipeITickBlockEntity;
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

public abstract class PipeBlockEntityBase extends BlockEntity implements PipeITickBlockEntity {
    @Nullable
    public List<Connection> connectionList;
    protected boolean[] extractingSides;
    protected boolean[] disconnectedSides;
    private int invalidateCountdown;

    public PipeBlockEntityBase(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state) {
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

    public static void detectPipeBlock(Level world, BlockPos pos) {
        List<BlockPos> pipePositions = new ArrayList<>();
        LinkedList<BlockPos> blockPosList = new LinkedList<>();
        Block block = world.getBlockState(pos).getBlock();
        if (!(block instanceof PipeBlockBase pipeBlock)) {
            return;
        }

        PipeBlockEntityBase pipeBlockBlockEntity = pipeBlock.getBlockEntity(world, pos);
        if (pipeBlockBlockEntity != null) {
            for (Direction side : Direction.values()) {
                if (pipeBlockBlockEntity.pipeExtracting(side)) {
                    if (!pipeBlock.enabledConnectTo(world, pos, side)) {
                        pipeBlockBlockEntity.setPipeExtracting(side, false);
                        if (!pipeBlockBlockEntity.hasReasonToStay()) {
                            pipeBlock.setHasData(world, pos, false);
                        }
                        pipeBlockBlockEntity.syncData();
                    }
                }
            }
        }

        pipePositions.add(pos);
        addSerialPipeList(world, pos, pipeBlock, pipePositions, blockPosList);
        while (blockPosList.size() > 0) {
            BlockPos blockPos = blockPosList.removeFirst();
            block = world.getBlockState(blockPos).getBlock();
            if (block instanceof PipeBlockBase) {
                addSerialPipeList(world, blockPos, (PipeBlockBase) block, pipePositions, blockPosList);
            }

        }
        for (BlockPos position : pipePositions) {
            BlockEntity te = world.getBlockEntity(position);
            if (!(te instanceof PipeBlockEntityBase pipe)) {
                continue;
            }
            pipe.connectionList = null;
        }
    }

    private static void addSerialPipeList(Level world, BlockPos pos, PipeBlockBase pipeBlock, List<BlockPos> travelPositions, LinkedList<BlockPos> pipePos) {
        for (Direction direction : Direction.values()) {
            if (pipeBlock.pipeConnected(world, pos, direction)) {
                BlockPos blockPos = pos.relative(direction);
                if (!travelPositions.contains(blockPos) && !pipePos.contains(blockPos)) {
                    travelPositions.add(blockPos);
                    pipePos.add(blockPos);
                }
            }
        }
    }

private void updateList() {
    BlockState blockState = getBlockState();
    if (!(blockState.getBlock() instanceof PipeBlockBase)) {
        connectionList = null;
        return;
    }
    if (!pipeExtracting()) {
        connectionList = null;
        return;
    }

    Map<PipeGettingDirection, Integer> connections = new HashMap<>();

        Map<BlockPos, Integer> posList = new HashMap<>();
        List<BlockPos> pipePositions = new ArrayList<>();

        addPipeList(level, worldPosition, posList, pipePositions, connections, 1);

        while (posList.size() > 0) {
            Map.Entry<BlockPos, Integer> blockPosIntegerEntry = posList.entrySet().stream().findAny().get();
            addPipeList(level, blockPosIntegerEntry.getKey(), posList, pipePositions, connections, blockPosIntegerEntry.getValue());
            pipePositions.add(blockPosIntegerEntry.getKey());
            posList.remove(blockPosIntegerEntry.getKey());
        }

        connectionList = connections.entrySet().stream().map(entry -> new Connection(entry.getKey().getPos(), entry.getKey().getDirection(), entry.getValue())).collect(Collectors.toList());
    }

    public void addPipeList(Level world, BlockPos position, Map<BlockPos, Integer> list, List<BlockPos> travelPositions, Map<PipeGettingDirection, Integer> insertPositions, int distance) {
        Block block = world.getBlockState(position).getBlock();
        if (!(block instanceof PipeBlockBase pipeBlock)) {
            return;
        }
        for (Direction direction : Direction.values()) {
            if (pipeBlock.pipeConnected(world, position, direction)) {
                BlockPos blockPos = position.relative(direction);
                PipeGettingDirection pipeGettingDirection = new PipeGettingDirection(blockPos, direction.getOpposite());
                if (canPipeInsertMode(position, direction)) {
                    if (!insertPositions.containsKey(pipeGettingDirection)) {
                        insertPositions.put(pipeGettingDirection, distance);
                    } else {
                        if (insertPositions.get(pipeGettingDirection) > distance) {
                            insertPositions.put(pipeGettingDirection, distance);
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

    public boolean canPipeInsertMode(BlockPos pos, Direction direction) {
        BlockEntity pipeBlockEntity = level.getBlockEntity(pos);
        if (pipeBlockEntity instanceof PipeBlockEntityBase pipe) {
            if (pipe.pipeExtracting(direction)) {
                return false;
            }
        }

        BlockEntity blockentity = level.getBlockEntity(pos.relative(direction));
        if (blockentity == null) {
            return false;
        }
        if (blockentity instanceof PipeBlockEntityBase) {
            return false;
        }
        return canPipeInsertMode(blockentity, direction.getOpposite());
    }

    public abstract boolean canPipeInsertMode(BlockEntity blockentity, Direction direction);

    @Override
    public void tick() {
        if (invalidateCountdown > 0) {
            invalidateCountdown--;
            if (invalidateCountdown <= 0) {
                connectionList = null;
            }
        }
    }

    public boolean pipeExtracting(Direction side) {
        return extractingSides[side.get3DDataValue()];
    }

    public boolean pipeExtracting() {
        for (boolean extract : extractingSides) {
            if (extract) {
                return true;
            }
        }
        return false;
    }

    public boolean hasReasonToStay() {
        if (pipeExtracting()) {
            return true;
        }
        for (boolean disconnected : disconnectedSides) {
            if (disconnected) {
                return true;
            }
        }
        return false;
    }

    public void setPipeExtracting(Direction side, boolean extracting) {
        extractingSides[side.get3DDataValue()] = extracting;
        setChanged();
    }

    public boolean pipeDisconnected(Direction side) {
        return disconnectedSides[side.get3DDataValue()];
    }

    public void setPipeDisconnected(Direction side, boolean disconnected) {
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