package net.epitap.degeneracycraft.transport.port_bus.port_busbase;

import net.epitap.degeneracycraft.transport.parametor.PipeItemHandler;
import net.epitap.degeneracycraft.transport.parametor.PipeSetLazyOptional;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeDCIEnergyStorageFloat;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_thermal_generator.bus.BasicPowerThermalGeneratorBusType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_thermal_generator.port.BasicPowerThermalGeneratorPortType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_circuit_builder.bus.BasicTechnologyCircuitBuilderBusType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_circuit_builder.port.BasicTechnologyCircuitBuilderPortType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_element_processor.bus.BasicTechnologyMachineElementProcessorBusType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_element_processor.port.BasicTechnologyMachineElementProcessorPortType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.port.BasicTechnologyMachineManufacturerPortType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_part_processor.bus.BasicTechnologyMachinePartProcessorBusType;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_part_processor.port.BasicTechnologyMachinePartProcessorPortType;
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

public class PortWorkBlockEntity extends PortBlockEntityBase {

    protected PortTypeBase<?>[] portType;
    protected final int[][] index;
    protected PipeSetLazyOptional<PipeItemHandler> itemStored;
    protected PipeSetLazyOptional<PortIEnergyStorage> intEnergyStored;
    protected PipeSetLazyOptional<PipeDCIEnergyStorageFloat> floatEnergyStored;
    private int recursionDepth;

    public PortWorkBlockEntity(BlockEntityType<?> blockEntityType, PortTypeBase<?>[] portType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
        this.portType = portType;
        index = new int[Direction.values().length][portType.length];
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
//        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPowerThermalGeneratorPortType.INSTANCE)) {
//            if (side != null) {
//                return itemStored.get(side).cast();
//            }
//        } else if (cap == CapabilityEnergy.ENERGY && hasType(BasicPowerThermalGeneratorBusType.INSTANCE)) {
//            if (side != null) {
//                return intEnergyStored.get(side).cast();
//            }
//        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
//            if (side != null) {
//                return itemStored.get(side).cast();
//            }
//        } else if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
//            if (side != null) {
//                return intEnergyStored.get(side).cast();
//            }
//        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
//            if (side != null) {
//                return itemStored.get(side).cast();
//            }
//        } else if (cap == CapabilityEnergy.ENERGY && hasType(BasicPrecisionCircuitBuilderBusType.INSTANCE)) {
//            if (side != null) {
//                return intEnergyStored.get(side).cast();
//            }
//        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPrecisionCircuitBuilderPortType.INSTANCE)) {
//            if (side != null) {
//                return itemStored.get(side).cast();
//            }
//        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicMachineElementProcessorPortType.INSTANCE)) {
//            if (side != null) {
//                return itemStored.get(side).cast();
//            }
//        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPowerThermalGeneratorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPowerThermalGeneratorBusType.INSTANCE)) {
            if (side != null) {
                return intEnergyStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            if (side != null) {
                return intEnergyStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyCircuitBuilderBusType.INSTANCE)) {
            if (side != null) {
                return intEnergyStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyCircuitBuilderPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            if (side != null) {
                return intEnergyStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineElementProcessorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            if (side != null) {
                return intEnergyStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachinePartProcessorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        return super.getCapability(cap, side);
    }

    public boolean hasType(PortTypeBase<?> type) {
        for (PortTypeBase<?> t : portType) {
            if (t == type) {
                return true;
            }
        }
        return false;
    }

    public int get3dData(Direction direction, PortTypeBase<?> portType) {
        return index[direction.get3DDataValue()][getIndex(portType)];
    }

    public void set3dData(Direction direction, PortTypeBase<?> portType, int value) {
        index[direction.get3DDataValue()][getIndex(portType)] = value;
    }

    public PortTypeBase<?>[] getPortTypes() {
        return portType;
    }

    public int getIndex(PortTypeBase<?> portType) {
        for (int i = 0; i < getPortTypes().length; i++) {
            PortTypeBase<?> type = getPortTypes()[i];
            if (type == portType) {
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
        for (PortTypeBase<?> type : getPortTypes()) {
            type.tick(this);
        }
        if (hasType(BasicPowerThermalGeneratorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    intEnergyStored.get(side).ifPresent(PortIEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    intEnergyStored.get(side).ifPresent(PortIEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    intEnergyStored.get(side).ifPresent(PortIEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    intEnergyStored.get(side).ifPresent(PortIEnergyStorage::tick);
                }
            }
        }
    }

    @Override
    public void setPortExtracting(Direction side, boolean extracting) {
        super.setPortExtracting(side, extracting);
        if (hasType(BasicPowerThermalGeneratorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicPowerThermalGeneratorBusType.INSTANCE)) {
            intEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PortIEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            intEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PortIEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyCircuitBuilderBusType.INSTANCE)) {
            intEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PortIEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyCircuitBuilderPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            intEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PortIEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachineElementProcessorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            intEnergyStored.revalidate(side, storage -> extracting, (storage) -> new PortIEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachinePartProcessorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (hasType(BasicPowerThermalGeneratorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicPowerThermalGeneratorBusType.INSTANCE)) {
            intEnergyStored.revalidate(this::portExtracting, (side) -> new PortIEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            intEnergyStored.revalidate(this::portExtracting, (side) -> new PortIEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyCircuitBuilderBusType.INSTANCE)) {
            intEnergyStored.revalidate(this::portExtracting, (side) -> new PortIEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyCircuitBuilderPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            intEnergyStored.revalidate(this::portExtracting, (side) -> new PortIEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachineElementProcessorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            intEnergyStored.revalidate(this::portExtracting, (side) -> new PortIEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachinePartProcessorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PipeItemHandler.INSTANCE);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag compound) {
        super.saveAdditional(compound);
    }

    public List<Connection> getSortedConnections(Direction side, PortTypeBase portType) {
        return getConnection().stream().sorted(Comparator.comparingInt(Connection::distance)).collect(Collectors.toList());
    }

    @Override
    public void setRemoved() {
        intEnergyStored.invalidate();
        floatEnergyStored.invalidate();
        itemStored.invalidate();
        super.setRemoved();
    }

    @Override
    public boolean canPortInsertMode(BlockEntity blockentity, Direction direction) {
        for (PortTypeBase<?> type : portType) {
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
