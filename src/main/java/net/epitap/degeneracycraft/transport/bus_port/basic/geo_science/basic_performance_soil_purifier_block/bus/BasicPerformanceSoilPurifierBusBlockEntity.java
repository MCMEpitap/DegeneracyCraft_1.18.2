package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceSoilPurifierBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceSoilPurifierBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceSoilPurifierBusType.INSTANCE}, pos, state);
    }
}
