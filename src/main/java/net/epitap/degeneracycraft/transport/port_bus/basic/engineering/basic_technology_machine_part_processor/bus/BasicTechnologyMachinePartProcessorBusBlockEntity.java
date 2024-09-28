package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_part_processor.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMachinePartProcessorBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMachinePartProcessorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMachinePartProcessorBusType.INSTANCE}, pos, state);
    }
}
