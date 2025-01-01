package net.epitap.degeneracycraft.transport.port_bus.basic.hybrid_physics.basic_performance_forming_machine.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceFormingMachinePortRenderer extends PortRendererBase {
    public BasicPerformanceFormingMachinePortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK_EXTRACT;
    }
}
