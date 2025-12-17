package net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceMaterialSeparatorBusRenderer extends PortRendererBase {
    public BasicPerformanceMaterialSeparatorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BUS_BLOCK_EXTRACT;
    }
}
