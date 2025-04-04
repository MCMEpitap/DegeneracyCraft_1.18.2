package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceRockCrasherPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceRockCrasherPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceRockCrasherPortType.INSTANCE}, pos, state);
    }
}
