package net.epitap.degeneracycraft.transport.pipe.low.energy;


import net.epitap.degeneracycraft.transport.pipe.parametor.PipeModelRegistry.DCPipeModel;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class LowEnergyPipeRenderer extends PipeRendererBase {
    public LowEnergyPipeRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPipeModel getModel() {
        return DCPipeModel.BASIC_ENERGY_PIPE_BLOCK_EXTRACT;
    }
}
