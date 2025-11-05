package net.epitap.degeneracycraft.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.*;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bioreactor.BasicPerformanceBioReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bioreactor.BasicPerformanceBioReactorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipeTransferHandler;
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
                BasicPerformanceAstronomicalTelescopeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceBioReactorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceChemicalReactorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceCompoundPurifierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceElectrolyserRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                RedstonePoweredMachineElementManufactureMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                RedstonePoweredMachinePartManufactureMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


        registration.addRecipeCategories(new
                BasicPowerSteamGeneratorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


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
                BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));




        registration.addRecipeCategories(new
                BasicPerformanceMachineDataInstallerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceDesignatedDataInjectorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));










        registration.addRecipeCategories(new
                BasicPerformanceRockCrasherRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceElectricArcFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceFormingMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

//        registration.addRecipeCategories(new
//                BasicPowerSteamGeneratorMultiblockStructureCategory(registration.getJeiHelpers().getGuiHelper()));


    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<Pulverization> recipes = rm.getAllRecipesFor(Pulverization.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(PulverizationRecipeCategory.UID, Pulverization.class), recipes);



        List<BasicPerformanceAstronomicalTelescopeRecipe> basicPerformanceAstronomicalTelescopeRecipe =
                rm.getAllRecipesFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceAstronomicalTelescopeRecipeCategory.UID, BasicPerformanceAstronomicalTelescopeRecipe.class), basicPerformanceAstronomicalTelescopeRecipe);



        List<BasicPerformanceBioReactorRecipe> basicPerformanceBioReactorRecipe =
                rm.getAllRecipesFor(BasicPerformanceBioReactorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceBioReactorRecipeCategory.UID, BasicPerformanceBioReactorRecipe.class), basicPerformanceBioReactorRecipe);



        List<BasicPerformanceChemicalReactorRecipe> basicPerformanceChemicalReactorRecipe =
                rm.getAllRecipesFor(BasicPerformanceChemicalReactorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceChemicalReactorRecipeCategory.UID, BasicPerformanceChemicalReactorRecipe.class), basicPerformanceChemicalReactorRecipe);
        List<BasicPerformanceCompoundPurifierRecipe> basicPerformanceCompoundPurifierRecipe =
                rm.getAllRecipesFor(BasicPerformanceCompoundPurifierRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceCompoundPurifierRecipeCategory.UID, BasicPerformanceCompoundPurifierRecipe.class), basicPerformanceCompoundPurifierRecipe);
        List<BasicPerformanceElectrolyserRecipe> basicPerformanceElectrolyserRecipe =
                rm.getAllRecipesFor(BasicPerformanceElectrolyserRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceElectrolyserRecipeCategory.UID, BasicPerformanceElectrolyserRecipe.class), basicPerformanceElectrolyserRecipe);



        List<RedstonePoweredMachineElementManufactureMachineRecipe> redstonePoweredMachineComponentManufactureMachineRecipes =
                rm.getAllRecipesFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID, RedstonePoweredMachineElementManufactureMachineRecipe.class), redstonePoweredMachineComponentManufactureMachineRecipes);
        List<RedstonePoweredMachinePartManufactureMachineRecipe> redstonePoweredMachinePartManufactureMachineRecipes =
                rm.getAllRecipesFor(RedstonePoweredMachinePartManufactureMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID, RedstonePoweredMachinePartManufactureMachineRecipe.class), redstonePoweredMachinePartManufactureMachineRecipes);

        List<BasicPowerSteamGeneratorRecipe> basicPowerSteamGeneratorRecipes =
                rm.getAllRecipesFor(BasicPowerSteamGeneratorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPowerSteamGeneratorRecipeCategory.UID, BasicPowerSteamGeneratorRecipe.class), basicPowerSteamGeneratorRecipes);

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
        List<BasicTechnologyMultiblockEquipmentFabricatorRecipe> basicTechnologyMultiblockEquipmentFabricatorRecipes =
                rm.getAllRecipesFor(BasicTechnologyMultiblockEquipmentFabricatorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.UID, BasicTechnologyMultiblockEquipmentFabricatorRecipe.class), basicTechnologyMultiblockEquipmentFabricatorRecipes);





        List<BasicPerformanceMachineDataInstallerRecipe> basicPerformanceMachineDataInstallerRecipes =
                rm.getAllRecipesFor(BasicPerformanceMachineDataInstallerRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceMachineDataInstallerRecipeCategory.UID, BasicPerformanceMachineDataInstallerRecipe.class), basicPerformanceMachineDataInstallerRecipes);
        List<BasicPerformanceDesignatedDataInjectorRecipe> basicPerformanceDesignatedDataInjectorRecipes =
                rm.getAllRecipesFor(BasicPerformanceDesignatedDataInjectorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceDesignatedDataInjectorRecipeCategory.UID, BasicPerformanceDesignatedDataInjectorRecipe.class), basicPerformanceDesignatedDataInjectorRecipes);




        List<BasicPerformanceRockCrasherRecipe> basicPerformanceRockCrasherRecipes =
                rm.getAllRecipesFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceRockCrasherRecipeCategory.UID, BasicPerformanceRockCrasherRecipe.class), basicPerformanceRockCrasherRecipes);




        List<BasicPerformanceElectricArcFurnaceRecipe> basicPerformanceElectricFurnaceRecipe =
                rm.getAllRecipesFor(BasicPerformanceElectricArcFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceElectricArcFurnaceRecipeCategory.UID, BasicPerformanceElectricArcFurnaceRecipe.class), basicPerformanceElectricFurnaceRecipe);
        List<BasicPerformanceFormingMachineRecipe> basicPerformanceFormingMachineRecipe =
                rm.getAllRecipesFor(BasicPerformanceFormingMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceFormingMachineRecipeCategory.UID, BasicPerformanceFormingMachineRecipe.class), basicPerformanceFormingMachineRecipe);


//        List<BasicPowerSteamGeneratorMultiblockStructure> basicPowerCompositeStructureTypeThermalGeneratorMultiblockStructures =
//                rm.getAllRecipesFor(BasicPowerSteamGeneratorMultiblockStructure.Type.INSTANCE);
//        registration.addRecipes(new RecipeType<>(BasicPowerSteamGeneratorMultiblockStructureCategory.UID, BasicPowerSteamGeneratorMultiblockStructure.class), basicPowerCompositeStructureTypeThermalGeneratorMultiblockStructures);
    }

    @SuppressWarnings("removal")
    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RedstonePoweredMachineElementManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID);
        registration.addRecipeClickArea(RedstonePoweredMachinePartManufactureMachineScreen.class, 64, 20, 29, 8, RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);



        registration.addRecipeClickArea(BasicPerformanceAstronomicalTelescopeScreen.class, 64, 20, 29, 8, BasicPerformanceAstronomicalTelescopeRecipeCategory.UID);



        registration.addRecipeClickArea(BasicPerformanceBioReactorScreen.class, 64, 20, 29, 8, BasicPerformanceBioReactorRecipeCategory.UID);




        registration.addRecipeClickArea(BasicPerformanceChemicalReactorScreen.class, 64, 20, 29, 8, BasicPerformanceChemicalReactorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceCompoundPurifierScreen.class, 64, 20, 29, 8, BasicPerformanceCompoundPurifierRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceElectrolyserScreen.class, 64, 20, 29, 8, BasicPerformanceElectrolyserRecipeCategory.UID);



        registration.addRecipeClickArea(BasicTechnologyMachineManufacturerScreen.class, 64, 20, 29, 8, BasicTechnologyMachineManufacturerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyUniversalAssemblerScreen.class, 64, 20, 29, 8, BasicTechnologyUniversalAssemblerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyCircuitBuilderScreen.class, 64, 20, 29, 8, BasicTechnologyCircuitBuilderRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMachineElementProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyMachineElementProcessorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMachinePartProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyMachinePartProcessorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMultiblockEquipmentFabricatorScreen.class, 64, 20, 29, 8, BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.UID);




        registration.addRecipeClickArea(BasicPerformanceMachineDataInstallerScreen.class, 64, 20, 29, 8, BasicPerformanceMachineDataInstallerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceDesignatedDataInjectorScreen.class, 64, 20, 29, 8, BasicPerformanceDesignatedDataInjectorRecipeCategory.UID);






        registration.addRecipeClickArea(BasicPerformanceRockCrasherScreen.class, 64, 20, 29, 8, BasicPerformanceRockCrasherRecipeCategory.UID);




        registration.addRecipeClickArea(BasicPerformanceElectricArcFurnaceScreen.class, 64, 20, 29, 8, BasicPerformanceElectricArcFurnaceRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceFormingMachineScreen.class, 64, 20, 29, 8, BasicPerformanceFormingMachineRecipeCategory.UID);


    }

    @SuppressWarnings("removal")
    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK.get()), BasicPerformanceAstronomicalTelescopeRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BLOCK.get()), BasicPerformanceBioReactorRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BLOCK.get()), BasicPerformanceChemicalReactorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BLOCK.get()), BasicPerformanceCompoundPurifierRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.get()), BasicPerformanceElectrolyserRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get()), BasicTechnologyMachineManufacturerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get()), BasicTechnologyUniversalAssemblerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BLOCK.get()), BasicTechnologyCircuitBuilderRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()), BasicTechnologyMachineElementProcessorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.get()), BasicTechnologyMachinePartProcessorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK.get()), BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.UID);


        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK.get()), BasicPerformanceMachineDataInstallerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK.get()), BasicPerformanceDesignatedDataInjectorRecipeCategory.UID);


        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get()), BasicPerformanceElectricArcFurnaceRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK.get()), BasicPerformanceFormingMachineRecipeCategory.UID);
    }

    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(
                new BasicPerformanceAstronomicalTelescopeRecipeTransferHandler<>(
                        BasicPerformanceAstronomicalTelescopeMenu.class,
                        0, 2,
                        5, 36
                ),
                BasicPerformanceAstronomicalTelescopeRecipeCategory.TYPE
        );




        registration.addRecipeTransferHandler(
                new BasicPerformanceBioReactorRecipeTransferHandler<>(
                        BasicPerformanceBioReactorMenu.class,
                        0, 4,
                        9, 36
                ),
                BasicPerformanceBioReactorRecipeCategory.TYPE
        );




        registration.addRecipeTransferHandler(
                new BasicPerformanceChemicalReactorRecipeTransferHandler<>(
                        BasicPerformanceChemicalReactorMenu.class,
                        0, 5,
                        10, 36
                ),
                BasicPerformanceChemicalReactorRecipeCategory.TYPE
        );

        registration.addRecipeTransferHandler(
                new BasicPerformanceCompoundPurifierRecipeTransferHandler<>(
                        BasicPerformanceCompoundPurifierMenu.class,
                        0, 3,
                        7, 36
                ),
                BasicPerformanceCompoundPurifierRecipeCategory.TYPE
        );

        registration.addRecipeTransferHandler(
                new BasicPerformanceElectrolyserRecipeTransferHandler<>(
                        BasicPerformanceElectrolyserMenu.class,
                        0, 3,
                        8, 36
                ),
                BasicPerformanceElectrolyserRecipeCategory.TYPE
        );




        registration.addRecipeTransferHandler(
                new RedstonePoweredMachineElementManufactureMachineRecipeTransferHandler<>(
                        RedstonePoweredMachineElementManufactureMachineMenu.class,
                        0, 9,
                        10, 36
                ),
                RedstonePoweredMachineElementManufactureMachineRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new RedstonePoweredMachinePartManufactureMachineRecipeTransferHandler<>(
                        RedstonePoweredMachinePartManufactureMachineMenu.class,
                        0, 9,
                        10, 36
                ),
                RedstonePoweredMachinePartManufactureMachineRecipeCategory.TYPE
        );

        registration.addRecipeTransferHandler(
                new BasicTechnologyCircuitBuilderRecipeTransferHandler<>(
                        BasicTechnologyCircuitBuilderMenu.class,
                        0, 9,
                        12, 36
                ),
                BasicTechnologyCircuitBuilderRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologyMachineElementProcessorRecipeTransferHandler<>(
                        BasicTechnologyMachineElementProcessorMenu.class,
                        0, 9,
                        12, 36
                ),
                BasicTechnologyMachineElementProcessorRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologyMachineManufacturerRecipeTransferHandler<>(
                        BasicTechnologyMachineManufacturerMenu.class,
                        0, 9,
                        12, 36
                ),
                BasicTechnologyMachineManufacturerRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologyMachinePartProcessorRecipeTransferHandler<>(
                        BasicTechnologyMachinePartProcessorMenu.class,
                        0, 9,
                        12, 36
                ),
                BasicTechnologyMachinePartProcessorRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologyMultiblockEquipmentFabricatorRecipeTransferHandler<>(
                        BasicTechnologyMultiblockEquipmentFabricatorMenu.class,
                        0, 9,
                        12, 36
                ),
                BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.TYPE
        );



        registration.addRecipeTransferHandler(
                new BasicTechnologyUniversalAssemblerRecipeTransferHandler<>(
                        BasicTechnologyUniversalAssemblerMenu.class,
                        0, 9,
                        12, 36
                ),
                BasicTechnologyUniversalAssemblerRecipeCategory.TYPE
        );


        registration.addRecipeTransferHandler(
                new BasicPerformanceDesignatedDataInjectorRecipeTransferHandler<>(
                        BasicPerformanceDesignatedDataInjectorMenu.class,
                        0, 5,
                        8, 36
                ),
                BasicPerformanceDesignatedDataInjectorRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicPerformanceMachineDataInstallerRecipeTransferHandler<>(
                        BasicPerformanceMachineDataInstallerMenu.class,
                        0, 3,
                        6, 36
                ),
                BasicPerformanceMachineDataInstallerRecipeCategory.TYPE
        );



        registration.addRecipeTransferHandler(
                new BasicPerformanceRockCrasherTransferHandler<>(
                        BasicPerformanceRockCrasherMenu.class,
                        0, 1,
                        6, 36
                ),
                BasicPerformanceRockCrasherRecipeCategory.TYPE
        );



        registration.addRecipeTransferHandler(
                new BasicPerformanceElectricArcFurnaceTransferHandler<>(
                        BasicPerformanceElectricArcFurnaceMenu.class,
                        0, 2,
                        6, 36
                ),
                BasicPerformanceElectricArcFurnaceRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicPerformanceFormingMachineRecipeTransferHandler<>(
                        BasicPerformanceFormingMachineMenu.class,
                        0, 2,
                        6, 36
                ),
                BasicPerformanceFormingMachineRecipeCategory.TYPE
        );



    }



}
