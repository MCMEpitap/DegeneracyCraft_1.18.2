package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_cell_incubator.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCellIncubatorBusRenderer extends PortRendererBase {
    public BasicPerformanceCellIncubatorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CELL_INCUBATOR_BUS_BLOCK_EXTRACT;
    }
}
