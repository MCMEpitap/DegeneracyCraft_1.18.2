package net.epitap.degeneracycraft.item.sefirah_core.capability;

import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class PlayerSkillData {

    private final Map<ResourceLocation, Integer> investedPoints = new HashMap<>();

    public boolean isUnlocked(ResourceLocation skillId) {
        return investedPoints.containsKey(skillId);
    }

    public int getLevel(ResourceLocation skillId) {
        return investedPoints.getOrDefault(skillId, 0);
    }

    public void invest(ResourceLocation skillId) {
        investedPoints.merge(skillId, 1, Integer::sum);
    }
}

