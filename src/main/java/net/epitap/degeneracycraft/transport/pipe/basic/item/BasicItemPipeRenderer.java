package net.epitap.degeneracycraft.transport.pipe.basic.item;


import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeRendererBase;
import net.epitap.degeneracycraft.transport.pipe.render.PipeModelRegistry.DCModel;
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
