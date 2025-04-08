package net.epitap.degeneracycraft.world.feature.ore.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class SampleUtils {
    @Nullable
    public static BlockPos getSamplePosition(WorldGenLevel level, ChunkPos chunkPos) {
        return getSamplePosition(level, chunkPos, -1);
    }

    @Nullable
    public static BlockPos getSamplePosition(WorldGenLevel level, ChunkPos chunkPos, int spread) {

        if (!(level instanceof WorldGenRegion)) {
            return null;
        }

        WorldGenRegion world = (WorldGenRegion) level;
        int usedSpread = Math.max(8, spread);
        int xCenter = (chunkPos.getMinBlockX() + chunkPos.getMaxBlockX()) / 2;
        int zCenter = (chunkPos.getMinBlockZ() + chunkPos.getMaxBlockZ()) / 2;

        // Only put things in the negative X|Z if the spread is provided.
        int blockPosX = xCenter
                + (level.getRandom().nextInt(usedSpread) * ((level.getRandom().nextBoolean()) ? 1 : -1));
        int blockPosZ = zCenter
                + (level.getRandom().nextInt(usedSpread) * ((level.getRandom().nextBoolean()) ? 1 : -1));

        if (!world.hasChunk(chunkPos.x, chunkPos.z)) {
            return null;
        }

        BlockPos searchPos = new BlockPos(blockPosX, world.getHeight(), blockPosZ);

        // With worlds being so much deeper,
        // it makes most sense to take a top-down approach
        while (searchPos.getY() > world.getMinBuildHeight()) {
            BlockState blockToPlaceOn = world.getBlockState(searchPos);
            // Check if the location itself is solid
            if (Block.isFaceFull(blockToPlaceOn.getShape(world, searchPos), Direction.UP)) {
                if (!blockToPlaceOn.is(Blocks.GRASS_BLOCK)) {
                    searchPos = searchPos.below();
                    continue;
                }
                BlockPos actualPlacePos = searchPos.above();
                if (canReplace(world, actualPlacePos)) {
                    return actualPlacePos;
                }
            }
            searchPos = searchPos.below();
        }

        return null;
    }

    /**
     * @param level an WorldGenLevel instance
     * @param pos   A BlockPos to check in and around
     * @return true if the block at pos is replaceable
     */
    public static boolean canReplace(WorldGenLevel level, BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        return state.getMaterial().isReplaceable() || state.isAir();
    }

    /**
     * @param level an WorldGenLevel instance
     * @param pos   A BlockPos to check in and around
     * @return true if the block is water (since we can waterlog)
     */
    public static boolean isInWater(WorldGenLevel level, BlockPos pos) {
        return level.getBlockState(pos).getBlock() == Blocks.WATER;
    }

    /**
     * @param level an WorldGenLevel instance
     * @param pos   A BlockPos to check in and around
     * @return true if the block is in a non-water fluid
     */
    public static boolean inNonWaterFluid(WorldGenLevel level, BlockPos pos) {
        return level.getBlockState(pos).getMaterial().isLiquid() && !isInWater(level, pos);
    }

    /**
     * @param posA
     * @param posB
     * @param range An integer representing how far is acceptable to be considered
     *              in range
     * @return true if within range
     */
//    public static boolean isWithinRange(int posA, int posB, int range) {
//        return (Math.abs(posA - posB) <= range);
//    }
}
