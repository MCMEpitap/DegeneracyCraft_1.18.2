package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceElectrolyserPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceElectrolyserPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceElectrolyserPortType.INSTANCE}, pos, state);
    }
}
