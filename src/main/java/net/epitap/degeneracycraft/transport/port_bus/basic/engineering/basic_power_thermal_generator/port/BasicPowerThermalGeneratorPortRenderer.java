package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_thermal_generator.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPowerThermalGeneratorPortRenderer extends PortRendererBase {
    public BasicPowerThermalGeneratorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_POWER_THERMAL_GENERATOR_PORT_BLOCK_EXTRACT;
    }
}
