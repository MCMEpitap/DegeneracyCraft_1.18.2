package net.epitap.degeneracycraft.world.feature.ore.check;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.ChunkPos;

public interface IChunkCheck {
    boolean hasChunkGenerated(ChunkPos pos);

    void setChunkGenerated(ChunkPos pos);

    CompoundTag serializeNBT();

    void deserializeNBT(CompoundTag compound);
}