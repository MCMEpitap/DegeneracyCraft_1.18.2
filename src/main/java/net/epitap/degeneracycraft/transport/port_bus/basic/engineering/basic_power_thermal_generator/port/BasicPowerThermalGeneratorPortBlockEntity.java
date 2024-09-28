package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_thermal_generator.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerThermalGeneratorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPowerThermalGeneratorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_THERMAL_GENERATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPowerThermalGeneratorPortType.INSTANCE}, pos, state);
    }
}
