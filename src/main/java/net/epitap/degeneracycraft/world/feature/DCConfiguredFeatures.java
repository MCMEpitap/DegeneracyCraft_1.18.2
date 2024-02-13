package net.epitap.degeneracycraft.world.feature;

import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class DCConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CASSITERITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DCBlocks.OVERWORLD_CASSITERITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DCBlocks.DEEPSLATE_CASSITERITE_ORE.get().defaultBlockState())
    );


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_CASSITERITE_ORE_GENERATION = FeatureUtils.register("overworld_cassiterite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CASSITERITE_ORE,10));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_CASSITERITE_ORE_GENERATION = FeatureUtils.register("deepslate_cassiterite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CASSITERITE_ORE,64));

}
