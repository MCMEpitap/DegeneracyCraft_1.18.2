package net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortBlockEntityBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortTypeBase;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeIEnergyUtils;
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

public class BasicPerformanceRockCrasherBusType extends PortTypeBase<Void> {
    public static final BasicPerformanceRockCrasherBusType INSTANCE = new BasicPerformanceRockCrasherBusType();

    public BasicPerformanceRockCrasherBusType() {
    }

    public String getKey() {
        return "basic_performance_rock_crasher_bus_block";
    }

    public boolean canImport(BlockEntity blockEntity, Direction direction) {
        return blockEntity.getCapability(CapabilityEnergy.ENERGY, direction).isPresent();
    }

    public String getTranslationKey() {
        return "basic_performance_rock_crasher_bus_block";
    }

    public ItemStack getIcon() {
        return new ItemStack(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK.get());
    }

    public void tick(PortWorkBlockEntity blockEntity) {
    }

    public void extractEnergy(PortWorkBlockEntity blockEntity, Direction side) {
        if (blockEntity.portExtracting(side)) {
            IEnergyStorage energyStorage = this.getEnergyStorage(blockEntity, blockEntity.getBlockPos().relative(side), side.getOpposite());
            if (energyStorage != null && energyStorage.canExtract()) {
                List<PortBlockEntityBase.Connection> connections = blockEntity.getSortedConnections(side, this);
                this.importEnergy(blockEntity, side, connections, energyStorage);
            }
        }
    }


    public float receiveEnergy(PortWorkBlockEntity blockEntity, Direction side, float amount, boolean simulate) {
        if (!blockEntity.portExtracting(side)) {
            return 0;
        } else {
            List<PortBlockEntityBase.Connection> connections = blockEntity.getSortedConnections(side, this);
            float maxTransfer = Math.min(this.getTickRate(blockEntity, side), amount);
            return this.exportEnergy(blockEntity, connections, maxTransfer, simulate);
        }
    }

    protected void importEnergy(PortWorkBlockEntity blockEntity, Direction side, List<PortBlockEntityBase.Connection> connections, IEnergyStorage energyStorage) {
        if (!connections.isEmpty()) {
            float completeAmount = this.getTickRate(blockEntity, side);
            float energyToTransfer = completeAmount;
            int p = blockEntity.get3dData(side, this) % connections.size();
            List<IEnergyStorage> destinations = new ArrayList(connections.size());

            for (int i = 0; i < connections.size(); ++i) {
                int index = (i + p) % connections.size();
                PortBlockEntityBase.Connection connection = connections.get(index);
                IEnergyStorage destination = this.getEnergyStorage(blockEntity, connection.pos(), connection.direction());
                if (destination != null && destination.canReceive() && destination.receiveEnergy(1, true) >= 1) {
                    destinations.add(destination);
                }
            }

            Iterator var13 = destinations.iterator();

            while (var13.hasNext()) {
                IEnergyStorage destination = (IEnergyStorage) var13.next();
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

    protected float exportEnergy(PortWorkBlockEntity blockEntity, List<PortBlockEntityBase.Connection> connections, float maxReceive, boolean simulate) {
        if (blockEntity.pushRecursion()) {
            return 0;
        } else {
            float actuallyTransferred = 0;
            float energyToTransfer = maxReceive;
            Iterator var8 = connections.iterator();

            while (var8.hasNext()) {
                PortBlockEntityBase.Connection connection = (PortBlockEntityBase.Connection) var8.next();
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

    @Nullable
    private IEnergyStorage getEnergyStorage(PortWorkBlockEntity blockEntity, BlockPos pos, Direction direction) {
        BlockEntity energyBlockEntity = blockEntity.getLevel().getBlockEntity(pos);
        return energyBlockEntity == null ? null : energyBlockEntity.getCapability(CapabilityEnergy.ENERGY, direction).orElse(null);
    }

    public float getTickRate() {
        return 64F;
    }

}
