package net.epitap.degeneracycraft.transport.pipe.energy.floa;


import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeRendererBase;
import net.epitap.degeneracycraft.transport.pipe.render.PipeModelRegistry.DCModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class FloatEnergyPipeRenderer extends PipeRendererBase {
    public FloatEnergyPipeRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCModel getModel() {
        return DCModel.FLOAT_ENERGY_PIPE_BLOCK_EXTRACT;
    }
}
