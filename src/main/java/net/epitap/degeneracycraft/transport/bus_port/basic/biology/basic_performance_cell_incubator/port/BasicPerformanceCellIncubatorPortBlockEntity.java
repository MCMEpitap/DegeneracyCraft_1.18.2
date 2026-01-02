package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_cell_incubator.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceCellIncubatorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceCellIncubatorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_CELL_INCUBATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceCellIncubatorPortType.INSTANCE}, pos, state);
    }
}
