package net.epitap.degeneracycraft.transport.bus_port.parametor;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;

public class PortIEnergyStorageUtils {
    public PortIEnergyStorageUtils() {
    }

    public static float pushEnergy(IEnergyStorage provider, IEnergyStorage receiver, float maxAmount) {
        float energySim = provider.extractEnergy((int) maxAmount, true);
        float receivedSim = receiver.receiveEnergy((int) energySim, true);
        float energy = provider.extractEnergy((int) receivedSim, false);
        receiver.receiveEnergy((int) energy, false);
        return energy;
    }

    @Nullable
    public static IEnergyStorage getEnergyStorage(LevelAccessor world, BlockPos pos, Direction side) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        return blockEntity == null ? null : blockEntity.getCapability(CapabilityEnergy.ENERGY, side.getOpposite()).orElse(null);
    }

    @Nullable
    public static IEnergyStorage getEnergyStorageOffset(LevelAccessor world, BlockPos pos, Direction side) {
        return getEnergyStorage(world, pos.relative(side), side.getOpposite());
    }
}
