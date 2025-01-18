package net.epitap.degeneracycraft.transport.pipe.parametor;

public class PipeValue2D<K, V> {

    private final K key;
    private final V value;

    public PipeValue2D(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
