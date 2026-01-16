package net.epitap.degeneracycraft.transport.bus_port.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceRealityPhaseAdjustmentMachinePortRenderer extends PortRendererBase {
    public BasicPerformanceRealityPhaseAdjustmentMachinePortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_PORT_BLOCK_EXTRACT;
    }
}
