package net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine;

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

public class BasicPerformanceFormingMachineRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final float energy;
    final float time;
    final ItemStack input0;
    final ItemStack input1;
    final ItemStack output0;

    public BasicPerformanceFormingMachineRecipe(ResourceLocation id, float energy, float time, ItemStack input0, ItemStack input1, ItemStack output0) {
        this.id = id;
        this.energy = energy;
        this.time = time;
        this.input0 = input0;
        this.input1 = input1;
        this.output0 = output0;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level level) {
        return energy == getRequiredEnergy() && time == getRequiredTime()
                && input0.is(pContainer.getItem(0).getItem())
                && input1.is(pContainer.getItem(1).getItem());
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

    public ItemStack getOutput0Item() {
        return output0;
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

    public static class Type implements RecipeType<BasicPerformanceFormingMachineRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_performance_forming_machine_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicPerformanceFormingMachineRecipe> {
        public static final Serializer INSTANCE = new Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_performance_forming_machine_recipe");

        public BasicPerformanceFormingMachineRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
            ItemStack input0 = BasicPerformanceFormingMachineRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack input1 = BasicPerformanceFormingMachineRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input1"));
            ItemStack output0 = BasicPerformanceFormingMachineRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));

            return new BasicPerformanceFormingMachineRecipe(pRecipeId, energy, time, input0, input1, output0);
        }

        @Override
        public @Nullable BasicPerformanceFormingMachineRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            float energy = pBuffer.readFloat();
            float time = pBuffer.readFloat();
            ItemStack input0 = pBuffer.readItem();
            ItemStack input1 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();

            return new BasicPerformanceFormingMachineRecipe(pRecipeId, energy, time, input0, input1, output0);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicPerformanceFormingMachineRecipe pRecipe) {
            pBuffer.writeFloat(pRecipe.energy);
            pBuffer.writeFloat(pRecipe.time);
            pBuffer.writeItem(pRecipe.input0.getContainerItem());
            pBuffer.writeItem(pRecipe.input1.getContainerItem());
            pBuffer.writeItem(pRecipe.output0.getContainerItem());
        }
    }
}
