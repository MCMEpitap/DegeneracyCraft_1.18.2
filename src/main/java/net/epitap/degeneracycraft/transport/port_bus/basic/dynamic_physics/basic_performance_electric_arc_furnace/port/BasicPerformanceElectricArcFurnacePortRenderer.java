package net.epitap.degeneracycraft.transport.port_bus.basic.dynamic_physics.basic_performance_electric_arc_furnace.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceElectricArcFurnacePortRenderer extends PortRendererBase {
    public BasicPerformanceElectricArcFurnacePortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK_EXTRACT;
    }
}
