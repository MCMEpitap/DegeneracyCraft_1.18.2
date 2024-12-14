package net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicPowerSteamGeneratorStructure {
    static int minX = -1, maxX = 1;
    static int minY = -1, maxY = 1;
    static int minZ = -2, maxZ = 0;
    public static String[][][] structureReset;
    public static String[][][] structure0;
    public static String[][][] structure1;
    public static String[][][] structureH0;
    public static String[][][] structureH1;

    public BasicPowerSteamGeneratorStructure() {
    }

    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        // 画面上方向が-z方向
        // 3次元目がy方向
        structure0 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", " ", "G"},
                        {"P", "M", "H"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"F", "F", "F"}
                }
        };

        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("F", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        blockConditions.put("G", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
        blockConditions.put("P", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()));
        blockConditions.put("H", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get()));
        blockConditions.put("S", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));
        blockConditions.put("B", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()));
        blockConditions.put("E", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
        blockConditions.put("M", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get()));


        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    int arrayY = y - minY;
                    int arrayZ = z - minZ;
                    int arrayX = x - minX;

                    String expectedBlock = structure0[arrayY][arrayZ][arrayX];

                    if (" ".equals(expectedBlock)) continue;

                    BlockPos relativePos = getRelativePos(basePos, x, y, z, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
                    if (condition == null || !condition.test(targetState)) {
                        return false;
                    }
                }
            }
        }

        // 全ての条件を満たした場合
        return true;
    }

    public static boolean isPowered0(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        // 画面上方向が-z方向
        // 3次元目がy方向
        structure1 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", "C", "G"},
                        {"P", "M", "H"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"F", "F", "F"}
                }
        };

        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("F", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        blockConditions.put("G", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
        blockConditions.put("P", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()));
        blockConditions.put("H", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get()));
        blockConditions.put("S", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));
        blockConditions.put("B", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()));
        blockConditions.put("E", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
        blockConditions.put("M", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get()));
        blockConditions.put("C", blockState -> blockState.is(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get()));

        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    int arrayY = y - minY;
                    int arrayZ = z - minZ;
                    int arrayX = x - minX;

                    String expectedBlock = structure1[arrayY][arrayZ][arrayX];

                    if (" ".equals(expectedBlock)) continue;

                    BlockPos relativePos = getRelativePos(basePos, x, y, z, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
                    if (condition == null || !condition.test(targetState)) {
                        return false;
                    }
                }
            }
        }

        // 全ての条件を満たした場合
        return true;
    }

    public static boolean isReset(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        // 画面上方向が-z方向
        // 3次元目がy方向
        structureReset = new String[][][]{
                {
                        {"A", "A", "A"},
                        {"A", "A", "A"},
                        {"A", "A", "A"}
                },
                {
                        {"A", "A", "A"},
                        {"A", "A", "A"},
                        {"A", " ", "A"}
                },
                {
                        {"A", "A", "A"},
                        {"A", "A", "A"},
                        {"A", "A", "A"}
                }
        };

        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("A", blockState -> blockState.is(Blocks.AIR));

        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    int arrayY = y - minY;
                    int arrayZ = z - minZ;
                    int arrayX = x - minX;

                    String expectedBlock = structureReset[arrayY][arrayZ][arrayX];

                    if (" ".equals(expectedBlock)) continue;

                    BlockPos relativePos = getRelativePos(basePos, x, y, z, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
                    if (condition == null || !condition.test(targetState)) {
                        return false;
                    }
                }
            }
        }

        // 全ての条件を満たした場合
        return true;
    }


//    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction facing = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        BlockPos basePos = blockEntity.getBlockPos();
//
//        // 構造定義
//        structureH0 = new String[][][]{
//                {
//                        {"F", "F", "F"},
//                        {"F", "F", "F"},
//                        {"S", "B", "E"}
//                },
//                {
//                        {"F", "G", "F"},
//                        {"G", " ", "G"},
//                        {"P", " ", "H"}
//                },
//                {
//                        {"F", "F", "F"},
//                        {"F", "F", "F"},
//                        {"F", "F", "F"}
//                }
//        };
//
//        structureH1 = new String[][][]{
//                {
//                        {"F", "F", "F"},
//                        {"F", "F", "F"},
//                        {"S", "B", "E"}
//                },
//                {
//                        {"F", "G", "F"},
//                        {"G", "C", "G"},
//                        {"P", " ", "H"}
//                },
//                {
//                        {"F", "F", "F"},
//                        {"F", "F", "F"},
//                        {"F", "F", "F"}
//                }
//        };
//
//        Map<String, Supplier<Block>> blockMapping = new HashMap<>();
//        blockMapping.put("F", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK);
//        blockMapping.put("G", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK);
//        blockMapping.put("P", DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK);
//        blockMapping.put("H", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK);
//        blockMapping.put("S", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK);
//        blockMapping.put("B", DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK);
//        blockMapping.put("E", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK);
//        blockMapping.put("C", DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK);
//
//        boolean displayHologram = blockEntity.itemHandler.getStackInSlot(3).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get()) ||
//                blockEntity.itemHandler.getStackInSlot(3).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
//
//        // 現在の段を取得し、範囲をチェック
//        int currentLayer = Math.min(blockEntity.getCurrentLayer(), structureH0.length - 1);
//
//        // 表示する段の範囲を決定
//        for (int y = 0; y <= currentLayer; y++) {
//            if (y < 0 || y >= structureH0.length) continue; // Y範囲外チェック
//
//            // 配列のY座標を基準ブロックからの高さに変換
//            int yOffset = y - 1; // 最下層が基準ブロックの高さに対応
//
//            for (int z = minZ; z <= maxZ; z++) {
//                int arrayZ = z - minZ;
//                if (arrayZ < 0 || arrayZ >= structureH0[0].length) continue; // Z範囲外チェック
//
//                for (int x = minX; x <= maxX; x++) {
//                    int arrayX = x - minX;
//                    if (arrayX < 0 || arrayX >= structureH0[0][0].length) continue; // X範囲外チェック
//
//                    String blockKey = null;
//                    if (blockEntity.itemHandler.getStackInSlot(3).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
//                        blockKey = structureH0[y][arrayZ][arrayX];
//                    }
//
//                    if (blockEntity.itemHandler.getStackInSlot(3).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
//                        blockKey = structureH1[y][arrayZ][arrayX];
//                    }
//
//                    if (blockKey == null || blockKey.equals(" ")) continue; // 無効なブロックはスキップ
//
//                    BlockPos relativePos = getRelativePos(basePos, x, yOffset, z, facing);
//
//                    if (displayHologram) {
//                        // ホログラムを表示
//                        Block blockToPlace = blockMapping.get(blockKey).get();
//                        BlockState blockStateToPlace = blockToPlace.defaultBlockState();
//
//                        if (level.getBlockState(relativePos).is(Blocks.AIR)) {
//                            level.setBlock(relativePos, blockStateToPlace, 3);
//                        }
//                    } else {
//                        // ホログラムを削除
//                        if (blockMapping.values().stream().anyMatch(supplier -> level.getBlockState(relativePos).is(supplier.get()))) {
//                            level.setBlock(relativePos, Blocks.AIR.defaultBlockState(), 3);
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//
//
//
//    /**
//     * 指定した段がすべて正しく設置されているかを検証
//     */
//    private static boolean isLayerComplete(Level level, BlockPos basePos, int layer, Direction facing, String[][][] structure, Map<String, Supplier<Block>> blockMapping) {
//        String[][] layerStructure = structure[layer];
//
//        for (int z = 0; z < layerStructure.length; z++) {
//            for (int x = 0; x < layerStructure[z].length; x++) {
//                String blockKey = layerStructure[z][x];
//                if (" ".equals(blockKey)) continue;
//
//                BlockPos relativePos = getRelativePos(basePos, x - 1, layer - 1, z - 2, facing);
//                BlockState targetState = level.getBlockState(relativePos);
//
//                Supplier<Block> expectedBlock = blockMapping.get(blockKey);
//                if (expectedBlock == null || !targetState.is(expectedBlock.get())) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }

    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        // ホログラム表示用の構造定義
        structureH0 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", " ", "G"},
                        {"P", " ", "H"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"F", "F", "F"}
                }
        };

        Map<String, Supplier<Block>> holoBlockMapping = new HashMap<>();
        holoBlockMapping.put("F", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK);
        holoBlockMapping.put("G", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK);
        holoBlockMapping.put("P", DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK);
        holoBlockMapping.put("H", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK);
        holoBlockMapping.put("S", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK);
        holoBlockMapping.put("B", DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK);
        holoBlockMapping.put("E", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK);

        // 特定のアイテムがスロットにある場合のみホログラムを表示
        boolean displayHologram = blockEntity.itemHandler.getStackInSlot(3).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());

        if (!displayHologram) {
            // スロットにアイテムがない場合はすべてのホログラムを削除
            clearHolograms(level, basePos, structureH0.length, facing);
            return;
        }

        // 現在の段を取得
        int currentLayer = blockEntity.getCurrentLayer();

        // 現在の段が完成しているかをチェック
        boolean layerComplete = isLayerComplete(level, basePos, currentLayer, facing, structureH0, holoBlockMapping);

        // 次の段を表示する処理
        if (layerComplete && currentLayer < structureH0.length - 1) {
            blockEntity.setCurrentLayer(currentLayer + 1); // 次の段を表示
            currentLayer++; // 表示段数を更新
        }

        // 表示する段の高さ
        int yOffset = currentLayer - 1;

        for (int z = minZ; z <= maxZ; z++) {
            int arrayZ = z - minZ;
            for (int x = minX; x <= maxX; x++) {
                int arrayX = x - minX;

                String blockKey = structureH0[currentLayer][arrayZ][arrayX];
                if (" ".equals(blockKey)) continue;

                BlockPos relativePos = getRelativePos(basePos, x, yOffset, z, facing);
                Block blockToPlace = holoBlockMapping.get(blockKey).get();
                BlockState blockStateToPlace = blockToPlace.defaultBlockState();

                // 空気ブロックにのみホログラムを表示
                if (level.getBlockState(relativePos).is(Blocks.AIR)) {
                    level.setBlock(relativePos, blockStateToPlace, 3);
                }
            }
        }
    }

    /**
     * 指定した段がすべて正しく設置されているかを検証
     */
    private static boolean isLayerComplete(Level level, BlockPos basePos, int layer, Direction facing, String[][][] structure, Map<String, Supplier<Block>> blockMapping) {
        String[][] layerStructure = structure[layer];

        for (int z = 0; z < layerStructure.length; z++) {
            for (int x = 0; x < layerStructure[z].length; x++) {
                String blockKey = layerStructure[z][x];
                if (" ".equals(blockKey)) continue;

                BlockPos relativePos = getRelativePos(basePos, x - 1, layer - 1, z - 2, facing);
                BlockState targetState = level.getBlockState(relativePos);

                Supplier<Block> expectedBlock = blockMapping.get(blockKey);
                if (expectedBlock == null || !targetState.is(expectedBlock.get())) {
                    return false; // 一致しないブロックがある場合
                }
            }
        }

        return true; // すべて一致している場合
    }

    /**
     * ホログラムを削除する処理
     */
    private static void clearHolograms(Level level, BlockPos basePos, int layers, Direction facing) {
        for (int y = 0; y < layers; y++) {
            int yOffset = y - 1; // 基準ブロックからの高さ
            for (int z = minZ; z <= maxZ; z++) {
                int arrayZ = z - minZ;
                for (int x = minX; x <= maxX; x++) {
                    int arrayX = x - minX;
                    BlockPos relativePos = getRelativePos(basePos, x, yOffset, z, facing);

                    // ホログラムブロックのみ削除
                    if (level.getBlockState(relativePos).is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get()) ||
                            level.getBlockState(relativePos).is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get()) ||
                            level.getBlockState(relativePos).is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get()) ||
                            level.getBlockState(relativePos).is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get()) ||
                            level.getBlockState(relativePos).is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get()) ||
                            level.getBlockState(relativePos).is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get()) ||
                            level.getBlockState(relativePos).is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                        level.setBlock(relativePos, Blocks.AIR.defaultBlockState(), 3);
                    }
                }
            }
        }
    }


    private static BlockPos getRelativePos(BlockPos basePos, int x, int y, int z, Direction facing) {
        return switch (facing) {
            case NORTH -> basePos.relative(Direction.WEST, x).relative(Direction.DOWN, y).relative(Direction.NORTH, z);
            case SOUTH -> basePos.relative(Direction.EAST, x).relative(Direction.DOWN, y).relative(Direction.SOUTH, z);
            case WEST -> basePos.relative(Direction.SOUTH, x).relative(Direction.DOWN, y).relative(Direction.WEST, z);
            case EAST -> basePos.relative(Direction.NORTH, x).relative(Direction.DOWN, y).relative(Direction.EAST, z);
            default -> basePos; // 想定外の方向は基準座標をそのまま返す
        };
    }
}

