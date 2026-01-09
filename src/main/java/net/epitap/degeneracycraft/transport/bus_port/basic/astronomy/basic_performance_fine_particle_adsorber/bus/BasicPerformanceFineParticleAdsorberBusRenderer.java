package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceFineParticleAdsorberBusRenderer extends PortRendererBase {
    public BasicPerformanceFineParticleAdsorberBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK_EXTRACT;
    }
}
