package net.epitap.degeneracycraft.integration.jei;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_astronomical_telescope.BasicPerformanceAstronomicalTelescopeRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCRecipeTypes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Degeneracycraft.MOD_ID);
//
//    public static final RegistryObject<RecipeSerializer<Pulverization>> PULVERIZATION_SERIALIZER =
//            SERIALIZERS.register("pulverization",()-> Pulverization.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<RedstonePoweredMachineElementManufactureMachineRecipe>> REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_SERIALIZER =
            SERIALIZERS.register("redstone_powered_machine_element_manufacture_machine_recipe", () -> RedstonePoweredMachineElementManufactureMachineRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<RedstonePoweredMachinePartManufactureMachineRecipe>> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_SERIALIZER =
            SERIALIZERS.register("redstone_powered_machine_part_manufacture_machine_recipe", () -> RedstonePoweredMachinePartManufactureMachineRecipe.Serializer.INSTANCE);



    public static final RegistryObject<RecipeSerializer<BasicPerformanceAstronomicalTelescopeRecipe>> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_SERIALIZER =
            SERIALIZERS.register("basic_performance_astronomical_telescope_recipe", () -> BasicPerformanceAstronomicalTelescopeRecipe.Serializer.INSTANCE);



    public static final RegistryObject<RecipeSerializer<BasicPerformanceBioReactorRecipe>> BASIC_PERFORMANCE_BIO_REACTOR_SERIALIZER =
            SERIALIZERS.register("basic_performance_bio_reactor_recipe", () -> BasicPerformanceBioReactorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceCellIncubatorRecipe>> BASIC_PERFORMANCE_CELL_INCUBATOR_SERIALIZER =
            SERIALIZERS.register("basic_performance_cell_incubator_recipe", () -> BasicPerformanceCellIncubatorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceCropCultivatorRecipe>> BASIC_PERFORMANCE_CROP_CULTIVATOR_SERIALIZER =
            SERIALIZERS.register("basic_performance_crop_cultivator_recipe", () -> BasicPerformanceCropCultivatorRecipe.Serializer.INSTANCE);



    public static final RegistryObject<RecipeSerializer<BasicPerformanceChemicalReactorRecipe>> BASIC_PERFORMANCE_CHEMICAL_REACTOR_SERIALIZER =
            SERIALIZERS.register("basic_performance_chemical_reactor_recipe", () -> BasicPerformanceChemicalReactorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceCompoundPurifierRecipe>> BASIC_PERFORMANCE_COMPOUND_PURIFIER_SERIALIZER =
            SERIALIZERS.register("basic_performance_compound_purifier_recipe", () -> BasicPerformanceCompoundPurifierRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceElectrolyserRecipe>> BASIC_PERFORMANCE_ELECTROLYSER_SERIALIZER =
            SERIALIZERS.register("basic_performance_electrolyser_recipe", () -> BasicPerformanceElectrolyserRecipe.Serializer.INSTANCE);



    public static final RegistryObject<RecipeSerializer<BasicPowerSteamGeneratorRecipe>> BASIC_POWER_STEAM_GENERATOR_SERIALIZER =
            SERIALIZERS.register("basic_power_steam_generator_recipe", () -> BasicPowerSteamGeneratorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyCompressionCondenserRecipe>> BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_SERIALIZER =
            SERIALIZERS.register("basic_technology_compression_condenser_recipe", () -> BasicTechnologyCompressionCondenserRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyElectromagneticInductorRecipe>> BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_electromagnetic_inductor_recipe", () -> BasicTechnologyElectromagneticInductorRecipe.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<BasicTechnologyMachineManufacturerRecipe>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_SERIALIZER =
            SERIALIZERS.register("basic_technology_machine_manufacturer_recipe", () -> BasicTechnologyMachineManufacturerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyUniversalAssemblerRecipe>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_SERIALIZER =
            SERIALIZERS.register("basic_technology_universal_assembler_recipe", () -> BasicTechnologyUniversalAssemblerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyMachineElementProcessorRecipe>> BASIC_MACHINE_ELEMENT_PROCESSOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_machine_element_processor_recipe", () -> BasicTechnologyMachineElementProcessorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyMachinePartProcessorRecipe>> BASIC_MACHINE_PART_PROCESSOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_machine_part_processor_recipe", () -> BasicTechnologyMachinePartProcessorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyMultiblockEquipmentFabricatorRecipe>> BASIC_MULTIBLOCK_EQUIPMENT_FABRICATOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_multiblock_equipment_fabricator_recipe", () -> BasicTechnologyMultiblockEquipmentFabricatorRecipe.Serializer.INSTANCE);




    public static final RegistryObject<RecipeSerializer<BasicPerformanceCircuitBuilderRecipe>> BASIC_PERFORMANCE_CIRCUIT_BUILDER_SERIALIZER =
            SERIALIZERS.register("basic_performance_circuit_builder_recipe", () -> BasicPerformanceCircuitBuilderRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceMachineDataInstallerRecipe>> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_SERIALIZER =
            SERIALIZERS.register("basic_performance_machine_data_installer_recipe", () -> BasicPerformanceMachineDataInstallerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceDesignatedDataInjectorRecipe>> BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_SERIALIZER =
            SERIALIZERS.register("basic_performance_designated_data_injector_recipe", () -> BasicPerformanceDesignatedDataInjectorRecipe.Serializer.INSTANCE);




    public static final RegistryObject<RecipeSerializer<BasicPerformanceOreSorterRecipe>> BASIC_PERFORMANCE_BASIC_PERFORMANCE_ORE_SORTER_SERIALIZER =
            SERIALIZERS.register("basic_performance_ore_sorter_recipe", () -> BasicPerformanceOreSorterRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceRockCrasherRecipe>> BASIC_PERFORMANCE_BASIC_PERFORMANCE_ROCK_CRASHER_SERIALIZER =
            SERIALIZERS.register("basic_performance_rock_crasher_recipe", () -> BasicPerformanceRockCrasherRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceSoilPurifierRecipe>> BASIC_PERFORMANCE_BASIC_PERFORMANCE_SOIL_PURIFIER_SERIALIZER =
            SERIALIZERS.register("basic_performance_soil_purifier_recipe", () -> BasicPerformanceSoilPurifierRecipe.Serializer.INSTANCE);





    public static final RegistryObject<RecipeSerializer<BasicPerformanceElectricArcFurnaceRecipe>> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_SERIALIZER =
            SERIALIZERS.register("basic_performance_electric_arc_furnace_recipe", () -> BasicPerformanceElectricArcFurnaceRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceFormingMachineRecipe>> BASIC_PERFORMANCE_FORMING_MACHINE_SERIALIZER =
            SERIALIZERS.register("basic_performance_forming_machine_recipe", () -> BasicPerformanceFormingMachineRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicPerformanceMaterialSeparatorRecipe>> BASIC_PERFORMANCE_MATERIAL_SEPARATOR_SERIALIZER =
            SERIALIZERS.register("basic_performance_material_separator_recipe", () -> BasicPerformanceMaterialSeparatorRecipe.Serializer.INSTANCE);





    public static final RegistryObject<RecipeSerializer<BasicTechnologyImitationMagicEngraverRecipe>> BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_SERIALISER =
            SERIALIZERS.register("basic_technology_imitation_magic_engraver_recipe", () -> BasicTechnologyImitationMagicEngraverRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicTechnologySuspectedMagicCondenserRecipe>> BASIC_TECHNOLOGY_SUSPECTRD_MAGIC_CONDENSER_SERIALISER =
            SERIALIZERS.register("basic_technology_suspected_magic_condenser_recipe", () -> BasicTechnologySuspectedMagicCondenserRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicTechnologyVirtualSigilProcessorRecipe>> BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PRPCESSOR_SERIALISER =
            SERIALIZERS.register("basic_technology_virtual_sigil_processor_recipe", () -> BasicTechnologyVirtualSigilProcessorRecipe.Serializer.INSTANCE);
//



//    public static final RegistryObject<RecipeSerializer<BasicPowerSteamGeneratorMultiblockStructure>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_MULTIBLOCK_STRUCTURE_SERIALIZER =
//            SERIALIZERS.register("basic_power_thermal_generator_multiblock_structure", () -> BasicPowerSteamGeneratorMultiblockStructure.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
