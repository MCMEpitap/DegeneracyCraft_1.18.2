package net.epitap.degeneracycraft.integration.jei.test;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;

import java.util.Map;
import java.util.Set;

public class JsonReadingHelper implements Recipe<Container> {
//    static int MAX_WIDTH = 3;
//    static int MAX_HEIGHT = 3;
    /**
     * Expand the max width and height allowed in the deserializer.
     * This should be called by modders who add custom crafting tables that are larger than the vanilla 3x3.
     *
     * @param width your max recipe width
     * @param height your max recipe height
     */
//    public static void setCraftingSize(int width, int height) {
//        if (MAX_WIDTH < width) MAX_WIDTH = width;
//        if (MAX_HEIGHT < height) MAX_HEIGHT = height;
//    }

    final int width;
    final int height;
    //    final int depth;
    final NonNullList<Ingredient> recipeItems;
    final ItemStack result;
    private final ResourceLocation id;
    final String group;

    public JsonReadingHelper(ResourceLocation pId, String pGroup, int pWidth, int pHeight, NonNullList<Ingredient> pRecipeItems, ItemStack pResult) {
        this.id = pId;
        this.group = pGroup;
        this.width = pWidth;
        this.height = pHeight;

        this.recipeItems = pRecipeItems;
        this.result = pResult;
    }

    public ResourceLocation getId() {
        return this.id;
    }

    /**
     * Get the result of this recipe, usually for display purposes (e.g. recipe book). If your recipe has more than one
     * possible result (e.g. it's dynamic and depends on its inputs), then return an empty stack.
     */
    public ItemStack getResultItem() {
        return this.result;
    }

    public NonNullList<Ingredient> getIngredients() {
        return this.recipeItems;
    }

    @Override
    public boolean matches(Container pContainer, Level pLevel) {
        return false;
    }

    @Override
    public ItemStack assemble(Container pContainer) {
        return null;
    }

    /**
     * Used to determine if this recipe can fit in a grid of the given width/height
     */
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

//    /**
//     * Used to check if a recipe matches current crafting inventory
//     */
//    public boolean matches(CraftingContainer pInv, Level pLevel) {
//        for(int i = 0; i <= pInv.getWidth() - this.width; ++i) {
//            for(int j = 0; j <= pInv.getHeight() - this.height; ++j) {
//                if (this.matches(pInv, i, j, true)) {
//                    return true;
//                }
//
//                if (this.matches(pInv, i, j, false)) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    /**
//     * Checks if the region of a crafting inventory is match for the recipe.
//     */
//    private boolean matches(CraftingContainer pCraftingInventory, int pWidth, int pHeight, boolean pMirrored) {
//        for(int i = 0; i < pCraftingInventory.getWidth(); ++i) {
//            for(int j = 0; j < pCraftingInventory.getHeight(); ++j) {
//                int k = i - pWidth;
//                int l = j - pHeight;
//                Ingredient ingredient = Ingredient.EMPTY;
//                if (k >= 0 && l >= 0 && k < this.width && l < this.height) {
//                    if (pMirrored) {
//                        ingredient = this.recipeItems.get(this.width - k - 1 + l * this.width);
//                    } else {
//                        ingredient = this.recipeItems.get(k + l * this.width);
//                    }
//                }
//
//                if (!ingredient.test(pCraftingInventory.getItem(i + j * pCraftingInventory.getWidth()))) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//
//    /**
//     * Returns an Item that is the result of this recipe
//     */
//    public ItemStack assemble(CraftingContainer pInv) {
//        return this.getResultItem().copy();
//    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
//    public int getDepth() {
//        return this.depth;
//    }

    public static NonNullList<Ingredient> dissolvePattern(String[] pPattern, Map<String, Ingredient> pKeys, int pPatternWidth, int pPatternHeight) {
        NonNullList<Ingredient> nonnulllist = NonNullList.withSize(pPatternWidth * pPatternHeight, Ingredient.EMPTY);
        Set<String> set = Sets.newHashSet(pKeys.keySet());
        set.remove(" ");

        for (int i = 0; i < pPattern.length; ++i) {
            for (int j = 0; j < pPattern[i].length(); ++j) {
                String s = pPattern[i].substring(j, j + 1);
                Ingredient ingredient = pKeys.get(s);
                if (ingredient == null) {
                    throw new JsonSyntaxException("Pattern references symbol '" + s + "' but it's not defined in the key");
                }

                set.remove(s);
                nonnulllist.set(j + pPatternWidth * i, ingredient);
            }
        }

        if (!set.isEmpty()) {
            throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
        } else {
            return nonnulllist;
        }
    }

    @VisibleForTesting
    public static String[] shrink(String... pToShrink) {
        int i = Integer.MAX_VALUE;
        int j = 0;
        int k = 0;
        int l = 0;

        for (int i1 = 0; i1 < pToShrink.length; ++i1) {
            String s = pToShrink[i1];
            i = Math.min(i, firstNonSpace(s));
            int j1 = lastNonSpace(s);
            j = Math.max(j, j1);
            if (j1 < 0) {
                if (k == i1) {
                    ++k;
                }

                ++l;
            } else {
                l = 0;
            }
        }

        if (pToShrink.length == l) {
            return new String[0];
        } else {
            String[] astring = new String[pToShrink.length - l - k];

            for (int k1 = 0; k1 < astring.length; ++k1) {
                astring[k1] = pToShrink[k1 + k].substring(i, j + 1);
            }

            return astring;
        }
    }

    public boolean isIncomplete() {
        NonNullList<Ingredient> nonnulllist = this.getIngredients();
        return nonnulllist.isEmpty() || nonnulllist.stream().filter((p_151277_) -> {
            return !p_151277_.isEmpty();
        }).anyMatch((p_151273_) -> {
            return net.minecraftforge.common.ForgeHooks.hasNoElements(p_151273_);
        });
    }

    private static int firstNonSpace(String pEntry) {
        int i;
        for (i = 0; i < pEntry.length() && pEntry.charAt(i) == ' '; ++i) {
        }

        return i;
    }

    private static int lastNonSpace(String pEntry) {
        int i;
        for (i = pEntry.length() - 1; i >= 0 && pEntry.charAt(i) == ' '; --i) {
        }

        return i;
    }

    static String[] patternFromJson(JsonArray pPatternArray) {
        String[] astring = new String[pPatternArray.size()];
        if (astring.length == 0) {
            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
        } else {
            for (int i = 0; i < astring.length; ++i) {
                String s = GsonHelper.convertToString(pPatternArray.get(i), "pattern[" + i + "]");

                if (i > 0 && astring[0].length() != s.length()) {
                    throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
                }

                astring[i] = s;
            }

            return astring;
        }
    }

    /**
     * Returns a key json object as a Java HashMap.
     */
    static Map<String, Ingredient> keyFromJson(JsonObject pKeyEntry) {
        Map<String, Ingredient> map = Maps.newHashMap();

        for (Map.Entry<String, JsonElement> entry : pKeyEntry.entrySet()) {
            if (entry.getKey().length() != 1) {
                throw new JsonSyntaxException("Invalid key entry: '" + entry.getKey() + "' is an invalid symbol (must be 1 character only).");
            }

            if (" ".equals(entry.getKey())) {
                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
            }

            map.put(entry.getKey(), Ingredient.fromJson(entry.getValue()));
        }

        map.put(" ", Ingredient.EMPTY);
        return map;
    }

    public static ItemStack itemStackFromJson(JsonObject pStackObject) {
        return CraftingHelper.getItemStack(pStackObject, true, false);
    }

//    public static Item itemFromJson(JsonObject pItemObject) {
//        String s = GsonHelper.getAsString(pItemObject, "item");
//        Item item = Registry.ITEM.getOptional(new ResourceLocation(s)).orElseThrow(() -> {
//            return new JsonSyntaxException("Unknown item '" + s + "'");
//        });
//        if (item == Items.AIR) {
//            throw new JsonSyntaxException("Invalid item: " + s);
//        } else {
//            return item;
//        }
//    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return JsonReadingHelper.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return JsonReadingHelper.Type.INSTANCE;
    }

    public static class Type implements RecipeType<JsonReadingHelper> {
        private Type() {
        }

        public static final JsonReadingHelper.Type INSTANCE = new JsonReadingHelper.Type();
        public static final String ID = "json_reading_helper";
    }

    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<JsonReadingHelper> {
        public Serializer() {
        }

        public static final JsonReadingHelper.Serializer INSTANCE = new JsonReadingHelper.Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "json_reading_helper");

        public JsonReadingHelper fromJson(ResourceLocation pRecipeId, JsonObject pJson) {
            String s = GsonHelper.getAsString(pJson, "group", "");
            Map<String, Ingredient> map = JsonReadingHelper.keyFromJson(GsonHelper.getAsJsonObject(pJson, "key"));
            String[] astring = JsonReadingHelper.shrink(JsonReadingHelper.patternFromJson(GsonHelper.getAsJsonArray(pJson, "pattern")));
            int i = astring[0].length();
            int j = astring.length;
            NonNullList<Ingredient> nonnulllist = JsonReadingHelper.dissolvePattern(astring, map, i, j);
            ItemStack itemstack = JsonReadingHelper.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));
            return new JsonReadingHelper(pRecipeId, s, i, j, nonnulllist, itemstack);
        }

        public JsonReadingHelper fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            int i = pBuffer.readVarInt();
            int j = pBuffer.readVarInt();
            String s = pBuffer.readUtf();
            NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i * j, Ingredient.EMPTY);

            for (int k = 0; k < nonnulllist.size(); ++k) {
                nonnulllist.set(k, Ingredient.fromNetwork(pBuffer));
            }

            ItemStack itemstack = pBuffer.readItem();
            return new JsonReadingHelper(pRecipeId, s, i, j, nonnulllist, itemstack);
        }

        public void toNetwork(FriendlyByteBuf pBuffer, JsonReadingHelper pRecipe) {
            pBuffer.writeVarInt(pRecipe.width);
            pBuffer.writeVarInt(pRecipe.height);
            pBuffer.writeUtf(pRecipe.group);

            for (Ingredient ingredient : pRecipe.recipeItems) {
                ingredient.toNetwork(pBuffer);
            }

            pBuffer.writeItem(pRecipe.result);
        }
    }
}