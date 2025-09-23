package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceCompoundPurifierBusRenderer extends PortRendererBase {
    public BasicPerformanceCompoundPurifierBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK_EXTRACT;
    }
}
