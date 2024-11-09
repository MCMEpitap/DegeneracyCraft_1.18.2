package net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator;

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

public class BasicPowerSteamGeneratorRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final ItemStack input0;
    final ItemStack output0;

    public BasicPowerSteamGeneratorRecipe(ResourceLocation id, ItemStack input0, ItemStack output0) {
        this.id = id;
        this.input0 = input0;
        this.output0 = output0;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level level) {
        return input0.is(pContainer.getItem(0).getItem());
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output0;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    public ItemStack getInput0Item() {
        return input0;
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

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<BasicPowerSteamGeneratorRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_power_steam_generator_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicPowerSteamGeneratorRecipe> {
        public Serializer() {
        }

        public static final Serializer INSTANCE = new Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_power_steam_generator_recipe");

        public BasicPowerSteamGeneratorRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            ItemStack input0 = BasicPowerSteamGeneratorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack output0 = BasicPowerSteamGeneratorRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));

            return new BasicPowerSteamGeneratorRecipe(pRecipeId, input0, output0);

        }

        @Override
        public @Nullable BasicPowerSteamGeneratorRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            ItemStack input0 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();

            return new BasicPowerSteamGeneratorRecipe(pRecipeId, input0, output0);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicPowerSteamGeneratorRecipe pRecipe) {
            pBuffer.writeItem(pRecipe.input0.getContainerItem());
            pBuffer.writeItem(pRecipe.output0.getContainerItem());
        }
    }
}
