package net.epitap.degeneracycraft.pipe.basic;


import net.epitap.degeneracycraft.pipe.render.PipeModelRegistry.DCModel;
import net.epitap.degeneracycraft.pipe.pipebase.PipeRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicItemPipeRenderer extends PipeRendererBase {
    public BasicItemPipeRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCModel getModel() {
        return DCModel.BASIC_ITEM_PIPE_BLOCK_EXTRACT;
    }
}
