package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceCircuitBuilderBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceCircuitBuilderBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceCircuitBuilderBusType.INSTANCE}, pos, state);
    }
}
