package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

import java.util.Objects;
import java.util.function.Supplier;

public class TransferRecipeC2SPacket {

    private final BlockPos pos;
    private final String recipeId; // ResourceLocationの文字列で送る

    public TransferRecipeC2SPacket(BlockPos pos, String recipeId) {
        this.pos = pos;
        this.recipeId = recipeId;
    }

    public TransferRecipeC2SPacket(FriendlyByteBuf buf) {
        this.pos = buf.readBlockPos();
        this.recipeId = buf.readUtf();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBlockPos(pos);
        buf.writeUtf(recipeId);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            if (player == null) return;

            player.level.getRecipeManager().byKey(Objects.requireNonNull(ResourceLocation.tryParse(recipeId)))
                    .ifPresent(recipe -> {
                        if (player.level.getBlockEntity(pos) instanceof BasicPerformanceDesignatedDataInjectorBlockEntity blockEntity) {
                            // サーバー側でアイテム補充
                            blockEntity.insertRecipeInputsFromPlayer(player, recipe);

                            // クライアントに同期
                            net.epitap.degeneracycraft.networking.DCMessages.sendToClients(
                                    new net.epitap.degeneracycraft.networking.packet.DCItemStackSyncS2CPacket(
                                            blockEntity.itemHandler, blockEntity.getBlockPos()
                                    )
                            );
                        }
                    });
        });
        return true;
    }
}
