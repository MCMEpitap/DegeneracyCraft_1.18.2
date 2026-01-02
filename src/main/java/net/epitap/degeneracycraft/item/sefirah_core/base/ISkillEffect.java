package net.epitap.degeneracycraft.item.sefirah_core.base;

import net.minecraft.world.entity.player.Player;

public interface ISkillEffect {
    void apply(Player player, int level);
    void remove(Player player, int level);
}
