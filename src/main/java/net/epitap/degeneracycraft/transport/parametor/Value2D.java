package net.epitap.degeneracycraft.transport.parametor;

public class Value2D<K, V> {

    private final K key;
    private final V value;

    public Value2D(K key, V value) {
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
