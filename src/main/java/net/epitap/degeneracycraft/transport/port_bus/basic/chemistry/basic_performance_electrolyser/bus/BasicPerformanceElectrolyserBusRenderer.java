package net.epitap.degeneracycraft.transport.port_bus.basic.chemistry.basic_performance_electrolyser.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceElectrolyserBusRenderer extends PortRendererBase {
    public BasicPerformanceElectrolyserBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK_EXTRACT;
    }
}
