package net.epitap.degeneracycraft.pipe.energy;


import net.epitap.degeneracycraft.pipe.render.PipeModelRegistry.DCModel;
import net.epitap.degeneracycraft.pipe.pipebase.PipeRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicEnergyPipeRenderer extends PipeRendererBase {
    public BasicEnergyPipeRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCModel getModel() {
        return DCModel.BASIC_ENERGY_PIPE_BLOCK_EXTRACT;
    }
}
