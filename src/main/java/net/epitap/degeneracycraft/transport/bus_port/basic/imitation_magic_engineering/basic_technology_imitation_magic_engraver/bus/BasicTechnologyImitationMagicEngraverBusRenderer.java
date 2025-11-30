package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyImitationMagicEngraverBusRenderer extends PortRendererBase {
    public BasicTechnologyImitationMagicEngraverBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_BLOCK_EXTRACT;
    }
}
