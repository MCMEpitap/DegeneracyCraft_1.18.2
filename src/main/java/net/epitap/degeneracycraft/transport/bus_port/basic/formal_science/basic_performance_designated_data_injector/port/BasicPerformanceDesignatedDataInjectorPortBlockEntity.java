package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceDesignatedDataInjectorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceDesignatedDataInjectorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceDesignatedDataInjectorPortType.INSTANCE}, pos, state);
    }
}
