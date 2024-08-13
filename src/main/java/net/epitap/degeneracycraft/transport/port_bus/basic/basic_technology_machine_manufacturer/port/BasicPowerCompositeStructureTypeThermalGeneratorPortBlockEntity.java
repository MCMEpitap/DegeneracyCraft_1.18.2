package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPowerCompositeStructureTypeThermalGeneratorPortType.INSTANCE}, pos, state);
    }
}
