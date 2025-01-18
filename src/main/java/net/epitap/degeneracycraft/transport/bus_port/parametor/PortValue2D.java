package net.epitap.degeneracycraft.transport.bus_port.parametor;

public class PortValue2D<K, V> {

    private final K key;
    private final V value;

    public PortValue2D(K key, V value) {
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
