package net.epitap.degeneracycraft.world.test;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class DCOreConfiguration implements FeatureConfiguration {
    public static final Codec<DCOreConfiguration> CODEC = RecordCodecBuilder.create((p_67849_) -> {
        return p_67849_.group(Codec.list(DCOreConfiguration.TargetBlockState.CODEC).fieldOf("targets").forGetter((p_161027_) -> {
            return p_161027_.targetStates;
        }), Codec.intRange(0, 65536).fieldOf("size").forGetter((p_161025_) -> {
            return p_161025_.size;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter((p_161020_) -> {
            return p_161020_.discardChanceOnAirExposure;
        })).apply(p_67849_, DCOreConfiguration::new);
    });
    public final List<DCOreConfiguration.TargetBlockState> targetStates;
    public final int size;
    public final float discardChanceOnAirExposure;

    public DCOreConfiguration(List<DCOreConfiguration.TargetBlockState> p_161016_, int p_161017_, float p_161018_) {
        this.size = p_161017_;
        this.targetStates = p_161016_;
        this.discardChanceOnAirExposure = p_161018_;
    }

    public DCOreConfiguration(List<DCOreConfiguration.TargetBlockState> pTargetStates, int pSize) {
        this(pTargetStates, pSize, 0.0F);
    }

    public DCOreConfiguration(RuleTest pTarget, BlockState pState, int pSize, float pDiscardChanceOnAirExposure) {
        this(ImmutableList.of(new DCOreConfiguration.TargetBlockState(pTarget, pState)), pSize, pDiscardChanceOnAirExposure);
    }

    public DCOreConfiguration(RuleTest pTarget, BlockState pState, int pSize) {
        this(ImmutableList.of(new DCOreConfiguration.TargetBlockState(pTarget, pState)), pSize, 0.0F);
    }

    public static DCOreConfiguration.TargetBlockState target(RuleTest pTarget, BlockState pState) {
        return new DCOreConfiguration.TargetBlockState(pTarget, pState);
    }

    public static class TargetBlockState {
        public static final Codec<DCOreConfiguration.TargetBlockState> CODEC = RecordCodecBuilder.create((p_161039_) -> {
            return p_161039_.group(RuleTest.CODEC.fieldOf("target").forGetter((p_161043_) -> {
                return p_161043_.target;
            }), BlockState.CODEC.fieldOf("state").forGetter((p_161041_) -> {
                return p_161041_.state;
            })).apply(p_161039_, DCOreConfiguration.TargetBlockState::new);
        });
        public final RuleTest target;
        public final BlockState state;

        TargetBlockState(RuleTest p_161036_, BlockState p_161037_) {
            this.target = p_161036_;
            this.state = p_161037_;
        }
    }
}
