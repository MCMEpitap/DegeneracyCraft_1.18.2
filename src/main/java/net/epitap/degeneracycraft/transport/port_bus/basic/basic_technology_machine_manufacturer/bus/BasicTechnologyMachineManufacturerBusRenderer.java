package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMachineManufacturerBusRenderer extends PortRendererBase {
    public BasicTechnologyMachineManufacturerBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK_EXTRACT;
    }
}
