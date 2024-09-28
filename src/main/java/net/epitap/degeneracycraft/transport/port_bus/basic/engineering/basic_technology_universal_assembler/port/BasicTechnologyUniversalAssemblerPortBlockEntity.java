package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_universal_assembler.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyUniversalAssemblerPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyUniversalAssemblerPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyUniversalAssemblerPortType.INSTANCE}, pos, state);
    }
}
