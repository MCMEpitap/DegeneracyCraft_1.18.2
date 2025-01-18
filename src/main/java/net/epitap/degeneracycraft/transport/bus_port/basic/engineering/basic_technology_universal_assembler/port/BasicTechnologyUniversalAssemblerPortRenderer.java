package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicTechnologyUniversalAssemblerPortRenderer extends PortRendererBase {
    public BasicTechnologyUniversalAssemblerPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK_EXTRACT;
    }
}
