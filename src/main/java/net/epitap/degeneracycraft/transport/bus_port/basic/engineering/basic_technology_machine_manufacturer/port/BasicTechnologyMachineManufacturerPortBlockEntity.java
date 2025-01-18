package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMachineManufacturerPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMachineManufacturerPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMachineManufacturerPortType.INSTANCE}, pos, state);
    }
}
