package net.epitap.degeneracycraft.world.feature.ore.main;

import com.mojang.serialization.Codec;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.world.feature.ore.check.ChunkCheck;
import net.epitap.degeneracycraft.world.feature.ore.check.IChunkCheck;
import net.epitap.degeneracycraft.world.feature.ore.check.IVeinCheck;
import net.epitap.degeneracycraft.world.feature.ore.check.VeinCheck;
import net.epitap.degeneracycraft.world.feature.ore.util.FeatureUtils;
import net.epitap.degeneracycraft.world.feature.ore.network.CommonConfig;
import net.epitap.degeneracycraft.world.feature.ore.vein.IVein;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.ConcurrentLinkedQueue;

public class VeinFeature extends Feature<NoneFeatureConfiguration> {
    public VeinFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    public final VeinFeature withRegistryName(String modID, String name) {
        this.setRegistryName(new ResourceLocation(modID, name));
        return this;
    }

    @Override
    @ParametersAreNonnullByDefault
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> f) {
        if (f.chunkGenerator() instanceof FlatLevelSource) {
            return false;
        }

        WorldGenLevel level = f.level();
        BlockPos pos = f.origin();

        IVeinCheck depCap = level.getLevel().getCapability(VeinCheck.CAPABILITY)
                .orElseThrow(() -> new RuntimeException("Vein Capability Is Null.."));

        IChunkCheck cgCap = level.getLevel().getCapability(ChunkCheck.CAPABILITY)
                .orElseThrow(() -> new RuntimeException("Vein Capability Is Null.."));

        boolean placedPluton = false;
        boolean placedPending = placePendingBlocks(level, depCap, cgCap, pos);

        if (level.getRandom().nextDouble() > CommonConfig.CHUNK_SKIP_CHANCE.get()) {
            for (int p = 0; p < CommonConfig.NUMBER_PLUTONS_PER_CHUNK.get(); p++) {
                IVein pluton = DCOresAPI.veinRegistry.pick(level, pos);
                if (pluton == null) {
                    continue;
                }

                boolean anyGenerated = pluton.generate(level, pos, depCap, cgCap) > 0;
                if (anyGenerated) {
                    placedPluton = true;
                    pluton.afterGen(level, pos, depCap, cgCap);
                }
            }
        }
        // Let our tracker know that we did in fact traverse this chunk
        cgCap.setChunkGenerated(new ChunkPos(pos));
        return placedPluton || placedPending;
    }

    private boolean placePendingBlocks(WorldGenLevel level, IVeinCheck depCap, IChunkCheck cgCap,
                                       BlockPos origin) {
        ChunkPos cp = new ChunkPos(origin);
        ConcurrentLinkedQueue<VeinCheck.PendingBlock> q = depCap.getPendingBlocks(cp);
        if (cgCap.hasChunkGenerated(cp) && q.size() > 0) {
            Degeneracycraft.LOGGER.info(
                    "Chunk [{}, {}] has already generated but we're trying to place pending blocks anyways", cp.x,
                    cp.z);
        }
        q.stream().forEach(x -> FeatureUtils.enqueueBlockPlacement(level, cp, x.getPos(), x.getState(), depCap, cgCap));
        depCap.removePendingBlocksForChunk(cp);
        return q.size() > 0;
    }
}
