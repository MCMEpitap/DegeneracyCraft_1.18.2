package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceOreSorterBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceOreSorterBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ORE_SORTER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceOreSorterBusType.INSTANCE}, pos, state);
    }
}
