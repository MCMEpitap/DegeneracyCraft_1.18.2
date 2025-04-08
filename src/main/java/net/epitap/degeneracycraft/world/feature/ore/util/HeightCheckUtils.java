package net.epitap.degeneracycraft.world.feature.ore.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;

public class HeightCheckUtils {

    public static BlockPos getTopSolidBlock(LevelReader world, BlockPos start) {
        BlockPos retPos = new BlockPos(start.getX(), world.getHeight() - 1, start.getZ());
        while (retPos.getY() > 0) {
            if (world.getBlockState(retPos).getMaterial().isSolid()) {
                break;
            }
            retPos = retPos.below();
        }
        return retPos;
    }
}
