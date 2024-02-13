package net.epitap.degeneracycraft.event;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.event.InputEvent;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Degeneracycraft.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = Degeneracycraft.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
    }
}
