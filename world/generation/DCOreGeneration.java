package net.epitap.degeneracycraft.world.generation;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class DCOreGeneration {
    public static void generationOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

//        base.add(DCPlacedFeatures.OVERWORLD_CASSITERITE_ORE_PLACED);
//        base.add(DCPlacedFeatures.DEEPSLATE_CASSITERITE_ORE_PLACED);

//        base.add(DCPlacedFeatures.OVERWORLD_GRAVITATION_ORE_PLACED);


    }

}
