package net.epitap.degeneracycraft.integration.jei.test.test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import java.util.HashMap;
import java.util.Map;

public class MultiBlockStructureLoader extends SimpleJsonResourceReloadListener {
    private static final Gson GSON = new Gson();
    private final Map<String, MultiBlockStructure> structures = new HashMap<>();

    public MultiBlockStructureLoader() {
        super(GSON, "multiblock_structures");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> resources, ResourceManager manager, ProfilerFiller profiler) {
        structures.clear();
        for (Map.Entry<ResourceLocation, JsonElement> entry : resources.entrySet()) {
            try {
                JsonObject json = entry.getValue().getAsJsonObject();
                MultiBlockStructure structure = MultiBlockStructure.fromJson(json); // 修正済み
                structures.put(entry.getKey().getPath(), structure);
            } catch (Exception e) {
                System.err.println("Failed to load structure: " + entry.getKey());
                e.printStackTrace();
            }
        }
    }

    public MultiBlockStructure getStructure(String name) {
        return structures.get(name);
    }
}
