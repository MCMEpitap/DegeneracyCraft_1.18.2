//package net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_power_steam_generator.bus;
//
//import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortWorkBlockEntity;
//import net.minecraft.core.Direction;
//import net.minecraftforge.energy.IEnergyStorage;
//
//public class BasicPowerSteamGeneratorBusEnergyStorage implements IEnergyStorage {
//    protected PortWorkBlockEntity pipe;
//    protected Direction side;
//    protected float lastReceived;
//
//    public BasicPowerSteamGeneratorBusEnergyStorage(PortWorkBlockEntity pipe, Direction side) {
//        this.pipe = pipe;
//        this.side = side;
//    }
//
//    public void tick() {
//        this.lastReceived = this.pipe.getLevel().getGameTime();
//        if (this.pipe.getLevel().getGameTime() - this.lastReceived > 1F) {
//            BasicPowerSteamGeneratorBusType.INSTANCE.extractEnergy(this.pipe, this.side);
//
//        }
//    }
//
//    public float receiveEnergyFloat(float maxReceive, boolean simulate) {
//        this.lastReceived = this.pipe.getLevel().getGameTime();
//        return BasicPowerSteamGeneratorBusType.INSTANCE.receiveEnergy(this.pipe, this.side, maxReceive, simulate);
//    }
//
//
//    public float extractEnergyFloat(float maxExtract, boolean simulate) {
//        return 0;
//    }
//
//
//    public float getEnergyStoredFloat() {
//        return 0;
//    }
//
//    public float getMaxEnergyStoredFloat() {
//        return Float.MAX_VALUE;
//    }
//
//    @Override
//    public int receiveEnergy(int maxReceive, boolean simulate) {
//        this.lastReceived = this.pipe.getLevel().getGameTime();
//        return (int) BasicPowerSteamGeneratorBusType.INSTANCE.receiveEnergy(this.pipe, this.side, maxReceive, simulate);
//    }
//
//    @Override
//    public int extractEnergy(int maxExtract, boolean simulate) {
//        return 0;
//    }
//
//    @Override
//    public int getEnergyStored() {
//        return 0;
//    }
//
//    @Override
//    public int getMaxEnergyStored() {
//        return Integer.MAX_VALUE;
//    }
//
//    public boolean canExtract() {
//        return false;
//    }
//
//    public boolean canReceive() {
//        return true;
//    }
//}
