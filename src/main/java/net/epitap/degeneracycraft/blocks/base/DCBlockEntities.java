package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.entity.machine.PulverizerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_power_steam_generator.BasicPowerSteamGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.energy_storage.basic_strength_astronomy_multiblock_energy_storage.BasicStrengthAstronomyMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.material_storage.basic_strength_astronomy_multiblock_material_storage.BasicStrengthAstronomyMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.energy_storage.basic_strength_biology_multiblock_energy_storage.BasicStrengthBiologyMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.material_storage.basic_strength_biology_multiblock_material_storage.BasicStrengthBiologyMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.energy_storage.basic_strength_chemistry_multiblock_energy_storage.BasicStrengthChemistryMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.material_storage.basic_strength_chemistry_multiblock_material_storage.BasicStrengthChemistryMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_energetics.energy_storage.basic_strength_dynamic_energetics_multiblock_energy_storage.BasicStrengthDynamicEnergeticsMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_energetics.material_storage.basic_strength_dynamic_energetics_multiblock_material_storage.BasicStrengthDynamicEnergeticsMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energy_storage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.material_storage.basic_strength_engineering_multiblock_material_storage.BasicStrengthEngineeringMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.energy_storage.basic_strength_formal_science_multiblock_energy_storage.BasicStrengthFormalScienceMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.material_storage.basic_strength_formal_science_multiblock_material_storage.BasicStrengthFormalScienceMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.energy_storage.basic_strength_geo_science_multiblock_energy_storage.BasicStrengthGeoScienceMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.material_storage.basic_strength_geo_science_multiblock_material_storage.BasicStrengthGeoScienceMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.energy_storage.basic_strength_hybrid_physics_multiblock_energy_storage.BasicStrengthHybridPhysicsMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.material_storage.basic_strength_hybrid_physics_multiblock_material_storage.BasicStrengthHybridPhysicsMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.energy_storage.basic_strength_imitation_magic_engineering_multiblock_energy_storage.BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.material_storage.basic_strength_imitation_magic_engineering_multiblock_material_storage.BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.bus.BasicPerformanceAstronomicalTelescopeBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.port.BasicPerformanceAstronomicalTelescopePortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.bus.BasicPerformanceFineParticleAdsorberBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.port.BasicPerformanceFineParticleAdsorberPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.bus.BasicPerformanceStarlightCollectorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.port.BasicPerformanceStarlightCollectorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.bus.BasicPerformanceBioReactorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.port.BasicPerformanceBioReactorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.bus.BasicPerformanceCropCultivatorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.port.BasicPerformanceCropCultivatorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.bus.BasicPerformanceChemicalReactorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.port.BasicPerformanceChemicalReactorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.bus.BasicPerformanceCompoundPurifierBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.port.BasicPerformanceCompoundPurifierPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.bus.BasicPerformanceElectrolyserBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.port.BasicPerformanceElectrolyserPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_power_steam_generator.bus.BasicPowerSteamGeneratorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_power_steam_generator.port.BasicPowerSteamGeneratorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.bus.BasicTechnologyCompressionCondenserBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.port.BasicTechnologyCompressionCondenserPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.bus.BasicTechnologyElectromagneticInductorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.port.BasicTechnologyElectromagneticInductorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.bus.BasicTechnologyMachineElementProcessorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.port.BasicTechnologyMachineElementProcessorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.port.BasicTechnologyMachineManufacturerPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.bus.BasicTechnologyMachinePartProcessorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.port.BasicTechnologyMachinePartProcessorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.bus.BasicTechnologyMultiblockEquipmentFabricatorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.port.BasicTechnologyMultiblockEquipmentFabricatorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.bus.BasicTechnologyUniversalAssemblerBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.port.BasicTechnologyUniversalAssemblerPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.bus.BasicPerformanceCircuitBuilderBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.port.BasicPerformanceCircuitBuilderPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.bus.BasicPerformanceDesignatedDataInjectorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.port.BasicPerformanceDesignatedDataInjectorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.bus.BasicPerformanceMachineDataInstallerBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.port.BasicPerformanceMachineDataInstallerPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.bus.BasicPerformanceOreSorterBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.port.BasicPerformanceOreSorterPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.bus.BasicPerformanceRockCrasherBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.port.BasicPerformanceRockCrasherPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.bus.BasicPerformanceSoilPurifierBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.port.BasicPerformanceSoilPurifierPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.bus.BasicPerformanceElectricArcFurnaceBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.port.BasicPerformanceElectricArcFurnacePortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.bus.BasicPerformanceFormingMachineBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.port.BasicPerformanceFormingMachinePortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.bus.BasicPerformanceMaterialSeparatorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.port.BasicPerformanceMaterialSeparatorPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.bus.BasicTechnologyImitationMagicEngraverBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.port.BasicTechnologyImitationMagicEngraverPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.bus.BasicTechnologySuspectedMagicCondenserBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.port.BasicTechnologySuspectedMagicCondenserPortBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.bus.BasicTechnologyVirtualSigilProcessorBusBlockEntity;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.port.BasicTechnologyVirtualSigilProcessorPortBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Degeneracycraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<PulverizerBlockEntity>> PULVERIZER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("pulverizer_block_entity", () ->
                    BlockEntityType.Builder.of(PulverizerBlockEntity::new, DCBlocks.PULVERIZER_BLOCK.get()).build(null));


//    public static final RegistryObject<BlockEntityType<UniversalAssemblerPhase2BlockEntity>> UNIVERSAL_ASSEMBLER_PHASE2_BLOCK_ENTITY =
//            BLOCK_ENTITIES.register("universal_assembler_phase2_block_entity",()->
//                    BlockEntityType.Builder.of(UniversalAssemblerPhase2BlockEntity::new, DCBlocks.UNIVERSAL_ASSEMBLER_PHASE2_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<RedstonePoweredMachineElementManufactureMachineBlockEntity>> REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("redstone_powered_machine_element_manufacture_machine_block_entity", () ->
                    BlockEntityType.Builder.of(RedstonePoweredMachineElementManufactureMachineBlockEntity::new, DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<RedstonePoweredMachinePartManufactureMachineBlockEntity>> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("redstone_powered_machine_part_manufacture_machine_block_entity", () ->
                    BlockEntityType.Builder.of(RedstonePoweredMachinePartManufactureMachineBlockEntity::new, DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicStrengthAstronomyMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_astronomy_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthAstronomyMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthAstronomyMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_astronomy_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthAstronomyMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthBiologyMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_biology_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthBiologyMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthBiologyMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_biology_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthBiologyMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthChemistryMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_chemistry_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthChemistryMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthChemistryMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_chemistry_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthChemistryMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthDynamicEnergeticsMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_dynamic_energetics_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthDynamicEnergeticsMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthDynamicEnergeticsMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_dynamic_energetics_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthDynamicEnergeticsMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthEngineeringMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_engineering_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthEngineeringMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthEngineeringMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_engineering_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthEngineeringMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthFormalScienceMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_formal_science_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthFormalScienceMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthFormalScienceMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_formal_science_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthFormalScienceMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthGeoScienceMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_geo_science_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthGeoScienceMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthGeoScienceMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_geo_science_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthGeoScienceMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthHybridPhysicsMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_hybrid_physics_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthHybridPhysicsMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthHybridPhysicsMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_hybrid_physics_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthHybridPhysicsMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_imitation_magic_engineering_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_imitation_magic_engineering_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));



    public static final RegistryObject<BlockEntityType<BasicPerformanceAstronomicalTelescopeBlockEntity>> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_astronomical_telescope_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceAstronomicalTelescopeBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceAstronomicalTelescopeBusBlockEntity>> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_astronomical_telescope_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceAstronomicalTelescopeBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceAstronomicalTelescopePortBlockEntity>> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_astronomical_telescope_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceAstronomicalTelescopePortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceFineParticleAdsorberBlockEntity>> BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_fine_particle_adsorber_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceFineParticleAdsorberBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceFineParticleAdsorberBusBlockEntity>> BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_fine_particle_adsorber_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceFineParticleAdsorberBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceFineParticleAdsorberPortBlockEntity>> BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_fine_particle_adsorber_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceFineParticleAdsorberPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_PORT_BLOCK.get()).build(null));
    

    public static final RegistryObject<BlockEntityType<BasicPerformanceStarlightCollectorBlockEntity>> BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_starlight_collector_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceStarlightCollectorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceStarlightCollectorBusBlockEntity>> BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_starlight_collector_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceStarlightCollectorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceStarlightCollectorPortBlockEntity>> BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_starlight_collector_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceStarlightCollectorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_PORT_BLOCK.get()).build(null));



    public static final RegistryObject<BlockEntityType<BasicPerformanceBioReactorBlockEntity>> BASIC_PERFORMANCE_BIO_REACTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_bio_reactor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceBioReactorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceBioReactorBusBlockEntity>> BASIC_PERFORMANCE_BIO_REACTOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_bio_reactor_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceBioReactorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceBioReactorPortBlockEntity>> BASIC_PERFORMANCE_BIO_REACTOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_bio_reactor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceBioReactorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceCellIncubatorBlockEntity>> BASIC_PERFORMANCE_CELL_INCUBATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_cell_incubator_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCellIncubatorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCropCultivatorBusBlockEntity>> BASIC_PERFORMANCE_CELL_INCUBATOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_cell_incubator_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCropCultivatorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCropCultivatorPortBlockEntity>> BASIC_PERFORMANCE_CELL_INCUBATOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_cell_incubator_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCropCultivatorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CELL_INCUBATOR_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceCropCultivatorBlockEntity>> BASIC_PERFORMANCE_CROP_CULTIVATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_crop_cultivator_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCropCultivatorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCropCultivatorBusBlockEntity>> BASIC_PERFORMANCE_CROP_CULTIVATOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_crop_cultivator_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCropCultivatorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCropCultivatorPortBlockEntity>> BASIC_PERFORMANCE_CROP_CULTIVATOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_crop_cultivator_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCropCultivatorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CROP_CULTIVATOR_PORT_BLOCK.get()).build(null));




    public static final RegistryObject<BlockEntityType<BasicPerformanceChemicalReactorBlockEntity>> BASIC_PERFORMANCE_CHEMICAL_REACTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_chemical_reactor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceChemicalReactorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceChemicalReactorBusBlockEntity>> BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_chemical_reactor_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceChemicalReactorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceChemicalReactorPortBlockEntity>> BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_chemical_reactor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceChemicalReactorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceElectrolyserBlockEntity>> BASIC_PERFORMANCE_ELECTROLYSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_electrolyser_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceElectrolyserBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceElectrolyserBusBlockEntity>> BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_electrolyser_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceElectrolyserBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceElectrolyserPortBlockEntity>> BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_electrolyser_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceElectrolyserPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCompoundPurifierBlockEntity>> BASIC_PERFORMANCE_COMPOUND_PURIFIER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_compound_purifier_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCompoundPurifierBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCompoundPurifierBusBlockEntity>> BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_compound_purifier_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCompoundPurifierBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCompoundPurifierPortBlockEntity>> BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_compound_purifier_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCompoundPurifierPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_BLOCK.get()).build(null));







    public static final RegistryObject<BlockEntityType<BasicPowerSteamGeneratorBlockEntity>> BASIC_POWER_STEAM_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_power_steam_generator_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPowerSteamGeneratorBlockEntity::new, DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPowerSteamGeneratorBusBlockEntity>> BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_power_steam_generator_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPowerSteamGeneratorBusBlockEntity::new, DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPowerSteamGeneratorPortBlockEntity>> BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_power_steam_generator_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPowerSteamGeneratorPortBlockEntity::new, DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()).build(null));
    
    public static final RegistryObject<BlockEntityType<BasicTechnologyCompressionCondenserBlockEntity>> BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_compression_condenser_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyCompressionCondenserBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyCompressionCondenserBusBlockEntity>> BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_compression_condenser_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyCompressionCondenserBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyCompressionCondenserPortBlockEntity>> BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_compression_condenser_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyCompressionCondenserPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicTechnologyElectromagneticInductorBlockEntity>> BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_electromagnetic_inductor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyElectromagneticInductorBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyElectromagneticInductorBusBlockEntity>> BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_electromagnetic_inductor_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyElectromagneticInductorBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyElectromagneticInductorPortBlockEntity>> BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_electromagnetic_inductor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyElectromagneticInductorPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_BLOCK.get()).build(null));










    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineManufacturerBlockEntity>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_manufacturer_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineManufacturerBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineManufacturerPortBlockEntity>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_manufacturer_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineManufacturerPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineManufacturerBusBlockEntity>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_manufacturer_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineManufacturerBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyUniversalAssemblerBlockEntity>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_universal_assembler_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyUniversalAssemblerBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyUniversalAssemblerBusBlockEntity>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_universal_assembler_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyUniversalAssemblerBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyUniversalAssemblerPortBlockEntity>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_universal_assembler_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyUniversalAssemblerPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineElementProcessorBlockEntity>> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_element_processor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineElementProcessorBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineElementProcessorBusBlockEntity>> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_element_processor_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineElementProcessorBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineElementProcessorPortBlockEntity>> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_element_processor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineElementProcessorPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachinePartProcessorBlockEntity>> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_part_processor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachinePartProcessorBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachinePartProcessorBusBlockEntity>> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_part_processor_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachinePartProcessorBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachinePartProcessorPortBlockEntity>> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_part_processor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachinePartProcessorPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMultiblockEquipmentFabricatorBlockEntity>> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_multiblock_equipment_fabricator_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMultiblockEquipmentFabricatorBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMultiblockEquipmentFabricatorBusBlockEntity>> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_multiblock_equipment_fabricator_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMultiblockEquipmentFabricatorBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMultiblockEquipmentFabricatorPortBlockEntity>> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_multiblock_equipment_fabricator_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMultiblockEquipmentFabricatorPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicPhaseBoltManufactureMachineBlockEntity>> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_phase_bolt_manufacture_machine_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPhaseBoltManufactureMachineBlockEntity::new, DCBlocks.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK.get()).build(null));






    public static final RegistryObject<BlockEntityType<BasicPerformanceCircuitBuilderBlockEntity>> BASIC_PERFORMANCE_CIRCUIT_BUILDER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_circuit_builder_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCircuitBuilderBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCircuitBuilderBusBlockEntity>> BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_circuit_builder_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCircuitBuilderBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceCircuitBuilderPortBlockEntity>> BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_circuit_builder_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceCircuitBuilderPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceMachineDataInstallerBlockEntity>> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_machine_data_installer_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceMachineDataInstallerBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceMachineDataInstallerBusBlockEntity>> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_machine_data_installer_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceMachineDataInstallerBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceMachineDataInstallerPortBlockEntity>> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_machine_data_installer_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceMachineDataInstallerPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceDesignatedDataInjectorBlockEntity>> BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_designated_data_injector_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceDesignatedDataInjectorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceDesignatedDataInjectorBusBlockEntity>> BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_designated_data_injector_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceDesignatedDataInjectorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceDesignatedDataInjectorPortBlockEntity>> BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_designated_data_injector_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceDesignatedDataInjectorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK.get()).build(null));






    public static final RegistryObject<BlockEntityType<BasicPerformanceOreSorterBlockEntity>> BASIC_PERFORMANCE_ORE_SORTER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_ore_sorter_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceOreSorterBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceOreSorterBusBlockEntity>> BASIC_PERFORMANCE_ORE_SORTER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_ore_sorter_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceOreSorterBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceOreSorterPortBlockEntity>> BASIC_PERFORMANCE_ORE_SORTER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_ore_sorter_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceOreSorterPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ORE_SORTER_PORT_BLOCK.get()).build(null));
    
    public static final RegistryObject<BlockEntityType<BasicPerformanceRockCrasherBlockEntity>> BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_rock_crasher_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceRockCrasherBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceRockCrasherBusBlockEntity>> BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_rock_crasher_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceRockCrasherBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceRockCrasherPortBlockEntity>> BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_rock_crasher_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceRockCrasherPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceSoilPurifierBlockEntity>> BASIC_PERFORMANCE_SOIL_PURIFIER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_soil_purifier_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceSoilPurifierBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceSoilPurifierBusBlockEntity>> BASIC_PERFORMANCE_SOIL_PURIFIER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_soil_purifier_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceSoilPurifierBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceSoilPurifierPortBlockEntity>> BASIC_PERFORMANCE_SOIL_PURIFIER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_soil_purifier_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceSoilPurifierPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_SOIL_PURIFIER_PORT_BLOCK.get()).build(null));








    public static final RegistryObject<BlockEntityType<BasicPerformanceElectricArcFurnaceBlockEntity>> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_electric_arc_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceElectricArcFurnaceBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceElectricArcFurnaceBusBlockEntity>> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_electric_arc_furnace_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceElectricArcFurnaceBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceElectricArcFurnacePortBlockEntity>> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_electric_arc_furnace_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceElectricArcFurnacePortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK.get()).build(null));
   
    public static final RegistryObject<BlockEntityType<BasicPerformanceFormingMachineBlockEntity>> BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_forming_machine_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceFormingMachineBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceFormingMachineBusBlockEntity>> BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_forming_machine_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceFormingMachineBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceFormingMachinePortBlockEntity>> BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_forming_machine_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceFormingMachinePortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPerformanceMaterialSeparatorBlockEntity>> BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_material_separator_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceMaterialSeparatorBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceMaterialSeparatorBusBlockEntity>> BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_material_separator_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceMaterialSeparatorBusBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPerformanceMaterialSeparatorPortBlockEntity>> BASIC_PERFORMANCE_MATERIAL_SEPARATOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_performance_material_separator_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPerformanceMaterialSeparatorPortBlockEntity::new, DCBlocks.BASIC_PERFORMANCE_MATERIAL_SEPARATOR_PORT_BLOCK.get()).build(null));
    


    public static final RegistryObject<BlockEntityType<BasicTechnologyImitationMagicEngraverBlockEntity>> BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_imitation_magic_engraver_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyImitationMagicEngraverBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyImitationMagicEngraverBusBlockEntity>> BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_imitation_magic_engraver_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyImitationMagicEngraverBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyImitationMagicEngraverPortBlockEntity>> BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_imitation_magic_engraver_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyImitationMagicEngraverPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicTechnologySuspectedMagicCondenserBlockEntity>> BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_suspected_magic_condenser_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologySuspectedMagicCondenserBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologySuspectedMagicCondenserBusBlockEntity>> BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_suspected_magic_condenser_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologySuspectedMagicCondenserBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologySuspectedMagicCondenserPortBlockEntity>> BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_suspected_magic_condenser_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologySuspectedMagicCondenserPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_BLOCK.get()).build(null));
    
    public static final RegistryObject<BlockEntityType<BasicTechnologyVirtualSigilProcessorBlockEntity>> BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_virtual_sigil_processor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyVirtualSigilProcessorBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyVirtualSigilProcessorBusBlockEntity>> BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_virtual_sigil_processor_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyVirtualSigilProcessorBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyVirtualSigilProcessorPortBlockEntity>> BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_virtual_sigil_processor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyVirtualSigilProcessorPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_PORT_BLOCK.get()).build(null));












    public static final RegistryObject<BlockEntityType<InfinityPoweredAllInOneCompressorMachineBlockEntity>> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("infinity_powered_all_in_one_compressor_machine_block_entity", () ->
                    BlockEntityType.Builder.of(InfinityPoweredAllInOneCompressorMachineBlockEntity::new, DCBlocks.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK.get()).build(null));


//    public static final RegistryObject<BlockEntityType<BasicPowerSteamGeneratorBusBlockEntity>> TEST_BLOCK_ENTITY =
//            BLOCK_ENTITIES.register("test_pipe",()->
//                    BlockEntityType.Builder.of(BasicPowerSteamGeneratorBusBlockEntity::new, DCBlocks.TEST_BLOCK.get()).build(null));

//    public static RegistryObject<BlockEntityType<TestBlockEntity> > COMPACT_CHEST_ENTITY_TYPE =
//            TestBlockEntity.register("compact_chest", () -> BlockEntityType.Builder.of(TestBlockEntity::new, mapRegistryObjectToBlocks(COMPACT_CHEST_BLOCKS)).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
