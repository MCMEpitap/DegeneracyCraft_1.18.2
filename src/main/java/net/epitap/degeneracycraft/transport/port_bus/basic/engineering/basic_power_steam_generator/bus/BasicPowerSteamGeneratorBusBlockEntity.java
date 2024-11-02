package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_steam_generator.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerSteamGeneratorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPowerSteamGeneratorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPowerSteamGeneratorBusType.INSTANCE}, pos, state);
    }
}
