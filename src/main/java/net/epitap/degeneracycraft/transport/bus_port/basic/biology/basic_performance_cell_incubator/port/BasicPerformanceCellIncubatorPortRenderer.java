package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_cell_incubator.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCellIncubatorPortRenderer extends PortRendererBase {
    public BasicPerformanceCellIncubatorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_CELL_INCUBATOR_PORT_BLOCK_EXTRACT;
    }
}
