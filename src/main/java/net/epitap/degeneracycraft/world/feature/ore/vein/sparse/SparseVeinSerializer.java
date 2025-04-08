package net.epitap.degeneracycraft.world.feature.ore.vein.sparse;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class SparseVeinSerializer {
    public SparseVein deserialize(JsonObject json, JsonDeserializationContext ctx) {
        return SparseVein.deserialize(json, ctx);
    }

    public JsonElement serialize(SparseVein dep, JsonSerializationContext ctx) {
        return dep.serialize(dep, ctx);
    }
}
