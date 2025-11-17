package net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyCompressionCondenserBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyCompressionCondenserBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyCompressionCondenserBusType.INSTANCE}, pos, state);
    }
}
