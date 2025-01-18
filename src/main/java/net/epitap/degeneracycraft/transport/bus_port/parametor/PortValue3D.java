package net.epitap.degeneracycraft.transport.bus_port.parametor;

public class PortValue3D<V1, V2, V3> {

    private final V1 value1;
    private final V2 value2;
    private final V3 value3;

    public PortValue3D(V1 value1, V2 value2, V3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public V3 getValue3() {
        return value3;
    }
}