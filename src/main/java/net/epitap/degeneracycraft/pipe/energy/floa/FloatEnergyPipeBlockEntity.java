package net.epitap.degeneracycraft.pipe.energy.floa;

import net.epitap.degeneracycraft.pipe.entity.PipeBlockEntities;
import net.epitap.degeneracycraft.pipe.entity.PipeWorkBlockEntity;
import net.epitap.degeneracycraft.pipe.pipebase.PipeTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class FloatEnergyPipeBlockEntity extends PipeWorkBlockEntity {
    public FloatEnergyPipeBlockEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.FLOAT_ENERGY_PIPE_BLOCK_ENTITY, new PipeTypeBase[]{FloatEnergyPipeType.INSTANCE}, pos, state);
    }
}
