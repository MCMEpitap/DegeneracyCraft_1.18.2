package net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicPerformanceMaterialSeparatorPortRenderer extends PortRendererBase {
    public BasicPerformanceMaterialSeparatorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_PORT_BLOCK_EXTRACT;
    }
}
