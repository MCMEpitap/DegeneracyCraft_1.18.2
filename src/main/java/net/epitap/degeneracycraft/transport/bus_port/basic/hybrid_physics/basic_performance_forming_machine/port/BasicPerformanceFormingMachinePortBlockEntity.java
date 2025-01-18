package net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceFormingMachinePortBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceFormingMachinePortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceFormingMachinePortType.INSTANCE}, pos, state);
    }
}
