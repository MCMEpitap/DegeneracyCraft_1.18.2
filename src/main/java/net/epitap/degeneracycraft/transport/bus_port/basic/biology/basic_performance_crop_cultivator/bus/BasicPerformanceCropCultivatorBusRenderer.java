package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCropCultivatorBusRenderer extends PortRendererBase {
    public BasicPerformanceCropCultivatorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CROP_CULTIVATOR_BUS_BLOCK_EXTRACT;
    }
}
