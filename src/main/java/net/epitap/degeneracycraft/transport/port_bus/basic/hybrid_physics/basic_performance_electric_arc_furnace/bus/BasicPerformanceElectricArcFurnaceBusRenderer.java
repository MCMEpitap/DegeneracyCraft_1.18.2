package net.epitap.degeneracycraft.transport.port_bus.basic.hybrid_physics.basic_performance_electric_arc_furnace.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceElectricArcFurnaceBusRenderer extends PortRendererBase {
    public BasicPerformanceElectricArcFurnaceBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK_EXTRACT;
    }
}
