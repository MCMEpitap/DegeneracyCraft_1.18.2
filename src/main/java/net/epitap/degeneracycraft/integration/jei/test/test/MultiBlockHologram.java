package net.epitap.degeneracycraft.integration.jei.test.test;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Map;

public class MultiBlockHologram {

    public static void displayHologram(Level world, BlockPos origin, MultiBlockStructure structure) {
        List<List<String>> pattern = structure.getPattern();
        Map<String, String> mapping = structure.getMapping();

        for (int y = 0; y < pattern.size(); y++) {
            List<String> layer = pattern.get(y);

            for (int z = 0; z < layer.size(); z++) {
                String row = layer.get(z);

                for (int x = 0; x < row.length(); x++) {
                    char symbol = row.charAt(x);
                    if (symbol == ' ') {
                        continue; // 空白の場合はスキップ
                    }

                    BlockPos displayPos = origin.offset(x, y, z);

                    // パーティクルで表示
                    world.addParticle(
                            new BlockParticleOption(ParticleTypes.BLOCK, Blocks.LIGHT.defaultBlockState()),
                            displayPos.getX() + 0.5,
                            displayPos.getY() + 0.5,
                            displayPos.getZ() + 0.5,
                            0, 0, 0
                    );
                }
            }
        }
    }
}

