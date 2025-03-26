package net.epitap.degeneracycraft.world.feature;

import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class DCOrePlacement {

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(float pCount, PlacementModifier pHeightRange) {
        return orePlacement(FloatCountPlacement.of(pCount), pHeightRange);
    }

//    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
//        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
//    }
}
