package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.bus;
//

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceMachineDataInstallerBusBlockEntity extends PortWorkBlockEntity {
    public BasicPerformanceMachineDataInstallerBusBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicPerformanceMachineDataInstallerBusType.INSTANCE}, pos, state);
    }
}
