package net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyElectromagneticInductorBusRenderer extends PortRendererBase {
    public BasicTechnologyElectromagneticInductorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_BLOCK_EXTRACT;
    }
}
