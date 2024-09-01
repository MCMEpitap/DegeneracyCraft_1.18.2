package net.epitap.degeneracycraft.transport.port_bus.basic.basic_precision_circuit_builder.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPrecisionCircuitBuilderBusRenderer extends PortRendererBase {
    public BasicPrecisionCircuitBuilderBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PRECISION_CIRCUIT_BUILDER_BUS_BLOCK_EXTRACT;
    }
}
