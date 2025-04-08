package net.epitap.degeneracycraft.world.feature.ore.vein;

import net.epitap.degeneracycraft.world.feature.ore.main.DCOresFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VeinRegistry {
    private ArrayList<IVein> Veins;

    public VeinRegistry() {
        this.Veins = new ArrayList<>();
    }

    public void clear() {
        this.Veins = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    public ArrayList<IVein> getOres() {
        return (ArrayList<IVein>) this.Veins.clone();
    }

    public boolean addVein(IVein ore) {
        return this.Veins.add(ore);
    }

    @Nullable
    public IVein pick(WorldGenLevel level, BlockPos pos) {
        @SuppressWarnings("unchecked")
        ArrayList<IVein> choices = (ArrayList<IVein>) this.Veins.clone();
        // Dimension Filtering done here!
        choices.removeIf((dep) -> {
            ResourceLocation dim = level.getLevel().dimension().location();
            boolean isDimFilterBl = dep.isDimensionFilterBl();
            for (String dim2Raw : dep.getDimensionFilter()) {
                boolean match = new ResourceLocation(dim2Raw).equals(dim);
                if ((isDimFilterBl && match) || (!isDimFilterBl && !match)) {
                    return true;
                }
            }
            return false;
        });

        if (choices.size() == 0) {
            return null;
        }

        if (level.getRandom().nextInt(3) == 0) {
            if (choices.stream()
                    .anyMatch((dep) -> dep.hasBiomeRestrictions() && dep.canPlaceInBiome(level.getBiome(pos)))) {
                choices.removeIf((dep) -> !(dep.hasBiomeRestrictions() && dep.canPlaceInBiome(level.getBiome(pos))));
            }
        }

        int totalWt = 0;
        for (IVein d : choices) {
            totalWt += d.getGenWt();
        }

        int rng = level.getRandom().nextInt(totalWt);
        for (IVein d : choices) {
            int wt = d.getGenWt();
            if (rng < wt) {
                return d;
            }
            rng -= wt;
        }
        return null;
    }

    private static final List<GenerationStep.Decoration> decorations = new LinkedList<>();
    static {
        decorations.add(GenerationStep.Decoration.UNDERGROUND_ORES);
        decorations.add(GenerationStep.Decoration.UNDERGROUND_DECORATION);
    }

    @SubscribeEvent
    public void onBiomesLoaded(BiomeLoadingEvent evt) {
        BiomeGenerationSettingsBuilder gen = evt.getGeneration();
        gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, DCOresFeatures.VEINS_PLACED);
    }
}
