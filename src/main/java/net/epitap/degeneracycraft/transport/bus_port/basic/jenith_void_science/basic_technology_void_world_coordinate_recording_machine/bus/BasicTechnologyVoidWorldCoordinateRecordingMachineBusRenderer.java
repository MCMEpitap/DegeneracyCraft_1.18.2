package net.epitap.degeneracycraft.transport.bus_port.basic.jenith_void_science.basic_technology_void_world_coordinate_recording_machine.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry.DCPortModel;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortRendererBase;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicTechnologyVoidWorldCoordinateRecordingMachineBusRenderer extends PortRendererBase {
    public BasicTechnologyVoidWorldCoordinateRecordingMachineBusRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public DCPortModel getModel() {
        return DCPortModel.BASIC_TECHNOLOGY_VOID_WORLD_COORDINATE_RECORDING_MACHINE_BUS_BLOCK_EXTRACT;
    }
}
