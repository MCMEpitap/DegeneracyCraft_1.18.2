package net.epitap.degeneracycraft.blocks.machine.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicPerformanceRealityPhaseAdjustmentMachineStructure {
    static int minX0 = -2, maxX0 = 2;
    static int minY0 = -1, maxY0 = 3;
    static int minZ0 = -4, maxZ0 = 0;
    static int minX1 = -2, maxX1 = 2;
    static int minY1 = -1, maxY1 = 3;
    static int minZ1 = -4, maxZ1 = 0;
    public static String[][][] structure0 = new String[][][]{
            {
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"}
            },
            {
                    {"F", "G", "F", "G", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", " ", " ", " ", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", "F", "F", "F", "F"}
            },
            {
                    {"F", "G", "F", "G", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", " ", " ", " ", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", "E", "B", "E", "F"}
            },
            {
                    {"F", "G", "F", "G", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", " ", " ", " ", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", "P", " ", "P", "F"}
            },
            {
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "S", "F", "S", "F"}
            }
    };
    public static String[][][] structure1 = new String[][][]{
            {
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"}
            },
            {
                    {"F", "G", "F", "G", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", " ", "C", " ", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", "F", "F", "F", "F"}
            },
            {
                    {"F", "G", "F", "G", "F"},
                    {"G", " ", "C", " ", "G"},
                    {"F", "C", "C", "C", "F"},
                    {"G", " ", "C", " ", "G"},
                    {"F", "E", "B", "E", "F"}
            },
            {
                    {"F", "G", "F", "G", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", " ", "C", " ", "F"},
                    {"G", " ", " ", " ", "G"},
                    {"F", "P", " ", "P", "F"}
            },
            {
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "F", "F", "F", "F"},
                    {"F", "S", "F", "S", "F"}
            }
    };

    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPerformanceRealityPhaseAdjustmentMachineBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPerformanceRealityPhaseAdjustmentMachineBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();
        Map<String, Predicate<BlockState>> blockConditions = getBlockConditions();

        for (int y = 0; y < structure0.length; y++) {
            for (int z = 0; z < structure0[y].length; z++) {
                for (int x = 0; x < structure0[y][z].length; x++) {
                    String expectedBlock = structure0[y][z][x];

                    if (" ".equals(expectedBlock)) continue;

                    BlockPos relativePos = getRelativePos(basePos,x + minX0, maxY0 - y, z + minZ0, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
                    if (condition == null || !condition.test(targetState)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isPowered1(Level level, BlockPos pos, BlockState state, BasicPerformanceRealityPhaseAdjustmentMachineBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPerformanceRealityPhaseAdjustmentMachineBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        Map<String, Predicate<BlockState>> blockConditions = getBlockConditions();

        for (int y = 0; y < structure1.length; y++) {
            for (int z = 0; z < structure1[y].length; z++) {
                for (int x = 0; x < structure1[y][z].length; x++) {
                    String expectedBlock = structure1[y][z][x];

                    if (" ".equals(expectedBlock)) continue;

                    BlockPos relativePos = getRelativePos(basePos,x + minX1, maxY1 - y, z + minZ1, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
                    if (condition == null || !condition.test(targetState)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static @NotNull Map<String, Predicate<BlockState>> getBlockConditions() {
        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("F", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        blockConditions.put("G", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
        blockConditions.put("P", blockState -> blockState.is(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_PORT_BLOCK.get()));
        blockConditions.put("S", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_ITEM_STORAGE_BLOCK.get()));
        blockConditions.put("B", blockState -> blockState.is(DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BUS_BLOCK.get()));
        blockConditions.put("E", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
        blockConditions.put("C", blockState -> blockState.is(DCBlocks.BASIC_EFFICIENCY_PHASE_STABLE_FLAME_BLOCK.get()));
        return blockConditions;
    }

    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPerformanceRealityPhaseAdjustmentMachineBlockEntity blockEntity) {
        if (level.isClientSide()) return;
        Direction facing = state.getValue(BasicPerformanceRealityPhaseAdjustmentMachineBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();
        Map<String, Predicate<BlockState>> blockConditions = getBlockConditions();

        Map<String, Supplier<BlockState>> holoBlockKey = getHoloBlockSuppliers();

        if (blockEntity.hologramLevel == -1) {
            removeHolograms(level, basePos, structure1, minX1, minY1, minZ1, facing, holoBlockKey);
            return;
        }

        if (blockEntity.hologramLevel == 0) {
            for (int y = minY0; y <= maxY0; y++) {
                int arrayY = maxY0 - y;
                if (isLayerFormed(level, basePos, structure0[arrayY], minX0, y, minZ0, facing, blockConditions)) {
                    displayLayer(level, basePos, structure0[arrayY], minX0, y, minZ0, facing, holoBlockKey);
                    return;
                }
            }
        }

        if (blockEntity.hologramLevel == 1) {
            removeHolograms(level, basePos, structure1, minX1, minY1, minZ1, facing, holoBlockKey);
            for (int y = minY1; y <= maxY1; y++) {
                int arrayY = maxY1 - y;
                if (isLayerFormed(level, basePos, structure1[arrayY], minX1, y, minZ1, facing, blockConditions)) {
                    displayLayer(level, basePos, structure1[arrayY], minX1, y, minZ1, facing, holoBlockKey);
                    return;
                }
            }
        }
    }

    private static @NotNull Map<String, Supplier<BlockState>> getHoloBlockSuppliers() {
        Map<String, Supplier<BlockState>> blockSuppliers = new HashMap<>();
        blockSuppliers.put("F", () -> DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState());
        blockSuppliers.put("G", () -> DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState());
        blockSuppliers.put("P", () -> DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_PORT_HOLO_BLOCK.get().defaultBlockState());
        blockSuppliers.put("S", () -> DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_ITEM_STORAGE_HOLO_BLOCK.get().defaultBlockState());
        blockSuppliers.put("B", () -> DCBlocks.BASIC_PERFORMANCE_REALITY_PHASE_ADJUSTMENT_MACHINE_BUS_HOLO_BLOCK.get().defaultBlockState());
        blockSuppliers.put("E", () -> DCBlocks.BASIC_STRENGTH_KALEIDOSCOPIC_REALITY_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get().defaultBlockState());
        blockSuppliers.put("C", () -> DCBlocks.BASIC_EFFICIENCY_PHASE_STABLE_FLAME_HOLO_BLOCK.get().defaultBlockState());
        return blockSuppliers;
    }

    private static void displayLayer(Level level, BlockPos basePos, String[][] structureLayer, int minx, int yOffset, int minz, Direction facing, Map<String, Supplier<BlockState>> blockMapping) {
        for (int z = 0; z < structureLayer.length; z++) {
            for (int x = 0; x < structureLayer[z].length; x++) {
                String blockKey = structureLayer[z][x];
                if (" ".equals(blockKey)) continue;

                BlockState blockToPlace = blockMapping.get(blockKey).get();
                BlockPos relativePos = getRelativePos(basePos, x + minx, yOffset, z + minz, facing);

                if (level.getBlockState(relativePos).isAir()) {
                    level.setBlock(relativePos, blockToPlace, 3);
                }
            }
        }
    }

    private static void removeHolograms(Level level, BlockPos basePos, String[][][] structureLayer, int minx, int miny, int minz, Direction facing, Map<String, Supplier<BlockState>> blockMapping) {
        for (int y = 0; y < structureLayer.length; y++) {
            for (int z = 0; z < structureLayer[y].length; z++) {
                for (int x = 0; x < structureLayer[y][z].length; x++) {
                    BlockPos relativePos = getRelativePos(basePos, x + minx, y + miny, z + minz, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    boolean isHologram = blockMapping.values().stream()
                            .anyMatch(supplier -> targetState.equals(supplier.get()));

                    if (isHologram) {
                        level.setBlock(relativePos, Blocks.AIR.defaultBlockState(), 3);
                    }
                }
            }
        }
    }

    private static boolean isLayerFormed(Level level, BlockPos basePos, String[][] structureLayer, int minx, int yOffset, int minz, Direction facing, Map<String, Predicate<BlockState>> blockConditions) {
        for (int z = 0; z < structureLayer.length; z++) {
            for (int x = 0; x < structureLayer[z].length; x++) {
                String blockKey = structureLayer[z][x];
                if (" ".equals(blockKey)) continue;

                Predicate<BlockState> condition = blockConditions.get(blockKey);

                BlockPos relativePos = getRelativePos(basePos, x + minx, yOffset, z + minz, facing);
                BlockState targetState = level.getBlockState(relativePos);

                if (!condition.test(targetState)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static BlockPos getRelativePos(BlockPos basePos, int x, int y, int z, Direction facing) {
        return switch (facing) {
            case NORTH -> basePos.relative(Direction.WEST, x).relative(Direction.UP, y).relative(Direction.NORTH, z);
            case SOUTH -> basePos.relative(Direction.EAST, x).relative(Direction.UP, y).relative(Direction.SOUTH, z);
            case WEST -> basePos.relative(Direction.SOUTH, x).relative(Direction.UP, y).relative(Direction.WEST, z);
            case EAST -> basePos.relative(Direction.NORTH, x).relative(Direction.UP, y).relative(Direction.EAST, z);
            default -> basePos;
        };
    }
}

