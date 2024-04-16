package net.epitap.degeneracycraft.transport.pipe.energy;


import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeRendererBase;
import net.epitap.degeneracycraft.transport.pipe.render.PipeModelRegistry.DCModel;
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
