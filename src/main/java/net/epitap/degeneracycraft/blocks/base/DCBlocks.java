package net.epitap.degeneracycraft.blocks.base;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.block.machine.PulverizerBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.energy_storage.basic_strength_astronomy_multiblock_energy_storage.BasicStrengthAstronomyMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.material_storage.basic_strength_astronomy_multiblock_material_storage.BasicStrengthAstronomyMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.energy_storage.basic_strength_biology_multiblock_energy_storage.BasicStrengthBiologyMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.material_storage.basic_strength_biology_multiblock_material_storage.BasicStrengthBiologyMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.energy_storage.basic_strength_chemistry_multiblock_energy_storage.BasicStrengthChemistryMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.material_storage.basic_strength_chemistry_multiblock_material_storage.BasicStrengthChemistryMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energy_storage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.material_storage.basic_strength_engineering_multiblock_material_storage.BasicStrengthEngineeringMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.energy_storage.basic_strength_formal_science_multiblock_energy_storage.BasicStrengthFormalScienceMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.material_storage.basic_strength_formal_science_multiblock_material_storage.BasicStrengthFormalScienceMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.energy_storage.basic_strength_geo_science_multiblock_energy_storage.BasicStrengthGeoScienceMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.material_storage.basic_strength_geo_science_multiblock_material_storage.BasicStrengthGeoScienceMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.energy_storage.basic_strength_hybrid_physics_multiblock_energy_storage.BasicStrengthHybridPhysicsMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.material_storage.basic_strength_hybrid_physics_multiblock_material_storage.BasicStrengthHybridPhysicsMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.energy_storage.basic_strength_imitation_magic_engineering_multiblock_energy_storage.BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.material_storage.basic_strength_imitation_magic_engineering_multiblock_material_storage.BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.item.DCCreativeTab;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.bus.BasicPerformanceElectrolyserBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.port.BasicPerformanceElectrolyserPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_power_steam_generator.bus.BasicPowerSteamGeneratorBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_power_steam_generator.port.BasicPowerSteamGeneratorPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.bus.BasicTechnologyMachineElementProcessorBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.port.BasicTechnologyMachineElementProcessorPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.port.BasicTechnologyMachineManufacturerPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.bus.BasicTechnologyMachinePartProcessorBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.port.BasicTechnologyMachinePartProcessorPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.bus.BasicTechnologyMultiblockEquipmentFabricatorBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.port.BasicTechnologyMultiblockEquipmentFabricatorPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.bus.BasicTechnologyUniversalAssemblerBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_universal_assembler.port.BasicTechnologyUniversalAssemblerPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.bus.BasicPerformanceMachineDataInstallerBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.port.BasicPerformanceMachineDataInstallerPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.bus.BasicPerformanceRockCrasherBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.port.BasicPerformanceRockCrasherPortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.bus.BasicPerformanceElectricArcFurnaceBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.port.BasicPerformanceElectricArcFurnacePortBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.bus.BasicPerformanceFormingMachineBusBlock;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.port.BasicPerformanceFormingMachinePortBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class DCBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);
    public static final TagKey<Block> GRAVITATION_ORE = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "gravitation_ore"));
    public static final RegistryObject<Block> OVERWORLD_CASSITERITE_ORE = registerBlock("overworld_cassiterite_ore", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
            DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CASSITERITE_ORE = registerBlock("deepslate_cassiterite_ore", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
            DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final RegistryObject<Block> NETHER_CASSITERITE_ORE = registerBlock("nether_cassiterite_ore", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
            DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final RegistryObject<Block> END_CASSITERITE_ORE = registerBlock("end_cassiterite_ore", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
            DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final TagKey<Block> CASSITERITE_ORE = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "cassiterite_ore"));

    public static final RegistryObject<Block> SILICON_BLOCK = registerTooltipMeterialElementBlock("silicon_block", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f, 10.0f)),
            DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "silicon", "basic");
    public static final RegistryObject<Block> TIN_BLOCK = registerTooltipMeterialElementBlock("tin_block", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f, 10.0f)),
            DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "tin", "basic");


    public static final RegistryObject<Block> OVERWORLD_GRAVITATION_ORE = registerBlock("overworld_gravitation_ore_block", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
            DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);

    public static final RegistryObject<Block> REINFORCED_PLANKS = registerBlock("reinforced_planks", () -> new BlockBase(BlockBehaviour.Properties.of(Material.WOOD).strength(4.0f, 10.0f)),
            DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB);


    public static final RegistryObject<Block> PULVERIZER_BLOCK = registerBlock("pulverizer", () -> new PulverizerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_TAB);

    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_astronomy_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_astronomy_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_astronomy_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_astronomy_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_astronomy_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_astronomy_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_astronomy_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_astronomy_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_astronomy_multiblock_energy_storage_block", () ->
            new BasicStrengthAstronomyMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_astronomy_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_astronomy_multiblock_material_storage_block", () ->
            new BasicStrengthAstronomyMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_astronomy_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_biology_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_biology_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_biology_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_biology_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_biology_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_biology_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_biology_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_biology_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_biology_multiblock_energy_storage_block", () ->
            new BasicStrengthBiologyMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_biology_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_biology_multiblock_material_storage_block", () ->
            new BasicStrengthBiologyMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_biology_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_chemistry_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_chemistry_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_chemistry_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_chemistry_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_chemistry_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_chemistry_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_chemistry_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_chemistry_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_chemistry_multiblock_energy_storage_block", () ->
            new BasicStrengthChemistryMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_chemistry_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_chemistry_multiblock_material_storage_block", () ->
            new BasicStrengthChemistryMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_chemistry_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK = registerBlock("low_strength_multiblock_structure_frame_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK = registerBlock("low_strength_multiblock_structure_glass_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_engineering_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_engineering_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_engineering_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_engineering_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_engineering_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_engineering_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_engineering_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_engineering_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_engineering_multiblock_energy_storage_block", () ->
            new BasicStrengthEngineeringMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_engineering_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_engineering_multiblock_material_storage_block", () ->
            new BasicStrengthEngineeringMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_engineering_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_formal_science_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_formal_science_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_formal_science_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_formal_science_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_formal_science_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_formal_science_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_formal_science_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_formal_science_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_formal_science_multiblock_energy_storage_block", () ->
            new BasicStrengthFormalScienceMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_formal_science_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_formal_science_multiblock_material_storage_block", () ->
            new BasicStrengthFormalScienceMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_formal_science_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_geo_science_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_geo_science_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_geo_science_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_geo_science_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_geo_science_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_geo_science_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_geo_science_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_geo_science_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_geo_science_multiblock_energy_storage_block", () ->
            new BasicStrengthGeoScienceMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_geo_science_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_geo_science_multiblock_material_storage_block", () ->
            new BasicStrengthGeoScienceMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_geo_science_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_hybrid_physics_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_hybrid_physics_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_hybrid_physics_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_hybrid_physics_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_hybrid_physics_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_hybrid_physics_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_hybrid_physics_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_hybrid_physics_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_hybrid_physics_multiblock_energy_storage_block", () ->
            new BasicStrengthHybridPhysicsMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_hybrid_physics_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_hybrid_physics_multiblock_material_storage_block", () ->
            new BasicStrengthHybridPhysicsMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_hybrid_physics_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_imitation_magic_engineering_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_imitation_magic_engineering_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_imitation_magic_engineering_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_imitation_magic_engineering_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_imitation_magic_engineering_multiblock_energy_storage_block", () ->
            new BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_imitation_magic_engineering_multiblock_material_storage_block", () ->
            new BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE2_BLOCK = registerBlock("universal_assembler_phase2",()-> new UniversalAssemblerPhase2Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE3_BLOCK = registerBlock("universal_assembler_phase3",()-> new UniversalAssemblerPhase3Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE4_BLOCK = registerBlock("universal_assembler_phase4",()-> new UniversalAssemblerPhase4Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE5_BLOCK = registerBlock("universal_assembler_phase5",()-> new UniversalAssemblerPhase5Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE6_BLOCK = registerBlock("universal_assembler_phase6",()-> new UniversalAssemblerPhase6Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE7_BLOCK = registerBlock("universal_assembler_phase7",()-> new UniversalAssemblerPhase7Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE8_BLOCK = registerBlock("universal_assembler_phase8",()-> new UniversalAssemblerPhase8Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

//    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASEMAX_BLOCK = registerBlock("universal_assembler_phasemax",()-> new UniversalAssemblerPhasemaxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
//            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


    public static final RegistryObject<Block> REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK = registerBlock("redstone_powered_machine_element_manufacture_machine_block", () ->
            new RedstonePoweredMachineElementManufactureMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

    public static final RegistryObject<Block> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK = registerBlock("redstone_powered_machine_part_manufacture_machine_block", () ->
            new RedstonePoweredMachinePartManufactureMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);



    public static final RegistryObject<Block> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK = registerTooltipBasicMachineBlock("basic_performance_astronomical_telescope_block", () ->
                    new BasicPowerSteamGeneratorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_astronomical_telescope_block", "astronomy", "basic");
    //        public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK = registerTooltipMultiblockAbilityBlock("basic_operation_assembling_chamber_block", () ->
//                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
//            "basic_technology_universal_assembler_block",
//            "engineering",
//            "basic");
//    public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_operation_assembling_chamber_holo_block", () ->
//            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK = registerBlock("basic_precision_telescope_bus_block", () ->
            new BasicTechnologyUniversalAssemblerBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_HOLO_BLOCK = registerHoloBlock("basic_precision_telescope_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK = registerBlock("basic_precision_telescope_port_block", () ->
            new BasicTechnologyMachineManufacturerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_HOLO_BLOCK = registerHoloBlock("basic_precision_telescope_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));


    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTROLYSER_BLOCK = registerTooltipBasicMachineBlock("basic_performance_electrolyser_block", () ->
                    new BasicPerformanceElectrolyserBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:5×3×3",
            "Lv1:5×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_electrolyser_block", "chemistry", "basic");

    public static final RegistryObject<Block> BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_BLOCK = registerTooltipMultiblockAbilityBlock("basic_durable_expanded_electrolytic_cell_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_performance_electrolyser_block",
            "chemistry",
            "basic");
    public static final RegistryObject<Block> BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK = registerHoloBlock("basic_durable_expanded_electrolytic_cell_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK = registerBlock("basic_performance_electrolyser_bus_block", () ->
            new BasicPerformanceElectrolyserBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK = registerHoloBlock("basic_performance_electrolyser_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK = registerBlock("basic_performance_electrolyser_port_block", () ->
            new BasicPerformanceElectrolyserPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK = registerHoloBlock("basic_performance_electrolyser_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));


    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_BLOCK = registerTooltipBasicMachineBlock("basic_power_steam_generator_block", () ->
                    new BasicPowerSteamGeneratorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Power 16 FE/t",
            "Lv0:Power 32 FE/t",
            "Lv1:Power 48 FE/t",
            "basic_power_steam_generator_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK = registerTooltipMultiblockAbilityBlock(
            "basic_endurance_high_temperature_combustion_chamber_block", () ->
                    new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_power_steam_generator_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_endurance_high_temperature_combustion_chamber_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK = registerBlock("basic_power_steam_generator_bus_block", () ->
            new BasicPowerSteamGeneratorBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK = registerHoloBlock("basic_power_steam_generator_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK = registerBlock("basic_power_steam_generator_port_block", () ->
            new BasicPowerSteamGeneratorPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK = registerHoloBlock("basic_power_steam_generator_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK = registerTooltipBasicMachineBlock("basic_technology_machine_manufacturer_block", () ->
                    new BasicTechnologyMachineManufacturerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_machine_manufacturer_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_BLOCK = registerTooltipMultiblockAbilityBlock("basic_efficiency_machine_processing_chamber_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_technology_machine_manufacturer_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_efficiency_machine_processing_chamber_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK = registerBlock("basic_technology_machine_manufacturer_bus_block", () ->
            new BasicTechnologyMachineManufacturerBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_HOLO_BLOCK = registerHoloBlock("basic_technology_machine_manufacturer_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK = registerBlock("basic_technology_machine_manufacturer_port_block", () ->
            new BasicTechnologyMachineManufacturerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_HOLO_BLOCK = registerHoloBlock("basic_technology_machine_manufacturer_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK = registerTooltipBasicMachineBlock("basic_technology_universal_assembler_block", () ->
                    new BasicTechnologyUniversalAssemblerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_universal_assembler_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK = registerTooltipMultiblockAbilityBlock("basic_operation_assembling_chamber_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_technology_universal_assembler_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_operation_assembling_chamber_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK = registerBlock("basic_technology_universal_assembler_bus_block", () ->
            new BasicTechnologyUniversalAssemblerBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK = registerHoloBlock("basic_technology_universal_assembler_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK = registerBlock("basic_technology_universal_assembler_port_block", () ->
            new BasicTechnologyUniversalAssemblerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK = registerHoloBlock("basic_technology_universal_assembler_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BLOCK = registerTooltipBasicMachineBlock("basic_technology_circuit_builder_block", () ->
                    new BasicTechnologyCircuitBuilderBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_circuit_builder_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK = registerTooltipMultiblockAbilityBlock("basic_purity_circuit_clean_room_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_technology_circuit_builder_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK = registerHoloBlock("basic_purity_circuit_clean_room_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_BLOCK = registerBlock("basic_technology_circuit_builder_bus_block", () ->
            new BasicTechnologyUniversalAssemblerBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_HOLO_BLOCK = registerHoloBlock("basic_technology_circuit_builder_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_BLOCK = registerBlock("basic_technology_circuit_builder_port_block", () ->
            new BasicTechnologyMachineManufacturerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_HOLO_BLOCK = registerHoloBlock("basic_technology_circuit_builder_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));


    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK = registerTooltipBasicMachineBlock("basic_technology_machine_element_processor_block", () ->
                    new BasicTechnologyMachineElementProcessorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_machine_element_processor_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_BLOCK = registerTooltipMultiblockAbilityBlock("basic_efficiency_machine_element_processing_chamber_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_technology_machine_element_processor_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_efficiency_machine_element_processing_chamber_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK = registerBlock("basic_technology_machine_element_processor_bus_block", () ->
            new BasicTechnologyMachineElementProcessorBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_HOLO_BLOCK = registerHoloBlock("basic_technology_machine_element_processor_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK = registerBlock("basic_technology_machine_element_processor_port_block", () ->
            new BasicTechnologyMachineElementProcessorPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_HOLO_BLOCK = registerHoloBlock("basic_technology_machine_element_processor_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK = registerTooltipBasicMachineBlock("basic_technology_machine_part_processor_block", () ->
                    new BasicTechnologyMachinePartProcessorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_machine_part_processor_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_BLOCK = registerTooltipMultiblockAbilityBlock("basic_efficiency_machine_part_processing_chamber_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_technology_machine_part_processor_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_efficiency_machine_part_processing_chamber_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK = registerBlock("basic_technology_machine_part_processor_bus_block", () ->
            new BasicTechnologyMachinePartProcessorBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_HOLO_BLOCK = registerHoloBlock("basic_technology_machine_part_processor_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK = registerBlock("basic_technology_machine_part_processor_port_block", () ->
            new BasicTechnologyMachinePartProcessorPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_HOLO_BLOCK = registerHoloBlock("basic_technology_machine_part_processor_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK = registerTooltipBasicMachineBlock("basic_technology_multiblock_equipment_fabricator_block", () ->
                    new BasicTechnologyMultiblockEquipmentFabricatorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_multiblock_equipment_fabricator_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_BLOCK = registerTooltipMultiblockAbilityBlock("basic_efficiency_equipment_production_auxiliary_system_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_technology_multiblock_equipment_fabricator_block",
            "engineering",
            "basic");

    public static final RegistryObject<Block> BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_HOLO_BLOCK = registerHoloBlock("basic_efficiency_equipment_production_auxiliary_system_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK = registerBlock("basic_technology_multiblock_equipment_fabricator_bus_block", () ->
            new BasicTechnologyMultiblockEquipmentFabricatorBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_HOLO_BLOCK = registerHoloBlock("basic_technology_multiblock_equipment_fabricator_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK = registerBlock("basic_technology_multiblock_equipment_fabricator_port_block", () ->
            new BasicTechnologyMultiblockEquipmentFabricatorPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_HOLO_BLOCK = registerHoloBlock("basic_technology_multiblock_equipment_fabricator_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK = registerBlock("basic_phase_bolt_manufacture_machine_block", () ->
            new BasicPhaseBoltManufactureMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


    public static final RegistryObject<Block> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK = registerTooltipBasicMachineBlock("basic_performance_machine_data_installer_block", () ->
                    new BasicPerformanceMachineDataInstallerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_machine_data_installer_block", "formal_science", "basic");
    public static final RegistryObject<Block> BASIC_SPEED_DATA_READER_BLOCK = registerTooltipMultiblockAbilityBlock("basic_speed_data_reader_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_performance_machine_data_installer_block",
            "formal_science",
            "basic");
    public static final RegistryObject<Block> BASIC_SPEED_DATA_READER_HOLO_BLOCK = registerHoloBlock("basic_speed_data_reader_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK = registerBlock("basic_performance_machine_data_installer_bus_block", () ->
            new BasicPerformanceMachineDataInstallerBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_HOLO_BLOCK = registerHoloBlock("basic_performance_machine_data_installer_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK = registerBlock("basic_performance_machine_data_installer_port_block", () ->
            new BasicPerformanceMachineDataInstallerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_HOLO_BLOCK = registerHoloBlock("basic_performance_machine_data_installer_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));













    public static final RegistryObject<Block> BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK = registerTooltipBasicMachineBlock("basic_performance_rock_crasher_block", () ->
                    new BasicPerformanceRockCrasherBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×4×3",
            "Lv1:3×4×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_rock_crasher_block", "geo_science", "basic");
    public static final RegistryObject<Block> BASIC_CRASHING_BASE_BLOCK = registerTooltipMultiblockAbilityBlock("basic_crashing_base_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_performance_rock_crasher_block",
            "geo_science",
            "basic");
    public static final RegistryObject<Block> BASIC_CRASHING_BASE_HOLO_BLOCK = registerHoloBlock("basic_crashing_base_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK = registerBlock("basic_performance_rock_crasher_bus_block", () ->
            new BasicPerformanceRockCrasherBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ROCK_CRASHER_BUS_HOLO_BLOCK = registerHoloBlock("basic_performance_rock_crasher_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK = registerBlock("basic_performance_rock_crasher_port_block", () ->
            new BasicPerformanceRockCrasherPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ROCK_CRASHER_PORT_HOLO_BLOCK = registerHoloBlock("basic_performance_rock_crasher_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));































    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK = registerTooltipBasicMachineBlock("basic_performance_electric_arc_furnace_block", () ->
                    new BasicPerformanceRockCrasherBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×4×3",
            "Lv1:3×4×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_electric_arc_furnace_block", "hybrid_physics", "basic");
    public static final RegistryObject<Block> BASIC_FLOW_COOLING_SYSTEM_BLOCK = registerTooltipMultiblockAbilityBlock("basic_flow_cooling_system_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_performance_electric_arc_furnace_block",
            "hybrid_physics",
            "basic");
    public static final RegistryObject<Block> BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK = registerHoloBlock("basic_flow_cooling_system_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK = registerBlock("basic_performance_electric_arc_furnace_bus_block", () ->
            new BasicPerformanceElectricArcFurnaceBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_HOLO_BLOCK = registerHoloBlock("basic_performance_electric_arc_furnace_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK = registerBlock("basic_performance_electric_arc_furnace_port_block", () ->
            new BasicPerformanceElectricArcFurnacePortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_HOLO_BLOCK = registerHoloBlock("basic_performance_electric_arc_furnace_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK = registerTooltipBasicMachineBlock("basic_performance_forming_machine_block", () ->
                    new BasicPerformanceFormingMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:5×3×3",
            "Lv1:5×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_forming_machine_block", "hybrid_physics", "basic");
    public static final RegistryObject<Block> BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_BLOCK = registerTooltipMultiblockAbilityBlock("basic_precision_extrusion_assist_system_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_performance_forming_machine_block",
            "hybrid_physics",
            "basic");
    public static final RegistryObject<Block> BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_HOLO_BLOCK = registerHoloBlock("basic_precision_extrusion_assist_system_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK = registerBlock("basic_performance_forming_machine_bus_block", () ->
            new BasicPerformanceFormingMachineBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_FORMING_MACHINE_BUS_HOLO_BLOCK = registerHoloBlock("basic_performance_forming_machine_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK = registerBlock("basic_performance_forming_machine_port_block", () ->
            new BasicPerformanceFormingMachinePortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_FORMING_MACHINE_PORT_HOLO_BLOCK = registerHoloBlock("basic_performance_forming_machine_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK = registerBlock("infinity_powered_all_in_one_compressor_machine_block", () ->
            new InfinityPoweredAllInOneCompressorMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

//    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_pipe", () ->
//            new BasicPowerSteamGeneratorBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


//    private static <T extends Block> RegistryObject<T> registerTooltipBasicAbilityBlock(String name, Supplier<T> block, CreativeModeTab tab, String machineName) {
//        RegistryObject<T> toReturn = BLOCKS.register(name, block);
//        registerTooltipBasicAbilityBlockItem(name, toReturn, tab, machineName);
//        return toReturn;
//
//    }
//
//    private static <T extends Block> RegistryObject<Item> registerTooltipBasicAbilityBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String machineName) {
//        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
//            @Override
//            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
//                if(Screen.hasShiftDown()){
//                    pTooltip.add(new TranslatableComponent(machineName));
//                } else {
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
//                }
//            }
//        });
//    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    private static <T extends Block> RegistryObject<T> registerTooltipBasicMachineBlock(String name, Supplier<T> block, CreativeModeTab tab, String lv0MachineSize, String lv1MachineSize,
                                                                                        String basePara, String lv0Para, String lv1Para, String machineName, String scienceName, String phase) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerTooltipBasicMachineBlockItem(name, toReturn, tab, lv0MachineSize, lv1MachineSize, basePara, lv0Para, lv1Para, machineName, scienceName, phase);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerTooltipBasicMachineBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String lv0MachineSize, String lv1MachineSize,
                                                                                               String basePara, String lv0Para, String lv1Para, String machineName, String scienceName, String phase) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + machineName).withStyle(ChatFormatting.WHITE));
                    switch (scienceName) {
                        case "astronomy" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "biology" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.GREEN));
                        case "chemistry" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.BLUE));
                        case "engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.DARK_GRAY));
                        case "formal_science" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.AQUA));
                        case "geo_science" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.YELLOW));
                        case "hybrid_physics" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.RED));
                        case "imitation_magic_engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.WHITE));
                    }
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerTooltipMultiblockAbilityBlock(String name, Supplier<T> block, CreativeModeTab tab, String machineName, String scienceName, String phase) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerTooltipMultiblockAbilityBlockItem(name, toReturn, tab, machineName, scienceName, phase);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerTooltipMultiblockAbilityBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab,
                                                                                                    String machineName, String scienceName, String phase) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ability" + machineName).withStyle(ChatFormatting.WHITE));
                    switch (scienceName) {
                        case "astronomy" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "biology" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.GREEN));
                        case "chemistry" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.BLUE));
                        case "engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.BLACK));
                        case "formal_science" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.AQUA));
                        case "geo_science" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.YELLOW));
                        case "hybrid_physics" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.RED));
                        case "imitation_magic_engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.WHITE));
                    }
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerTooltipMeterialElementBlock(String name, Supplier<T> block, CreativeModeTab tab, String atomicName, String phase) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerTooltipMeterialElementBlockItem(name, toReturn, tab, atomicName, phase);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerTooltipMeterialElementBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String atomicName, String phase) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".name").withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".number").withStyle(ChatFormatting.GOLD));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".weight").withStyle(ChatFormatting.LIGHT_PURPLE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".melting").withStyle(ChatFormatting.BLUE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".boiling").withStyle(ChatFormatting.RED));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".formula").withStyle(ChatFormatting.AQUA));
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerHoloBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerHoloBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerHoloBlockItem(String name, RegistryObject<T> block) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(0)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
