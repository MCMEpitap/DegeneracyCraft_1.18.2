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
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipeCategory;
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
                RedstonePoweredMachineElementManufactureMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                RedstonePoweredMachinePartManufactureMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

        registration.addRecipeCategories(new
                BasicTechnologyMachineManufacturerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyUniversalAssemblerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyCircuitBuilderRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyMachineElementProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyMachinePartProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

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
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID, RedstonePoweredMachineElementManufactureMachineRecipe.class), redstonePoweredMachineComponentManufactureMachineRecipes);
        List<RedstonePoweredMachinePartManufactureMachineRecipe> redstonePoweredMachineParttManufactureMachineRecipes =
                rm.getAllRecipesFor(RedstonePoweredMachinePartManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID, RedstonePoweredMachinePartManufactureMachineRecipe.class), redstonePoweredMachineParttManufactureMachineRecipes);

        List<BasicTechnologyMachineManufacturerRecipe> basicTechnologyMachineManufacturerRecipes =
                rm.getAllRecipesFor(BasicTechnologyMachineManufacturerRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMachineManufacturerRecipeCategory.UID, BasicTechnologyMachineManufacturerRecipe.class), basicTechnologyMachineManufacturerRecipes);
        List<BasicTechnologyUniversalAssemblerRecipe> basicTechnologyUniversalAssemblerRecipes =
                rm.getAllRecipesFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyUniversalAssemblerRecipeCategory.UID, BasicTechnologyUniversalAssemblerRecipe.class), basicTechnologyUniversalAssemblerRecipes);
        List<BasicTechnologyCircuitBuilderRecipe> basicPrecisionCircuitBuilderRecipes =
                rm.getAllRecipesFor(BasicTechnologyCircuitBuilderRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyCircuitBuilderRecipeCategory.UID, BasicTechnologyCircuitBuilderRecipe.class), basicPrecisionCircuitBuilderRecipes);
        List<BasicTechnologyMachineElementProcessorRecipe> basicMachineElementProcessorRecipes =
                rm.getAllRecipesFor(BasicTechnologyMachineElementProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMachineElementProcessorRecipeCategory.UID, BasicTechnologyMachineElementProcessorRecipe.class), basicMachineElementProcessorRecipes);
        List<BasicTechnologyMachinePartProcessorRecipe> basicMachinePartProcessorRecipes =
                rm.getAllRecipesFor(BasicTechnologyMachinePartProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMachinePartProcessorRecipeCategory.UID, BasicTechnologyMachinePartProcessorRecipe.class), basicMachinePartProcessorRecipes);


        List<BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure> basicPowerCompositeStructureTypeThermalGeneratorMultiblockStructures =
                rm.getAllRecipesFor(BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructureCategory.UID, BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.class), basicPowerCompositeStructureTypeThermalGeneratorMultiblockStructures);

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RedstonePoweredMachineElementManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID);
        registration.addRecipeClickArea(RedstonePoweredMachinePartManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);

        registration.addRecipeClickArea(BasicTechnologyMachineManufacturerScreen.class, 64, 20, 29, 8, BasicTechnologyMachineManufacturerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyUniversalAssemblerScreen.class, 64, 20, 29, 8, BasicTechnologyUniversalAssemblerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyCircuitBuilderScreen.class, 64, 20, 29, 8, BasicTechnologyCircuitBuilderRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMachineElementProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyMachineElementProcessorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMachinePartProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyMachinePartProcessorRecipeCategory.UID);

    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);

        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get()), BasicTechnologyMachineManufacturerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get()), BasicTechnologyUniversalAssemblerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BLOCK.get()), BasicTechnologyCircuitBuilderRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()), BasicTechnologyMachineElementProcessorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.get()), BasicTechnologyMachinePartProcessorRecipeCategory.UID);
    }

}
