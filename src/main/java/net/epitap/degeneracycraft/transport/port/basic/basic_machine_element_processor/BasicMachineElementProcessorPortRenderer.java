package net.epitap.degeneracycraft.transport.port.basic.basic_machine_element_processor;

import net.epitap.degeneracycraft.transport.port.portbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port.render.TestPipeModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicMachineElementProcessorPortRenderer extends PortRendererBase {
    public BasicMachineElementProcessorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public TestPipeModelRegistry.TestDCModel getModel() {
        return TestPipeModelRegistry.TestDCModel.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_EXTRACT;
    }
}
