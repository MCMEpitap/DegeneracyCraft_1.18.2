package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_universal_assembler.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyUniversalAssemblerPortRenderer extends PortRendererBase {
    public BasicTechnologyUniversalAssemblerPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK_EXTRACT;
    }
}
