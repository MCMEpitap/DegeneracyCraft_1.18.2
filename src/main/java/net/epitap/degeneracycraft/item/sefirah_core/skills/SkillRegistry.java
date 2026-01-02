package net.epitap.degeneracycraft.item.sefirah_core.skills;

import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class SkillRegistry {

    public static final Map<ResourceLocation, SkillDefinition> SKILLS = new HashMap<>();

    public static void register(SkillDefinition node) {
        SKILLS.put(node.getId(), node);
    }

    public static SkillDefinition get(ResourceLocation id) {
        return SKILLS.get(id);
    }
}
