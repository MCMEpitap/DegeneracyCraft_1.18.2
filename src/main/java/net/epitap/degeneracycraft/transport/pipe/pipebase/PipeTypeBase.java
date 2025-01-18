package net.epitap.degeneracycraft.transport.pipe.pipebase;

import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

public abstract class PipeTypeBase<T> {
    public abstract String getKey();

    public abstract void tick(PipeWorkBlockEntity blockEntity);

    public abstract float getTickRate();

    public abstract boolean canImport(BlockEntity blockentity, Direction direction);

    public abstract String getTranslationKey();

    public abstract ItemStack getIcon();

    public float getTickRate(PipeWorkBlockEntity blockEntity, Direction direction) {
        return getTickRate();
    }
}
