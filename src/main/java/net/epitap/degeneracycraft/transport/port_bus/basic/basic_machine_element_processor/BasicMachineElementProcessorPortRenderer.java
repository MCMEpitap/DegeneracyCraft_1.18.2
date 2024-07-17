package net.epitap.degeneracycraft.transport.port_bus.basic.basic_machine_element_processor;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicMachineElementProcessorPortRenderer extends PortRendererBase {
    public BasicMachineElementProcessorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_EXTRACT;
    }
}
