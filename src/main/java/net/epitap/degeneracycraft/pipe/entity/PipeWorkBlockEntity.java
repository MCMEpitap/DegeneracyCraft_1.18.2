package net.epitap.degeneracycraft.pipe.entity;

import net.epitap.degeneracycraft.pipe.basic.BasicItemPipeType;
import net.epitap.degeneracycraft.pipe.energy.BasicEnergyPipeType;
import net.epitap.degeneracycraft.pipe.energy.PipeFloatEnergyStorage;
import net.epitap.degeneracycraft.pipe.energy.PipeIntEnergyStorage;
import net.epitap.degeneracycraft.pipe.energy.floa.FloatEnergyPipeType;
import net.epitap.degeneracycraft.pipe.pipebase.PipeBlockEntityBase;
import net.epitap.degeneracycraft.pipe.pipebase.PipeTypeBase;
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
    protected PipeSetLazyOptional<PipeIntEnergyStorage> intEnergyStored;
    protected PipeSetLazyOptional<PipeFloatEnergyStorage> floatEnergyStored;
    private int recursionDepth;

    public PipeWorkBlockEntity(BlockEntityType<?> blockEntityType, PipeTypeBase<?>[] pipeType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
        this.pipeType = pipeType;
        index = new int[Direction.values().length][pipeType.length];
        itemStored = new PipeSetLazyOptional<>();
        intEnergyStored = new PipeSetLazyOptional<>();
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
                return intEnergyStored.get(side).cast();
            }
        } else
        if (cap == CapabilityEnergy.ENERGY && hasType(FloatEnergyPipeType.INSTANCE)) {
            if (side != null) {
                return floatEnergyStored.get(side).cast();
            }
        } else
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicItemPipeType.INSTANCE)) {
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
                    intEnergyStored.get(side).ifPresent(PipeIntEnergyStorage::tick);
                }
            }
        }

        if (hasType(FloatEnergyPipeType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (pipeExtracting(side)) {
                    floatEnergyStored.get(side).ifPresent(PipeFloatEnergyStorage::tick);
                }
            }
        }

    }

    @Override
    public void setPipeExtracting(Direction side, boolean extracting) {
        super.setPipeExtracting(side, extracting);
        if (hasType(BasicEnergyPipeType.INSTANCE)) {
            intEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PipeIntEnergyStorage(this, storage));
        }
        if (hasType(FloatEnergyPipeType.INSTANCE))
            floatEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PipeFloatEnergyStorage(this, storage));
        if (hasType(BasicItemPipeType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (hasType(BasicEnergyPipeType.INSTANCE)) {
            intEnergyStored.revalidate(this::pipeExtracting, (side) -> new PipeIntEnergyStorage(this, side));
        }
        if (hasType(FloatEnergyPipeType.INSTANCE)) {
            floatEnergyStored.revalidate(this::pipeExtracting, (side) -> new PipeFloatEnergyStorage(this, side));
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
        intEnergyStored.invalidate();
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
