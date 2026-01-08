package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceStarlightCollectorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceStarlightCollectorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceStarlightCollectorBusType.INSTANCE}, pos, state);
    }
}
