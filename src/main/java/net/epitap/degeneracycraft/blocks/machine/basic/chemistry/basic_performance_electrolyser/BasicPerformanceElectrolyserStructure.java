package net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.dcenum.MBPPos;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceElectrolyserStructure {


    public static boolean isFormed(BasicPerformanceElectrolyserBlockEntity blockEntity) {
        return blockEntity.isFormed = blockEntity.formed0 && blockEntity.formed1 && blockEntity.formed2;
    }

    public static boolean isPowered0(BasicPerformanceElectrolyserBlockEntity blockEntity) {
        return blockEntity.isPowered0 = blockEntity.powered0_1 && blockEntity.isFormed;
    }


    public static boolean isFormed0(Level level, BlockPos pos, BlockState state, BasicPerformanceElectrolyserBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectrolyserBlock.FACING);
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;


        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z_2.xPos).above(MBPPos.x_2y_1z_2.yPos).relative(reZ, MBPPos.x_2y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z_2.xPos).above(MBPPos.x2y_1z_2.yPos).relative(reZ, MBPPos.x2y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z_1.xPos).above(MBPPos.x_2y_1z_1.yPos).relative(reZ, MBPPos.x_2y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos9 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z_1.xPos).above(MBPPos.x2y_1z_1.yPos).relative(reZ, MBPPos.x2y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos10 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z0.xPos).above(MBPPos.x_2y_1z0.yPos).relative(reZ, MBPPos.x_2y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos11 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());
        boolean pos12 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos13 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());
        boolean pos14 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z0.xPos).above(MBPPos.x2y_1z0.yPos).relative(reZ, MBPPos.x2y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());

        return blockEntity.formed0 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8 && pos9 && pos10
                && pos11 && pos12 && pos13 && pos14;
    }

    public static boolean isFormed1(Level level, BlockPos pos, BlockState state, BasicPerformanceElectrolyserBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectrolyserBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;


        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK.get());
        boolean pos9 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK.get());
        boolean pos10 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());

        return blockEntity.formed1 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8 && pos9 && pos10;
    }

    public static boolean isFormed2(Level level, BlockPos pos, BlockState state, BasicPerformanceElectrolyserBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectrolyserBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y1z_2.xPos).above(MBPPos.x_2y1z_2.yPos).relative(reZ, MBPPos.x_2y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y1z_2.xPos).above(MBPPos.x2y1z_2.yPos).relative(reZ, MBPPos.x2y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y1z_1.xPos).above(MBPPos.x_2y1z_1.yPos).relative(reZ, MBPPos.x_2y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos9 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y1z_1.xPos).above(MBPPos.x2y1z_1.yPos).relative(reZ, MBPPos.x2y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos10 = level.getBlockState(blockpos.relative(reX, MBPPos.x_2y1z0.xPos).above(MBPPos.x_2y1z0.yPos).relative(reZ, MBPPos.x_2y1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos11 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
        boolean pos12 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
                .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK.get());
        boolean pos13 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
        boolean pos14 = level.getBlockState(blockpos.relative(reX, MBPPos.x2y1z0.xPos).above(MBPPos.x2y1z0.yPos).relative(reZ, MBPPos.x2y1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());

        return blockEntity.formed2 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8 && pos9 && pos10
                && pos11 && pos12 && pos13 && pos14;

    }

    public static boolean powered0_1(Level level, BlockPos pos, BlockState state, BasicPerformanceElectrolyserBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectrolyserBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;
        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                .is(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_BLOCK.get());

        return blockEntity.powered0_1 = pos0;
    }


    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPerformanceElectrolyserBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectrolyserBlock.FACING);
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        if (blockEntity.itemHandler.getStackInSlot(3).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                || blockEntity.itemHandler.getStackInSlot(3).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z_2.xPos).above(MBPPos.x_2y_1z_2.yPos).relative(reZ, MBPPos.x_2y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y_1z_2.xPos).above(MBPPos.x_2y_1z_2.yPos).relative(reZ, MBPPos.x_2y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z_2.xPos).above(MBPPos.x2y_1z_2.yPos).relative(reZ, MBPPos.x2y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y_1z_2.xPos).above(MBPPos.x2y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z_1.xPos).above(MBPPos.x_2y_1z_1.yPos).relative(reZ, MBPPos.x_2y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y_1z_1.xPos).above(MBPPos.x_2y_1z_1.yPos).relative(reZ, MBPPos.x_2y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z_1.xPos).above(MBPPos.x2y_1z_1.yPos).relative(reZ, MBPPos.x2y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y_1z_1.xPos).above(MBPPos.x2y_1z_1.yPos).relative(reZ, MBPPos.x2y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z0.xPos).above(MBPPos.x_2y_1z0.yPos).relative(reZ, MBPPos.x_2y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y_1z0.xPos).above(MBPPos.x_2y_1z0.yPos).relative(reZ, MBPPos.x_2y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z0.xPos).above(MBPPos.x2y_1z0.yPos).relative(reZ, MBPPos.x2y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y_1z0.xPos).above(MBPPos.x2y_1z0.yPos).relative(reZ, MBPPos.x2y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (blockEntity.formed0) {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos),
                            DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos),
                            DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos),
                            DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }

                if (blockEntity.formed1) {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z0.xPos).above(MBPPos.x0y0z0.yPos).relative(reZ, MBPPos.x0y0z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y0z0.xPos).above(MBPPos.x0y0z0.yPos).relative(reZ, MBPPos.x0y0z0.zPos),
                                DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos),
                                DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                } else {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z0.xPos).above(MBPPos.x0y0z0.yPos).relative(reZ, MBPPos.x0y0z0.zPos))
                            .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y0z0.xPos).above(MBPPos.x0y0z0.yPos).relative(reZ, MBPPos.x0y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                }
            } else {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                        .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                        .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
            }
        } else {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z_2.xPos).above(MBPPos.x_2y_1z_2.yPos).relative(reZ, MBPPos.x_2y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y_1z_2.xPos).above(MBPPos.x_2y_1z_2.yPos).relative(reZ, MBPPos.x_2y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z_2.xPos).above(MBPPos.x2y_1z_2.yPos).relative(reZ, MBPPos.x2y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y_1z_2.xPos).above(MBPPos.x2y_1z_2.yPos).relative(reZ, MBPPos.x2y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z_1.xPos).above(MBPPos.x_2y_1z_1.yPos).relative(reZ, MBPPos.x_2y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y_1z_1.xPos).above(MBPPos.x_2y_1z_1.yPos).relative(reZ, MBPPos.x_2y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z_1.xPos).above(MBPPos.x2y_1z_1.yPos).relative(reZ, MBPPos.x2y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y_1z_1.xPos).above(MBPPos.x2y_1z_1.yPos).relative(reZ, MBPPos.x2y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y_1z0.xPos).above(MBPPos.x_2y_1z0.yPos).relative(reZ, MBPPos.x_2y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y_1z0.xPos).above(MBPPos.x_2y_1z0.yPos).relative(reZ, MBPPos.x_2y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y_1z0.xPos).above(MBPPos.x2y_1z0.yPos).relative(reZ, MBPPos.x2y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y_1z0.xPos).above(MBPPos.x2y_1z0.yPos).relative(reZ, MBPPos.x2y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }


            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                    .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                    .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }


            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_2.xPos).above(MBPPos.x_2y0z_2.yPos).relative(reZ, MBPPos.x_2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_2.xPos).above(MBPPos.x2y0z_2.yPos).relative(reZ, MBPPos.x2y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z_1.xPos).above(MBPPos.x_2y0z_1.yPos).relative(reZ, MBPPos.x_2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y0z_1.xPos).above(MBPPos.x2y0z_1.yPos).relative(reZ, MBPPos.x2y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_2y0z0.xPos).above(MBPPos.x_2y0z0.yPos).relative(reZ, MBPPos.x_2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z0.xPos).above(MBPPos.x0y0z0.yPos).relative(reZ, MBPPos.x0y0z0.zPos))
                    .is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z0.xPos).above(MBPPos.x0y0z0.yPos).relative(reZ, MBPPos.x0y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x2y0z0.xPos).above(MBPPos.x2y0z0.yPos).relative(reZ, MBPPos.x2y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
        }

        if (blockEntity.itemHandler.getStackInSlot(3).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
            if (blockEntity.formed0) {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos),
                            DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
            } else {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                        .is(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
            }
        }
    }
}
