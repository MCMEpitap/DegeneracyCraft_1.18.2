package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_part_processor.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMachinePartProcessorBusRenderer extends PortRendererBase {
    public BasicTechnologyMachinePartProcessorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK_EXTRACT;
    }
}
