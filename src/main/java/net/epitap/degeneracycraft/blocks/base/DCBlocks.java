package net.epitap.degeneracycraft.blocks.base;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.block.machine.PulverizerBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_thermal_generator.BasicPowerThermalGeneratorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlock;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.energystorage.basic_strength_multiblock_energy_storage.BasicStrengthMultiblockEnergyStorageBlock;
import net.epitap.degeneracycraft.blocks.storage.basic.materialstorage.basic_strength_multiblock_material_storage.BasicStrengthMultiblockMaterialStorageBlock;
import net.epitap.degeneracycraft.item.DCCreativeTab;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_thermal_generator.bus.BasicPowerThermalGeneratorBusBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_power_thermal_generator.port.BasicPowerThermalGeneratorPortBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_element_processor.bus.BasicTechnologyMachineElementProcessorBusBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_element_processor.port.BasicTechnologyMachineElementProcessorPortBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_manufacturer.port.BasicTechnologyMachineManufacturerPortBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_part_processor.bus.BasicTechnologyMachinePartProcessorBusBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_machine_part_processor.port.BasicTechnologyMachinePartProcessorPortBlock;
import net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_universal_assembler.bus.BasicTechnologyUniversalAssemblerBusBlock;
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

    public static final RegistryObject<Block> OVERWORLD_GRAVITATION_ORE = registerBlock("overworld_gravitation_ore", () -> new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
            DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);

    public static final RegistryObject<Block> REINFORCED_PLANKS = registerBlock("reinforced_planks", () -> new BlockBase(BlockBehaviour.Properties.of(Material.WOOD).strength(4.0f, 10.0f)),
            DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB);


    public static final RegistryObject<Block> PULVERIZER_BLOCK = registerBlock("pulverizer", () -> new PulverizerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_TAB);

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_multiblock_base_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_multiblock_machine_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_multiblock_structure_frame_block", () ->
            new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_multiblock_structure_glass_block", () ->
            new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK = registerBlock("basic_strength_multiblock_energy_storage_block", () ->
            new BasicStrengthMultiblockEnergyStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_energy_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK = registerBlock("basic_strength_multiblock_material_storage_block", () ->
            new BasicStrengthMultiblockMaterialStorageBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_material_storage_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK = registerBlock("low_strength_multiblock_structure_frame_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK = registerBlock("low_strength_multiblock_structure_glass_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


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

    public static final RegistryObject<Block> BASIC_PRECISION_TELESCOPE_BLOCK = registerTooltipBasicMachineBlock("basic_precision_telescope_block", () ->
                    new BasicPowerThermalGeneratorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_precision_telescope_block", "astronomy", "basic");
    //        public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_operation_assembling_chamber_block", () ->
//                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
//            "basic_technology_universal_assembler_block",
//            "engineering",
//            "basic");
//    public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_operation_assembling_chamber_holo_block", () ->
//            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PRECISION_TELESCOPE_BUS_BLOCK = registerBlock("basic_precision_telescope_bus_block", () ->
            new BasicTechnologyUniversalAssemblerBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PRECISION_TELESCOPE_BUS_HOLO_BLOCK = registerHoloBlock("basic_precision_telescope_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PRECISION_TELESCOPE_PORT_BLOCK = registerBlock("basic_precision_telescope_port_block", () ->
            new BasicTechnologyMachineManufacturerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PRECISION_TELESCOPE_PORT_HOLO_BLOCK = registerHoloBlock("basic_precision_telescope_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));


    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_FURNACE_BLOCK = registerTooltipBasicMachineBlock("basic_performance_electric_furnace_block", () ->
                    new BasicTechnologyMachineElementProcessorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_performance_electric_furnace_block", "dynamic_physics", "basic");
    public static final RegistryObject<Block> BASIC_FLOW_COOLING_SYSTEM_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_flow_cooling_system_block", () ->
                    new BlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_performance_electric_furnace_block",
            "dynamic_physics",
            "basic");
    public static final RegistryObject<Block> BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK = registerHoloBlock("basic_flow_cooling_system_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_FURNACE_BUS_BLOCK = registerBlock("basic_performance_electric_furnace_bus_block", () ->
            new BasicPerformanceElectricFurnaceBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_FURNACE_BUS_HOLO_BLOCK = registerHoloBlock("basic_performance_electric_furnace_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_FURNACE_PORT_BLOCK = registerBlock("basic_performance_electric_furnace_port_block", () ->
            new BasicPerformanceElectricFurnacePortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_PERFORMANCE_ELECTRIC_FURNACE_PORT_HOLO_BLOCK = registerHoloBlock("basic_performance_electric_furnace_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));


    public static final RegistryObject<Block> BASIC_POWER_THERMAL_GENERATOR_BLOCK = registerTooltipBasicMachineBlock("basic_power_thermal_generator_block", () ->
                    new BasicPowerThermalGeneratorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Power 16 FE/t",
            "Lv0:Power 32 FE/t",
            "Lv1:Power 48 FE/t",
            "basic_power_thermal_generator_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK = registerTooltipBasicMultiblockAbilityBlock(
            "basic_endurance_high_temperature_combustion_chamber_block", () ->
                    new GlassBlockBase(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "basic_power_thermal_generator_block",
            "engineering",
            "basic");
    public static final RegistryObject<Block> BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK = registerHoloBlock("basic_endurance_high_temperature_combustion_chamber_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_POWER_THERMAL_GENERATOR_BUS_BLOCK = registerBlock("basic_power_thermal_generator_bus_block", () ->
            new BasicPowerThermalGeneratorBusBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_POWER_THERMAL_GENERATOR_BUS_HOLO_BLOCK = registerHoloBlock("basic_power_thermal_generator_bus_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));
    public static final RegistryObject<Block> BASIC_POWER_THERMAL_GENERATOR_PORT_BLOCK = registerBlock("basic_power_thermal_generator_port_block", () ->
            new BasicPowerThermalGeneratorPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_POWER_THERMAL_GENERATOR_PORT_HOLO_BLOCK = registerHoloBlock("basic_power_thermal_generator_port_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK = registerTooltipBasicMachineBlock("basic_technology_machine_manufacturer_block", () ->
                    new BasicTechnologyMachineManufacturerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB,
            "Lv0:3×3×3",
            "Lv1:3×3×3",
            "Base:Speed ×1.00,Energy Usage ×1.00",
            "Lv0:Speed ×2.00,Energy Usage ×1.50",
            "Lv1:Speed ×3.00,Energy Usage ×2.00",
            "basic_technology_machine_manufacturer_block", "engineering", "basic");
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_efficiency_machine_processing_chamber_block", () ->
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
    public static final RegistryObject<Block> BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_operation_assembling_chamber_block", () ->
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
            new BasicTechnologyMachineManufacturerPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
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
    public static final RegistryObject<Block> BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_purity_circuit_clean_room_block", () ->
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
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_efficiency_machine_element_processing_chamber_block", () ->
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
    public static final RegistryObject<Block> BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_BLOCK = registerTooltipBasicMultiblockAbilityBlock("basic_efficiency_machine_part_processing_chamber_block", () ->
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


    public static final RegistryObject<Block> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK = registerBlock("basic_phase_bolt_manufacture_machine_block", () ->
            new BasicPhaseBoltManufactureMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


    public static final RegistryObject<Block> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK = registerBlock("infinity_powered_all_in_one_compressor_machine_block", () ->
            new InfinityPoweredAllInOneCompressorMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

//    public static final RegistryObject<Block> TEST = registerBlock("test_block", () ->
//            new TestBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


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
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_size.").withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent(lv0MachineSize).withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent(lv1MachineSize).withStyle(ChatFormatting.RED));
                    pTooltip.add(new TranslatableComponent(basePara).withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent(lv0Para).withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent(lv1Para).withStyle(ChatFormatting.RED));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + machineName).withStyle(ChatFormatting.WHITE));
                    switch (scienceName) {
                        case "astronomy" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "biology" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.GREEN));
                        case "chemistry" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.BLUE));
                        case "dynamic_physics" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.RED));
                        case "engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.WHITE));
                        case "faux_magic_engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.BLACK));
                        case "geoscience" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.YELLOW));
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

    private static <T extends Block> RegistryObject<T> registerTooltipBasicMultiblockAbilityBlock(String name, Supplier<T> block, CreativeModeTab tab, String machineName, String scienceName, String phase) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerTooltipBasicMultiblockAbilityBlockItem(name, toReturn, tab, machineName, scienceName, phase);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerTooltipBasicMultiblockAbilityBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab,
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
                        case "dynamic_physics" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.RED));
                        case "engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.WHITE));
                        case "faux_magic_engineering" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.BLACK));
                        case "geoscience" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.science." + scienceName).withStyle(ChatFormatting.YELLOW));
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
