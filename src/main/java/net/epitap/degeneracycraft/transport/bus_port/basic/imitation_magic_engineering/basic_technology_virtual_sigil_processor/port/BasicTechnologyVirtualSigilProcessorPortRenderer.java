package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyVirtualSigilProcessorPortRenderer extends PortRendererBase {
    public BasicTechnologyVirtualSigilProcessorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_PORT_BLOCK_EXTRACT;
    }
}
