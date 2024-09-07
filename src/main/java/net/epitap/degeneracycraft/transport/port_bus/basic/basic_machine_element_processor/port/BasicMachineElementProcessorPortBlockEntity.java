package net.epitap.degeneracycraft.transport.port_bus.basic.basic_machine_element_processor.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicMachineElementProcessorPortBlockEntity extends PortWorkBlockEntity {
    public BasicMachineElementProcessorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicMachineElementProcessorPortType.INSTANCE}, pos, state);
    }
}
