package net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyElectromagneticInductorPortRenderer extends PortRendererBase {
    public BasicTechnologyElectromagneticInductorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_BLOCK_EXTRACT;
    }
}
