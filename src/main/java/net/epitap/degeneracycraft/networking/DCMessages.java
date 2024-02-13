package net.epitap.degeneracycraft.networking;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.networking.packet.DCEnergySyncS2CPacket;
import net.epitap.degeneracycraft.networking.packet.DCExampleC2SPacket;
import net.epitap.degeneracycraft.networking.packet.DCItemStackSyncS2CPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class DCMessages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Degeneracycraft.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(DCExampleC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(DCExampleC2SPacket::new)
                .encoder(DCExampleC2SPacket::toBytes)
                .consumer(DCExampleC2SPacket::handle)
                .add();

//        net.messageBuilder(DrinkWaterC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
//                .decoder(DrinkWaterC2SPacket::new)
//                .encoder(DrinkWaterC2SPacket::toBytes)
//                .consumerMainThread(DrinkWaterC2SPacket::handle)
//                .add();
//
//        net.messageBuilder(ThirstDataSyncS2CPacket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
//                .decoder(ThirstDataSyncS2CPacket::new)
//                .encoder(ThirstDataSyncS2CPacket::toBytes)
//                .consumerMainThread(ThirstDataSyncS2CPacket::handle)
//                .add();

        net.messageBuilder(DCEnergySyncS2CPacket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
                .decoder(DCEnergySyncS2CPacket::new)
                .encoder(DCEnergySyncS2CPacket::toBytes)
                .consumer(DCEnergySyncS2CPacket::handle)
                .add();


        net.messageBuilder(DCItemStackSyncS2CPacket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
                .decoder(DCItemStackSyncS2CPacket::new)
                .encoder(DCItemStackSyncS2CPacket::toBytes)
                .consumer(DCItemStackSyncS2CPacket::handle)
                .add();
    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }

    public static <MSG> void sendToClients(MSG message) {
        INSTANCE.send(PacketDistributor.ALL.noArg(), message);
    }
}
