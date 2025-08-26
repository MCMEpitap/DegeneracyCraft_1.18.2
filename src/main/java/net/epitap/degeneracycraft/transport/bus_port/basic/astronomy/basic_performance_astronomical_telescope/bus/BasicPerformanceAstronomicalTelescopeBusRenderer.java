package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceAstronomicalTelescopeBusRenderer extends PortRendererBase {
    public BasicPerformanceAstronomicalTelescopeBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK_EXTRACT;
    }
}
