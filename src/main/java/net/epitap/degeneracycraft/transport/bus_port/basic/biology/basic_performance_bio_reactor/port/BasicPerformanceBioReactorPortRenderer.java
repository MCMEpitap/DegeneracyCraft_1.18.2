package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceBioReactorPortRenderer extends PortRendererBase {
    public BasicPerformanceBioReactorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_BIO_REACTOR_PORT_BLOCK_EXTRACT;
    }
}
