package net.epitap.degeneracycraft.transport.pipe.parametor;

import java.util.function.Supplier;

public class PipeTransportModelValue<T> {
    private T value;
    private final Supplier<T> supplier;

    public PipeTransportModelValue(Supplier<T> supplier) {
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
