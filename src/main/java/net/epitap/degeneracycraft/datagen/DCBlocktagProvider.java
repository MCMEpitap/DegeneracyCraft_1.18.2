package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.tag.DCTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;



public class DCBlocktagProvider extends BlockTagsProvider {


    public DCBlocktagProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Degeneracycraft.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DCBlocks.OVERWORLD_GRAVITATION_ORE.get())
                .add(DCBlocks.OVERWORLD_CASSITERITE_ORE.get())
                .add(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get())
                .add(DCBlocks.NETHER_CASSITERITE_ORE.get())
                .add(DCBlocks.END_CASSITERITE_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(DCBlocks.OVERWORLD_CASSITERITE_ORE.get())
                .add(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get())
                .add(DCBlocks.NETHER_CASSITERITE_ORE.get())
                .add(DCBlocks.END_CASSITERITE_ORE.get());

        tag(DCTags.Blocks.NEEDS_CAMMDA_TIER1)
                .add(DCBlocks.OVERWORLD_GRAVITATION_ORE.get());


        tag(DCBlocks.GRAVITATION_ORE)
                .add(DCBlocks.OVERWORLD_GRAVITATION_ORE.get());

        tag(DCBlocks.CASSITERITE_ORE)
                .add(DCBlocks.OVERWORLD_CASSITERITE_ORE.get())
                .add(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get())
                .add(DCBlocks.NETHER_CASSITERITE_ORE.get())
                .add(DCBlocks.END_CASSITERITE_ORE.get());


        tag(DCTags.Blocks.DEGENERACYCRAFT_MACHINES)
                .add(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get())
                .add(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BLOCK.get())
                .add(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get());

    }


    @Override
    public String getName() {
        return "DegeneracyCraft Tags";
    }
}
