package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_universal_assembler.bus;


import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyUniversalAssemblerBusRenderer extends PortRendererBase {
    public BasicTechnologyUniversalAssemblerBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_EXTRACT;
    }
}
