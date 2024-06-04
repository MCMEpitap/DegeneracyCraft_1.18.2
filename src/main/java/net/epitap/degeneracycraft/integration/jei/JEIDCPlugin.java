package net.epitap.degeneracycraft.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_machine_element_processor.BasicMachineElementProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachineElementProcessorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineComponentManufactureMachineRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.test.BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure;
import net.epitap.degeneracycraft.integration.jei.test.BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructureCategory;
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
                RedstonePoweredMachinePartManufactureMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

        registration.addRecipeCategories(new
                BasicMachineElementProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

        registration.addRecipeCategories(new
                BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructureCategory(registration.getJeiHelpers().getGuiHelper()));

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<Pulverization> recipes = rm.getAllRecipesFor(Pulverization.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(PulverizationRecipeCategory.UID, Pulverization.class), recipes);

        List<RedstonePoweredMachineElementManufactureMachineRecipe> redstonePoweredMachineComponentManufactureMachineRecipes =
                rm.getAllRecipesFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID, RedstonePoweredMachineElementManufactureMachineRecipe.class), redstonePoweredMachineComponentManufactureMachineRecipes);
        List<RedstonePoweredMachinePartManufactureMachineRecipe> redstonePoweredMachineParttManufactureMachineRecipes =
                rm.getAllRecipesFor(RedstonePoweredMachinePartManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID, RedstonePoweredMachinePartManufactureMachineRecipe.class), redstonePoweredMachineParttManufactureMachineRecipes);

        List<BasicMachineElementProcessorRecipe> basicMachineElementProcessorRecipes =
                rm.getAllRecipesFor(BasicMachineElementProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicMachineElementProcessorRecipeCategory.UID, BasicMachineElementProcessorRecipe.class), basicMachineElementProcessorRecipes);

        List<BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure> basicPowerCompositeStructureTypeThermalGeneratorMultiblockStructures =
                rm.getAllRecipesFor(BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructureCategory.UID, BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.class), basicPowerCompositeStructureTypeThermalGeneratorMultiblockStructures);

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RedstonePoweredMachineElementManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID);
        registration.addRecipeClickArea(RedstonePoweredMachinePartManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);

        registration.addRecipeClickArea(BasicMachineElementProcessorScreen.class, 64, 20, 29, 8, BasicMachineElementProcessorRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachineComponentManufactureMachineRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);

        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()), BasicMachineElementProcessorRecipeCategory.UID);
    }

}
