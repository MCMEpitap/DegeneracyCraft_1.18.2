package net.epitap.degeneracycraft.transport.bus_port.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceRealityPhaseAdjustmentMachineBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceRealityPhaseAdjustmentMachineBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceRealityPhaseAdjustmentMachineBusType.INSTANCE}, pos, state);
    }
}
