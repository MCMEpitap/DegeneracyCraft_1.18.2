package net.epitap.degeneracycraft.energy;

import net.minecraft.nbt.FloatTag;
import net.minecraft.nbt.Tag;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.IEnergyStorage;


public class DCEnergyStorageFloat implements INBTSerializable<Tag>, DCIEnergyStorageFloat, IEnergyStorage{
    protected float energy;
    protected float capacity;
    protected float maxReceive;
    protected float maxExtract;

    public DCEnergyStorageFloat(float capacity)
        {
            this(capacity, capacity, capacity, 0);
        }

    public DCEnergyStorageFloat(float capacity, float maxTransfer)
        {
            this(capacity, maxTransfer, maxTransfer, 0);
        }

    public DCEnergyStorageFloat(float capacity, float maxReceive, float maxExtract)
        {
            this(capacity, maxReceive, maxExtract, 0);
        }

    public DCEnergyStorageFloat(float capacity, float maxReceive, float maxExtract, float energy)
        {
            this.capacity = capacity;
            this.maxReceive = maxReceive;
            this.maxExtract = maxExtract;
            this.energy = Math.max(0 , Math.min(capacity, energy));
        }

    @Override
    public float receiveEnergyFloat(float maxReceive, boolean simulate)
    {
        if (!canReceive())
            return 0;

        float energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
        if (!simulate)
            energy += energyReceived;
        return energyReceived;
    }

    @Override
    public float extractEnergyFloat(float maxExtract, boolean simulate)
    {
        if (!canExtract())
            return 0;

        float energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
        if (!simulate)
            energy -= energyExtracted;
        return energyExtracted;
    }
    @Override
    public float getEnergyStoredFloat() {
        return energy;
    }
    @Override
    public float getMaxEnergyStoredFloat() {
        return capacity;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        if (!canReceive())
            return 0;

        float energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
        if (!simulate)
            energy += energyReceived;

        return (int) energyReceived;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        if (!canExtract())
            return 0;

        float energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
        if (!simulate)
            energy -= energyExtracted;
        return (int) energyExtracted;
    }

    @Override
    public int getEnergyStored() {
        return (int) (energy > Integer.MAX_VALUE ? Integer.MAX_VALUE : energy);
    }

    @Override
    public int getMaxEnergyStored() {
        return (int) (capacity > Integer.MAX_VALUE ? Integer.MAX_VALUE : capacity);
    }
    @Override
    public boolean canExtract()
    {
        return this.maxExtract > 0;
    }
    @Override
    public boolean canReceive()
    {
        return this.maxReceive > 0;
    }

    @Override
    public Tag serializeNBT()
    {
        return FloatTag.valueOf(this.getEnergyStoredFloat());
    }

    @Override
    public void deserializeNBT(Tag nbt)
    {
        if (!(nbt instanceof FloatTag floatNbt))
            throw new IllegalArgumentException("Can not deserialize to an instance that isn't the default implementation");
        this.energy = floatNbt.getAsFloat();
    }
}
