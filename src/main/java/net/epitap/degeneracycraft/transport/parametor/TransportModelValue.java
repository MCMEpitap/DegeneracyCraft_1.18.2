package net.epitap.degeneracycraft.transport.parametor;

import java.util.function.Supplier;

public class TransportModelValue<T> {
    private T value;
    private final Supplier<T> supplier;

    public TransportModelValue(Supplier<T> supplier) {
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
