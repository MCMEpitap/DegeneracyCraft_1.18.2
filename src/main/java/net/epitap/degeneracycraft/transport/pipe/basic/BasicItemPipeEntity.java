package net.epitap.degeneracycraft.transport.pipe.basic;

import net.epitap.degeneracycraft.transport.pipe.entities.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.entities.PipeWorkBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicItemPipeEntity extends PipeWorkBlockEntity {
    public BasicItemPipeEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.BASIC_ITEM_PIPE_BLOCK_ENTITY, new PipeTypeBase[]{BasicItemPipeType.INSTANCE}, pos, state);
    }
}
