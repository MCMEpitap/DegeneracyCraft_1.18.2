package net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder;

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

public class BasicTechnologyCircuitBuilderRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final float energy;
    final float time;
    final ItemStack input0;
    final ItemStack input1;
    final ItemStack input2;
    final ItemStack input3;
    final ItemStack input4;
    final ItemStack input5;
    final ItemStack input6;
    final ItemStack input7;
    final ItemStack input8;
    final ItemStack output0;

    public BasicTechnologyCircuitBuilderRecipe(ResourceLocation id, float energy, float time, ItemStack input0, ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4, ItemStack input5, ItemStack input6, ItemStack input7, ItemStack input8, ItemStack output0) {
        this.id = id;
        this.energy = energy;
        this.time = time;
        this.input0 = input0;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
        this.input6 = input6;
        this.input7 = input7;
        this.input8 = input8;
        this.output0 = output0;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level level) {
        return energy == getRequiredEnergy() && time == getRequiredTime()
                && input0.is(pContainer.getItem(0).getItem())
                && input1.is(pContainer.getItem(1).getItem())
                && input2.is(pContainer.getItem(2).getItem())
                && input3.is(pContainer.getItem(3).getItem())
                && input4.is(pContainer.getItem(4).getItem())
                && input5.is(pContainer.getItem(5).getItem())
                && input6.is(pContainer.getItem(6).getItem())
                && input7.is(pContainer.getItem(7).getItem())
                && input8.is(pContainer.getItem(8).getItem());
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

    public ItemStack getInput3Item() {
        return input3;
    }

    public ItemStack getInput4Item() {
        return input4;
    }

    public ItemStack getInput5Item() {
        return input5;
    }

    public ItemStack getInput6Item() {
        return input6;
    }

    public ItemStack getInput7Item() {
        return input7;
    }

    public ItemStack getInput8Item() {
        return input8;
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

    public static class Type implements RecipeType<BasicTechnologyCircuitBuilderRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_precision_circuit_builder_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicTechnologyCircuitBuilderRecipe> {
        public static final Serializer INSTANCE = new Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_precision_circuit_builder_recipe");

        public BasicTechnologyCircuitBuilderRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
            ItemStack input0 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack input1 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input1"));
            ItemStack input2 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input2"));
            ItemStack input3 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input3"));
            ItemStack input4 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input4"));
            ItemStack input5 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input5"));
            ItemStack input6 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input6"));
            ItemStack input7 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input7"));
            ItemStack input8 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input8"));
            ItemStack output0 = BasicTechnologyCircuitBuilderRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));

            return new BasicTechnologyCircuitBuilderRecipe(pRecipeId, energy, time, input0, input1, input2, input3, input4, input5, input6, input7, input8, output0);
        }

        @Override
        public @Nullable BasicTechnologyCircuitBuilderRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            float energy = pBuffer.readFloat();
            float time = pBuffer.readFloat();
            ItemStack input0 = pBuffer.readItem();
            ItemStack input1 = pBuffer.readItem();
            ItemStack input2 = pBuffer.readItem();
            ItemStack input3 = pBuffer.readItem();
            ItemStack input4 = pBuffer.readItem();
            ItemStack input5 = pBuffer.readItem();
            ItemStack input6 = pBuffer.readItem();
            ItemStack input7 = pBuffer.readItem();
            ItemStack input8 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();

            return new BasicTechnologyCircuitBuilderRecipe(pRecipeId, energy, time, input0, input1, input2, input3, input4, input5, input6, input7, input8, output0);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicTechnologyCircuitBuilderRecipe pRecipe) {

            pBuffer.writeFloat(pRecipe.energy);
            pBuffer.writeFloat(pRecipe.time);
            pBuffer.writeItem(pRecipe.input0.getContainerItem());
            pBuffer.writeItem(pRecipe.input1.getContainerItem());
            pBuffer.writeItem(pRecipe.input2.getContainerItem());
            pBuffer.writeItem(pRecipe.input3.getContainerItem());
            pBuffer.writeItem(pRecipe.input4.getContainerItem());
            pBuffer.writeItem(pRecipe.input5.getContainerItem());
            pBuffer.writeItem(pRecipe.input6.getContainerItem());
            pBuffer.writeItem(pRecipe.input7.getContainerItem());
            pBuffer.writeItem(pRecipe.input8.getContainerItem());
            pBuffer.writeItem(pRecipe.output0.getContainerItem());
        }
    }
}
