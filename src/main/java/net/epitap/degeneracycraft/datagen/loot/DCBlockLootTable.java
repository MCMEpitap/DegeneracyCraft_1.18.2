package net.epitap.degeneracycraft.datagen.loot;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class DCBlockLootTable extends BlockLoot {

    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F };

    @Override
    protected void addTables() {
        this.add(DCBlocks.OVERWORLD_GRAVITATION_ORE.get(), (Block) -> createOreDrop(DCBlocks.OVERWORLD_GRAVITATION_ORE.get(), DCItems.RAW_GRAVITATION_ORE.get()));

        this.add(DCBlocks.OVERWORLD_CASSITERITE_ORE.get(), (Block) -> createOreDrop(DCBlocks.OVERWORLD_CASSITERITE_ORE.get(), DCItems.RAW_CASSITERITE_ORE.get()));
        this.add(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get(), (Block) -> createOreDrop(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get(), DCItems.RAW_CASSITERITE_ORE.get()));
        this.add(DCBlocks.NETHER_CASSITERITE_ORE.get(), (Block) -> createOreDrop(DCBlocks.NETHER_CASSITERITE_ORE.get(), DCItems.RAW_CASSITERITE_ORE.get()));
        this.add(DCBlocks.END_CASSITERITE_ORE.get(), (Block) -> createOreDrop(DCBlocks.END_CASSITERITE_ORE.get(), DCItems.RAW_CASSITERITE_ORE.get()));

        this.add(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get(), block -> createSingleItemTable(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()));
        this.add(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(), block -> createSingleItemTable(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()));

        this.add(DCBlocks.REINFORCED_PLANKS.get(), block -> createSingleItemTable(DCBlocks.REINFORCED_PLANKS.get()));


        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get()));
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get()));
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));

        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));


        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(), block -> noDrop());
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), block -> noDrop());
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), block -> noDrop());
        this.add(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), block -> noDrop());

//        this.add(DCBlocks.LOW_STERNGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(), block -> createSingleItemTable(DCBlocks.LOW_STERNGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get()));
        this.add(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.get(), block -> createSingleItemTable(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.get()));
        this.add(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), block -> createSingleItemTable(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get()));

        this.add(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.get()));
        this.add(DCBlocks.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK.get()));
        this.add(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()));
        this.add(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get()));

        this.add(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get(), block -> createSingleItemTable(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get()));

        this.add(DCBlocks.PULVERIZER_BLOCK.get(), block -> createSingleItemTable(DCBlocks.PULVERIZER_BLOCK.get()));


//        this.add(DCBlocks.TEST.get(),block -> createSingleItemTable(DCBlocks.TEST.get()));

        this.add(DCBlocks.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK.get(), block -> createSingleItemTable(DCBlocks.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

