package net.epitap.degeneracycraft.world.feature.ore.network;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class NetworkManager {
    public SimpleChannel networkWrapper;
    private static final String PROTOCOL_VERSION = "1";

    public NetworkManager() {
        networkWrapper = NetworkRegistry.newSimpleChannel(new ResourceLocation(Degeneracycraft.MOD_ID, "main"),
                () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    }
}
