package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicPerformanceSoilPurifierPortRenderer extends PortRendererBase {
    public BasicPerformanceSoilPurifierPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK_EXTRACT;
    }
}
