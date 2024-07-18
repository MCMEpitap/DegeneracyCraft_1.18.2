package net.epitap.degeneracycraft.transport.pipe.energy;

import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlocks;
import net.epitap.degeneracycraft.transport.pipe.entities.PipeWorkBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlockEntityBase;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeIEnergyUtils;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeTypeBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicEnergyPipeType extends PipeTypeBase<Void> {
    public static final BasicEnergyPipeType INSTANCE = new BasicEnergyPipeType();

    public BasicEnergyPipeType() {
    }

    public String getKey() {
        return "basic_energy_pipe";
    }

    public boolean canImport(BlockEntity blockEntity, Direction direction) {
        return blockEntity.getCapability(CapabilityEnergy.ENERGY, direction).isPresent();
    }

    public String getTranslationKey() {
        return "basic_energy_pipe";
    }

    public ItemStack getIcon() {
        return new ItemStack(PipeBlocks.BASIC_ENERGY_PIPE_BLOCK);
    }

    public void tick(PipeWorkBlockEntity blockEntity) {
    }

    public void extractEnergy(PipeWorkBlockEntity blockEntity, Direction side){
        if (blockEntity.pipeExtracting(side)) {
            IEnergyStorage energyStorage = this.getEnergyStorage(blockEntity, blockEntity.getBlockPos().relative(side), side.getOpposite());
            if (energyStorage != null && energyStorage.canExtract()) {
                List<PipeBlockEntityBase.Connection> connections = blockEntity.getSortedConnections(side, this);
                this.importEnergy(blockEntity, side, connections, energyStorage);
            }
        }
    }


    public float receiveEnergy(PipeWorkBlockEntity blockEntity, Direction side, float amount, boolean simulate) {
        if (!blockEntity.pipeExtracting(side)) {
            return 0;
        } else {
            List<PipeBlockEntityBase.Connection> connections = blockEntity.getSortedConnections(side, this);
            float maxTransfer = Math.min(this.getTickRate(blockEntity, side), amount);
            return this.exportEnergy(blockEntity, connections, maxTransfer, simulate);
        }
    }

    protected void importEnergy(PipeWorkBlockEntity blockEntity, Direction side, List<PipeBlockEntityBase.Connection> connections, IEnergyStorage energyStorage) {
        if (!connections.isEmpty()) {
            float completeAmount = this.getTickRate(blockEntity, side);
            float energyToTransfer = completeAmount;
            int p = blockEntity.get3dData(side, this) % connections.size();
            List<IEnergyStorage> destinations = new ArrayList(connections.size());

            for(int i = 0; i < connections.size(); ++i) {
                int index = (i + p) % connections.size();
                PipeBlockEntityBase.Connection connection = connections.get(index);
                IEnergyStorage destination = this.getEnergyStorage(blockEntity, connection.pos(), connection.direction());
                if (destination != null && destination.canReceive() && destination.receiveEnergy(1, true) >= 1) {
                    destinations.add(destination);
                }
            }

            Iterator var13 = destinations.iterator();

            while(var13.hasNext()) {
                IEnergyStorage destination = (IEnergyStorage)var13.next();
                float simulatedExtract = energyStorage.extractEnergy((int) Math.min(Math.max(completeAmount / destinations.size(), 1), energyToTransfer), true);
                if (simulatedExtract > 0) {
                    float transferred = PipeIEnergyUtils.pushEnergy(energyStorage, destination, simulatedExtract);
                    if (transferred > 0) {
                        energyToTransfer -= transferred;
                    }
                }

                p = (p + 1) % connections.size();
                if (energyToTransfer <= 0) {
                    break;
                }
            }

            blockEntity.set3dData(side, this, p);
        }
    }

    protected float exportEnergy(PipeWorkBlockEntity blockEntity, List<PipeBlockEntityBase.Connection> connections, float maxReceive, boolean simulate) {
        if (blockEntity.pushRecursion()) {
            return 0;
        } else {
            float actuallyTransferred = 0;
            float energyToTransfer = maxReceive;
            Iterator var8 = connections.iterator();

            while(var8.hasNext()) {
                PipeBlockEntityBase.Connection connection = (PipeBlockEntityBase.Connection)var8.next();
                if (energyToTransfer <= 0) {
                    break;
                }

                IEnergyStorage destination = this.getEnergyStorage(blockEntity, connection.pos(), connection.direction());
                if (destination != null && destination.canReceive()) {
                    float extracted = destination.receiveEnergy((int) Math.min(energyToTransfer, maxReceive), simulate);
                    energyToTransfer -= extracted;
                    actuallyTransferred += extracted;
                }
            }

            blockEntity.popRecursion();
            return actuallyTransferred;
        }
    }

//    private boolean hasNotInserted(boolean[] inventoriesFull) {
//        boolean[] var2 = inventoriesFull;
//        int var3 = inventoriesFull.length;
//
//        for(int var4 = 0; var4 < var3; ++var4) {
//            boolean b = var2[var4];
//            if (!b) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    @Nullable
    private IEnergyStorage getEnergyStorage(PipeWorkBlockEntity blockEntity, BlockPos pos, Direction direction) {
        BlockEntity energyBlockEntity = blockEntity.getLevel().getBlockEntity(pos);
        return energyBlockEntity == null ? null : energyBlockEntity.getCapability(CapabilityEnergy.ENERGY, direction).orElse(null);
    }

    public float getTickRate() {
        return Float.MAX_VALUE;
    }

}
