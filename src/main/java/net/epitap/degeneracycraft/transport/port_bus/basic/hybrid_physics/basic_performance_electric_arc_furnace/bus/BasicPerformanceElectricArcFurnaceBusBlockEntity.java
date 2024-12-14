package net.epitap.degeneracycraft.transport.port_bus.basic.hybrid_physics.basic_performance_electric_arc_furnace.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceElectricArcFurnaceBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceElectricArcFurnaceBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceElectricArcFurnaceBusType.INSTANCE}, pos, state);
    }
}
