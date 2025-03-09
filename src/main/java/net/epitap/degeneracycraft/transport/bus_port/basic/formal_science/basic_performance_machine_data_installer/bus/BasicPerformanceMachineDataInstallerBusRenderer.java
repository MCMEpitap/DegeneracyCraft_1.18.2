package net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPerformanceMachineDataInstallerBusRenderer extends PortRendererBase {
    public BasicPerformanceMachineDataInstallerBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK_EXTRACT;
    }
}
