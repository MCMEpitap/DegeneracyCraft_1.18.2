package net.epitap.degeneracycraft.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.epitap.degeneracycraft.blocks.screen.initial.RedstonePoweredMachineComponentManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.initial.RedstonePoweredMachineComponentManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.RedstonePoweredMachineComponentManufactureMachineRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIDCPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Degeneracycraft.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                PulverizationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

        registration.addRecipeCategories(new
                RedstonePoweredMachineComponentManufactureMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<Pulverization> recipes = rm.getAllRecipesFor(Pulverization.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(PulverizationRecipeCategory.UID, Pulverization.class), recipes);

        List<RedstonePoweredMachineComponentManufactureMachineRecipe> Brecipes =
                rm.getAllRecipesFor(RedstonePoweredMachineComponentManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID, RedstonePoweredMachineComponentManufactureMachineRecipe.class), Brecipes);

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RedstonePoweredMachineComponentManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID);
    }

//    @Override
//    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
//        registration.addRecipeTransferHandler(RedstonePoweredMachineComponentManufactureMachineMenu.class,RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID,0,9,10,36);
//    }
}
