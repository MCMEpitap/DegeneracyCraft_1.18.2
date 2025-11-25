package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologySuspectedMagicCondenserBusRenderer extends PortRendererBase {
    public BasicTechnologySuspectedMagicCondenserBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_BLOCK_EXTRACT;
    }
}
