package net.epitap.degeneracycraft.transport.pipe.basic.energy.floa;

import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeTypeBase;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class FloatEnergyPipeBlockEntity extends PipeWorkBlockEntity {
    public FloatEnergyPipeBlockEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.FLOAT_ENERGY_PIPE_BLOCK_ENTITY, new PipeTypeBase[]{FloatEnergyPipeType.INSTANCE}, pos, state);
    }
}
