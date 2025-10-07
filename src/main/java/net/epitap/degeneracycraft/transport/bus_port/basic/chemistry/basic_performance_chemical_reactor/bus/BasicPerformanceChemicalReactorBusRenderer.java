package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceChemicalReactorBusRenderer extends PortRendererBase {
    public BasicPerformanceChemicalReactorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_BLOCK_EXTRACT;
    }
}
