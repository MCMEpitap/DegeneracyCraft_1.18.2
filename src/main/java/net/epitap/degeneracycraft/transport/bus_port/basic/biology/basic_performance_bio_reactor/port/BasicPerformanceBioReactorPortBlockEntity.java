package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceBioReactorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceBioReactorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_BIO_REACTOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceBioReactorPortType.INSTANCE}, pos, state);
    }
}
