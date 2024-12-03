//package net.epitap.degeneracycraft.integration.jei.test;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import net.epitap.degeneracycraft.Degeneracycraft;
//import net.minecraft.core.NonNullList;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.util.GsonHelper;
//import net.minecraft.world.SimpleContainer;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.crafting.*;
//import net.minecraft.world.level.Level;
//import org.jetbrains.annotations.Nullable;
//
//public class BasicPowerSteamGeneratorMultiblockStructure implements Recipe<SimpleContainer> {
//        private final ResourceLocation id;
//        private final ItemStack output;
//        private final NonNullList<JsonReadingItem> recipeItems;
//
//        public BasicPowerSteamGeneratorMultiblockStructure(ResourceLocation id, ItemStack output,
//                                       NonNullList<JsonReadingItem> recipeItems) {
//            this.id = id;
//            this.output = output;
//            this.recipeItems = recipeItems;
//        }
//
//        @Override
//        public boolean matches(SimpleContainer pContainer, Level pLevel) {
//            return recipeItems.get(0).test(pContainer.getItem(1));
//        }
//
//        @Override
//        public NonNullList<JsonReadingItem> getIngredients() {
//            return recipeItems;
//        }
//
//        @Override
//        public ItemStack assemble(SimpleContainer pContainer) {
//            return output;
//        }
//
//        @Override
//        public boolean canCraftInDimensions(int pWidth, int pHeight) {
//            return true;
//        }
//
//        @Override
//        public ItemStack getResultItem() {
//            return output.copy();
//        }
//
//        @Override
//        public ResourceLocation getId() {
//            return id;
//        }
//
//        @Override
//        public RecipeSerializer<?> getSerializer() {
//            return Serializer.INSTANCE;
//        }
//
//        @Override
//        public RecipeType<?> getType() {
//            return Type.INSTANCE;
//        }
//
//        public static class Type implements RecipeType<BasicPowerSteamGeneratorMultiblockStructure> {
//            private Type() { }
//            public static final Type INSTANCE = new Type();
//            public static final String ID = "basic_power_steam_generator_multiblock_structure";
//        }
//
//        public static class Serializer implements RecipeSerializer<BasicPowerSteamGeneratorMultiblockStructure> {
//            public static final Serializer INSTANCE = new Serializer();
//            public static final ResourceLocation ID =
//                    new ResourceLocation(Degeneracycraft.MOD_ID,"basic_power_steam_generator_multiblock_structure");
//
//            @Override
//            public BasicPowerSteamGeneratorMultiblockStructure fromJson(ResourceLocation id, JsonObject json) {
//                ItemStack output = JsonReadingHelper.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
//
//                JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
//                NonNullList<JsonReadingItem> inputs = NonNullList.withSize(1, JsonReadingItem.EMPTY);
//
//                for (int i = 0; i < inputs.size(); i++) {
//                    inputs.set(i, JsonReadingItem.fromJson(ingredients.get(i)));
//                }
//
//                return new BasicPowerSteamGeneratorMultiblockStructure(id, output, inputs);
//            }
//
//            @Override
//            public BasicPowerSteamGeneratorMultiblockStructure fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
//                NonNullList<JsonReadingItem> inputs = NonNullList.withSize(buf.readInt(), JsonReadingItem.EMPTY);
//
//                for (int i = 0; i < inputs.size(); i++) {
//                    inputs.set(i, JsonReadingItem.fromNetwork(buf));
//                }
//
//                ItemStack output = buf.readItem();
//                return new BasicPowerSteamGeneratorMultiblockStructure(id, output, inputs);
//            }
//
//            @Override
//            public void toNetwork(FriendlyByteBuf buf, BasicPowerSteamGeneratorMultiblockStructure recipe) {
//                buf.writeInt(recipe.getIngredients().size());
//                for (JsonReadingItem ing : recipe.getIngredients()) {
//                    ing.toNetwork(buf);
//                }
//                buf.writeItemStack(recipe.getResultItem(), false);
//            }
//
//            @Override
//            public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
//                return INSTANCE;
//            }
//
//            @Nullable
//            @Override
//            public ResourceLocation getRegistryName() {
//                return ID;
//            }
//
//            @Override
//            public Class<RecipeSerializer<?>> getRegistryType() {
//                return Serializer.castClass(RecipeSerializer.class);
//            }
//
//            @SuppressWarnings("unchecked") // Need this wrapper, because generics
//            private static <G> Class<G> castClass(Class<?> cls) {
//                return (Class<G>)cls;
//            }
//        }
//    }

package net.epitap.degeneracycraft.integration.jei.test;

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

public class BasicPowerSteamGeneratorMultiblockStructure implements Recipe<SimpleContainer> {
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

    public BasicPowerSteamGeneratorMultiblockStructure(ResourceLocation id, float energy, float time, ItemStack input0, ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4, ItemStack input5, ItemStack input6, ItemStack input7, ItemStack input8, ItemStack output0) {
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

    public static ItemStack itemStackFromJson(JsonObject pStackObject) {
        return CraftingHelper.getItemStack(pStackObject, true, false);
    }

//    public void main(String[] args) {
//        // 石の ItemStack を作成
//        ItemStack stoneStack = new ItemStack(this.itemStackFromJson);
//
//        // Block を取得
//        Block block = ItemStackToBlockConverter.getBlockFromItemStack(stoneStack);
//
//        if (block != null) {
//            System.out.println("Block: " + block);
//        } else {
//            System.out.println("この ItemStack に対応する Block はありません。");
//        }
//    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return BasicPowerSteamGeneratorMultiblockStructure.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return BasicPowerSteamGeneratorMultiblockStructure.Type.INSTANCE;
    }

    public static class Type implements RecipeType<BasicPowerSteamGeneratorMultiblockStructure> {
        private Type() {
        }

        public static final BasicPowerSteamGeneratorMultiblockStructure.Type INSTANCE = new BasicPowerSteamGeneratorMultiblockStructure.Type();
        public static final String ID = "basic_power_thermal_generator_multiblock_structure";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicPowerSteamGeneratorMultiblockStructure> {
        public Serializer() {
        }

        public static final BasicPowerSteamGeneratorMultiblockStructure.Serializer INSTANCE = new BasicPowerSteamGeneratorMultiblockStructure.Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_power_thermal_generator_multiblock_structure");

        public BasicPowerSteamGeneratorMultiblockStructure fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
            ItemStack input0 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack input1 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input1"));
            ItemStack input2 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input2"));
            ItemStack input3 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input3"));
            ItemStack input4 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input4"));
            ItemStack input5 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input5"));
            ItemStack input6 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input6"));
            ItemStack input7 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input7"));
            ItemStack input8 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input8"));
            ItemStack output0 = BasicPowerSteamGeneratorMultiblockStructure.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));

            return new BasicPowerSteamGeneratorMultiblockStructure(pRecipeId, energy, time, input0, input1, input2, input3, input4, input5, input6, input7, input8, output0);

        }

        @Override
        public @Nullable BasicPowerSteamGeneratorMultiblockStructure fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
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

            return new BasicPowerSteamGeneratorMultiblockStructure(pRecipeId, energy, time, input0, input1, input2, input3, input4, input5, input6, input7, input8, output0);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicPowerSteamGeneratorMultiblockStructure pRecipe) {

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
