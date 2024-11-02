package net.epitap.degeneracycraft.dcenum;



public enum DCMachines {
    BASIC_POWER_STEAM_GENERATOR_BLOCK("basic_power_steam_generator_block");


    private final String name;

    DCMachines(String name) {
        this.name = name;
    }

    public String getPhase() {
        return this.name;
    }

}

