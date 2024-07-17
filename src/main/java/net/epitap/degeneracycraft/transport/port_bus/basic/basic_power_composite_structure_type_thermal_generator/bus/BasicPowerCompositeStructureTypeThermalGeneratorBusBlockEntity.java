package net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_composite_structure_type_thermal_generator.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerCompositeStructureTypeThermalGeneratorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPowerCompositeStructureTypeThermalGeneratorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_BLOCK_ENTITY, new PortTypeBase[]{BasicEnergyPipeType.INSTANCE}, pos, state);
    }
}
