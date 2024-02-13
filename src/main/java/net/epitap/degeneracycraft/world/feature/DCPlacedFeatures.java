package net.epitap.degeneracycraft.world.feature;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class DCPlacedFeatures {
    public static final Holder<PlacedFeature> OVERWORLD_CASSITERITE_ORE_PLACED = PlacementUtils.register("overworld_cassiterite_ore_placed",
            DCConfiguredFeatures.OVERWORLD_CASSITERITE_ORE_GENERATION,
            DCOrePlacement.commonOrePlacement(10,HeightRangePlacement.uniform(VerticalAnchor.absolute(5),VerticalAnchor.absolute(50))
            ));
    public static final Holder<PlacedFeature> DEEPSLATE_CASSITERITE_ORE_PLACED = PlacementUtils.register("deepslate_cassiterite_ore_placed",
            DCConfiguredFeatures.DEEPSLATE_CASSITERITE_ORE_GENERATION,
            DCOrePlacement.commonOrePlacement(10,HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-5))
            ));

}
//HeightRangePlacement.triangle(VerticalAnchor.absolute(-200), VerticalAnchor.absolute(40)