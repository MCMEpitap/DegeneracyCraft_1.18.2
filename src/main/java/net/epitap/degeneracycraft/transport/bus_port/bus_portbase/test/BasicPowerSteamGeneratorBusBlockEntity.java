package net.epitap.degeneracycraft.transport.bus_port.bus_portbase.test;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerSteamGeneratorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPowerSteamGeneratorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPowerSteamGeneratorBusType.INSTANCE}, pos, state);
    }
}
