package net.epitap.degeneracycraft.transport.port_bus.basic.chemistry.basic_performance_electrolyser.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceElectrolyserPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceElectrolyserPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE__PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceElectrolyserPortType.INSTANCE}, pos, state);
    }
}
