package net.epitap.degeneracycraft.item.sefirah_core.skills;

import net.epitap.degeneracycraft.item.sefirah_core.base.SkillNodeLayout;
import net.minecraft.resources.ResourceLocation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SkillTreeLayout {

    private final Map<ResourceLocation, SkillNodeLayout> nodes = new HashMap<>();

    public static SkillTreeLayout createDefault() {
        SkillTreeLayout tree = new SkillTreeLayout();

        tree.add(new SkillNodeLayout(
                new ResourceLocation("degeneracycraft", "keter_root"),
                128, 128
        ));

        tree.add(new SkillNodeLayout(
                new ResourceLocation("degeneracycraft", "keter_synergy"),
                0, 0
        ));

        return tree;
    }

    public void add(SkillNodeLayout node) {
        nodes.put(node.getId(), node);
    }

    public Collection<SkillNodeLayout> getNodes() {
        return nodes.values();
    }

    public SkillNodeLayout get(ResourceLocation id) {
        return nodes.get(id);
    }
}
