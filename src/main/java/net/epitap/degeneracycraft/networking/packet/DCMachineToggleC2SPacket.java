package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class DCMachineToggleC2SPacket {
    private final BlockPos pos;
    private final int type;

    public static final int TOGGLE_HOLOGRAM = 0;
    public static final int TOGGLE_HALT = 1;

    public DCMachineToggleC2SPacket(FriendlyByteBuf buf) {
        this.pos = buf.readBlockPos();
        this.type = buf.readInt();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBlockPos(pos);
        buf.writeInt(type);
    }

    public DCMachineToggleC2SPacket(BlockPos pos, int type) {
        this.pos = pos;
        this.type = type;
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context ctx = supplier.get();
        ctx.enqueueWork(() -> {
            ServerPlayer player = ctx.getSender();
            if (player == null) return;

            BlockEntity blockEntity = player.level.getBlockEntity(pos);
            if (blockEntity instanceof BasicPerformanceStarlightCollectorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                machine.setChanged();
            }
        });
        return true;
    }
}
