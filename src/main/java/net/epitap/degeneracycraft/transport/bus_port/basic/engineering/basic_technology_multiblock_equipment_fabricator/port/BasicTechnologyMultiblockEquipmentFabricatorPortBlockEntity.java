package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMultiblockEquipmentFabricatorPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMultiblockEquipmentFabricatorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMultiblockEquipmentFabricatorPortType.INSTANCE}, pos, state);
    }
}
