package net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_composite_structure_type_thermal_generator.bus;


import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeRendererBase;
import net.epitap.degeneracycraft.transport.pipe.render.PipeModelRegistry.DCModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPowerCompositeStructureTypeThermalGeneratorBusRenderer extends PipeRendererBase {
    public BasicPowerCompositeStructureTypeThermalGeneratorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCModel getModel() {
        return DCModel.BASIC_ENERGY_PIPE_BLOCK_EXTRACT;
    }
}
