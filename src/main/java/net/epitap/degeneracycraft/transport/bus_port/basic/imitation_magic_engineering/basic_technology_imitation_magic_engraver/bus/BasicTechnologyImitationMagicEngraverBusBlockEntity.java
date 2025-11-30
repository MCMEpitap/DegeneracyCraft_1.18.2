package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyImitationMagicEngraverBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyImitationMagicEngraverBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyImitationMagicEngraverBusType.INSTANCE}, pos, state);
    }
}
