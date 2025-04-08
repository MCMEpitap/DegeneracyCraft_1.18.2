package net.epitap.degeneracycraft.world.feature.ore.util;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.world.feature.ore.network.CommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

public class VeinUtils {
    private static Random random = new Random();
    private static HashSet<BlockState> defaultMatchersCached = null;

    @Nullable
    public static BlockState pick(HashMap<BlockState, Float> map, float totl) {
        float rng = random.nextFloat();
        for (Entry<BlockState, Float> e : map.entrySet()) {
            float wt = e.getValue();
            if (rng < wt) {
                return e.getKey();
            }
            rng -= wt;
        }

        Degeneracycraft.LOGGER.error("Could not reach decision on block to place at Utils#pick");
        return null;
    }

    public static boolean canPlaceInBiome(Holder<Biome> targetBiome, @Nullable List<Biome> biomes,
                                          @Nullable List<BiomeDictionary.Type> biomeTypes, boolean isBiomeFilterBl) {
        boolean matchForBiome = false;
        boolean matchForBiomeType = false;

        if (biomes != null) {
            matchForBiome = biomes.stream().anyMatch((b) -> targetBiome.is(b.getRegistryName()));
        }

        if (biomeTypes != null) {
            matchForBiomeType = biomeTypes.stream().anyMatch(t -> BiomeDictionary.getBiomes(t).stream()
                    .anyMatch(b -> targetBiome.is(b.location())));
        }

        return ((matchForBiome || matchForBiomeType) && !isBiomeFilterBl)
                || (!matchForBiome && !matchForBiomeType && isBiomeFilterBl);
    }

    @SuppressWarnings("unchecked")
    public static HashSet<BlockState> getDefaultMatchers() {
        // If the cached data isn't there yet, load it.
        if (defaultMatchersCached == null) {
            defaultMatchersCached = new HashSet<>();
            CommonConfig.DEFAULT_REPLACEMENT_MATS.get().forEach(s -> {
                Block block = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(s));
                if (block == null || !addDefaultMatcher(block)) {
                    Degeneracycraft.LOGGER.warn("{} is not a valid block. Please verify.", s);
                }
            });
        }

        return (HashSet<BlockState>) defaultMatchersCached.clone();
    }

    public static boolean addDefaultMatcher(Block block) {
        BlockState defaultState = block.defaultBlockState();
        if (!defaultState.isAir()) {
            defaultMatchersCached.add(defaultState);
            return true;
        }
        return false;
    }


    public static boolean nearlyEquals(float a, float b) {
        return Math.abs(a - b) <= Float.MIN_VALUE;
    }
}
