package net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor;

import net.epitap.degeneracycraft.pipe.test.pipebase.PortRendererBase;
import net.epitap.degeneracycraft.pipe.test.render.TestPipeModelRegistry.TestDCModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicMachineElementProcessorPortRenderer extends PortRendererBase {
    public BasicMachineElementProcessorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public TestDCModel getModel() {
        return TestDCModel.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_EXTRACT;
    }
}
