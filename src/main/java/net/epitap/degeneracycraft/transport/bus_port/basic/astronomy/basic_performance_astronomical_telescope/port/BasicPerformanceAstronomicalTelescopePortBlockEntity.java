package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceAstronomicalTelescopePortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceAstronomicalTelescopePortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceAstronomicalTelescopePortType.INSTANCE}, pos, state);
    }
}
