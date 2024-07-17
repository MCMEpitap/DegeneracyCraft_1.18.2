package net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_composite_structure_type_thermal_generator;

import net.epitap.degeneracycraft.transport.port_bus.portbase.PortRendererBase;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BasicPowerCompositeStructureTypeThermalGeneratorPortRenderer extends PortRendererBase {
    public BasicPowerCompositeStructureTypeThermalGeneratorPortRenderer(BlockEntityRendererProvider.Context renderer) {
        super(renderer);
    }

    @Override
    public PortModelRegistry.DCPortModel getModel() {
        return PortModelRegistry.DCPortModel.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_BLOCK_EXTRACT;
    }
}
