package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceSoilPurifierPortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceSoilPurifierPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_SOIL_PURIFIER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceSoilPurifierPortType.INSTANCE}, pos, state);
    }
}
