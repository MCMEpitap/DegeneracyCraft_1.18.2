package net.epitap.degeneracycraft.transport.pipe.low.energy;

import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeTypeBase;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class LowEnergyPipeBlockEntity extends PipeWorkBlockEntity {
    public LowEnergyPipeBlockEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.LOW_ENERGY_PIPE_BLOCK_ENTITY, new PipeTypeBase[]{LowEnergyPipeType.INSTANCE}, pos, state);
    }
}
