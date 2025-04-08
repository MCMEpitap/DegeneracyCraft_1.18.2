package net.epitap.degeneracycraft.world.feature.ore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.world.feature.ore.main.DCOresAPI;
import net.epitap.degeneracycraft.world.feature.ore.vein.VeinProspecting;
import net.epitap.degeneracycraft.world.feature.ore.vein.dence.DenseVein;
import net.epitap.degeneracycraft.world.feature.ore.vein.dence.DenseVeinSerializer;
import net.epitap.degeneracycraft.world.feature.ore.vein.sparse.SparseVein;
import net.epitap.degeneracycraft.world.feature.ore.vein.sparse.SparseVeinSerializer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import javax.annotation.Nonnull;
import java.util.Map;

public class WorldGenVeinDataLoader extends SimpleJsonResourceReloadListener {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    private DenseVeinSerializer denseDepSer = new DenseVeinSerializer();
    private SparseVeinSerializer sparseDepSer = new SparseVeinSerializer();

    public WorldGenVeinDataLoader() {
        super(GSON, "veins");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> datamap, @Nonnull ResourceManager manager,
                         ProfilerFiller profiler) {
        DCOresAPI.veinRegistry.clear();
        datamap.forEach((rl, json) -> {
            try {
                JsonObject jsonobject = json.getAsJsonObject();
                JsonObject config = jsonobject.get("config").getAsJsonObject();
                Degeneracycraft.LOGGER.info("Preparing to load vein datafile {}", rl.toString());

                switch (jsonobject.get("type").getAsString()) {
                    case "degeneracycraft:vein_dense":
                        DenseVein denseVein = denseDepSer.deserialize(config, null);
                        if (denseVein != null) {
                            Degeneracycraft.LOGGER.info(denseVein.toString());
                            DCOresAPI.veinRegistry.addVein(denseVein);
                        }
                        return;
                    case "degeneracycraft:vein_sparse":
                        SparseVein sparseVein = sparseDepSer.deserialize(config, null);
                        if (sparseVein != null) {
                            Degeneracycraft.LOGGER.info(sparseVein.toString());
                            DCOresAPI.veinRegistry.addVein(sparseVein);
                        }
                        return;
                    default:
                        Degeneracycraft.LOGGER.warn("Unknown JSON type. Received JSON {}", json.toString());
                }
            } catch (NullPointerException ex) {
                Degeneracycraft.LOGGER.info("Skipping registration of ore {}", rl);
            }
        });

        VeinProspecting.populateVeinBlocks();
    }
}
