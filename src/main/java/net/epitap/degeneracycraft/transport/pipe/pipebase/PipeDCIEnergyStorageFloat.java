package net.epitap.degeneracycraft.transport.pipe.pipebase;

import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.transport.pipe.basic.energy.floa.FloatEnergyPipeType;
import net.minecraft.core.Direction;

public class PipeDCIEnergyStorageFloat implements DCIEnergyStorageFloat {
    protected PipeWorkBlockEntity pipe;
    protected Direction side;
    protected float lastReceived;

    public PipeDCIEnergyStorageFloat(PipeWorkBlockEntity pipe, Direction side) {
        this.pipe = pipe;
        this.side = side;
    }

    public void tick() {
        if (this.pipe.getLevel().getGameTime() - this.lastReceived > 1F) {
            FloatEnergyPipeType.INSTANCE.extractEnergy(this.pipe, this.side);
        }
    }

    public float receiveEnergyFloat(float maxReceive, boolean simulate) {
        this.lastReceived = this.pipe.getLevel().getGameTime();
        return FloatEnergyPipeType.INSTANCE.receiveEnergy(this.pipe, this.side, maxReceive, simulate);
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
