package net.epitap.degeneracycraft.transport.port_bus.basic.hybrid_physics.basic_performance_forming_machine.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceFormingMachineBusRenderer extends PortRendererBase {
    public BasicPerformanceFormingMachineBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK_EXTRACT;
    }
}
