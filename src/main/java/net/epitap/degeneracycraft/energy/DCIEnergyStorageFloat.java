package net.epitap.degeneracycraft.energy;

public interface DCIEnergyStorageFloat {
    float receiveEnergyFloat(float maxReceive, boolean simulate);

    float extractEnergyFloat(float maxExtract, boolean simulate);

    float getEnergyStoredFloat();


    float getMaxEnergyStoredFloat();

    boolean canExtract();


    boolean canReceive();
}
