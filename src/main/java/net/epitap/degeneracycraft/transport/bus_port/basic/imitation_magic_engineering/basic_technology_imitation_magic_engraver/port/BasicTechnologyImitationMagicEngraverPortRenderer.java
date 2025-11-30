package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyImitationMagicEngraverPortRenderer extends PortRendererBase {
    public BasicTechnologyImitationMagicEngraverPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_BLOCK_EXTRACT;
    }
}
