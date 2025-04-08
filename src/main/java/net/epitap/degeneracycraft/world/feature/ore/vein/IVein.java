package net.epitap.degeneracycraft.world.feature.ore.vein;

import net.epitap.degeneracycraft.world.feature.ore.check.IChunkCheck;
import net.epitap.degeneracycraft.world.feature.ore.check.IVeinCheck;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;

public interface IVein {
    int generate(WorldGenLevel level, BlockPos pos, IVeinCheck veins,
                 IChunkCheck chunksGenerated);

    void afterGen(WorldGenLevel level, BlockPos pos, IVeinCheck veins,
                         IChunkCheck chunksGenerated);

    HashSet<BlockState> getAllOres();

    int getGenWt();

    boolean canPlaceInBiome(Holder<Biome> biome);

    boolean hasBiomeRestrictions();

    String[] getDimensionFilter();

    boolean isDimensionFilterBl();

    HashSet<BlockState> getBlockStateMatchers();
}
