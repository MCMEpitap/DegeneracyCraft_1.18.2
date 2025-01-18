package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_circuit_builder.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyCircuitBuilderPortRenderer extends PortRendererBase {
    public BasicTechnologyCircuitBuilderPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PRECISION_CIRCUIT_BUILDER_PORT_BLOCK_EXTRACT;
    }
}
