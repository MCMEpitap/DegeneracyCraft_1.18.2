package net.epitap.degeneracycraft.pipe.render;

import java.util.function.Supplier;

public class PipeModelValue<T> {
    private T value;
    private Supplier<T> supplier;

    public PipeModelValue(Supplier<T> supplier) {
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
