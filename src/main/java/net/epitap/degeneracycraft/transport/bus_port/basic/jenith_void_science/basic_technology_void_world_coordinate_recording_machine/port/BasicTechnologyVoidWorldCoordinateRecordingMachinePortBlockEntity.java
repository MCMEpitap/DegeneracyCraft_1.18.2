package net.epitap.degeneracycraft.transport.bus_port.basic.jenith_void_science.basic_technology_void_world_coordinate_recording_machine.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyVoidWorldCoordinateRecordingMachinePortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyVoidWorldCoordinateRecordingMachinePortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_VOID_WORLD_COORDINATE_RECORDING_MACHINE_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyVoidWorldCoordinateRecordingMachinePortType.INSTANCE}, pos, state);
    }
}
