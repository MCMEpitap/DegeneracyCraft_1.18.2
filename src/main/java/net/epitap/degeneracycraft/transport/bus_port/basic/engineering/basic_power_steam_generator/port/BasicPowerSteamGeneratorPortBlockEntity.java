package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_power_steam_generator.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerSteamGeneratorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPowerSteamGeneratorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPowerSteamGeneratorPortType.INSTANCE}, pos, state);
    }
}
