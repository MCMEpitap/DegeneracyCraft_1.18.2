package net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyElectromagneticInductorBusBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyElectromagneticInductorBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyElectromagneticInductorBusType.INSTANCE}, pos, state);
    }
}
