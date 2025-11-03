package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceBioReactorBusRenderer extends PortRendererBase {
    public BasicPerformanceBioReactorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_BIO_REACTOR_BUS_BLOCK_EXTRACT;
    }
}
