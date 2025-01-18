package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_power_steam_generator.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicPowerSteamGeneratorPortRenderer extends PortRendererBase {
    public BasicPowerSteamGeneratorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_EXTRACT;
    }
}
