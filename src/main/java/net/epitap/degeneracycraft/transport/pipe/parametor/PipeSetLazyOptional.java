package net.epitap.degeneracycraft.transport.pipe.parametor;

import net.minecraft.core.Direction;
import net.minecraftforge.common.util.LazyOptional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
public class PipeSetLazyOptional<T> {
    protected Map<Direction, LazyOptional<T>> store;

    public PipeSetLazyOptional() {
        store = new HashMap<>();
        for (Direction side : Direction.values()) {
            store.put(side, LazyOptional.empty());
        }
    }

    public LazyOptional<T> get(Direction side) {
        return store.get(side);
    }

    public void revalidate(Direction side, Function<Direction, Boolean> validFunction, Function<Direction, T> storeStorage) {
        store.get(side).invalidate();
        if (validFunction.apply(side)) {
            store.put(side, LazyOptional.of(() -> storeStorage.apply(side)));
        } else {
            store.put(side, LazyOptional.empty());
        }
    }

    public void revalidate(Function<Direction, Boolean> validFunction, Function<Direction, T> cachePopulator) {
        for (Direction side : Direction.values()) {
            revalidate(side, validFunction, cachePopulator);
        }
    }

    public void invalidate() {
        store.values().forEach(LazyOptional::invalidate);
    }
}
