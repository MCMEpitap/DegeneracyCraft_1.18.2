package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMachineManufacturerPortRenderer extends PortRendererBase {
    public BasicTechnologyMachineManufacturerPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_BLOCK_EXTRACT;
    }
}
