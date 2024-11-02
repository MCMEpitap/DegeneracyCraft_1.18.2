package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_steam_generator.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPowerSteamGeneratorBusRenderer extends PortRendererBase {
    public BasicPowerSteamGeneratorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_EXTRACT;
    }
}
