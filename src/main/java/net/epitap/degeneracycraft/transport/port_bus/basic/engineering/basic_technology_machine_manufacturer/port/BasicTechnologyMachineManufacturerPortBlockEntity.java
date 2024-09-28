package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_manufacturer.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMachineManufacturerPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMachineManufacturerPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMachineManufacturerPortType.INSTANCE}, pos, state);
    }
}
