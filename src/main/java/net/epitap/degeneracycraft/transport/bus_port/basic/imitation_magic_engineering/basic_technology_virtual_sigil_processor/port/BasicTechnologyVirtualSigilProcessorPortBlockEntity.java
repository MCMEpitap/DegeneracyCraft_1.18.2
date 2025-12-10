package net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.port;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTechnologyVirtualSigilProcessorPortBlockEntity extends PortWorkBlockEntity {
    public BasicTechnologyVirtualSigilProcessorPortBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_PORT_BLOCK_ENTITY.get(), new PortTypeBase[]{BasicTechnologyVirtualSigilProcessorPortType.INSTANCE}, pos, state);
    }
}
