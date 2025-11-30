package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyImitationMagicEngraverPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyImitationMagicEngraverPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyImitationMagicEngraverPortType.INSTANCE}, pos, state);
    }
}
