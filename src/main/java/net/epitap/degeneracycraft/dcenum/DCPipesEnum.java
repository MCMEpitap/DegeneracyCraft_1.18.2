package net.epitap.degeneracycraft.dcenum;

public enum DCPipesEnum {
    BASIC("basic",64),
    LOW("low", 512),
    MEDIUM("medium", 4096),
    HIGH("high", 32768),
    SUPER("super", 262144),
    HYPER("hyper", 2097152),
    ULTRA("ultra", 16777216),
    ANTI("anti", 134217728),
    IMAGINARY("imaginary", 1073741824),
    INFINITY("infinity", 2147483647);

    private final String phase;
    private final long rate;
    private DCPipesEnum(String name, long rate) {
        this.phase = name;
        this.rate = rate;
    }

    public String getPhase() {
        return this.phase;
    }
}
