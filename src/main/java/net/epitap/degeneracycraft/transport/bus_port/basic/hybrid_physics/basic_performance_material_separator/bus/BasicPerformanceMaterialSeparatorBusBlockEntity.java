package net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceMaterialSeparatorBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceMaterialSeparatorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceMaterialSeparatorBusType.INSTANCE}, pos, state);
    }
}
