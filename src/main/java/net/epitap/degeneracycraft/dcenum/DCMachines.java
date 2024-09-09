package net.epitap.degeneracycraft.dcenum;



public enum DCMachines {
    BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK("basic_power_thermal_generator_block");


    private final String name;

    DCMachines(String name) {
        this.name = name;
    }

    public String getPhase() {
        return this.name;
    }

}

