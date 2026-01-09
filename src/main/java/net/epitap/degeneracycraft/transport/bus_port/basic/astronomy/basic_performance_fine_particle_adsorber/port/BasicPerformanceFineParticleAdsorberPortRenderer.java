package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceFineParticleAdsorberPortRenderer extends PortRendererBase {
    public BasicPerformanceFineParticleAdsorberPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_PORT_BLOCK_EXTRACT;
    }
}
