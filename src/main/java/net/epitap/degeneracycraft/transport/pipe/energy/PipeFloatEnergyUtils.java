package net.epitap.degeneracycraft.transport.pipe.energy;

import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.energy.CapabilityEnergy;

import javax.annotation.Nullable;

public class PipeFloatEnergyUtils {
    public PipeFloatEnergyUtils() {
    }

    public static float pushEnergy(DCIEnergyStorageFloat provider, DCIEnergyStorageFloat receiver, float maxAmount) {
        float energySim = provider.extractEnergyFloat(maxAmount, true);
        float receivedSim = receiver.receiveEnergyFloat(energySim, true);
        float energy = provider.extractEnergyFloat(receivedSim, false);
        receiver.receiveEnergyFloat(energy, false);
        return energy;
    }

    @Nullable
    public static DCIEnergyStorageFloat getEnergyStorage(LevelAccessor world, BlockPos pos, Direction side) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        return blockEntity == null ? null : (DCIEnergyStorageFloat)blockEntity.getCapability(CapabilityEnergy.ENERGY, side.getOpposite()).orElse(null);
    }

    @Nullable
    public static DCIEnergyStorageFloat getEnergyStorageOffset(LevelAccessor world, BlockPos pos, Direction side) {
        return getEnergyStorage(world, pos.relative(side), side.getOpposite());
    }
}
