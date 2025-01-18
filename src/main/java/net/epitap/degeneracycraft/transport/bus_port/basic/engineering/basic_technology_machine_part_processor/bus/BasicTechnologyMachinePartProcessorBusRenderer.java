package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.bus;


import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMachinePartProcessorBusRenderer extends PortRendererBase {
    public BasicTechnologyMachinePartProcessorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK_EXTRACT;
    }
}
