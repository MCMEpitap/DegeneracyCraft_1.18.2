package net.epitap.degeneracycraft.transport.bus_port.parametor;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.state.BlockState;

public class PortBlockEntityTicker<T extends BlockEntity> implements BlockEntityTicker<T> {
    @Override
    public void tick(Level level, BlockPos pos, BlockState state, T entity) {
        if (entity instanceof PortITickBlockEntity tick) {
            tick.tick();
        }
        if (level.isClientSide) {
            if (entity instanceof PortIClientTickBlockEntity tick) {
                tick.tickClient();
            }
        } else {
            if (entity instanceof PortIServerTickBlockEntity tick) {
                tick.tickServer();
            }
        }
    }
}

