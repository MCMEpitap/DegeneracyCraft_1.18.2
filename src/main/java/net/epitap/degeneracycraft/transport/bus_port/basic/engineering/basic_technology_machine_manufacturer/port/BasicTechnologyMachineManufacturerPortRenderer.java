package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicTechnologyMachineManufacturerPortRenderer extends PortRendererBase {
    public BasicTechnologyMachineManufacturerPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_EXTRACT;
    }
}
