package net.epitap.degeneracycraft.pipe.test.entities;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor.BasicMachineElementProcessorPortBlockEntity;
import net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor.BasicMachineElementProcessorPortRenderer;
import net.epitap.degeneracycraft.pipe.test.blocks.PortBlocks;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;

public class PortBlockEntities {
    public static BlockEntityType<BasicMachineElementProcessorPortBlockEntity> BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK;

    public static void registerBlockEntities(RegistryEvent.Register<BlockEntityType<?>> register) {

        BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK = BlockEntityType.Builder.of(BasicMachineElementProcessorPortBlockEntity::new, PortBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK).build(null);
        BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_machine_element_processor_port_block_entity"));
        register.getRegistry().register(BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK);

    }

    @OnlyIn(Dist.CLIENT)
    public static void clientSetup() {
        BlockEntityRenderers.register(BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK, BasicMachineElementProcessorPortRenderer::new);
    }
}
