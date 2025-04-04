package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicPerformanceRockCrasherPortRenderer extends PortRendererBase {
    public BasicPerformanceRockCrasherPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK_EXTRACT;
    }
}
