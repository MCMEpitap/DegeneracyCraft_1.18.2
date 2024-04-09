package net.epitap.degeneracycraft.pipe.test.pipebase;

import net.epitap.degeneracycraft.pipe.test.entities.PortWorkBlockEntity;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.util.HashSet;
import java.util.Set;

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

    public boolean deepExactCompare(Tag tag, Tag item) {
        if (tag instanceof CompoundTag compoundTag) {
            if (!(item instanceof CompoundTag compoundItemTag)) {
                return false;
            }
            Set<String> allKeys = new HashSet<>();
            allKeys.addAll(compoundTag.getAllKeys());
            allKeys.addAll(compoundItemTag.getAllKeys());
            for (String key : allKeys) {
                if (compoundTag.contains(key)) {
                    if (compoundItemTag.contains(key)) {
                        Tag nbt = compoundTag.get(key);
                        if (!deepExactCompare(nbt, compoundItemTag.get(key))) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        } else if (tag instanceof ListTag listTag) {
            if (!(item instanceof ListTag listItemTag)) {
                return false;
            }
            if (!listTag.stream().allMatch(itemTag -> listItemTag.stream().anyMatch(listItemTagMatch -> deepExactCompare(itemTag, listItemTagMatch)))) {
                return false;
            }
            return listItemTag.stream().allMatch(itemTag -> listTag.stream().anyMatch(listItemTagMatch -> deepExactCompare(itemTag, listItemTagMatch)));
        } else {
            return tag != null && tag.equals(item);
        }
    }

    public boolean deepFuzzyCompare(Tag tag, Tag item) {
        if (tag instanceof CompoundTag compoundTag) {
            if (!(item instanceof CompoundTag compoundItemTag)) {
                return false;
            }
            for (String key : compoundTag.getAllKeys()) {
                Tag nbt = compoundTag.get(key);
                if (compoundItemTag.contains(key, nbt.getId())) {
                    if (!deepFuzzyCompare(nbt, compoundItemTag.get(key))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        } else if (tag instanceof ListTag listTag) {
            if (!(item instanceof ListTag listItemTag)) {
                return false;
            }
            return listTag.stream().allMatch(itemTag -> listItemTag.stream().anyMatch(listItemTagMatch -> deepFuzzyCompare(itemTag, listItemTagMatch)));
        } else {
            return tag != null && tag.equals(item);
        }
    }

    public static int getConnectionsNotFullCount(boolean[] connections) {
        int count = 0;
        for (boolean connection : connections) {
            if (!connection) {
                count++;
            }
        }
        return count;
    }
}
