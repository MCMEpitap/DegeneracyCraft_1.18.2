package net.epitap.degeneracycraft.world.feature;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class FloatRepeatingPlacement extends PlacementModifier {
    protected abstract float count(Random pRandom, BlockPos pPos);

    public Stream<BlockPos> getPositions(PlacementContext pContext, Random pRandom, BlockPos pPos) {
        return IntStream.range(0, (int) this.count(pRandom, pPos)).mapToObj((p_191912_) -> {
            return pPos;
        });
    }
}
