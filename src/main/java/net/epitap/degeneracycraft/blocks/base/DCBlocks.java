package net.epitap.degeneracycraft.blocks.base;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.block.machine.PulverizerBlock;
import net.epitap.degeneracycraft.blocks.block.machine.UniversalAssemblerPhase1Block;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_machine_element_processor.BasicMachineElementProcessorBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_power_composite_structure_type_thermal_generator.BasicPowerCompositeStructureTypeThermalGeneratorBlock;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineBlock;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_component_manufacture_machine.RedstonePoweredMachineComponentManufactureMachineBlock;
import net.epitap.degeneracycraft.holoblock.DCHoloBlock;
import net.epitap.degeneracycraft.item.DCCreativeTab;
import net.epitap.degeneracycraft.item.DCItems;
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
    public static final TagKey<Block> GRAVITATION_ORE = TagKey.create(Registry.BLOCK_REGISTRY ,new ResourceLocation(Degeneracycraft.MOD_ID,"gravitation_ore"));
    public static final RegistryObject<Block> OVERWORLD_CASSITERITE_ORE = registerBlock("overworld_cassiterite_ore",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CASSITERITE_ORE = registerBlock("deepslate_cassiterite_ore",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final RegistryObject<Block> NETHER_CASSITERITE_ORE = registerBlock("nether_cassiterite_ore",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final RegistryObject<Block> END_CASSITERITE_ORE = registerBlock("end_cassiterite_ore",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);
    public static final TagKey<Block> CASSITERITE_ORE = TagKey.create(Registry.BLOCK_REGISTRY ,new ResourceLocation(Degeneracycraft.MOD_ID,"cassiterite_ore"));

    public static final RegistryObject<Block> OVERWORLD_GRAVITATION_ORE = registerBlock("overworld_gravitation_ore",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),DCCreativeTab.DEGENERACYCRAFT_ORE_TAB);

    public static final RegistryObject<Block> PULVERIZER_BLOCK = registerBlock("pulverizer",()-> new PulverizerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_TAB);

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK = registerBlock("basic_strength_multiblock_base_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK = registerBlock("basic_strength_multiblock_machine_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("basic_strength_multiblock_structure_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("basic_strength_multiblock_structure_glass_block",()->  new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f)), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

    public static final RegistryObject<Block> LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK = registerBlock("low_strength_multiblock_structure_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK = registerBlock("low_strength_multiblock_structure_glass_block",()->  new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);



    public static final RegistryObject<Block> UNIVERSAL_ASSEMBLER_PHASE1_BLOCK = registerBlock("universal_assembler_phase1",()-> new UniversalAssemblerPhase1Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

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

    public static final RegistryObject<Block> REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK = registerBlock("redstone_powered_machine_component_manufacture_machine_block", () ->
                    new RedstonePoweredMachineComponentManufactureMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK = registerBlock("basic_power_composite_structure_type_thermal_generator_block", () -> new BasicPowerCompositeStructureTypeThermalGeneratorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

    public static final RegistryObject<Block> BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK = registerBlock("basic_machine_element_processor_block", () -> new BasicMachineElementProcessorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

    public static final RegistryObject<Block> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK = registerBlock("basic_phase_bolt_manufacture_machine_block", () -> new BasicPhaseBoltManufactureMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


    public static final RegistryObject<Block> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK = registerBlock("infinity_powered_all_in_one_compressor_machine_block", () -> new InfinityPoweredAllInOneCompressorMachineBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);


    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_base_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_machine_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_structure_frame_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_structure_glass_holo_block", () ->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltip) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;

    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltip) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltip));
            }
        });
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
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
