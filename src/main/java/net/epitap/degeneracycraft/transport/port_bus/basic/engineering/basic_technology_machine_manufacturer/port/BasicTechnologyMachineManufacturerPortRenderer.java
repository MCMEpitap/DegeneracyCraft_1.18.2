package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_manufacturer.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMachineManufacturerPortRenderer extends PortRendererBase {
    public BasicTechnologyMachineManufacturerPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_EXTRACT;
    }
}
