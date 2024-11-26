package net.epitap.degeneracycraft.integration.jei.test.test;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Map;

public class MultiBlockDetector {

    public static boolean isStructureComplete(Level world, BlockPos origin, MultiBlockStructure structure) {
        List<List<String>> pattern = structure.getPattern();
        Map<String, String> mapping = structure.getMapping();

        // y座標ごとに層をチェック
        for (int y = 0; y < pattern.size(); y++) {
            List<String> layer = pattern.get(y);

            for (int z = 0; z < layer.size(); z++) {
                String row = layer.get(z);

                for (int x = 0; x < row.length(); x++) {
                    char symbol = row.charAt(x);
                    if (symbol == ' ') {
                        continue; // 空白の場合はスキップ
                    }

                    String blockId = mapping.get(String.valueOf(symbol));
                    if (blockId == null) {
                        return false; // マッピングが見つからない場合は失敗
                    }

                    BlockPos checkPos = origin.offset(x, y, z);
                    Block block = world.getBlockState(checkPos).getBlock();

                    // ブロックIDが一致しない場合は失敗
                    if (!block.getRegistryName().toString().equals(blockId)) {
                        return false;
                    }
                }
            }
        }

        return true; // 全て一致すれば成功
    }
}

