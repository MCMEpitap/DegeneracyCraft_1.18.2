package net.epitap.degeneracycraft.integration.jei.basic.basic_technology_universal_assembler;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class BasicTechnologyUniversalAssemblerRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;


    public BasicTechnologyUniversalAssemblerRecipe(ResourceLocation recipeId, NonNullList<Ingredient> inputs, ItemStack output) {
        this.id = recipeId;
        this.recipeItems = inputs;
        this.output = output;
    }


    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return recipeItems.get(0).test(pContainer.getItem(1))
                && recipeItems.get(1).test(pContainer.getItem(1))
                && recipeItems.get(2).test(pContainer.getItem(1))
                && recipeItems.get(3).test(pContainer.getItem(1))
                && recipeItems.get(4).test(pContainer.getItem(1))
                && recipeItems.get(5).test(pContainer.getItem(1))
                && recipeItems.get(6).test(pContainer.getItem(1))
                && recipeItems.get(7).test(pContainer.getItem(1))
                && recipeItems.get(8).test(pContainer.getItem(1))
                && recipeItems.get(9).test(pContainer.getItem(1))
                ;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return this.output;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return BasicTechnologyUniversalAssemblerRecipe.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE;
    }

    public static class Type implements RecipeType<BasicTechnologyUniversalAssemblerRecipe> {
        private Type() {
        }

        public static final BasicTechnologyUniversalAssemblerRecipe.Type INSTANCE = new BasicTechnologyUniversalAssemblerRecipe.Type();
        public static final String ID = "universal_assembler_phase1_recipe";
    }

    private static String[] patternFromJson(JsonArray jsonArr) {
        var astring = new String[jsonArr.size()];
        for (int i = 0; i < astring.length; ++i) {
            var s = GsonHelper.convertToString(jsonArr.get(i), "pattern[" + i + "]");

            if (i > 0 && astring[0].length() != s.length()) {
                throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            astring[i] = s;
        }

        return astring;
    }


    public static class Serializer implements RecipeSerializer<BasicTechnologyUniversalAssemblerRecipe> {
        public static final BasicTechnologyUniversalAssemblerRecipe.Serializer INSTANCE = new BasicTechnologyUniversalAssemblerRecipe.Serializer();
        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "universal_assembler_phase1_recipe");

        @Override
        public BasicTechnologyUniversalAssemblerRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(10, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }


            return new BasicTechnologyUniversalAssemblerRecipe(id, inputs, output);
        }


//        @Override
//        public BasicTechnologyUniversalAssemblerRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
//            var map = ShapedRecipe.keyFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "key"));
//            var pattern = ShapedRecipe.shrink(BasicTechnologyUniversalAssemblerRecipe.patternFromJson(GsonHelper.getAsJsonArray(pSerializedRecipe, "pattern")));
//            int width = pattern[0].length();
//            int height = pattern.length;
//            var inputs = ShapedRecipe.dissolvePattern(pattern, map, width, height);
//            var output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "result"));
//            int tier = GsonHelper.getAsInt(pSerializedRecipe, "tier", 0);
//            int size = tier * 2 + 1;
//
//            if (tier != 0 && (width > size || height > size))
//                throw new JsonSyntaxException("The pattern size is larger than the specified tier can support");
//
//            return new BasicTechnologyUniversalAssemblerRecipe(pRecipeId, width, height, inputs, output, tier);
//        }


        @Override
        public BasicTechnologyUniversalAssemblerRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new BasicTechnologyUniversalAssemblerRecipe(id, inputs, output);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, BasicTechnologyUniversalAssemblerRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return BasicTechnologyUniversalAssemblerRecipe.Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>) cls;
        }
    }
}
