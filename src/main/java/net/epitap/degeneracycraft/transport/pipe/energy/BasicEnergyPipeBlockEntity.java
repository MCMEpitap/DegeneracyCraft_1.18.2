package net.epitap.degeneracycraft.transport.pipe.energy;

import net.epitap.degeneracycraft.transport.pipe.entities.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.entities.PipeWorkBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicEnergyPipeBlockEntity extends PipeWorkBlockEntity {
    public BasicEnergyPipeBlockEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.BASIC_ENERGY_PIPE_BLOCK_ENTITY, new PipeTypeBase[]{BasicEnergyPipeType.INSTANCE}, pos, state);
    }
}
