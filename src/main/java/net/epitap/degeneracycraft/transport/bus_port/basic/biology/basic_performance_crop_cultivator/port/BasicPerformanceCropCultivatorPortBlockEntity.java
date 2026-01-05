package net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceCropCultivatorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceCropCultivatorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_CROP_CULTIVATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceCropCultivatorPortType.INSTANCE}, pos, state);
    }
}
