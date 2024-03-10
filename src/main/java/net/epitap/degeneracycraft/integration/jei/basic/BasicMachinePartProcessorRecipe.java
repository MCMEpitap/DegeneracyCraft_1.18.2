package net.epitap.degeneracycraft.integration.jei.basic;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

public class BasicMachinePartProcessorRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final float energy;
    final float time;
//    final ItemStack input0;
//    final ItemStack input1;
//    final ItemStack input2;
//    final ItemStack input3;
//    final ItemStack input4;
//    final ItemStack input5;
//    final ItemStack input6;
//    final ItemStack input7;
//    final ItemStack input8;
    final ItemStack output0;

    private final NonNullList<Ingredient> recipeItems;

    public BasicMachinePartProcessorRecipe(ResourceLocation id, float energy, float time, NonNullList<Ingredient> recipeItems, ItemStack output0) {
        this.id = id;
        this.energy = energy;
        this.time = time;
//        this.input0 = input0;
//        this.input1 = input1;
//        this.input2 = input2;
//        this.input3 = input3;
//        this.input4 = input4;
//        this.input5 = input5;
//        this.input6 = input6;
//        this.input7 = input7;
//        this.input8 = input8;
        this.output0 = output0;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level level) {
//        return energy == getRequiredEnergy() && time == getRequiredTime()
//                && input0.is(pContainer.getItem(0).getItem())
//                && input1.is(pContainer.getItem(1).getItem())
//                && input2.is(pContainer.getItem(2).getItem())
//                && input3.is(pContainer.getItem(3).getItem())
//                && input4.is(pContainer.getItem(4).getItem())
//                && input5.is(pContainer.getItem(5).getItem())
//                && input6.is(pContainer.getItem(6).getItem())
//                && input7.is(pContainer.getItem(7).getItem())
//                && input8.is(pContainer.getItem(8).getItem());

        return recipeItems.get(0).test(pContainer.getItem(0))
                && recipeItems.get(1).test(pContainer.getItem(1))
                && recipeItems.get(2).test(pContainer.getItem(2))
                && recipeItems.get(3).test(pContainer.getItem(3))
                && recipeItems.get(4).test(pContainer.getItem(4))
                && recipeItems.get(5).test(pContainer.getItem(5))
                && recipeItems.get(6).test(pContainer.getItem(6))
                && recipeItems.get(7).test(pContainer.getItem(7))
                && recipeItems.get(8).test(pContainer.getItem(8))

                ;

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

//    public ItemStack getInput0Item() {
//        return input0;
//    }
//    public ItemStack getInput1Item() {
//        return input1;
//    }
//    public ItemStack getInput2Item() {
//        return input2;
//    }
//    public ItemStack getInput3Item() {
//        return input3;
//    }
//    public ItemStack getInput4Item() {
//        return input4;
//    }
//    public ItemStack getInput5Item() {
//        return input5;
//    }
//    public ItemStack getInput6Item() {
//        return input6;
//    }
//    public ItemStack getInput7Item() {
//        return input7;
//    }
//    public ItemStack getInput8Item() {
//        return input8;
//    }
    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    public ItemStack getOutput0Item() {
        return output0;
    }

    @Override
    public ItemStack getResultItem() {
        return output0;
    }

    public Ingredient at(int slot) {
        return recipeItems.get(slot);
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    public static ItemStack itemStackFromJson(JsonObject pStackObject) {
        return CraftingHelper.getItemStack(pStackObject, true, false);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return BasicMachinePartProcessorRecipe.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return BasicMachinePartProcessorRecipe.Type.INSTANCE;
    }

    public static class Type implements RecipeType<BasicMachinePartProcessorRecipe> {
        private Type() {
        }
        public static final BasicMachinePartProcessorRecipe.Type INSTANCE = new BasicMachinePartProcessorRecipe.Type();
        public static final String ID = "basic_machine_part_processor_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicMachinePartProcessorRecipe> {
        public Serializer() {
        }

        public static final BasicMachinePartProcessorRecipe.Serializer INSTANCE = new BasicMachinePartProcessorRecipe.Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_machine_part_processor_recipe");

        public BasicMachinePartProcessorRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
//            ItemStack input0 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
//            ItemStack input1 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input1"));
//            ItemStack input2 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input2"));
//            ItemStack input3 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input3"));
//            ItemStack input4 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input4"));
//            ItemStack input5 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input5"));
//            ItemStack input6 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input6"));
//            ItemStack input7 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input7"));
//            ItemStack input8 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input8"));
            ItemStack output0 = BasicMachinePartProcessorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));
//
//            return new BasicMachinePartProcessorRecipe(pRecipeId, energy, time, input0, input1, input2, input3, input4, input5, input6, input7, input8, output0);


            JsonArray ingredients = GsonHelper.getAsJsonArray(pJson, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(10, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }
            return new BasicMachinePartProcessorRecipe(pRecipeId,energy,time,inputs,output0);
        }

        @Override
        public @Nullable BasicMachinePartProcessorRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            float energy = pBuffer.readFloat();
            float time = pBuffer.readFloat();
//            ItemStack input0 = pBuffer.readItem();
//            ItemStack input1 = pBuffer.readItem();
//            ItemStack input2 = pBuffer.readItem();
//            ItemStack input3 = pBuffer.readItem();
//            ItemStack input4 = pBuffer.readItem();
//            ItemStack input5 = pBuffer.readItem();
//            ItemStack input6 = pBuffer.readItem();
//            ItemStack input7 = pBuffer.readItem();
//            ItemStack input8 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();
//
            NonNullList<Ingredient> inputs = NonNullList.withSize(10, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(pBuffer));
            }

//            return new BasicMachinePartProcessorRecipe(pRecipeId, energy, time, input0, input1, input2, input3, input4, input5, input6, input7, input8, output0);
            return new BasicMachinePartProcessorRecipe(pRecipeId,energy,time,inputs,output0);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicMachinePartProcessorRecipe pRecipe) {

            pBuffer.writeFloat(pRecipe.energy);
            pBuffer.writeFloat(pRecipe.time);
//            pBuffer.writeItem(pRecipe.input0.getContainerItem());
//            pBuffer.writeItem(pRecipe.input1.getContainerItem());
//            pBuffer.writeItem(pRecipe.input2.getContainerItem());
//            pBuffer.writeItem(pRecipe.input3.getContainerItem());
//            pBuffer.writeItem(pRecipe.input4.getContainerItem());
//            pBuffer.writeItem(pRecipe.input5.getContainerItem());
//            pBuffer.writeItem(pRecipe.input6.getContainerItem());
//            pBuffer.writeItem(pRecipe.input7.getContainerItem());
//            pBuffer.writeItem(pRecipe.input8.getContainerItem());
//            pBuffer.writeItem(pRecipe.output0.getContainerItem());
            pBuffer.writeInt(pRecipe.getIngredients().size());
            for (Ingredient ing : pRecipe.getIngredients()) {
                ing.toNetwork(pBuffer);
            }
            pBuffer.writeItemStack(pRecipe.getResultItem(), false);
        }
    }
}
