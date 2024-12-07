package net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.dcenum.MBPPos;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BasicPowerSteamGeneratorStructure {
    public BasicPowerSteamGeneratorStructure() {
    }


//    public static boolean isFormed(BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        return blockEntity.isFormed = blockEntity.formed0 && blockEntity.formed1 && blockEntity.formed2;
//    }

    public static boolean isPowered0(BasicPowerSteamGeneratorBlockEntity blockEntity) {
        return blockEntity.isPowered0 = blockEntity.powered0_1 && blockEntity.isFormed;
    }


//    public static boolean isFormed0(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
//        Direction reX = dir.getCounterClockWise();
//        Direction reZ = dir;
//
//
//        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
//                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//
//        return blockEntity.formed0 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8;
//    }

//    public static boolean isFormed0(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        BlockPos blockpos = blockEntity.getBlockPos();
//        Direction reX = dir.getCounterClockWise();
//        Direction reZ = dir;
//
//        // マルチブロック構造を2次元boolean配列で定義
//        boolean[][] structure = new boolean[][] {
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                },
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                },
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                }
//        };
//
//        // 配列を検査して、すべての値がtrueであることを確認
//        boolean isValid = true;
//        for (boolean[] row : structure) {
//            for (boolean cell : row) {
//                if (!cell) {
//                    isValid = false;
//                    break;
//                }
//            }
//            if (!isValid) {
//                break;
//            }
//        }
//
//        // 結果を返す
//        return blockEntity.formed0 = isValid;
//    }
//
//    //    public static boolean isFormed1(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
////        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
////        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
////        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
////        Direction reX = dir.getCounterClockWise();
////        Direction reZ = dir;
////
////
////        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
////        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
////        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
////        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
////                .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get());
////        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
////
////        return blockEntity.formed1 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6;
////    }
//    public static boolean isFormed1(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
//        BlockPos blockpos = blockEntity.getBlockPos();
//        Direction reX = dir.getCounterClockWise();
//        Direction reZ = dir;
//
//        // マルチブロック構造を2次元boolean配列で定義
//        boolean[][] structure = new boolean[][] {
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                },
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()),
//                        true, // 中央 (常にtrueの基準点として使用)
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get())
//                },
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
//                                .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()),
//                        true,
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get())
//                }
//        };
//
//        // 配列を検査して、すべての値がtrueであることを確認
//        boolean isValid = true;
//        for (boolean[] row : structure) {
//            for (boolean cell : row) {
//                if (!cell) {
//                    isValid = false;
//                    break;
//                }
//            }
//            if (!isValid) {
//                break;
//            }
//        }
//
//        // 結果を返す
//        return blockEntity.formed1 = isValid;
//    }
//
////    public static boolean isFormed2(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
////        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
////        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
////        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
////        Direction reX = dir.getCounterClockWise();
////        Direction reZ = dir;
////
////        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
////        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());
////        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
////                .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get());
////        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
////                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
////
////        return blockEntity.formed2 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8;
////    }
//
//    public static boolean isFormed2(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        /*relative position getCounterClockWise=+x, above=+y, nothing=+z*/
//        BlockPos blockpos = blockEntity.getBlockPos();
//        Direction reX = dir.getCounterClockWise();
//        Direction reZ = dir;
//
//        // マルチブロック構造を2次元boolean配列で定義
//        boolean[][] structure = new boolean[][] {
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                },
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                },
//                {
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
//                                .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()),
//                        level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
//                                .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get())
//                }
//        };
//
//        // 配列を検査して、すべての値がtrueであることを確認
//        boolean isValid = true;
//        for (boolean[] row : structure) {
//            for (boolean cell : row) {
//                if (!cell) {
//                    isValid = false;
//                    break;
//                }
//            }
//            if (!isValid) {
//                break;
//            }
//        }
//
//        // 結果を返す
//        return blockEntity.formed2 = isValid;
//    }

//    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        /*relative position getCounterClockWise=+x, above=+y, nothing=+z*/
//        BlockPos blockpos = blockEntity.getBlockPos();
//        Direction reX = dir.getCounterClockWise();
//        Direction reZ = dir;
//
//        // 3次元boolean配列を定義 (x, y, zの順)
//        boolean[][][] structures = new boolean[][][]{
//                // isFormed0
//                {
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                        },
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                        },
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                        }
//                },
//                // isFormed1
//                {
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                        },
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()),
//                                true,
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get())
//                        },
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
//                                        .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()),
//                                true,
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get())
//                        }
//                },
//                // isFormed2
//                {
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                        },
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                        },
//                        {
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
//                                        .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()),
//                                level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
//                                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get())
//                        }
//                }
//        };
//
//        boolean isValid = true;
//        for (boolean[][] layer : structures) {
//            for (boolean[] row : layer) {
//                for (boolean cell : row) {
//                    if (!cell) {
//                        isValid = false;
//                        break;
//                    }
//                }
//                if (!isValid) break;
//            }
//            if (!isValid) break;
//        }
//
//        return blockEntity.isFormed = isValid;
//    }

//    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        // マルチブロック構造を直接定義
//        String[][][] structure = new String[][][]{
//                {
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"}
//                },
//                {
//                        {"FRAME", "GLASS", "FRAME"},
//                        {"GLASS", "NONE", "GLASS"},
//                        {"PORT", "NONE", "MACHINE_FRAME"}
//                },
//                {
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"STORAGE", "BUS", "ENERGY_STORAGE"}
//                }
//        };
//
//        // ブロック名と対応するブロックオブジェクトのマッピング
//        Map<String, Block> blockMapping = new HashMap<>();
//        blockMapping.put("FRAME", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        blockMapping.put("GLASS", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
//        blockMapping.put("PORT", DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get());
//        blockMapping.put("MACHINE_FRAME", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
//        blockMapping.put("STORAGE", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());
//        blockMapping.put("BUS", DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get());
//        blockMapping.put("ENERGY_STORAGE", DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
//        // 必要に応じてさらに条件を追加
//
//        // 基準位置 (blockEntity の座標) を中心として構造を確認
//        BlockPos basePos = blockEntity.getBlockPos();
//        int centerX = structure[0][0].length / 2; // 中心X (配列幅の半分)
//        int centerZ = structure[0].length / 2;   // 中心Z (配列高さの半分)
//
//        for (int y = 0; y < structure.length; y++) {
//            for (int z = 0; z < structure[y].length; z++) {
//                for (int x = 0; x < structure[y][z].length; x++) {
//                    String expectedBlock = structure[y][z][x];
//
//                    // "NONE" はスキップ
//                    if ("NONE".equals(expectedBlock)) continue;
//
//                    // 相対位置を計算
//                    BlockPos targetPos = basePos.offset(x - centerX, y, z - centerZ);
//                    Block targetBlock = level.getBlockState(targetPos).getBlock();
//
//                    // マッピングに存在するブロックと比較
//                    Block expected = blockMapping.get(expectedBlock);
//                    if (expected == null || targetBlock != expected) {
//                        return false; // 条件に一致しない場合
//                    }
//                }
//            }
//        }
//
//        return true; // 全て一致

    //    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        // マルチブロック構造を定義
//        String[][][] structure = new String[][][]{
//                {
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"}
//                },
//                {
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "NONE", "FRAME"},
//                        {"FRAME", "NONE", "FRAME"}
//                },
//                {
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"},
//                        {"FRAME", "FRAME", "FRAME"}
//                }
//        };
//
//        // ブロック名と条件をマッピング
//        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
//        blockConditions.put("FRAME", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
//        blockConditions.put("GLASS", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
//        blockConditions.put("PORT", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()));
//        blockConditions.put("MACHINE_FRAME", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get()));
//        blockConditions.put("STORAGE", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));
//        blockConditions.put("BUS", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()));
//        blockConditions.put("ENERGY_STORAGE", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
//        // 必要に応じてさらに条件を追加
//
//        // 基準となる座標
//        BlockPos basePos = blockEntity.getBlockPos();
//
//        // 座標の範囲を定義
//        int minX = -1, maxX = 1;
//        int minY = -1, maxY = 1;
//        int minZ = -2, maxZ = 0;
//
//        // 配列の中心を計算 (structure 配列を基準)
//        int centerX = structure[0][0].length / 2; // 配列の中心X
//        int centerZ = structure[0].length / 2;   // 配列の中心Z
//
//        // 座標範囲をループ
//        for (int y = minY; y <= maxY; y++) {
//            for (int z = minZ; z <= maxZ; z++) {
//                for (int x = minX; x <= maxX; x++) {
//                    // 配列内の対応する座標を計算
//                    int arrayY = y - minY; // 配列のYインデックス
//                    int arrayZ = z - minZ; // 配列のZインデックス
//                    int arrayX = x - minX; // 配列のXインデックス
//
//                    // 構造データから期待されるブロックタイプを取得
//                    String expectedBlock = structure[arrayY][arrayZ][arrayX];
//
//                    // "NONE" の場合はスキップ
//                    if ("NONE".equals(expectedBlock)) continue;
//
//                    // ワールド内の対応する座標
//                    BlockPos targetPos = basePos.offset(x, y, z);
//                    BlockState targetState = level.getBlockState(targetPos);
//
//                    // 条件に一致するか確認
//                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
//                    if (condition == null || !condition.test(targetState)) {
//                        return false; // 条件に一致しない場合
//                    }
//                }
//            }
//        }
//
//        // 全ての条件を満たした場合
//        return true;
//    }
    public static boolean isFormed(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        // マルチブロック構造を定義
        String[][][] structure = new String[][][]{
                {
                        {"FRAME", "FRAME", "FRAME"},
                        {"FRAME", "FRAME", "FRAME"},
                        {"FRAME", "FRAME", "FRAME"}
                },
                {
                        {"FRAME", "GLASS", "FRAME"},
                        {"GLASS", "NONE", "GLASS"},
                        {"FRAME", "MAIN", "FRAME"}
                },
                {
                        {"FRAME", "FRAME", "FRAME"},
                        {"FRAME", "FRAME", "FRAME"},
                        {"FRAME", "FRAME", "FRAME"}
                }
        };

        Map<String, Predicate<BlockState>> blockConditions = new HashMap<>();
        blockConditions.put("FRAME", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get()));
        blockConditions.put("GLASS", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get()));
        blockConditions.put("PORT", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get()));
        blockConditions.put("MACHINE_FRAME", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get()));
        blockConditions.put("STORAGE", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()));
        blockConditions.put("BUS", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get()));
        blockConditions.put("ENERGY_STORAGE", blockState -> blockState.is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()));
        blockConditions.put("MAIN", blockState -> blockState.is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get()));

        // 基準ブロックの向きを取得
        Direction facing = state.getValue(BasicPowerSteamGeneratorBlock.FACING); // 必要に応じて取得方法を変更
        BlockPos basePos = blockEntity.getBlockPos();

        // 座標の範囲を定義
        int minX = -1, maxX = 1;
        int minY = -1, maxY = 1;
        int minZ = -2, maxZ = 0;

        // 各座標の変換を適用 (基準ブロックからの相対座標)
        for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
                for (int x = minX; x <= maxX; x++) {
                    // 配列内の対応する座標を計算
                    int arrayY = y - minY; // 配列のYインデックス
                    int arrayZ = z - minZ; // 配列のZインデックス
                    int arrayX = x - minX; // 配列のXインデックス

                    // 構造データから期待されるブロックタイプを取得
                    String expectedBlock = structure[arrayY][arrayZ][arrayX];

                    // "NONE" の場合はスキップ
                    if ("NONE".equals(expectedBlock)) continue;

                    // 相対座標を絶対座標に変換 (向きを考慮)
                    BlockPos relativePos = getRelativePos(basePos, x, y, z, facing);
                    BlockState targetState = level.getBlockState(relativePos);

                    // 条件に一致するか確認
                    Predicate<BlockState> condition = blockConditions.get(expectedBlock);
                    if (condition == null || !condition.test(targetState)) {
                        return false; // 条件に一致しない場合
                    }
                }
            }
        }

        // 全ての条件を満たした場合
        return true;
    }


    /**
     * 基準座標と相対座標から絶対座標を計算する
     *
     * @param basePos 基準座標
     * @param x       相対X座標
     * @param y       相対Y座標
     * @param z       相対Z座標
     * @param facing  基準ブロックの向き
     * @return 絶対座標
     */
    private static BlockPos getRelativePos(BlockPos basePos, int x, int y, int z, Direction facing) {
        return switch (facing) {
            case NORTH -> basePos.relative(Direction.WEST, x).relative(Direction.UP, y).relative(Direction.NORTH, z);
            case SOUTH -> basePos.relative(Direction.EAST, x).relative(Direction.UP, y).relative(Direction.SOUTH, z);
            case WEST -> basePos.relative(Direction.NORTH, x).relative(Direction.UP, y).relative(Direction.WEST, z);
            case EAST -> basePos.relative(Direction.SOUTH, x).relative(Direction.UP, y).relative(Direction.EAST, z);
            default -> basePos; // 想定外の方向は基準座標をそのまま返す
        };
    }


    public static boolean powered0_1(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;
        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                .is(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get());

        return blockEntity.powered0_1 = pos0;
    }


//    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
//        Direction dir = state.getValue(BasicPowerSteamGeneratorBlock.FACING);
//        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
//        Direction reX = dir.getCounterClockWise();
//        Direction reZ = dir;
//
//        if (blockEntity.itemHandler.getStackInSlot(1).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
//                || blockEntity.itemHandler.getStackInSlot(1).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos),
//                        DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//
//            if (blockEntity.formed0) {
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos),
//                            DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos),
//                            DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
//                            DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos),
//                            DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos),
//                            DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos),
//                            DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos)).isAir()) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos),
//                            DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                }
//
//                if (blockEntity.formed1) {
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos),
//                                DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos)).isAir()) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos),
//                                DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
//                    }
//                } else {
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
//                            .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
//                            .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
//                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//                    }
//                }
//            } else {
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
//                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
//                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
//                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
//                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
//                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
//                        .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
//                        .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
//                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//                }
//            }
//        } else {
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
//                    .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
//                    .is(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
//                    .is(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//        }
//
//        if (blockEntity.itemHandler.getStackInSlot(1).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
//                && blockEntity.formed0) {
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos)).isAir()) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos),
//                        DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get().defaultBlockState(), 1);
//            }
//        } else {
//            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
//                    .is(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get())) {
//                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
//            }
//        }
//
//    }
}
