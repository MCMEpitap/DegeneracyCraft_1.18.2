package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicPerformanceOreSorterPortRenderer extends PortRendererBase {
    public BasicPerformanceOreSorterPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ORE_SORTER_PORT_BLOCK_EXTRACT;
    }
}
