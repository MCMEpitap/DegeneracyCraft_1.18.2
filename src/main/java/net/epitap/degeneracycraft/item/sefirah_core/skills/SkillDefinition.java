package net.epitap.degeneracycraft.item.sefirah_core.skills;

import net.epitap.degeneracycraft.item.sefirah_core.base.ISkillEffect;
import net.epitap.degeneracycraft.item.sefirah_core.base.SefirahType;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class SkillDefinition {

    private final ResourceLocation id;
    private final SefirahType sefirah;
    private final int cost;
    private final List<ResourceLocation> prerequisites;
    private final ISkillEffect effect;

    public SkillDefinition(ResourceLocation id,
                           SefirahType sefira,
                           int cost,
                           List<ResourceLocation> prerequisites,
                           ISkillEffect effect) {
        this.id = id;
        this.sefirah = sefira;
        this.cost = cost;
        this.prerequisites = prerequisites;
        this.effect = effect;
    }

    public ResourceLocation getId() {
        return id;
    }
    public SefirahType getSefirah() {
        return sefirah;
    }
    public int getCost() {
        return cost;
    }
    public List<ResourceLocation> getPrerequisites() {
        return prerequisites;
    }
    public ISkillEffect getEffect() {
        return effect;
    }
}

