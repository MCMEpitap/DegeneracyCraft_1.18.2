package net.epitap.degeneracycraft.pipe.test.render;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.pipe.render.PipeModelValue;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.BlockModelRotation;
import net.minecraft.client.resources.model.UnbakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;

public class TestPipeModelRegistry {
    public enum TestDCModel {
        TEST_BASIC_ENERGY_PIPE_BLOCK_EXTRACT("block/test_basic_energy_pipe_extract");

        private final ResourceLocation resource;
        private final PipeModelValue<BakedModel> cachedModel;

        TestDCModel(String name) {
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
        for (TestDCModel model : TestDCModel.values()) {
            ForgeModelBakery.addSpecialModel(model.getResourceLocation());
        }
    }

    public static void onModelBake(ModelBakeEvent registryEvent) {
        for (TestDCModel model : TestDCModel.values()) {
            model.getCachedModel().invalidate();
        }
    }
}
