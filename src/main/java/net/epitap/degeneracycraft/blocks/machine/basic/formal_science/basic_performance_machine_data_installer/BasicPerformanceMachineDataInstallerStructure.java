package net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer;

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

public class BasicPerformanceMachineDataInstallerStructure {
    static int minX = -1, maxX = 1;
    static int minY = -1, maxY = 1;
    static int minZ = -2, maxZ = 0;
    public static String[][][] structure0;
    public static String[][][] structure1;
    public static String[][][] structureH0;
    public static String[][][] structureH1;

    public BasicPerformanceMachineDataInstallerStructure() {
    }


    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPerformanceMachineDataInstallerBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPerformanceMachineDataInstallerBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        structure0 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"E", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", " ", "G"},
                        {"P", " ", "P"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "F", "S"}
                }
        };

        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("F", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        blockConditions.put("G", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
        blockConditions.put("P", blockState -> blockState.is(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK.get()));
        blockConditions.put("S", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));
        blockConditions.put("B", blockState -> blockState.is(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK.get()));
        blockConditions.put("E", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));

        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    int arrayY = maxY - y;
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
        return true;
    }

    public static boolean isPowered0(Level level, BlockPos pos, BlockState state, BasicPerformanceMachineDataInstallerBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPerformanceMachineDataInstallerBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        structure1 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"E", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", "R", "G"},
                        {"P", " ", "P"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "F", "S"}
                }
        };

        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("F", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        blockConditions.put("G", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
        blockConditions.put("P", blockState -> blockState.is(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK.get()));
        blockConditions.put("S", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));
        blockConditions.put("B", blockState -> blockState.is(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK.get()));
        blockConditions.put("E", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
        blockConditions.put("R", blockState -> blockState.is(DCBlocks.BASIC_SPEED_DATA_READER_BLOCK.get()));


        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    int arrayY = maxY - y;
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

        return true;
    }


    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPerformanceMachineDataInstallerBlockEntity blockEntity) {
        Direction facing = state.getValue(BasicPerformanceMachineDataInstallerBlock.FACING);
        BlockPos basePos = blockEntity.getBlockPos();

        structureH0 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"E", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", " ", "G"},
                        {"P", " ", "P"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "F", "S"}
                }
        };

        structureH1 = new String[][][]{
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"E", "B", "E"}
                },
                {
                        {"F", "G", "F"},
                        {"G", "R", "G"},
                        {"P", " ", "P"}
                },
                {
                        {"F", "F", "F"},
                        {"F", "F", "F"},
                        {"S", "F", "S"}
                }
        };

        Map<String, Supplier<Block>> blockMapping = new HashMap<>();
        blockMapping.put("F", DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK);
        blockMapping.put("G", DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK);
        blockMapping.put("P", DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_HOLO_BLOCK);
        blockMapping.put("S", DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK);
        blockMapping.put("B", DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_HOLO_BLOCK);
        blockMapping.put("E", DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK);
        blockMapping.put("R", DCBlocks.BASIC_SPEED_DATA_READER_HOLO_BLOCK);

        boolean displayHologram = blockEntity.itemHandler.getStackInSlot(3).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get()) ||
                blockEntity.itemHandler.getStackInSlot(3).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());

        if (!displayHologram) {
            removeHolograms(level, basePos, facing, blockMapping);
            return;
        }
        boolean visualizer0 = blockEntity.itemHandler.getStackInSlot(4).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
        boolean visualizer1 = blockEntity.itemHandler.getStackInSlot(4).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());


        for (int y = minY; y <= maxY; y++) {
            int arrayY = maxY - y;

            if (visualizer0) {
                if (!isLayerFormed(level, basePos, structureH0[arrayY], y, facing)) {
                    displayLayer(level, basePos, structureH0[arrayY], y, facing, blockMapping);
                    return;
                }
            }
            if (visualizer1) {
                if (!isLayerFormed(level, basePos, structureH1[arrayY], y, facing)) {
                    displayLayer(level, basePos, structureH1[arrayY], y, facing, blockMapping);
                    return;
                }
            }
        }
    }

    private static void displayLayer(Level level, BlockPos basePos, String[][] structureLayer, int yOffset, Direction facing, Map<String, Supplier<Block>> blockMapping) {
        for (int z = 0; z < structureLayer.length; z++) {
            for (int x = 0; x < structureLayer[z].length; x++) {
                String blockKey = structureLayer[z][x];
                if (" ".equals(blockKey)) continue;

                BlockPos relativePos = getRelativePos(basePos, x + minX, yOffset, z + minZ, facing);

                // 空気ブロックのみにホログラムを設置
                if (level.getBlockState(relativePos).is(Blocks.AIR)) {
                    Block blockToPlace = blockMapping.get(blockKey).get();
                    level.setBlock(relativePos, blockToPlace.defaultBlockState(), 3);
                }
            }
        }
    }

    private static void removeHolograms(Level level, BlockPos basePos, Direction facing, Map<String, Supplier<Block>> blockMapping) {
        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    BlockPos relativePos = getRelativePos(basePos, x, y, z, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    if (blockMapping.values().stream().anyMatch(supplier -> targetState.is(supplier.get()))) {
                        level.setBlock(relativePos, Blocks.AIR.defaultBlockState(), 3);
                    }
                }
            }
        }
    }

    private static boolean isLayerFormed(Level level, BlockPos basePos, String[][] structureLayer, int yOffset, Direction facing) {
        for (int z = 0; z < structureLayer.length; z++) {
            for (int x = 0; x < structureLayer[z].length; x++) {
                String expectedBlock = structureLayer[z][x];
                if (" ".equals(expectedBlock)) continue;

                BlockPos relativePos = getRelativePos(basePos, x + minX, yOffset, z + minZ, facing);
                BlockState targetState = level.getBlockState(relativePos);

                if (!isExpectedBlock(targetState, expectedBlock)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isExpectedBlock(BlockState blockState, String blockKey) {
        return switch (blockKey) {
            case "F" -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
            case "G" -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
            case "P" -> blockState.is(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK.get());
            case "S" -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());
            case "B" -> blockState.is(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK.get());
            case "E" -> blockState.is(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
            case "R" -> blockState.is(DCBlocks.BASIC_SPEED_DATA_READER_BLOCK.get());
            default -> false;
        };
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

