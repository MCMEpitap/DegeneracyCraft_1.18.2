package net.epitap.degeneracycraft.transport.pipe.pipebase;

import net.epitap.degeneracycraft.transport.pipe.basic.energy.BasicEnergyPipeEnergyStorage;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.BasicEnergyPipeType;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.floa.FloatEnergyPipeType;
import net.epitap.degeneracycraft.transport.pipe.basic.item.BasicItemPipeType;
import net.epitap.degeneracycraft.transport.pipe.low.energy.LowEnergyPipeEnergyStorage;
import net.epitap.degeneracycraft.transport.pipe.low.energy.LowEnergyPipeType;
import net.epitap.degeneracycraft.transport.pipe.parametor.PipeItemHandler;
import net.epitap.degeneracycraft.transport.pipe.parametor.PipeSetLazyOptional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PipeWorkBlockEntity extends PipeBlockEntityBase {

    protected PipeTypeBase<?>[] pipeType;
    protected final int[][] index;
    protected PipeSetLazyOptional<PipeItemHandler> itemStored;
    protected PipeSetLazyOptional<BasicEnergyPipeEnergyStorage> basicEnergyStored;
    protected PipeSetLazyOptional<LowEnergyPipeEnergyStorage> lowEnergyStored;
    protected PipeSetLazyOptional<PipeDCIEnergyStorageFloat> floatEnergyStored;
    private int recursionDepth;

    public PipeWorkBlockEntity(BlockEntityType<?> blockEntityType, PipeTypeBase<?>[] pipeType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
        this.pipeType = pipeType;
        index = new int[Direction.values().length][pipeType.length];
        itemStored = new PipeSetLazyOptional<>();
        basicEnergyStored = new PipeSetLazyOptional<>();
        lowEnergyStored = new PipeSetLazyOptional<>();
        floatEnergyStored = new PipeSetLazyOptional<>();
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (remove) {
            return super.getCapability(cap, side);
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicEnergyPipeType.INSTANCE)) {
            if (side != null) {
                return basicEnergyStored.get(side).cast();
            }
        } else if (cap == CapabilityEnergy.ENERGY && hasType(LowEnergyPipeType.INSTANCE)) {
            if (side != null) {
                return lowEnergyStored.get(side).cast();
            }
        } else if (cap == CapabilityEnergy.ENERGY && hasType(FloatEnergyPipeType.INSTANCE)) {
            if (side != null) {
                return floatEnergyStored.get(side).cast();
            }
        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicItemPipeType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        return super.getCapability(cap, side);
    }

    public boolean hasType(PipeTypeBase<?> type) {
        for (PipeTypeBase<?> t : pipeType) {
            if (t == type) {
                return true;
            }
        }
        return false;
    }

    public int get3dData(Direction direction, PipeTypeBase<?> pipeType) {
        return index[direction.get3DDataValue()][getIndex(pipeType)];
    }

    public void set3dData(Direction direction, PipeTypeBase<?> pipeType, int value) {
        index[direction.get3DDataValue()][getIndex(pipeType)] = value;
    }

    public PipeTypeBase<?>[] getPipeTypes() {
        return pipeType;
    }

    public int getIndex(PipeTypeBase<?> pipeType) {
        for (int i = 0; i < getPipeTypes().length; i++) {
            PipeTypeBase<?> type = getPipeTypes()[i];
            if (type == pipeType) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void tick() {
        super.tick();

        if (level.isClientSide) {
            return;
        }

        for (PipeTypeBase<?> type : getPipeTypes()) {
            type.tick(this);
        }

        if (hasType(BasicEnergyPipeType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (pipeExtracting(side)) {
                    basicEnergyStored.get(side).ifPresent(BasicEnergyPipeEnergyStorage::tick);
                }
            }
        }

        if (hasType(LowEnergyPipeType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (pipeExtracting(side)) {
                    lowEnergyStored.get(side).ifPresent(LowEnergyPipeEnergyStorage::tick);
                }
            }
        }

        if (hasType(FloatEnergyPipeType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (pipeExtracting(side)) {
                    floatEnergyStored.get(side).ifPresent(PipeDCIEnergyStorageFloat::tick);
                }
            }
        }

    }

    @Override
    public void setPipeExtracting(Direction side, boolean extracting) {
        super.setPipeExtracting(side, extracting);
        if (hasType(BasicEnergyPipeType.INSTANCE)) {
            basicEnergyStored.revalidate(side, storage -> extracting, (storage) -> new BasicEnergyPipeEnergyStorage(this, storage));
        }
        if (hasType(LowEnergyPipeType.INSTANCE)) {
            lowEnergyStored.revalidate(side, storage -> extracting, (storage) -> new LowEnergyPipeEnergyStorage(this, storage));
        }
        if (hasType(FloatEnergyPipeType.INSTANCE)) {
            floatEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PipeDCIEnergyStorageFloat(this, storage));
        }
        if (hasType(BasicItemPipeType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (hasType(BasicEnergyPipeType.INSTANCE)) {
            basicEnergyStored.revalidate(this::pipeExtracting, (side) -> new BasicEnergyPipeEnergyStorage(this, side));
        }
        if (hasType(LowEnergyPipeType.INSTANCE)) {
            lowEnergyStored.revalidate(this::pipeExtracting, (side) -> new LowEnergyPipeEnergyStorage(this, side));
        }
        if (hasType(FloatEnergyPipeType.INSTANCE)) {
            floatEnergyStored.revalidate(this::pipeExtracting, (side) -> new PipeDCIEnergyStorageFloat(this, side));
        }
        if (hasType(BasicItemPipeType.INSTANCE)) {
            itemStored.revalidate(this::pipeExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag compound) {
        super.saveAdditional(compound);
    }
    public List<Connection> getSortedConnections(Direction side, PipeTypeBase pipeType) {
        return getConnection().stream().sorted(Comparator.comparingInt(PipeBlockEntityBase.Connection::distance)).collect(Collectors.toList());
    }

    @Override
    public void setRemoved() {
        basicEnergyStored.invalidate();
        lowEnergyStored.invalidate();
        floatEnergyStored.invalidate();
        itemStored.invalidate();
        super.setRemoved();
    }

    @Override
    public boolean canPipeInsertMode(BlockEntity blockentity, Direction direction) {
        for (PipeTypeBase<?> type : pipeType) {
            if (type.canImport(blockentity, direction)) {
                return true;
            }
        }
        return false;
    }

    public boolean pushRecursion() {
        if (recursionDepth >= 1) {
            return true;
        }
        recursionDepth++;
        return false;
    }

    public void popRecursion() {
        recursionDepth--;
    }
}
