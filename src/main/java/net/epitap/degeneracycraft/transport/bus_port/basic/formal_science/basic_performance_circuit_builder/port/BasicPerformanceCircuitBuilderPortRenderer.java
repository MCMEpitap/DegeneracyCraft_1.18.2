package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCircuitBuilderPortRenderer extends PortRendererBase {
    public BasicPerformanceCircuitBuilderPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_BLOCK_EXTRACT;
    }
}
