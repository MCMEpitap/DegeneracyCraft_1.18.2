package net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_fine_particle_adsorber;

import com.google.gson.JsonObject;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

public class BasicPerformanceFineParticleAdsorberRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final float energy;
    final float time;
    final ItemStack input0;
    final ItemStack output0;
    final ItemStack output1;
    final ItemStack output2;

    public BasicPerformanceFineParticleAdsorberRecipe(ResourceLocation id, float energy, float time, ItemStack input0, ItemStack output0, ItemStack output1, ItemStack output2) {
        this.id = id;
        this.energy = energy;
        this.time = time;
        this.input0 = input0;
        this.output0 = output0;
        this.output1 = output1;
        this.output2 = output2;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level level) {
        return energy == getRequiredEnergy() && time == getRequiredTime()
                && input0.is(pContainer.getItem(0).getItem());
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output0;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    public float getRequiredEnergy() {
        return energy;
    }

    public float getRequiredTime() {
        return time;
    }

    public ItemStack getInput0Item() {
        return input0;
    }

    public ItemStack getOutput0Item() {
        return output0;
    }
    public ItemStack getOutput1Item() {
        return output1;
    }
    public ItemStack getOutput2Item() {
        return output2;
    }


    @Override
    public ItemStack getResultItem() {
        return output0;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }


    public static ItemStack itemStackFromJson(JsonObject pStackObject) {
        return CraftingHelper.getItemStack(pStackObject, true, false);
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<BasicPerformanceFineParticleAdsorberRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_performance_fine_particle_adsorber_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicPerformanceFineParticleAdsorberRecipe> {
        public static final Serializer INSTANCE = new Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_performance_fine_particle_adsorber_recipe");

        public BasicPerformanceFineParticleAdsorberRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
            ItemStack input0 = BasicPerformanceFineParticleAdsorberRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack output0 = BasicPerformanceFineParticleAdsorberRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));
            ItemStack output1 = BasicPerformanceFineParticleAdsorberRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output1"));
            ItemStack output2 = BasicPerformanceFineParticleAdsorberRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output2"));
            return new BasicPerformanceFineParticleAdsorberRecipe(pRecipeId, energy, time, input0, output0, output1, output2);
        }

        @Override
        public @Nullable BasicPerformanceFineParticleAdsorberRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            float energy = pBuffer.readFloat();
            float time = pBuffer.readFloat();
            ItemStack input0 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();
            ItemStack output1 = pBuffer.readItem();
            ItemStack output2 = pBuffer.readItem();

            return new BasicPerformanceFineParticleAdsorberRecipe(pRecipeId, energy, time, input0, output0, output1, output2);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicPerformanceFineParticleAdsorberRecipe pRecipe) {
            pBuffer.writeFloat(pRecipe.energy);
            pBuffer.writeFloat(pRecipe.time);
            pBuffer.writeItem(pRecipe.input0.getContainerItem());
            pBuffer.writeItem(pRecipe.output0.getContainerItem());
            pBuffer.writeItem(pRecipe.output1.getContainerItem());
            pBuffer.writeItem(pRecipe.output2.getContainerItem());

        }
    }
}
