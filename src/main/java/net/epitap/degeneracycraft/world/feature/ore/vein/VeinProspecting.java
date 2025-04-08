package net.epitap.degeneracycraft.world.feature.ore.vein;

import net.epitap.degeneracycraft.world.feature.ore.main.DCOresAPI;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;

public class VeinProspecting {
    private static HashSet<BlockState> veinBlocks;

    public static void populateVeinBlocks() {
        veinBlocks = new HashSet<>();

        DCOresAPI.veinRegistry.getOres().forEach((pluton) -> {
            HashSet<BlockState> ores = pluton.getAllOres();
            if (ores != null) {
                veinBlocks.addAll(ores);
            }
        });
    }
}
