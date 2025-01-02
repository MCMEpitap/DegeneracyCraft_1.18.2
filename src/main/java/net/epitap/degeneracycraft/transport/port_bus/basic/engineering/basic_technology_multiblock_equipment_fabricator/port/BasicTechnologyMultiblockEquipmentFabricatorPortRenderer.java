package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_multiblock_equipment_fabricator.port;

import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMultiblockEquipmentFabricatorPortRenderer extends PortRendererBase {
    public BasicTechnologyMultiblockEquipmentFabricatorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK_EXTRACT;
    }
}
