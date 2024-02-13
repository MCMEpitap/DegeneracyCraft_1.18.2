package net.epitap.degeneracycraft.energy;

public abstract class DCEnergyStorageFloatBase extends DCEnergyStorageFloat {

    public DCEnergyStorageFloatBase(float capacity, float maxTransfer) {
        super(capacity, maxTransfer);
    }

    @Override
    public float extractEnergyFloat(float maxExtract, boolean simulate) {
        float extractedEnergy = super.extractEnergyFloat(maxExtract, simulate);
        if(extractedEnergy != 0) {
            onEnergyChanged();
        }

        return extractedEnergy;
    }

    @Override
    public float receiveEnergyFloat(float maxReceive, boolean simulate) {
        float receiveEnergy = super.receiveEnergyFloat(maxReceive, simulate);
        if(receiveEnergy != 0) {
            onEnergyChanged();
        }

        return receiveEnergy;
    }

    public float setEnergyFloat(float energy) {
        this.energy = energy;
        return energy;
    }

    public abstract void onEnergyChanged();
}
