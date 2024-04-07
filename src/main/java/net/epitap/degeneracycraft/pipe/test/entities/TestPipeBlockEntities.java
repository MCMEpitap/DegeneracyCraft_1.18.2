package net.epitap.degeneracycraft.pipe.test.entities;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.pipe.test.basic.TestBasicItemPipeEntity;
import net.epitap.degeneracycraft.pipe.test.basic.TestBasicItemPipeRenderer;
import net.epitap.degeneracycraft.pipe.test.blocks.TestPipeBlocks;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;

public class TestPipeBlockEntities {
    public static BlockEntityType<TestBasicItemPipeEntity> TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY;

    public static void registerBlockEntities(RegistryEvent.Register<BlockEntityType<?>> register) {

        TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY = BlockEntityType.Builder.of(TestBasicItemPipeEntity::new, TestPipeBlocks.TEST_BASIC_ITEM_PIPE_BLOCK).build(null);
        TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "test_basic_item_pipe"));
        register.getRegistry().register(TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY);

    }

    @OnlyIn(Dist.CLIENT)
    public static void clientSetup() {
        BlockEntityRenderers.register(TEST_BASIC_ITEM_PIPE_BLOCK_ENTITY, TestBasicItemPipeRenderer::new);
    }
}
