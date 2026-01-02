package net.epitap.degeneracycraft.item.sefirah_core.sefirah.keter;

import net.epitap.degeneracycraft.item.sefirah_core.base.ISkillEffect;
import net.minecraft.world.entity.player.Player;

public class KeterMultiplierEffect implements ISkillEffect {

    private final double multiplier;

    public KeterMultiplierEffect(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public void apply(Player player, int level) {
        // Capability参照して倍率加算
    }

    @Override
    public void remove(Player player, int level) {
        // 解除
    }
}

