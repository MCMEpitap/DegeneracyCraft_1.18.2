package net.epitap.degeneracycraft.transport.port_bus.basic.basic_precision_circuit_builder.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPrecisionCircuitBuilderPortBlockEntity extends PortWorkBlockEntity {
    public BasicPrecisionCircuitBuilderPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPrecisionCircuitBuilderPortType.INSTANCE}, pos, state);
    }
}
