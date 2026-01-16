package net.epitap.degeneracycraft.transport.bus_port.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceRealityPhaseAdjustmentMachineBusRenderer extends PortRendererBase {
    public BasicPerformanceRealityPhaseAdjustmentMachineBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BUS_BLOCK_EXTRACT;
    }
}
