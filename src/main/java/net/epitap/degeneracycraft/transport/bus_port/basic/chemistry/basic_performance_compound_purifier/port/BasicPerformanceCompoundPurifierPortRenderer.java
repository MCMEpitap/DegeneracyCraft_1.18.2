package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCompoundPurifierPortRenderer extends PortRendererBase {
    public BasicPerformanceCompoundPurifierPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_BLOCK_EXTRACT;
    }
}
