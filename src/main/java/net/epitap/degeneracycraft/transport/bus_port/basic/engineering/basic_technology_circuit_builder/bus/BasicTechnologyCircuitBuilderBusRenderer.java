package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_circuit_builder.bus;


import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicTechnologyCircuitBuilderBusRenderer extends PortRendererBase {
    public BasicTechnologyCircuitBuilderBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PRECISION_CIRCUIT_BUILDER_BUS_BLOCK_EXTRACT;
    }
}
