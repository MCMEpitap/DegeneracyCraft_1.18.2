package net.epitap.degeneracycraft.pipe.basic;

import net.epitap.degeneracycraft.pipe.pipebase.PipeTypeBase;
import net.epitap.degeneracycraft.pipe.entity.PipeBlockEntities;
import net.epitap.degeneracycraft.pipe.entity.PipeWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicItemPipeEntity extends PipeWorkBlockEntity {
    public BasicItemPipeEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.BASIC_ITEM_PIPE_BLOCK_ENTITY, new PipeTypeBase[]{BasicItemPipeType.INSTANCE}, pos, state);
    }
}
