package net.epitap.degeneracycraft.transport.port_bus.basic.chemistry.basic_performance_electrolyser.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceElectrolyserPortRenderer extends PortRendererBase {
    public BasicPerformanceElectrolyserPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK_EXTRACT;
    }
}
