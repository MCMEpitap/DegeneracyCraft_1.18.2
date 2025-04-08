package net.epitap.degeneracycraft.world.feature.ore.packet;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PacketStackClientUnderground {
    public static void handleClient(PacketStackUnderground msg, Supplier<NetworkEvent.Context> context) {
        if (context.get().getDirection().getReceptionSide() == LogicalSide.CLIENT) {
            context.get().enqueueWork(() -> {
                Minecraft mc = Minecraft.getInstance();
//                sendProspectingMessage(mc.player, PacketReadingHelpers.messagify(msg.blocks), msg.direction);
            });
        }
        context.get().setPacketHandled(true);
    }

//    private static void sendProspectingMessage(LocalPlayer player, Object... messageDecorators) {
//        TranslatableComponent msg = new TranslatableComponent("geolosys.pro_pick.tooltip.found",
//                messageDecorators);
//        player.displayClientMessage(msg, true);
//    }
}
