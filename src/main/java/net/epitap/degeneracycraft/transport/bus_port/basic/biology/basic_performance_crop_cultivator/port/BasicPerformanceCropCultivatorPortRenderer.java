package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCropCultivatorPortRenderer extends PortRendererBase {
    public BasicPerformanceCropCultivatorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CROP_CULTIVATOR_PORT_BLOCK_EXTRACT;
    }
}
