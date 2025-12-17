package net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceMaterialSeparatorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceMaterialSeparatorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceMaterialSeparatorPortType.INSTANCE}, pos, state);
    }
}
