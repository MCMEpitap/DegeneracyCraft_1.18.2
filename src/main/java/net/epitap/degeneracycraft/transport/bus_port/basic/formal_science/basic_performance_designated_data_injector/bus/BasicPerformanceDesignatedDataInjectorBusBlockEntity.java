package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceDesignatedDataInjectorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceDesignatedDataInjectorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceDesignatedDataInjectorBusType.INSTANCE}, pos, state);
    }
}
