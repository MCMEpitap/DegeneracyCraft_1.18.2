package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_multiblock_equipment_fabricator.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyMultiblockEquipmentFabricatorBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyMultiblockEquipmentFabricatorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyMultiblockEquipmentFabricatorBusType.INSTANCE}, pos, state);
    }
}
