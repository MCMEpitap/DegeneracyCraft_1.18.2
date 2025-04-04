package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceRockCrasherBusRenderer extends PortRendererBase {
    public BasicPerformanceRockCrasherBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK_EXTRACT;
    }
}
