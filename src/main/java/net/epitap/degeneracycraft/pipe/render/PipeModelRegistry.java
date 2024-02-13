package net.epitap.degeneracycraft.pipe.render;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.BlockModelRotation;
import net.minecraft.client.resources.model.UnbakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
public class PipeModelRegistry {
    public enum DCModel {
        BASIC_ENERGY_PIPE_BLOCK_EXTRACT("block/basic_energy_pipe_extract"),
        BASIC_ITEM_PIPE_BLOCK_EXTRACT("block/basic_item_pipe_extract"),
        FLOAT_ENERGY_PIPE_BLOCK_EXTRACT("block/basic_energy_pipe_extract");

    private final ResourceLocation resource;
    private final PipeModelValue<BakedModel> cachedModel;

    DCModel(String name) {
        resource = new ResourceLocation(Degeneracycraft.MOD_ID, name);
        cachedModel = new PipeModelValue<>(() -> {
            UnbakedModel modelOrMissing = ForgeModelBakery.instance().getModelOrMissing(resource);
            return modelOrMissing.bake(ForgeModelBakery.instance(), ForgeModelBakery.instance().getSpriteMap()::getSprite, BlockModelRotation.X0_Y0, resource);
        });
    }

    public ResourceLocation getResourceLocation() {
        return resource;
    }

    public PipeModelValue<BakedModel> getCachedModel() {
        return cachedModel;
    }
}

    public static void onModelRegister(ModelRegistryEvent registryEvent) {
        for (DCModel model : DCModel.values()) {
            ForgeModelBakery.instance().addSpecialModel(model.getResourceLocation());
        }
    }

    public static void onModelBake(ModelBakeEvent registryEvent) {
        for (DCModel model : DCModel.values()) {
            model.getCachedModel().invalidate();
        }
    }
}
