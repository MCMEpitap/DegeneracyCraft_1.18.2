package net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_thermal_generator.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPowerThermalGeneratorBusRenderer extends PortRendererBase {
    public BasicPowerThermalGeneratorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_POWER_THERMAL_GENERATOR_BUS_BLOCK_EXTRACT;
    }
}
