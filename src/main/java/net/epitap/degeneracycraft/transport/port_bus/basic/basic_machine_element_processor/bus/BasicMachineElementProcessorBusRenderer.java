package net.epitap.degeneracycraft.transport.port_bus.basic.basic_machine_element_processor.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicMachineElementProcessorBusRenderer extends PortRendererBase {
    public BasicMachineElementProcessorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_BLOCK_EXTRACT;
    }
}
