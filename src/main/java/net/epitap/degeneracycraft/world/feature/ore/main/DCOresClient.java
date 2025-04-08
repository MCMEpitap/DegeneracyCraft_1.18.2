package net.epitap.degeneracycraft.world.feature.ore.main;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DCOresClient {
    public static void setup() {
        MinecraftForge.EVENT_BUS.register(DCOresClient.class);
    }

    @SubscribeEvent
    public static void onHover(ItemTooltipEvent event) {
        Minecraft mc = Minecraft.getInstance();

        if (mc.options.advancedItemTooltips) {
            event.getItemStack().getTags().forEach(x -> {
                event.getToolTip().add(new TextComponent("\u00A78#" + x.location() + "\u00A7r"));
            });
        }
    }
}
