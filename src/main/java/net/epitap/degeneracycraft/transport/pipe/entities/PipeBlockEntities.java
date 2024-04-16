package net.epitap.degeneracycraft.transport.pipe.entities;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.transport.pipe.basic.BasicItemPipeEntity;
import net.epitap.degeneracycraft.transport.pipe.basic.BasicItemPipeRenderer;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlocks;
import net.epitap.degeneracycraft.transport.pipe.energy.BasicEnergyPipeBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.energy.BasicEnergyPipeRenderer;
import net.epitap.degeneracycraft.transport.pipe.energy.floa.FloatEnergyPipeBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.energy.floa.FloatEnergyPipeRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;

public class PipeBlockEntities {
    public static BlockEntityType<BasicItemPipeEntity> BASIC_ITEM_PIPE_BLOCK_ENTITY;
    public static BlockEntityType<BasicEnergyPipeBlockEntity> ENERGY_PIPE;
    public static BlockEntityType<FloatEnergyPipeBlockEntity> FLOAT_ENERGY_PIPE_BLOCK_ENTITY;

    public static void registerBlockEntities(RegistryEvent.Register<BlockEntityType<?>> register) {

        BASIC_ITEM_PIPE_BLOCK_ENTITY = BlockEntityType.Builder.of(BasicItemPipeEntity::new, PipeBlocks.BASIC_ITEM_PIPE_BLOCK).build(null);
        BASIC_ITEM_PIPE_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_item_pipe"));
        register.getRegistry().register(BASIC_ITEM_PIPE_BLOCK_ENTITY);

        ENERGY_PIPE = BlockEntityType.Builder.of(BasicEnergyPipeBlockEntity::new, PipeBlocks.BASIC_ENERGY_PIPE_BLOCK).build(null);
        ENERGY_PIPE.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "energy_pipe"));
        register.getRegistry().register(ENERGY_PIPE);

        FLOAT_ENERGY_PIPE_BLOCK_ENTITY = BlockEntityType.Builder.of(FloatEnergyPipeBlockEntity::new, PipeBlocks.FLOAT_ENERGY_PIPE_BLOCK).build(null);
        FLOAT_ENERGY_PIPE_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "float_energy_pipe"));
        register.getRegistry().register(FLOAT_ENERGY_PIPE_BLOCK_ENTITY);
    }

    @OnlyIn(Dist.CLIENT)
    public static void clientSetup() {
        BlockEntityRenderers.register(BASIC_ITEM_PIPE_BLOCK_ENTITY, BasicItemPipeRenderer::new);
        BlockEntityRenderers.register(ENERGY_PIPE, BasicEnergyPipeRenderer::new);
        BlockEntityRenderers.register(FLOAT_ENERGY_PIPE_BLOCK_ENTITY, FloatEnergyPipeRenderer::new);
    }
}
