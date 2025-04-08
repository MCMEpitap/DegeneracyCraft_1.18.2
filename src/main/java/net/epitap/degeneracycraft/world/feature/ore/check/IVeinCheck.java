package net.epitap.degeneracycraft.world.feature.ore.check;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;

import java.util.concurrent.ConcurrentLinkedQueue;

public  interface IVeinCheck {
    void putPendingBlock(BlockPos pos, BlockState state);

    void removePendingBlocksForChunk(ChunkPos p);

    ConcurrentLinkedQueue<VeinCheck.PendingBlock> getPendingBlocks(ChunkPos chunkPos);

    CompoundTag serializeNBT();

    void deserializeNBT(CompoundTag nbt);
}
