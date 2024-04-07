package net.epitap.degeneracycraft.pipe.test.pipebase;

import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class TestPipeGetSideListBase<T> {
    private final Map<TestPipeTypeBase<?>, T>[] savedSideValues;
    protected Supplier<NonNullList<ItemStack>> upgradeInventory;
    protected String key;
    protected Function<TestPipeTypeBase<?>, T> defaultValue;
    protected Runnable blockList;

    public TestPipeGetSideListBase(Supplier<NonNullList<ItemStack>> upgradeInventory, String key, Function<TestPipeTypeBase<?>, T> defaultValue, Runnable runnable) {
        this.upgradeInventory = upgradeInventory;
        this.key = key;
        this.defaultValue = defaultValue;
        this.blockList = runnable;
        this.savedSideValues = new HashMap[Direction.values().length];
    }

    public T getValue(Direction side, TestPipeTypeBase<?> pipeType) {
        Map<TestPipeTypeBase<?>, T> map = this.savedSideValues[side.ordinal()];
        if (map == null) {
            map = new HashMap();
            this.savedSideValues[side.ordinal()] = map;
        }

        if (map.containsKey(pipeType)) {
            return (T) ((Map) map).get(pipeType);
        } else {
            ItemStack itemStack = (ItemStack) ((NonNullList) this.upgradeInventory.get()).get(side.ordinal());
            if (!itemStack.isEmpty() && itemStack.hasTag()) {
                CompoundTag itemStackTag = itemStack.getTag();
                if (!itemStackTag.contains(pipeType.getKey(), 10)) {
                    return (T) this.putDefault(pipeType, map);
                } else {
                    CompoundTag compound = itemStackTag.getCompound(pipeType.getKey());
                    if (!compound.contains(this.key)) {
                        return (T) this.putDefault(pipeType, map);
                    } else {
                        T value = this.deserialize(pipeType, compound.get(this.key));
                        if (value == null) {
                            return (T) this.putDefault(pipeType, map);
                        } else {
                            ((Map) map).put(pipeType, value);
                            return value;
                        }
                    }
                }
            } else {
                return (T) this.putDefault(pipeType, map);
            }
        }
    }

    public T putDefault(TestPipeTypeBase<?> pipeType, Map<TestPipeTypeBase<?>, T> map) {
        T def = this.defaultValue.apply(pipeType);
        map.put(pipeType, def);
        return def;
    }

    public void setValue(Direction side, TestPipeTypeBase<?> pipeType, T value) {
        Map<TestPipeTypeBase<?>, T> map = this.savedSideValues[side.ordinal()];
        if (map == null) {
            map = new HashMap();
            this.savedSideValues[side.ordinal()] = map;
        }

        ItemStack stack = (ItemStack) ((NonNullList) this.upgradeInventory.get()).get(side.ordinal());
        if (!stack.isEmpty()) {
            ((Map) map).put(pipeType, value);
            CompoundTag tag = stack.getOrCreateTag();
            CompoundTag compound;
            if (tag.contains(pipeType.getKey(), 10)) {
                compound = tag.getCompound(pipeType.getKey());
            } else {
                compound = new CompoundTag();
                tag.put(pipeType.getKey(), compound);
            }

            compound.put(this.key, this.serialize(value));
            this.blockList.run();
        }
    }

    public void invalidate() {
        Map[] var1 = this.savedSideValues;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Map<TestPipeTypeBase<?>, T> map = var1[var3];
            if (map != null) {
                map.clear();
            }
        }

    }

    public abstract Tag serialize(T var1);

    @Nullable
    public abstract T deserialize(TestPipeTypeBase<?> var1, Tag var2);
}
