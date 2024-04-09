package net.epitap.degeneracycraft.pipe.test.entities;

import net.epitap.degeneracycraft.pipe.parametor.PipeItemHandler;
import net.epitap.degeneracycraft.pipe.parametor.PipeSetLazyOptional;
import net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor.BasicMachineElementProcessorPortType;
import net.epitap.degeneracycraft.pipe.test.pipebase.PortBlockEntityBase;
import net.epitap.degeneracycraft.pipe.test.pipebase.PortTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PortWorkBlockEntity extends PortBlockEntityBase {

    protected PortTypeBase<?>[] pipeType;
    protected final int[][] index;
    protected PipeSetLazyOptional<PipeItemHandler> itemStored;
    //    protected PipeSetLazyOptional<PipeIntEnergyStorage> intEnergyStored;
//    protected PipeSetLazyOptional<PipeFloatEnergyStorage> floatEnergyStored;
    private int recursionDepth;

    public PortWorkBlockEntity(BlockEntityType<?> blockEntityType, PortTypeBase<?>[] pipeType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
        this.pipeType = pipeType;
        index = new int[Direction.values().length][pipeType.length];
        itemStored = new PipeSetLazyOptional<>();
//        intEnergyStored = new PipeSetLazyOptional<>();
//        floatEnergyStored = new PipeSetLazyOptional<>();
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (remove) {
            return super.getCapability(cap, side);
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicMachineElementProcessorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        return super.getCapability(cap, side);
    }

    public boolean hasType(PortTypeBase<?> type) {
        for (PortTypeBase<?> t : pipeType) {
            if (t == type) {
                return true;
            }
        }
        return false;
    }

    public int get3dData(Direction direction, PortTypeBase<?> pipeType) {
        return index[direction.get3DDataValue()][getIndex(pipeType)];
    }

    public void set3dData(Direction direction, PortTypeBase<?> pipeType, int value) {
        index[direction.get3DDataValue()][getIndex(pipeType)] = value;
    }

    public PortTypeBase<?>[] getPipeTypes() {
        return pipeType;
    }

    public int getIndex(PortTypeBase<?> pipeType) {
        for (int i = 0; i < getPipeTypes().length; i++) {
            PortTypeBase<?> type = getPipeTypes()[i];
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

        for (PortTypeBase<?> type : getPipeTypes()) {
            type.tick(this);
        }
    }

    @Override
    public void setPipeExtracting(Direction side, boolean extracting) {
        super.setPipeExtracting(side, extracting);
        if (hasType(BasicMachineElementProcessorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);

        if (hasType(BasicMachineElementProcessorPortType.INSTANCE)) {
            itemStored.revalidate(this::pipeExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag compound) {
        super.saveAdditional(compound);
    }

    public List<Connection> getSortedConnections(Direction side, PortTypeBase pipeType) {
        return getConnection().stream().sorted(Comparator.comparingInt(Connection::distance)).collect(Collectors.toList());
    }

    @Override
    public void setRemoved() {
//        intEnergyStored.invalidate();
//        floatEnergyStored.invalidate();
        itemStored.invalidate();
        super.setRemoved();
    }

    @Override
    public boolean canPipeInsertMode(BlockEntity blockentity, Direction direction) {
        for (PortTypeBase<?> type : pipeType) {
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
