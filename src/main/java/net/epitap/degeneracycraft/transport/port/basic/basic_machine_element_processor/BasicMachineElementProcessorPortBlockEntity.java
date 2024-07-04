package net.epitap.degeneracycraft.transport.port.basic.basic_machine_element_processor;

import net.epitap.degeneracycraft.transport.port.entities.PortBlockEntities;
import net.epitap.degeneracycraft.transport.port.entities.PortWorkBlockEntity;
import net.epitap.degeneracycraft.transport.port.portbase.PortTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicMachineElementProcessorPortBlockEntity extends PortWorkBlockEntity {
    public BasicMachineElementProcessorPortBlockEntity(BlockPos pos, BlockState state) {
        super(PortBlockEntities.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicMachineElementProcessorPortType.INSTANCE}, pos, state);
    }
}
