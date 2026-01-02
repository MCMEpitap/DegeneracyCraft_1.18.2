package net.epitap.degeneracycraft.item.sefirah_core.skills;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;

import java.util.HashSet;
import java.util.Set;

public class PlayerSkillData {

    private final Set<ResourceLocation> unlocked = new HashSet<>();

    public boolean isUnlocked(ResourceLocation id) {
        return unlocked.contains(id);
    }

    public void unlock(ResourceLocation id) {
        unlocked.add(id);
    }

    public CompoundTag save() {
        CompoundTag tag = new CompoundTag();
        ListTag list = new ListTag();
        for (ResourceLocation id : unlocked) {
            list.add(StringTag.valueOf(id.toString()));
        }
        tag.put("Unlocked", list);
        return tag;
    }

    public void load(CompoundTag tag) {
        unlocked.clear();
        ListTag list = tag.getList("Unlocked", Tag.TAG_STRING);
        for (Tag t : list) {
            unlocked.add(new ResourceLocation(t.getAsString()));
        }
    }
}
