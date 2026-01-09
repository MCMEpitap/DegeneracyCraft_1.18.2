package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceFineParticleAdsorberBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceFineParticleAdsorberBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceFineParticleAdsorberBusType.INSTANCE}, pos, state);
    }
}
