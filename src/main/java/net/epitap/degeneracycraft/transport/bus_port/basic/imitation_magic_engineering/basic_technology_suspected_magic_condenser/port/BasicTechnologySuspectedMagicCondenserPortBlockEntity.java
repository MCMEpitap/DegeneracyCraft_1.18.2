package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologySuspectedMagicCondenserPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologySuspectedMagicCondenserPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologySuspectedMagicCondenserPortType.INSTANCE}, pos, state);
    }
}
