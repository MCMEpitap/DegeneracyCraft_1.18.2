//package net.epitap.degeneracycraft.world.feature.ore;
//
//import net.minecraft.world.level.levelgen.placement.*;
//
//import java.util.List;
//
//public class DCOrePlacement {
//    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier placementModifier) {
//        return List.of(modifier, InSquarePlacement.spread(), placementModifier, BiomeFilter.biome());
//    }
//
//    public static List<PlacementModifier> commonOrePlacement(int number, PlacementModifier placementModifier) {
//        return orePlacement(CountPlacement.of(number), placementModifier);
//    }
//
//    public static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier placementModifier) {
//        return orePlacement(RarityFilter.onAverageOnceEvery(chance), placementModifier);
//    }
//}
