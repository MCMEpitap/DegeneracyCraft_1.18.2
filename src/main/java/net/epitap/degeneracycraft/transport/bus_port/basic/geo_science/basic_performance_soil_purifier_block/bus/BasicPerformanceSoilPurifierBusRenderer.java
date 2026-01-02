package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceSoilPurifierBusRenderer extends PortRendererBase {
    public BasicPerformanceSoilPurifierBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK_EXTRACT;
    }
}
