package net.epitap.degeneracycraft.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.*;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorScreen;
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
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorRecipeCategory;
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
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserRecipeTransferHandler;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorRecipeCategory;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorRecipeTransferHandler;
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
                BasicPerformanceFineParticleAdsorberRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceStarlightCollectorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceBioReactorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceCellIncubatorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceCropCultivatorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceChemicalReactorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceCompoundPurifierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceElectrolyserRecipeCategory(registration.getJeiHelpers().getGuiHelper()));




        registration.addRecipeCategories(new
                BasicTechnologyCompressionCondenserRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyElectromagneticInductorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));




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
                BasicTechnologyMachineElementProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyMachinePartProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceCircuitBuilderRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceMachineDataInstallerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceDesignatedDataInjectorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


        registration.addRecipeCategories(new
                BasicPerformanceOreSorterRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceRockCrasherRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceSoilPurifierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));



        registration.addRecipeCategories(new
                BasicPerformanceElectricArcFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceFormingMachineRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicPerformanceMaterialSeparatorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));




        registration.addRecipeCategories(new
                BasicTechnologyImitationMagicEngraverRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologySuspectedMagicCondenserRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                BasicTechnologyVirtualSigilProcessorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

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
        List<BasicPerformanceFineParticleAdsorberRecipe> basicPerformanceFineParticleAdsorberRecipe =
                rm.getAllRecipesFor(BasicPerformanceFineParticleAdsorberRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceFineParticleAdsorberRecipeCategory.UID, BasicPerformanceFineParticleAdsorberRecipe.class), basicPerformanceFineParticleAdsorberRecipe);
        List<BasicPerformanceStarlightCollectorRecipe> basicPerformanceStarlightCollectorRecipe =
                rm.getAllRecipesFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceStarlightCollectorRecipeCategory.UID, BasicPerformanceStarlightCollectorRecipe.class), basicPerformanceStarlightCollectorRecipe);



        List<BasicPerformanceBioReactorRecipe> basicPerformanceBioReactorRecipe =
                rm.getAllRecipesFor(BasicPerformanceBioReactorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceBioReactorRecipeCategory.UID, BasicPerformanceBioReactorRecipe.class), basicPerformanceBioReactorRecipe);
        List<BasicPerformanceCellIncubatorRecipe> basicPerformanceCellIncubatorRecipe =
                rm.getAllRecipesFor(BasicPerformanceCellIncubatorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceCellIncubatorRecipeCategory.UID, BasicPerformanceCellIncubatorRecipe.class), basicPerformanceCellIncubatorRecipe);
        List<BasicPerformanceCropCultivatorRecipe> basicPerformanceCropCultivatorRecipe =
                rm.getAllRecipesFor(BasicPerformanceCropCultivatorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceCropCultivatorRecipeCategory.UID, BasicPerformanceCropCultivatorRecipe.class), basicPerformanceCropCultivatorRecipe);



        List<BasicPerformanceChemicalReactorRecipe> basicPerformanceChemicalReactorRecipe =
                rm.getAllRecipesFor(BasicPerformanceChemicalReactorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceChemicalReactorRecipeCategory.UID, BasicPerformanceChemicalReactorRecipe.class), basicPerformanceChemicalReactorRecipe);
        List<BasicPerformanceCompoundPurifierRecipe> basicPerformanceCompoundPurifierRecipe =
                rm.getAllRecipesFor(BasicPerformanceCompoundPurifierRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceCompoundPurifierRecipeCategory.UID, BasicPerformanceCompoundPurifierRecipe.class), basicPerformanceCompoundPurifierRecipe);
        List<BasicPerformanceElectrolyserRecipe> basicPerformanceElectrolyserRecipe =
                rm.getAllRecipesFor(BasicPerformanceElectrolyserRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceElectrolyserRecipeCategory.UID, BasicPerformanceElectrolyserRecipe.class), basicPerformanceElectrolyserRecipe);




        List<BasicTechnologyCompressionCondenserRecipe> basicTechnologyCompressionCondenserRecipe =
                rm.getAllRecipesFor(BasicTechnologyCompressionCondenserRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyCompressionCondenserRecipeCategory.UID, BasicTechnologyCompressionCondenserRecipe.class), basicTechnologyCompressionCondenserRecipe);
        List<BasicTechnologyElectromagneticInductorRecipe> basicTechnologyElectromagneticInductorRecipe =
                rm.getAllRecipesFor(BasicTechnologyElectromagneticInductorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyElectromagneticInductorRecipeCategory.UID, BasicTechnologyElectromagneticInductorRecipe.class), basicTechnologyElectromagneticInductorRecipe);





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
        List<BasicTechnologyMachineElementProcessorRecipe> basicMachineElementProcessorRecipes =
                rm.getAllRecipesFor(BasicTechnologyMachineElementProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMachineElementProcessorRecipeCategory.UID, BasicTechnologyMachineElementProcessorRecipe.class), basicMachineElementProcessorRecipes);
        List<BasicTechnologyMachinePartProcessorRecipe> basicMachinePartProcessorRecipes =
                rm.getAllRecipesFor(BasicTechnologyMachinePartProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMachinePartProcessorRecipeCategory.UID, BasicTechnologyMachinePartProcessorRecipe.class), basicMachinePartProcessorRecipes);
        List<BasicTechnologyMultiblockEquipmentFabricatorRecipe> basicTechnologyMultiblockEquipmentFabricatorRecipes =
                rm.getAllRecipesFor(BasicTechnologyMultiblockEquipmentFabricatorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.UID, BasicTechnologyMultiblockEquipmentFabricatorRecipe.class), basicTechnologyMultiblockEquipmentFabricatorRecipes);




        List<BasicPerformanceCircuitBuilderRecipe> basicPerformanceCircuitBuilderRecipes =
                rm.getAllRecipesFor(BasicPerformanceCircuitBuilderRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceCircuitBuilderRecipeCategory.UID, BasicPerformanceCircuitBuilderRecipe.class), basicPerformanceCircuitBuilderRecipes);
        List<BasicPerformanceMachineDataInstallerRecipe> basicPerformanceMachineDataInstallerRecipes =
                rm.getAllRecipesFor(BasicPerformanceMachineDataInstallerRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceMachineDataInstallerRecipeCategory.UID, BasicPerformanceMachineDataInstallerRecipe.class), basicPerformanceMachineDataInstallerRecipes);
        List<BasicPerformanceDesignatedDataInjectorRecipe> basicPerformanceDesignatedDataInjectorRecipes =
                rm.getAllRecipesFor(BasicPerformanceDesignatedDataInjectorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceDesignatedDataInjectorRecipeCategory.UID, BasicPerformanceDesignatedDataInjectorRecipe.class), basicPerformanceDesignatedDataInjectorRecipes);



        List<BasicPerformanceOreSorterRecipe> basicPerformanceOreSorterRecipe =
                rm.getAllRecipesFor(BasicPerformanceOreSorterRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceOreSorterRecipeCategory.UID, BasicPerformanceOreSorterRecipe.class), basicPerformanceOreSorterRecipe);
        List<BasicPerformanceRockCrasherRecipe> basicPerformanceRockCrasherRecipes =
                rm.getAllRecipesFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceRockCrasherRecipeCategory.UID, BasicPerformanceRockCrasherRecipe.class), basicPerformanceRockCrasherRecipes);
        List<BasicPerformanceSoilPurifierRecipe> basicPerformanceSoilPurifierRecipe =
                rm.getAllRecipesFor(BasicPerformanceSoilPurifierRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceSoilPurifierRecipeCategory.UID, BasicPerformanceSoilPurifierRecipe.class), basicPerformanceSoilPurifierRecipe);




        List<BasicPerformanceElectricArcFurnaceRecipe> basicPerformanceElectricFurnaceRecipe =
                rm.getAllRecipesFor(BasicPerformanceElectricArcFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceElectricArcFurnaceRecipeCategory.UID, BasicPerformanceElectricArcFurnaceRecipe.class), basicPerformanceElectricFurnaceRecipe);
        List<BasicPerformanceFormingMachineRecipe> basicPerformanceFormingMachineRecipe =
                rm.getAllRecipesFor(BasicPerformanceFormingMachineRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceFormingMachineRecipeCategory.UID, BasicPerformanceFormingMachineRecipe.class), basicPerformanceFormingMachineRecipe);
        List<BasicPerformanceMaterialSeparatorRecipe> basicPerformanceMaterialSeparatorRecipe =
                rm.getAllRecipesFor(BasicPerformanceMaterialSeparatorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicPerformanceMaterialSeparatorRecipeCategory.UID, BasicPerformanceMaterialSeparatorRecipe.class), basicPerformanceMaterialSeparatorRecipe);



        List<BasicTechnologyImitationMagicEngraverRecipe> basicTechnologyImitationMagicEngraverRecipe =
                rm.getAllRecipesFor(BasicTechnologyImitationMagicEngraverRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyImitationMagicEngraverRecipeCategory.UID, BasicTechnologyImitationMagicEngraverRecipe.class), basicTechnologyImitationMagicEngraverRecipe);
        List<BasicTechnologySuspectedMagicCondenserRecipe> basicTechnologySuspectedMagicCondenserRecipe =
                rm.getAllRecipesFor(BasicTechnologySuspectedMagicCondenserRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologySuspectedMagicCondenserRecipeCategory.UID, BasicTechnologySuspectedMagicCondenserRecipe.class), basicTechnologySuspectedMagicCondenserRecipe);
        List<BasicTechnologyVirtualSigilProcessorRecipe> basicTechnologyVirtualSigilProcessorRecipe =
                rm.getAllRecipesFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BasicTechnologyVirtualSigilProcessorRecipeCategory.UID, BasicTechnologyVirtualSigilProcessorRecipe.class), basicTechnologyVirtualSigilProcessorRecipe);

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
        registration.addRecipeClickArea(BasicPerformanceFineParticleAdsorberScreen.class, 64, 20, 29, 8, BasicPerformanceFineParticleAdsorberRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceStarlightCollectorScreen.class, 64, 20, 29, 8, BasicPerformanceStarlightCollectorRecipeCategory.UID);



        registration.addRecipeClickArea(BasicPerformanceBioReactorScreen.class, 64, 20, 29, 8, BasicPerformanceBioReactorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceCellIncubatorScreen.class, 64, 20, 29, 8, BasicPerformanceCellIncubatorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceCropCultivatorScreen.class, 64, 20, 29, 8, BasicPerformanceCropCultivatorRecipeCategory.UID);




        registration.addRecipeClickArea(BasicPerformanceChemicalReactorScreen.class, 64, 20, 29, 8, BasicPerformanceChemicalReactorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceCompoundPurifierScreen.class, 64, 20, 29, 8, BasicPerformanceCompoundPurifierRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceElectrolyserScreen.class, 64, 20, 29, 8, BasicPerformanceElectrolyserRecipeCategory.UID);



        registration.addRecipeClickArea(BasicTechnologyCompressionCondenserScreen.class, 64, 20, 29, 8, BasicTechnologyCompressionCondenserRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyElectromagneticInductorScreen.class, 64, 20, 29, 8, BasicTechnologyElectromagneticInductorRecipeCategory.UID);



        registration.addRecipeClickArea(BasicTechnologyMachineManufacturerScreen.class, 64, 20, 29, 8, BasicTechnologyMachineManufacturerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyUniversalAssemblerScreen.class, 64, 20, 29, 8, BasicTechnologyUniversalAssemblerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMachineElementProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyMachineElementProcessorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMachinePartProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyMachinePartProcessorRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyMultiblockEquipmentFabricatorScreen.class, 64, 20, 29, 8, BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.UID);



        registration.addRecipeClickArea(BasicPerformanceCircuitBuilderScreen.class, 64, 20, 29, 8, BasicPerformanceCircuitBuilderRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceMachineDataInstallerScreen.class, 64, 20, 29, 8, BasicPerformanceMachineDataInstallerRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceDesignatedDataInjectorScreen.class, 64, 20, 29, 8, BasicPerformanceDesignatedDataInjectorRecipeCategory.UID);



        registration.addRecipeClickArea(BasicPerformanceOreSorterScreen.class, 64, 20, 29, 8, BasicPerformanceOreSorterRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceRockCrasherScreen.class, 64, 20, 29, 8, BasicPerformanceRockCrasherRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceSoilPurifierScreen.class, 64, 20, 29, 8, BasicPerformanceSoilPurifierRecipeCategory.UID);



        registration.addRecipeClickArea(BasicPerformanceElectricArcFurnaceScreen.class, 64, 20, 29, 8, BasicPerformanceElectricArcFurnaceRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceFormingMachineScreen.class, 64, 20, 29, 8, BasicPerformanceFormingMachineRecipeCategory.UID);
        registration.addRecipeClickArea(BasicPerformanceMaterialSeparatorScreen.class, 64, 20, 29, 8, BasicPerformanceMaterialSeparatorRecipeCategory.UID);


        registration.addRecipeClickArea(BasicTechnologyImitationMagicEngraverScreen.class, 64, 20, 29, 8, BasicTechnologyImitationMagicEngraverRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologySuspectedMagicCondenserScreen.class, 64, 20, 29, 8, BasicTechnologySuspectedMagicCondenserRecipeCategory.UID);
        registration.addRecipeClickArea(BasicTechnologyVirtualSigilProcessorScreen.class, 64, 20, 29, 8, BasicTechnologyVirtualSigilProcessorRecipeCategory.UID);

    }

    @SuppressWarnings("removal")
    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachineElementManufactureMachineRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()), RedstonePoweredMachinePartManufactureMachineRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK.get()), BasicPerformanceAstronomicalTelescopeRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BLOCK.get()), BasicPerformanceFineParticleAdsorberRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BLOCK.get()), BasicPerformanceStarlightCollectorRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BLOCK.get()), BasicPerformanceBioReactorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_BLOCK.get()), BasicPerformanceCellIncubatorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_BLOCK.get()), BasicPerformanceCropCultivatorRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BLOCK.get()), BasicPerformanceChemicalReactorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BLOCK.get()), BasicPerformanceCompoundPurifierRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.get()), BasicPerformanceElectrolyserRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BLOCK.get()), BasicTechnologyCompressionCondenserRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BLOCK.get()), BasicTechnologyElectromagneticInductorRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get()), BasicTechnologyMachineManufacturerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get()), BasicTechnologyUniversalAssemblerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()), BasicTechnologyMachineElementProcessorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.get()), BasicTechnologyMachinePartProcessorRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK.get()), BasicTechnologyMultiblockEquipmentFabricatorRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BLOCK.get()), BasicPerformanceCircuitBuilderRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK.get()), BasicPerformanceMachineDataInstallerRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK.get()), BasicPerformanceDesignatedDataInjectorRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_BLOCK.get()), BasicPerformanceOreSorterRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK.get()), BasicPerformanceRockCrasherRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_BLOCK.get()), BasicPerformanceSoilPurifierRecipeCategory.UID);



        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get()), BasicPerformanceElectricArcFurnaceRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK.get()), BasicPerformanceFormingMachineRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BLOCK.get()), BasicPerformanceMaterialSeparatorRecipeCategory.UID);


        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BLOCK.get()), BasicTechnologyImitationMagicEngraverRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BLOCK.get()), BasicTechnologySuspectedMagicCondenserRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BLOCK.get()), BasicTechnologyVirtualSigilProcessorRecipeCategory.UID);

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
                new BasicPerformanceFineParticleAdsorberTransferHandler<>(
                        BasicPerformanceFineParticleAdsorberMenu.class,
                        0, 1,
                        6, 36
                ),
                BasicPerformanceFineParticleAdsorberRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicPerformanceStarlightCollectorRecipeTransferHandler<>(
                        BasicPerformanceStarlightCollectorMenu.class,
                        0, 2,
                        5, 36
                ),
                BasicPerformanceStarlightCollectorRecipeCategory.TYPE
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
                new BasicPerformanceCellIncubatorRecipeTransferHandler<>(
                        BasicPerformanceCellIncubatorMenu.class,
                        0, 4,
                        7, 36
                ),
                BasicPerformanceCellIncubatorRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicPerformanceCropCultivatorRecipeTransferHandler<>(
                        BasicPerformanceCropCultivatorMenu.class,
                        0, 3,
                        7, 36
                ),
                BasicPerformanceCropCultivatorRecipeCategory.TYPE
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
                new BasicTechnologyCompressionCondenserRecipeTransferHandler<>(
                        BasicTechnologyCompressionCondenserMenu.class,
                        0, 3,
                        6, 36
                ),
                BasicTechnologyCompressionCondenserRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologyElectromagneticInductorRecipeTransferHandler<>(
                        BasicTechnologyElectromagneticInductorMenu.class,
                        0, 6,
                        9, 36
                ),
                BasicTechnologyElectromagneticInductorRecipeCategory.TYPE
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
                new BasicPerformanceCircuitBuilderRecipeTransferHandler<>(
                        BasicPerformanceCircuitBuilderMenu.class,
                        0, 5,
                        8, 36
                ),
                BasicPerformanceCircuitBuilderRecipeCategory.TYPE
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
                new BasicPerformanceOreSorterTransferHandler<>(
                        BasicPerformanceOreSorterMenu.class,
                        0, 1,
                        6, 36
                ),
                BasicPerformanceOreSorterRecipeCategory.TYPE
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
                new BasicPerformanceSoilPurifierRecipeTransferHandler<>(
                        BasicPerformanceSoilPurifierMenu.class,
                        0, 3,
                        6, 36
                ),
                BasicPerformanceSoilPurifierRecipeCategory.TYPE
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
        registration.addRecipeTransferHandler(
                new BasicPerformanceMaterialSeparatorRecipeTransferHandler<>(
                        BasicPerformanceMaterialSeparatorMenu.class,
                        0, 1,
                        6, 36
                ),
                BasicPerformanceMaterialSeparatorRecipeCategory.TYPE
        );




        registration.addRecipeTransferHandler(
                new BasicTechnologyImitationMagicEngraverRecipeTransferHandler<>(
                        BasicTechnologyImitationMagicEngraverMenu.class,
                        0, 5,
                        8, 36
                ),
                BasicTechnologyImitationMagicEngraverRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologySuspectedMagicCondenserRecipeTransferHandler<>(
                        BasicTechnologySuspectedMagicCondenserMenu.class,
                        0, 2,
                        5, 36
                ),
                BasicTechnologySuspectedMagicCondenserRecipeCategory.TYPE
        );
        registration.addRecipeTransferHandler(
                new BasicTechnologyVirtualSigilProcessorRecipeTransferHandler<>(
                        BasicTechnologyVirtualSigilProcessorMenu.class,
                        0, 5,
                        8, 36
                ),
                BasicTechnologyVirtualSigilProcessorRecipeCategory.TYPE
        );


    }



}
