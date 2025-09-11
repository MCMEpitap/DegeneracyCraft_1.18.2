package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkEvent;

import java.util.Optional;
import java.util.function.Supplier;

public class TransferRecipeC2SPacket {
    private final BlockPos pos;
    private final ResourceLocation recipeId;

    public TransferRecipeC2SPacket(BlockPos pos, Recipe<?> recipe) {
        this.pos = pos;
        this.recipeId = recipe.getId();
    }

    public TransferRecipeC2SPacket(FriendlyByteBuf buf) {
        this.pos = buf.readBlockPos();
        this.recipeId = buf.readResourceLocation();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBlockPos(pos);
        buf.writeResourceLocation(recipeId);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer player = ctx.get().getSender();
            if (player == null) return;
            Level level = player.level;
            if (!(level.getBlockEntity(pos) instanceof BasicPerformanceDesignatedDataInjectorBlockEntity be)) return;

            Optional<? extends Recipe<?>> opt = level.getRecipeManager().byKey(recipeId);
            if (opt.isEmpty()) return;

            be.insertRecipeInputsFromPlayer(player, opt.get());

            // 同期
            be.setChanged();
            level.sendBlockUpdated(pos, be.getBlockState(), be.getBlockState(), 3);
        });
        ctx.get().setPacketHandled(true);
    }
}

