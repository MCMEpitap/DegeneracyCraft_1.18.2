package net.epitap.degeneracycraft.transport.port_bus.port_busbase;

import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.minecraft.core.Direction;

public class PortDCIEnergyStorageFloat implements DCIEnergyStorageFloat {
    protected PortWorkBlockEntity pipe;
    protected Direction side;
    protected float lastReceived;

    public PortDCIEnergyStorageFloat(PortWorkBlockEntity pipe, Direction side) {
        this.pipe = pipe;
        this.side = side;
    }

    public void tick() {
        if (this.pipe.getLevel().getGameTime() - this.lastReceived > 1F) {
//            FloatEnergyPipeType.INSTANCE.extractEnergy(this.pipe, this.side);
        }
    }

    public float receiveEnergyFloat(float maxReceive, boolean simulate) {
        this.lastReceived = this.pipe.getLevel().getGameTime();
//        return FloatEnergyPipeType.INSTANCE.receiveEnergy(this.pipe, this.side, maxReceive, simulate);
        return 0F;
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

    public boolean canExtract() {
        return false;
    }

    public boolean canReceive() {
        return true;
    }
}
