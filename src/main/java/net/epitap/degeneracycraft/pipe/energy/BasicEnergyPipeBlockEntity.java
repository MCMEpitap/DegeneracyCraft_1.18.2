package net.epitap.degeneracycraft.pipe.energy;

import net.epitap.degeneracycraft.pipe.pipebase.PipeTypeBase;
import net.epitap.degeneracycraft.pipe.entity.PipeBlockEntities;
import net.epitap.degeneracycraft.pipe.entity.PipeWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicEnergyPipeBlockEntity extends PipeWorkBlockEntity {
    public BasicEnergyPipeBlockEntity(BlockPos pos, BlockState state) {
        super(PipeBlockEntities.ENERGY_PIPE, new PipeTypeBase[]{BasicEnergyPipeType.INSTANCE}, pos, state);
    }
}
