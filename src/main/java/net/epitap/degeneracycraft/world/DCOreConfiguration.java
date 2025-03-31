//package net.epitap.degeneracycraft.world;
//
//import com.google.common.collect.ImmutableList;
//import com.mojang.serialization.Codec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//import lombok.experimental.Accessors;
//import net.minecraft.MethodsReturnNonnullByDefault;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
//import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
//
//import javax.annotation.ParametersAreNonnullByDefault;
//import java.util.List;
//
//
//@SuppressWarnings("unused")
//@MethodsReturnNonnullByDefault
//@ParametersAreNonnullByDefault
//@Accessors(chain = true, fluent = true)
//
//public class DCOreConfiguration implements FeatureConfiguration {
//    public static final Codec<OreConfiguration> CODEC = RecordCodecBuilder.create((codec) ->
//            codec.group(
//                    Codec.list(OreConfiguration.TargetBlockState.CODEC).fieldOf("targets").forGetter((configuration) -> configuration.targetStates),
//                    Codec.intRange(0,1000).fieldOf("size").forGetter((configuration) -> configuration.size),
//                    Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter((configuration) -> configuration.discardChanceOnAirExposure))
//                    .apply(codec, OreConfiguration::new));
//
//    public final List<TargetBlockState> targetStates;
//    public final int size;
//    public final float discardChanceOnAirExposure;
//
//    public DCOreConfiguration(List<TargetBlockState> targetStates, int size, float discardChanceOnAirExposure) {
//        this.targetStates = targetStates;
//        this.size = size;
//        this.discardChanceOnAirExposure = discardChanceOnAirExposure;
//    }
//
//    public DCOreConfiguration(List<TargetBlockState> pTargetStates, int pSize) {
//        this(pTargetStates, pSize, 0.0F);
//    }
////
//    public DCOreConfiguration(RuleTest pTarget, BlockState pState, int pSize, float pDiscardChanceOnAirExposure) {
//        this(ImmutableList.of(new TargetBlockState(pTarget, pState)), pSize, pDiscardChanceOnAirExposure);
//    }
////
//    public DCOreConfiguration(RuleTest pTarget, BlockState pState, int pSize) {
//        this(ImmutableList.of(new TargetBlockState(pTarget, pState)), pSize, 0.0F);
//    }
//
//    public static TargetBlockState target(RuleTest pTarget, BlockState pState) {
//        return new TargetBlockState(pTarget, pState);
//    }
//
//    public static class TargetBlockState {
//        public static final Codec<TargetBlockState> CODEC = RecordCodecBuilder.create((blockStateInstance) ->
//                blockStateInstance.group(
//                        RuleTest.CODEC.fieldOf("target").forGetter((blockState) -> blockState.target),
//                        BlockState.CODEC.fieldOf("state").forGetter((blockState) -> blockState.state))
//                        .apply(blockStateInstance, TargetBlockState::new));
//        public final RuleTest target;
//        public final BlockState state;
//
//        TargetBlockState(RuleTest p_161036_, BlockState p_161037_) {
//            this.target = p_161036_;
//            this.state = p_161037_;
//        }
//    }
//}
