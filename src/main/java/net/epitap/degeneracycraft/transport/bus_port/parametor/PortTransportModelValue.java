package net.epitap.degeneracycraft.transport.bus_port.parametor;

import java.util.function.Supplier;

public class PortTransportModelValue<T> {
    private T value;
    private final Supplier<T> supplier;

    public PortTransportModelValue(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (value == null) {
            value = supplier.get();
        }
        return value;
    }

    public void invalidate() {
        value = null;
    }
}
