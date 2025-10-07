package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceChemicalReactorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceChemicalReactorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceChemicalReactorPortType.INSTANCE}, pos, state);
    }
}
