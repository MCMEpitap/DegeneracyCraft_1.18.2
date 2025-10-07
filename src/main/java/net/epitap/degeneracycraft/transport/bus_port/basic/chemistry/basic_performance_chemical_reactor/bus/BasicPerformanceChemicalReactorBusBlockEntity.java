package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceChemicalReactorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceChemicalReactorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceChemicalReactorBusType.INSTANCE}, pos, state);
    }
}
