package net.epitap.degeneracycraft.world.feature.ore.main;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.RegistryEvent;

public class DCOresFeatures {
    private static final Feature<NoneFeatureConfiguration> VEINS_FEATURE = new VeinFeature(
            NoneFeatureConfiguration.CODEC).withRegistryName(Degeneracycraft.MOD_ID, "veins");

    public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> VEIN_ALL = FeatureUtils
            .register(VEINS_FEATURE.getRegistryName().toString(), VEINS_FEATURE);


    public static Holder<PlacedFeature> VEINS_PLACED = PlacementUtils.register(
            VEINS_FEATURE.getRegistryName().toString(), VEIN_ALL,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),
                    VerticalAnchor.absolute(320)));


    public static void register(final RegistryEvent.Register<Feature<?>> featureRegistryEvent) {
        featureRegistryEvent.getRegistry().register(VEINS_FEATURE);
    }
}
