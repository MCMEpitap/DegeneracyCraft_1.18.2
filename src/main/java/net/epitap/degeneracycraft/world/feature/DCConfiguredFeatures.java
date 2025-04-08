//package net.epitap.degeneracycraft.world.feature;
//
//import net.epitap.degeneracycraft.blocks.base.DCBlocks;
//import net.minecraft.core.Holder;
//import net.minecraft.data.worldgen.features.FeatureUtils;
//import net.minecraft.data.worldgen.features.OreFeatures;
//import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
//
//import java.util.List;
//
//public class DCConfiguredFeatures {
//    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_GRAVITATION_ORES = List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DCBlocks.OVERWORLD_GRAVITATION_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DCBlocks.OVERWORLD_GRAVITATION_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DCBlocks.OVERWORLD_CASSITERITE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DCBlocks.OVERWORLD_CASSITERITE_ORE.get().defaultBlockState()));
//
//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GRAVITATION_ORE = FeatureUtils.register("gravitation_ore",
//            Feature.ORE, new OreConfiguration(OVERWORLD_GRAVITATION_ORES, 64));
//
//}
