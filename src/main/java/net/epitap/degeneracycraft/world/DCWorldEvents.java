package net.epitap.degeneracycraft.world;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Degeneracycraft.MOD_ID)
public class DCWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

//        DCOreGeneration.generateOres(event);
    }
}
