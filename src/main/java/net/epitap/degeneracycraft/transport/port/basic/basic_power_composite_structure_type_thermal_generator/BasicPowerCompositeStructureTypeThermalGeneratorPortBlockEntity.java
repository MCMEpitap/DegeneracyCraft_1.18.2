package net.epitap.degeneracycraft.transport.port.basic.basic_power_composite_structure_type_thermal_generator;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.port.basic.basic_machine_element_processor.BasicMachineElementProcessorPortType;
import net.epitap.degeneracycraft.transport.port.entities.PortWorkBlockEntity;
import net.epitap.degeneracycraft.transport.port.portbase.PortTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity extends PortWorkBlockEntity {
    public BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicMachineElementProcessorPortType.INSTANCE}, pos, state);
    }
}
