package net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser;

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

public class BasicPerformanceElectrolyserRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final float energy;
    final float time;
    final ItemStack input0;
    final ItemStack input1;
    final ItemStack input2;
    final ItemStack output0;
    final ItemStack output1;

    public BasicPerformanceElectrolyserRecipe(ResourceLocation id, float energy, float time, ItemStack input0, ItemStack input1, ItemStack input2, ItemStack output0, ItemStack output1) {
        this.id = id;
        this.energy = energy;
        this.time = time;
        this.input0 = input0;
        this.input1 = input1;
        this.input2 = input2;
        this.output0 = output0;
        this.output1 = output1;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level level) {
        return energy == getRequiredEnergy() && time == getRequiredTime()
                && input0.is(pContainer.getItem(0).getItem())
                && input1.is(pContainer.getItem(2).getItem())
                && input2.is(pContainer.getItem(3).getItem());
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

    public ItemStack getInput1Item() {
        return input1;
    }

    public ItemStack getInput2Item() {
        return input2;
    }


    public ItemStack getOutput0Item() {
        return output0;
    }

    public ItemStack getOutput1Item() {
        return output1;
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

    public static class Type implements RecipeType<BasicPerformanceElectrolyserRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_performance_electrolyser_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicPerformanceElectrolyserRecipe> {
        public static final Serializer INSTANCE = new Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_performance_electrolyser_recipe");

        public BasicPerformanceElectrolyserRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
            ItemStack input0 = BasicPerformanceElectrolyserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack input1 = BasicPerformanceElectrolyserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input1"));
            ItemStack input2 = BasicPerformanceElectrolyserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input2"));
            ItemStack output0 = BasicPerformanceElectrolyserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));
            ItemStack output1 = BasicPerformanceElectrolyserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output1"));

            return new BasicPerformanceElectrolyserRecipe(pRecipeId, energy, time, input0, input1, input2, output0, output1);
        }

        @Override
        public @Nullable BasicPerformanceElectrolyserRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            float energy = pBuffer.readFloat();
            float time = pBuffer.readFloat();
            ItemStack input0 = pBuffer.readItem();
            ItemStack input1 = pBuffer.readItem();
            ItemStack input2 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();
            ItemStack output1 = pBuffer.readItem();

            return new BasicPerformanceElectrolyserRecipe(pRecipeId, energy, time, input0, input1, input2, output0, output1);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicPerformanceElectrolyserRecipe pRecipe) {
            pBuffer.writeFloat(pRecipe.energy);
            pBuffer.writeFloat(pRecipe.time);
            pBuffer.writeItem(pRecipe.input0.getContainerItem());
            pBuffer.writeItem(pRecipe.input1.getContainerItem());
            pBuffer.writeItem(pRecipe.input2.getContainerItem());
            pBuffer.writeItem(pRecipe.output0.getContainerItem());
            pBuffer.writeItem(pRecipe.output1.getContainerItem());
        }
    }
}
