package net.epitap.degeneracycraft.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.*;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.epitap.degeneracycraft.blocks.menu.machine.basic.BasicMachinePartProcessorMenu;
import net.epitap.degeneracycraft.blocks.screen.basic.BasicMachinePartProcessorScreen;
import net.epitap.degeneracycraft.blocks.screen.initial.RedstonePoweredMachineComponentManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachinePartProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachinePartProcessorRecipeCategory;
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
        registration.addRecipeCategories(new
                BasicMachinePartProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<Pulverization> recipes = rm.getAllRecipesFor(Pulverization.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(PulverizationRecipeCategory.UID, Pulverization.class), recipes);
        List<RedstonePoweredMachineComponentManufactureMachineRecipe> redstonePoweredMachineComponentManufactureMachineRecipes =
                rm.getAllRecipesFor(RedstonePoweredMachineComponentManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID, RedstonePoweredMachineComponentManufactureMachineRecipe.class), redstonePoweredMachineComponentManufactureMachineRecipes);
        List<BasicMachinePartProcessorRecipe> basicMachinePartProcessorRecipes =
                rm.getAllRecipesFor(BasicMachinePartProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicMachinePartProcessorRecipeCategory.UID, BasicMachinePartProcessorRecipe.class), basicMachinePartProcessorRecipes);

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RedstonePoweredMachineComponentManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID);
        registration.addRecipeClickArea(BasicMachinePartProcessorScreen.class, 64, 20, 29, 8, BasicMachinePartProcessorRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_MACHINE_PART_PROCESSOR_BLOCK.get()), BasicMachinePartProcessorRecipeCategory.UID);
    }


    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(BasicMachinePartProcessorMenu.class, BasicMachinePartProcessorRecipeCategory.TYPE, 0, 9, 10, 36);
    }
}
