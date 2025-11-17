package net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyCompressionCondenserPortRenderer extends PortRendererBase {
    public BasicTechnologyCompressionCondenserPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_BLOCK_EXTRACT;
    }
}
