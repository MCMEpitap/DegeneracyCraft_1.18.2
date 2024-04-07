package net.epitap.degeneracycraft.pipe.test.basic;

import net.epitap.degeneracycraft.pipe.test.pipebase.TestPipeRendererBase;
import net.epitap.degeneracycraft.pipe.test.render.TestPipeModelRegistry.TestDCModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class TestBasicItemPipeRenderer extends TestPipeRendererBase {
    public TestBasicItemPipeRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public TestDCModel getModel() {
        return TestDCModel.TEST_BASIC_ENERGY_PIPE_BLOCK_EXTRACT;
    }
}
