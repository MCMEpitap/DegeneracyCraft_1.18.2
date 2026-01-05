package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceCropCultivatorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceCropCultivatorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_CROP_CULTIVATOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceCropCultivatorBusType.INSTANCE}, pos, state);
    }
}
