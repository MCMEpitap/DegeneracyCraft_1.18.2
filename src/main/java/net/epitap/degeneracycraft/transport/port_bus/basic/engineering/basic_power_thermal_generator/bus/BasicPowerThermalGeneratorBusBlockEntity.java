package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_thermal_generator.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerThermalGeneratorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPowerThermalGeneratorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_THERMAL_GENERATOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPowerThermalGeneratorBusType.INSTANCE}, pos, state);
    }
}
