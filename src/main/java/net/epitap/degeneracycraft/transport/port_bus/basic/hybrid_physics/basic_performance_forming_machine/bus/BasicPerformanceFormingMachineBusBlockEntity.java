package net.epitap.degeneracycraft.transport.port_bus.basic.hybrid_physics.basic_performance_forming_machine.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceFormingMachineBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceFormingMachineBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceFormingMachineBusType.INSTANCE}, pos, state);
    }
}