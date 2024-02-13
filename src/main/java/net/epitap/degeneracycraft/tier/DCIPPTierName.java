package net.epitap.degeneracycraft.tier;

public enum DCIPPTierName {
    BASIC("basic"),
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high"),
    SUPER("super"),
    HYPER("hyper"),
    ULTRA("ultra"),
    ANTI("anti"),
    IMAGINARY("imaginary"),
    INFINITY("infinity");

    private final String name;

    DCIPPTierName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
