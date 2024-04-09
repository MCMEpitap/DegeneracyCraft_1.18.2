package net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor;

import net.epitap.degeneracycraft.pipe.test.entities.PortBlockEntities;
import net.epitap.degeneracycraft.pipe.test.entities.PortWorkBlockEntity;
import net.epitap.degeneracycraft.pipe.test.pipebase.PortTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicMachineElementProcessorPortBlockEntity extends PortWorkBlockEntity {
    public BasicMachineElementProcessorPortBlockEntity(BlockPos pos, BlockState state) {
        super(PortBlockEntities.TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY, new PortTypeBase[]{BasicMachineElementProcessorPortType.INSTANCE}, pos, state);
    }
}
