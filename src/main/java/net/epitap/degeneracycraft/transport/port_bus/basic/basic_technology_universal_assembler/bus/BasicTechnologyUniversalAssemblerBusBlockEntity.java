package net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_universal_assembler.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyUniversalAssemblerBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyUniversalAssemblerBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyUniversalAssemblerBusType.INSTANCE}, pos, state);
    }
}
