package net.epitap.degeneracycraft.transport.port_bus.basic.chemistry.basic_performance_electrolyser.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceElectrolyserBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceElectrolyserBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceElectrolyserBusType.INSTANCE}, pos, state);
    }
}
