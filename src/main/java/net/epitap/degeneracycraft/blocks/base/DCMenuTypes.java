package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_power_steam_generator.BasicPowerSteamGeneratorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.menu.machine.PulverizerMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.energy_storage.basic_strength_astronomy_multiblock_energy_storage.BasicStrengthAstronomyMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.material_storage.basic_strength_astronomy_multiblock_material_storage.BasicStrengthAstronomyMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.energy_storage.basic_strength_biology_multiblock_energy_storage.BasicStrengthBiologyMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.material_storage.basic_strength_biology_multiblock_material_storage.BasicStrengthBiologyMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.energy_storage.basic_strength_chemistry_multiblock_energy_storage.BasicStrengthChemistryMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.material_storage.basic_strength_chemistry_multiblock_material_storage.BasicStrengthChemistryMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_energetics.energy_storage.basic_strength_dynamic_energetics_multiblock_energy_storage.BasicStrengthDynamicEnergeticsMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_energetics.material_storage.basic_strength_dynamic_energetics_multiblock_material_storage.BasicStrengthDynamicEnergeticsMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energy_storage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.material_storage.basic_strength_engineering_multiblock_material_storage.BasicStrengthEngineeringMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.energy_storage.basic_strength_formal_science_multiblock_energy_storage.BasicStrengthFormalScienceMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.material_storage.basic_strength_formal_science_multiblock_material_storage.BasicStrengthFormalScienceMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.energy_storage.basic_strength_geo_science_multiblock_energy_storage.BasicStrengthGeoScienceMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.material_storage.basic_strength_geo_science_multiblock_material_storage.BasicStrengthGeoScienceMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.energy_storage.basic_strength_hybrid_physics_multiblock_energy_storage.BasicStrengthHybridPhysicsMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.material_storage.basic_strength_hybrid_physics_multiblock_material_storage.BasicStrengthHybridPhysicsMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.energy_storage.basic_strength_imitation_magic_engineering_multiblock_energy_storage.BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.material_storage.basic_strength_imitation_magic_engineering_multiblock_material_storage.BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageMenu;
import net.epitap.degeneracycraft.item.sefirah_core.SefirahCoreMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Degeneracycraft.MOD_ID);


    public static final RegistryObject<MenuType<PulverizerMenu>> PULVERIZER_MENU =
            registerMenuType(PulverizerMenu::new, "pulverizer_menu");

    public static final RegistryObject<MenuType<BasicStrengthAstronomyMultiblockEnergyStorageMenu>> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthAstronomyMultiblockEnergyStorageMenu::new, "basic_strength_astronomy_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthAstronomyMultiblockMaterialStorageMenu>> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthAstronomyMultiblockMaterialStorageMenu::new, "basic_strength_astronomy_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthBiologyMultiblockEnergyStorageMenu>> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthBiologyMultiblockEnergyStorageMenu::new, "basic_strength_biology_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthBiologyMultiblockMaterialStorageMenu>> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthBiologyMultiblockMaterialStorageMenu::new, "basic_strength_biology_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthChemistryMultiblockEnergyStorageMenu>> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthChemistryMultiblockEnergyStorageMenu::new, "basic_strength_chemistry_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthChemistryMultiblockMaterialStorageMenu>> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthChemistryMultiblockMaterialStorageMenu::new, "basic_strength_chemistry_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthDynamicEnergeticsMultiblockEnergyStorageMenu>> BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthDynamicEnergeticsMultiblockEnergyStorageMenu::new, "basic_strength_dynamic_energetics_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthDynamicEnergeticsMultiblockMaterialStorageMenu>> BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthDynamicEnergeticsMultiblockMaterialStorageMenu::new, "basic_strength_dynamic_energetics_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthEngineeringMultiblockEnergyStorageMenu>> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthEngineeringMultiblockEnergyStorageMenu::new, "basic_strength_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthEngineeringMultiblockMaterialStorageMenu>> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthEngineeringMultiblockMaterialStorageMenu::new, "basic_strength_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthFormalScienceMultiblockEnergyStorageMenu>> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthFormalScienceMultiblockEnergyStorageMenu::new, "basic_strength_formal_science_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthFormalScienceMultiblockMaterialStorageMenu>> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthFormalScienceMultiblockMaterialStorageMenu::new, "basic_strength_formal_science_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthGeoScienceMultiblockEnergyStorageMenu>> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthGeoScienceMultiblockEnergyStorageMenu::new, "basic_strength_geo_science_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthGeoScienceMultiblockMaterialStorageMenu>> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthGeoScienceMultiblockMaterialStorageMenu::new, "basic_strength_geo_science_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthHybridPhysicsMultiblockEnergyStorageMenu>> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthHybridPhysicsMultiblockEnergyStorageMenu::new, "basic_strength_hybrid_physics_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthHybridPhysicsMultiblockMaterialStorageMenu>> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthHybridPhysicsMultiblockMaterialStorageMenu::new, "basic_strength_hybrid_physics_multiblock_material_storage_menu");

    public static final RegistryObject<MenuType<BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageMenu>> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_MENU =
            registerMenuType(BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageMenu::new, "basic_strength_imitation_magic_engineering_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageMenu>> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_MENU =
            registerMenuType(BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageMenu::new, "basic_strength_imitation_magic_engineering_multiblock_material_storage_menu");



    public static final RegistryObject<MenuType<RedstonePoweredMachineElementManufactureMachineMenu>> REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_MENU =
            registerMenuType(RedstonePoweredMachineElementManufactureMachineMenu::new, "redstone_powered_machine_element_manufacture_machine_menu");

    public static final RegistryObject<MenuType<RedstonePoweredMachinePartManufactureMachineMenu>> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_MENU =
            registerMenuType(RedstonePoweredMachinePartManufactureMachineMenu::new, "redstone_powered_machine_part_manufacture_machine_menu");



    public static final RegistryObject<MenuType<BasicPerformanceAstronomicalTelescopeMenu>> BASIC_PERFORMANCE_ASTROMICAL_TELESCOPE_MENU =
            registerMenuType(BasicPerformanceAstronomicalTelescopeMenu::new, "basic_performance_astronomical_telescope_menu");
    public static final RegistryObject<MenuType<BasicPerformanceFineParticleAdsorberMenu>> BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_MENU =
            registerMenuType(BasicPerformanceFineParticleAdsorberMenu::new, "basic_performance_fine_particle_adsorber_menu");
    public static final RegistryObject<MenuType<BasicPerformanceStarlightCollectorMenu>> BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_MENU =
            registerMenuType(BasicPerformanceStarlightCollectorMenu::new, "basic_performance_starlight_collector_menu");


    public static final RegistryObject<MenuType<BasicPerformanceBioReactorMenu>> BASIC_PERFORMANCE_BIO_REACTOR_MENU =
            registerMenuType(BasicPerformanceBioReactorMenu::new, "basic_performance_bio_reactor_menu");
    public static final RegistryObject<MenuType<BasicPerformanceCellIncubatorMenu>> BASIC_PERFORMANCE_CELL_INCUBATOR_MENU =
            registerMenuType(BasicPerformanceCellIncubatorMenu::new, "basic_performance_cell_incubator_menu");
    public static final RegistryObject<MenuType<BasicPerformanceCropCultivatorMenu>> BASIC_PERFORMANCE_CROP_CULTIVATOR_MENU =
            registerMenuType(BasicPerformanceCropCultivatorMenu::new, "basic_performance_crop_cultivator_menu");



    public static final RegistryObject<MenuType<BasicPerformanceChemicalReactorMenu>> BASIC_PERFORMANCE_CHEMICAL_REACTOR_MENU =
            registerMenuType(BasicPerformanceChemicalReactorMenu::new, "basic_performance_chemical_reactor_menu");
    public static final RegistryObject<MenuType<BasicPerformanceCompoundPurifierMenu>> BASIC_PERFORMANCE_COMPOUND_PURIFIER_MENU =
            registerMenuType(BasicPerformanceCompoundPurifierMenu::new, "basic_performance_compound_purifier_menu");
    public static final RegistryObject<MenuType<BasicPerformanceElectrolyserMenu>> BASIC_PERFORMANCE_ELECTROLYSER_MENU =
            registerMenuType(BasicPerformanceElectrolyserMenu::new, "basic_performance_electrolyser_menu");






    public static final RegistryObject<MenuType<BasicPowerSteamGeneratorMenu>> BASIC_POWER_STEAM_GENERATOR_MENU =
            registerMenuType(BasicPowerSteamGeneratorMenu::new, "basic_power_steam_generator_menu");
    public static final RegistryObject<MenuType<BasicTechnologyCompressionCondenserMenu>> BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_MENU =
            registerMenuType(BasicTechnologyCompressionCondenserMenu::new, "basic_technology_compression_condenser_menu");
    public static final RegistryObject<MenuType<BasicTechnologyElectromagneticInductorMenu>> BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_MENU =
            registerMenuType(BasicTechnologyElectromagneticInductorMenu::new, "basic_technology_electromagnetic_inductor_menu");










    public static final RegistryObject<MenuType<BasicTechnologyUniversalAssemblerMenu>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_MENU =
            registerMenuType(BasicTechnologyUniversalAssemblerMenu::new, "basic_technology_universal_assembler_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMachineManufacturerMenu>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_MENU =
            registerMenuType(BasicTechnologyMachineManufacturerMenu::new, "basic_technology_machine_manufacturer_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMachineElementProcessorMenu>> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_MACHINE_MENU =
            registerMenuType(BasicTechnologyMachineElementProcessorMenu::new, "basic_technology_machine_element_processor_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMachinePartProcessorMenu>> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_MACHINE_MENU =
            registerMenuType(BasicTechnologyMachinePartProcessorMenu::new, "basic_technology_machine_part_processor_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMultiblockEquipmentFabricatorMenu>> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_MENU =
            registerMenuType(BasicTechnologyMultiblockEquipmentFabricatorMenu::new, "basic_technology_multiblock_equipment_fabricator_menu");
    public static final RegistryObject<MenuType<BasicPhaseBoltManufactureMachineMenu>> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU =
            registerMenuType(BasicPhaseBoltManufactureMachineMenu::new, "basic_phase_bolt_manufacture_menu");





    public static final RegistryObject<MenuType<BasicPerformanceCircuitBuilderMenu>> BASIC_PERFORMANCE_CIRCUIT_BUILDER_MENU =
            registerMenuType(BasicPerformanceCircuitBuilderMenu::new, "basic_performance_circuit_builder_menu");
    public static final RegistryObject<MenuType<BasicPerformanceMachineDataInstallerMenu>> BASIC_PERFORMANCE_MACHINE_DARA_INSTALLER_MENU =
            registerMenuType(BasicPerformanceMachineDataInstallerMenu::new, "basic_performance_machine_data_installer_menu");
    public static final RegistryObject<MenuType<BasicPerformanceDesignatedDataInjectorMenu>> BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_MENU =
            registerMenuType(BasicPerformanceDesignatedDataInjectorMenu::new, "basic_performance_designated_data_injector_menu");



    public static final RegistryObject<MenuType<BasicPerformanceOreSorterMenu>> BASIC_PERFORMANCE_ORE_SORTER_MENU =
            registerMenuType(BasicPerformanceOreSorterMenu::new, "basic_performance_ore_sorter_menu");
    public static final RegistryObject<MenuType<BasicPerformanceRockCrasherMenu>> BASIC_PERFORMANCE_ROCK_CRASHER_MENU =
            registerMenuType(BasicPerformanceRockCrasherMenu::new, "basic_performance_rock_crasher_menu");
    public static final RegistryObject<MenuType<BasicPerformanceSoilPurifierMenu>> BASIC_PERFORMANCE_SOIL_PURIFIER_MENU =
            registerMenuType(BasicPerformanceSoilPurifierMenu::new, "basic_performance_soil_purifier_menu");



    public static final RegistryObject<MenuType<BasicPerformanceElectricArcFurnaceMenu>> BASIC_PERFORMANCE_ARC_ELECTRIC_FURNACE_MENU =
            registerMenuType(BasicPerformanceElectricArcFurnaceMenu::new, "basic_performance_electric_arc_furnace_menu");
    public static final RegistryObject<MenuType<BasicPerformanceFormingMachineMenu>> BASIC_PERFORMANCE_FORMING_MACHINE_MENU =
            registerMenuType(BasicPerformanceFormingMachineMenu::new, "basic_performance_forming_machine_menu");
    public static final RegistryObject<MenuType<BasicPerformanceMaterialSeparatorMenu>> BASIC_PERFORMANCE_MATERIAL_SEPARATOR_MENU =
            registerMenuType(BasicPerformanceMaterialSeparatorMenu::new, "basic_performance_material_separator_menu");


    public static final RegistryObject<MenuType<BasicTechnologyImitationMagicEngraverMenu>> BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_MENU =
            registerMenuType(BasicTechnologyImitationMagicEngraverMenu::new, "basic_technology_imitation_magic_engraver_menu");
    public static final RegistryObject<MenuType<BasicTechnologySuspectedMagicCondenserMenu>> BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_MENU =
            registerMenuType(BasicTechnologySuspectedMagicCondenserMenu::new, "basic_technology_suspected_magic_condenser_menu");
    public static final RegistryObject<MenuType<BasicTechnologyVirtualSigilProcessorMenu>> BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_MENU =
            registerMenuType(BasicTechnologyVirtualSigilProcessorMenu::new, "basic_technology_virtual_sigil_processor_menu");



    public static final RegistryObject<MenuType<InfinityPoweredAllInOneCompressorMachineMenu>> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU =
            registerMenuType(InfinityPoweredAllInOneCompressorMachineMenu::new, "infinity_powered_all_in_one_compressor_machine_menu");


    public static final RegistryObject<MenuType<SefirahCoreMenu>> SEFIRAH_CORE_MENU =
            registerMenuType(SefirahCoreMenu::new, "sefirah_core_menu");


//    public static final RegistryObject<MenuType<TestBlockMenu>> TEST_MENU=
//            registerMenuType(TestBlockMenu::new,"test_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }


}
