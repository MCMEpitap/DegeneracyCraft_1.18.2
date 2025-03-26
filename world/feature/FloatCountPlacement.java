package net.epitap.degeneracycraft.world.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.ConstantFloat;
import net.minecraft.util.valueproviders.FloatProvider;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.Random;

public class FloatCountPlacement extends FloatRepeatingPlacement {
    public static final Codec<FloatCountPlacement> CODEC = FloatProvider.codec(0, 256).fieldOf("count").xmap(FloatCountPlacement::new, (floatCount) -> {
        return floatCount.count;
    }).codec();
    private final FloatProvider count;

    private FloatCountPlacement(FloatProvider p_191627_) {
        this.count = p_191627_;
    }

    public static FloatCountPlacement of(FloatProvider pCount) {
        return new FloatCountPlacement(pCount);
    }

    public static FloatCountPlacement of(float pCount) {
        return of(ConstantFloat.of(pCount));
    }

    protected float count(Random pRandom, BlockPos pPos) {
        return this.count.sample(pRandom);
    }

    public PlacementModifierType<?> type() {
        return PlacementModifierType.COUNT;
    }
}
