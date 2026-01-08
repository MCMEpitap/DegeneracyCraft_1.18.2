package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceStarlightCollectorBusRenderer extends PortRendererBase {
    public BasicPerformanceStarlightCollectorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BUS_BLOCK_EXTRACT;
    }
}
