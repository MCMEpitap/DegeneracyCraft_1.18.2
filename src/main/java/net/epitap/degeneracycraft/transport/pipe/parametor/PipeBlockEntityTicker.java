package net.epitap.degeneracycraft.transport.pipe.parametor;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.state.BlockState;

public class PipeBlockEntityTicker<T extends BlockEntity> implements BlockEntityTicker<T> {
    @Override
    public void tick(Level level, BlockPos pos, BlockState state, T entity) {
        if (entity instanceof PipeITickBlockEntity tick) {
            tick.tick();
        }
        if (level.isClientSide) {
            if (entity instanceof PipeIClientTickBlockEntity tick) {
                tick.tickClient();
            }
        } else {
            if (entity instanceof PipeIServerTickBlockEntity tick) {
                tick.tickServer();
            }
        }
    }
}

