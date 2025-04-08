package net.epitap.degeneracycraft.world.feature.ore.main;

import net.epitap.degeneracycraft.world.feature.ore.vein.VeinRegistry;
import net.minecraftforge.common.MinecraftForge;

public class DCOresAPI {
    public static VeinRegistry veinRegistry = new VeinRegistry();

    public static void init() {
        MinecraftForge.EVENT_BUS.register(veinRegistry);
    }
}