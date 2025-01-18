package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.port;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyMultiblockEquipmentFabricatorPortRenderer extends PortRendererBase {
    public BasicTechnologyMultiblockEquipmentFabricatorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK_EXTRACT;
    }
}
