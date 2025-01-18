package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.bus;


import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMachineElementProcessorBusRenderer extends PortRendererBase {
    public BasicTechnologyMachineElementProcessorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK_EXTRACT;
    }
}
