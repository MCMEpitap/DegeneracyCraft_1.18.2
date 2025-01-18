package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMachineElementProcessorPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMachineElementProcessorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMachineElementProcessorPortType.INSTANCE}, pos, state);
    }
}
