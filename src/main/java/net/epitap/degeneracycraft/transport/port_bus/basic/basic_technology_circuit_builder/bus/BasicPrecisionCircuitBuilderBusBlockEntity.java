package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_circuit_builder.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPrecisionCircuitBuilderBusBlockEntity extends PortWorkBlockEntity {
    public BasicPrecisionCircuitBuilderBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPrecisionCircuitBuilderBusType.INSTANCE}, pos, state);
    }
}
