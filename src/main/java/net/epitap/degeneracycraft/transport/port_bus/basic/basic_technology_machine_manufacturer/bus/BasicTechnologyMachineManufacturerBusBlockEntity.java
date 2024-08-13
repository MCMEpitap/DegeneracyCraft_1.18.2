package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMachineManufacturerBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMachineManufacturerBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMachineManufacturerBusType.INSTANCE}, pos, state);
    }
}
