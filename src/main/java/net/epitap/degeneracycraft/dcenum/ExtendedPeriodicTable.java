package net.epitap.degeneracycraft.dcenum;

public enum ExtendedPeriodicTable {
    HYDROGEN("hydrogen", 1, 1.008, 14.01, 20.28, "H", 1);

    public final String name;
    public final int number;
    public final double weight;
    public final double melting;
    public final double boiling;
    public final String elementSymbol;
    public final int phase;

    ExtendedPeriodicTable(String name, int number, double weight, double melting, double boiling, String elementSymbol, int phase) {
        this.name = name;
        this.number = number;
        this.weight = weight;
        this.melting = melting;
        this.boiling = boiling;
        this.elementSymbol = elementSymbol;
        this.phase = phase;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getMelting() {
        return this.melting;
    }

    public double getBoiling() {
        return this.boiling;
    }

    public String getElementSymbol() {
        return this.elementSymbol;
    }

    public int getPhase() {
        return this.phase;
    }
}
