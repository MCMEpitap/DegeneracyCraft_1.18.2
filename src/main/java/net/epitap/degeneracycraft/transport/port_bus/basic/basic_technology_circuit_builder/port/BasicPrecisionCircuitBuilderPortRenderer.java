package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_circuit_builder.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPrecisionCircuitBuilderPortRenderer extends PortRendererBase {
    public BasicPrecisionCircuitBuilderPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PRECISION_CIRCUIT_BUILDER_PORT_BLOCK_EXTRACT;
    }
}
