package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.bus;


import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicPerformanceCircuitBuilderBusRenderer extends PortRendererBase {
    public BasicPerformanceCircuitBuilderBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_BLOCK_EXTRACT;
    }
}
