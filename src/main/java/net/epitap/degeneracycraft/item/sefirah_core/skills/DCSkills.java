package net.epitap.degeneracycraft.item.sefirah_core.skills;

import net.epitap.degeneracycraft.item.sefirah_core.base.SefirahType;
import net.epitap.degeneracycraft.item.sefirah_core.sefirah.keter.KeterMultiplierEffect;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class DCSkills {

    public static void init() {

        SkillRegistry.register(
                new SkillDefinition(
                        new ResourceLocation("degeneracycraft", "keter_core"),
                        SefirahType.KETER,
                        1,
                        List.of(),
                        new KeterMultiplierEffect(1.1)
                )
        );

        // 他のスキルもここに追加
    }
}
