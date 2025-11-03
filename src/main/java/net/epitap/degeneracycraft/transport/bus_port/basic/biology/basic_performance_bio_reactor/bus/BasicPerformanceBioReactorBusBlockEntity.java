package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceBioReactorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceBioReactorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_BIO_REACTOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceBioReactorBusType.INSTANCE}, pos, state);
    }
}
