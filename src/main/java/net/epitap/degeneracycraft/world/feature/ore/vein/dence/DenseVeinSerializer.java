package net.epitap.degeneracycraft.world.feature.ore.vein.dence;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;



public class DenseVeinSerializer {
    public DenseVein deserialize(JsonObject json, JsonDeserializationContext ctx) {
        return DenseVein.deserialize(json, ctx);
    }

    public JsonElement serialize(DenseVein dep, JsonSerializationContext ctx) {
        return dep.serialize(dep, ctx);
    }
}
