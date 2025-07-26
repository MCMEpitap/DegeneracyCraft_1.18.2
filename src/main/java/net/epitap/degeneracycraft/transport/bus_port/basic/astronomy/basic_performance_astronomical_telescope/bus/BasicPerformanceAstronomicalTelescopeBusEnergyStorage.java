package net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.bus;

import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
import net.minecraft.core.Direction;
import net.minecraftforge.energy.IEnergyStorage;

public class BasicPerformanceAstronomicalTelescopeBusEnergyStorage implements IEnergyStorage {
    protected PortWorkBlockEntity pipe;
    protected Direction side;
    protected float lastReceived;

    public BasicPerformanceAstronomicalTelescopeBusEnergyStorage(PortWorkBlockEntity pipe, Direction side) {
        this.pipe = pipe;
        this.side = side;
    }

    public void tick() {
        if (this.pipe.getLevel().getGameTime() - this.lastReceived > 1F) {
            BasicPerformanceAstronomicalTelescopeBusType.INSTANCE.extractEnergy(this.pipe, this.side);
        }
    }

    public float receiveEnergyFloat(float maxReceive, boolean simulate) {
        this.lastReceived = this.pipe.getLevel().getGameTime();

        return BasicPerformanceAstronomicalTelescopeBusType.INSTANCE.receiveEnergy(this.pipe, this.side, maxReceive, simulate);
    }


    public float extractEnergyFloat(float maxExtract, boolean simulate) {
        return 0;
    }


    public float getEnergyStoredFloat() {
        return 0;
    }

    public float getMaxEnergyStoredFloat() {
        return Float.MAX_VALUE;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        this.lastReceived = this.pipe.getLevel().getGameTime();
        return (int) BasicPerformanceAstronomicalTelescopeBusType.INSTANCE.receiveEnergy(this.pipe, this.side, maxReceive, simulate);
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        return 0;
    }

    @Override
    public int getEnergyStored() {
        return 0;
    }

    @Override
    public int getMaxEnergyStored() {
        return Integer.MAX_VALUE;
    }

    public boolean canExtract() {
        return false;
    }

    public boolean canReceive() {
        return true;
    }
}
