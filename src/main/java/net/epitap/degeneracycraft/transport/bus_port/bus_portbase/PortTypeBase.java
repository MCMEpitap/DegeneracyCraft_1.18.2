package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;

import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

public abstract class PortTypeBase<T> {
    public abstract String getKey();

    public abstract void tick(PortWorkBlockEntity blockEntity);

    public abstract float getTickRate();

    public abstract boolean canImport(BlockEntity blockentity, Direction direction);

    public abstract String getTranslationKey();

    public abstract ItemStack getIcon();

    public float getTickRate(PortWorkBlockEntity blockEntity, Direction direction) {
        return getTickRate();
    }
}
