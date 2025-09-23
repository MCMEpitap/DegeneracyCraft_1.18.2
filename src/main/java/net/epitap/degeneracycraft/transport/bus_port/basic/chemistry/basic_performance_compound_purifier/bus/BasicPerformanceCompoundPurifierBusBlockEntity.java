package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceCompoundPurifierBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceCompoundPurifierBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceCompoundPurifierBusType.INSTANCE}, pos, state);
    }
}
