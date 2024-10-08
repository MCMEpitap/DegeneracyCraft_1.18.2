package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_circuit_builder.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyCircuitBuilderBusRenderer extends PortRendererBase {
    public BasicTechnologyCircuitBuilderBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PRECISION_CIRCUIT_BUILDER_BUS_BLOCK_EXTRACT;
    }
}
