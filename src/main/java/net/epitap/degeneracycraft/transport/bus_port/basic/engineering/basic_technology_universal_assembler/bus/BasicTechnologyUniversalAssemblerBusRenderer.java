package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.bus;


import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

import static net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;

public class BasicTechnologyUniversalAssemblerBusRenderer extends PortRendererBase {
    public BasicTechnologyUniversalAssemblerBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_EXTRACT;
    }
}
