package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyUniversalAssemblerBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyUniversalAssemblerBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyUniversalAssemblerBusType.INSTANCE}, pos, state);
    }
}
