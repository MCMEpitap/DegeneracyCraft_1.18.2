package net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_power_steam_generator.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPowerSteamGeneratorBusRenderer extends PortRendererBase {
    public BasicPowerSteamGeneratorBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_EXTRACT;
    }
}
