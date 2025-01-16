package net.epitap.degeneracycraft.transport.pipe.pipebase;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.BasicEnergyPipeBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.BasicEnergyPipeRenderer;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.floa.FloatEnergyPipeBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.floa.FloatEnergyPipeRenderer;
import net.epitap.degeneracycraft.transport.pipe.basic.item.BasicItemPipeEntity;
import net.epitap.degeneracycraft.transport.pipe.basic.item.BasicItemPipeRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;

public class PipeBlockEntities {
    public static BlockEntityType<BasicItemPipeEntity> BASIC_ITEM_PIPE_BLOCK_ENTITY;
    public static BlockEntityType<BasicEnergyPipeBlockEntity> BASIC_ENERGY_PIPE_BLOCK_ENTITY;
    public static BlockEntityType<FloatEnergyPipeBlockEntity> FLOAT_ENERGY_PIPE_BLOCK_ENTITY;

    public static void registerBlockEntities(RegistryEvent.Register<BlockEntityType<?>> register) {

        BASIC_ITEM_PIPE_BLOCK_ENTITY = BlockEntityType.Builder.of(BasicItemPipeEntity::new, PipeBlocks.BASIC_ITEM_PIPE_BLOCK).build(null);
        BASIC_ITEM_PIPE_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_item_pipe"));
        register.getRegistry().register(BASIC_ITEM_PIPE_BLOCK_ENTITY);

        BASIC_ENERGY_PIPE_BLOCK_ENTITY = BlockEntityType.Builder.of(BasicEnergyPipeBlockEntity::new, PipeBlocks.BASIC_ENERGY_PIPE_BLOCK).build(null);
        BASIC_ENERGY_PIPE_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_energy_pipe"));
        register.getRegistry().register(BASIC_ENERGY_PIPE_BLOCK_ENTITY);

        FLOAT_ENERGY_PIPE_BLOCK_ENTITY = BlockEntityType.Builder.of(FloatEnergyPipeBlockEntity::new, PipeBlocks.FLOAT_ENERGY_PIPE_BLOCK).build(null);
        FLOAT_ENERGY_PIPE_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "float_energy_pipe"));
        register.getRegistry().register(FLOAT_ENERGY_PIPE_BLOCK_ENTITY);
    }

    @OnlyIn(Dist.CLIENT)
    public static void clientSetup() {
        BlockEntityRenderers.register(BASIC_ITEM_PIPE_BLOCK_ENTITY, BasicItemPipeRenderer::new);
        BlockEntityRenderers.register(BASIC_ENERGY_PIPE_BLOCK_ENTITY, BasicEnergyPipeRenderer::new);
        BlockEntityRenderers.register(FLOAT_ENERGY_PIPE_BLOCK_ENTITY, FloatEnergyPipeRenderer::new);
    }
}
