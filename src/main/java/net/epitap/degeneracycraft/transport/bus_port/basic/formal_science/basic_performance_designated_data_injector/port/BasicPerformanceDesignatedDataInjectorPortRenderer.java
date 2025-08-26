package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceDesignatedDataInjectorPortRenderer extends PortRendererBase {
    public BasicPerformanceDesignatedDataInjectorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK_EXTRACT;
    }
}
