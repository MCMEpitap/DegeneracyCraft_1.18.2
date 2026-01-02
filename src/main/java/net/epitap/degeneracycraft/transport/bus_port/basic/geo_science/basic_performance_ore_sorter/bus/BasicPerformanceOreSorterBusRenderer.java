package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceOreSorterBusRenderer extends PortRendererBase {
    public BasicPerformanceOreSorterBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ORE_SORTER_BUS_BLOCK_EXTRACT;
    }
}
