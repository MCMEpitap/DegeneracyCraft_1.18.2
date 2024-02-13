package net.epitap.degeneracycraft.world;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.world.generation.DCOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Degeneracycraft.MOD_ID)
public class DCWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingevent(final BiomeLoadingEvent event){

        DCOreGeneration.generationOres(event);
    }
}
