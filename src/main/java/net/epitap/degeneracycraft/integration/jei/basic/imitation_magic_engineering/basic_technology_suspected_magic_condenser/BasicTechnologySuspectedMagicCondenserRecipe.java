package net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser;

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

public class BasicTechnologySuspectedMagicCondenserRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    final float energy;
    final float time;
    final ItemStack input0;
    final ItemStack output0;

    public BasicTechnologySuspectedMagicCondenserRecipe(ResourceLocation id, float energy, float time, ItemStack input0, ItemStack output0) {
        this.id = id;
        this.energy = energy;
        this.time = time;
        this.input0 = input0;
        this.output0 = output0;
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

    public static class Type implements RecipeType<BasicTechnologySuspectedMagicCondenserRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_technology_suspected_magic_condenser_recipe";
    }


    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<BasicTechnologySuspectedMagicCondenserRecipe> {
        public Serializer() {
        }

        public static final Serializer INSTANCE = new Serializer();

        public static final ResourceLocation ID =
                new ResourceLocation(Degeneracycraft.MOD_ID, "basic_technology_suspected_magic_condenser_recipe");

        public BasicTechnologySuspectedMagicCondenserRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            float energy = GsonHelper.getAsFloat(pJson, "energy", 1);
            float time = GsonHelper.getAsFloat(pJson, "time", 1);
            ItemStack input0 = BasicTechnologySuspectedMagicCondenserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "input0"));
            ItemStack output0 = BasicTechnologySuspectedMagicCondenserRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "output0"));

            return new BasicTechnologySuspectedMagicCondenserRecipe(pRecipeId, energy, time, input0, output0);
        }

        @Override
        public @Nullable BasicTechnologySuspectedMagicCondenserRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            float energy = pBuffer.readFloat();
            float time = pBuffer.readFloat();
            ItemStack input0 = pBuffer.readItem();
            ItemStack output0 = pBuffer.readItem();

            return new BasicTechnologySuspectedMagicCondenserRecipe(pRecipeId, energy, time, input0, output0);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, BasicTechnologySuspectedMagicCondenserRecipe pRecipe) {
            pBuffer.writeFloat(pRecipe.energy);
            pBuffer.writeFloat(pRecipe.time);
            pBuffer.writeItem(pRecipe.input0.getContainerItem());
            pBuffer.writeItem(pRecipe.output0.getContainerItem());
        }
    }
}
