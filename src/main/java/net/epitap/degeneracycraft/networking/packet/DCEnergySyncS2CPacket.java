package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.basic_power_composite_structure_type_thermal_generator.BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_power_composite_structure_type_thermal_generator.BasicPowerCompositeStructureTypeThermalGeneratorMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class DCEnergySyncS2CPacket {
    private final float energy;
    private final BlockPos pos;

    public DCEnergySyncS2CPacket(float energy, BlockPos pos) {
        this.energy = energy;
        this.pos = pos;
    }

    public DCEnergySyncS2CPacket(FriendlyByteBuf buf) {
        this.energy = buf.readFloat();
        this.pos = buf.readBlockPos();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeFloat(energy);
        buf.writeBlockPos(pos);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            if(Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);

                if(Minecraft.getInstance().player.containerMenu instanceof BasicPowerCompositeStructureTypeThermalGeneratorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
        });
        return true;
    }
}
