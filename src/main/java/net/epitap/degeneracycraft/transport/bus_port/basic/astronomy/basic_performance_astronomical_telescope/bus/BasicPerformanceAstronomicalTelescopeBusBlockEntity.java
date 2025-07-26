package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceAstronomicalTelescopeBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceAstronomicalTelescopeBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceAstronomicalTelescopeBusType.INSTANCE}, pos, state);
    }
}
