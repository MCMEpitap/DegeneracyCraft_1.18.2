package net.epitap.degeneracycraft.blocks.machine.basic.dynamic_physics.basic_performance_electric_arc_furnace;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.dcenum.MBPPos;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class BasicPerformanceElectricArcFurnaceStructure {
    public static boolean isFormed(BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        return blockEntity.isFormed = blockEntity.formed0 && blockEntity.formed1 && blockEntity.formed2;
    }

    public static boolean isPowered0(BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        return blockEntity.isPowered0 = blockEntity.powered0_1 && blockEntity.isFormed;
    }


    public static boolean isFormed0(Level level, BlockPos pos, BlockState state, BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectricArcFurnaceBlock.FACING);
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());

        return blockEntity.formed0 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8;
    }

    public static boolean isFormed1(Level level, BlockPos pos, BlockState state, BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectricArcFurnaceBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;


        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK.get());

        return blockEntity.formed1 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6;
    }

    public static boolean isFormed2(Level level, BlockPos pos, BlockState state, BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectricArcFurnaceBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
                .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK.get());
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());

        return blockEntity.formed2 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8;
    }

    public static boolean powered0_1(Level level, BlockPos pos, BlockState state, BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectricArcFurnaceBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;
        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                .is(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_BLOCK.get());

        return blockEntity.powered0_1 = pos0;
    }


    public static void hologram(Level level, BlockPos pos, BlockState state, BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPerformanceElectricArcFurnaceBlock.FACING);
        BlockPos blockpos = new BlockPos(blockEntity.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        if (blockEntity.itemHandler.getStackInSlot(10).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                || blockEntity.itemHandler.getStackInSlot(10).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
            }

            if (blockEntity.formed0) {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos),
                            DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos),
                            DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get().defaultBlockState(), 1);
                }

                if (blockEntity.formed1) {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos),
                                DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos),
                                DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                } else {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
                            .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                }
            } else {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                        .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                        .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
            }
        } else {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z0.xPos).above(MBPPos.x_1y_1z0.yPos).relative(reZ, MBPPos.x_1y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z0.xPos).above(MBPPos.x1y_1z0.yPos).relative(reZ, MBPPos.x1y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }

            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos))
                    .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z0.xPos).above(MBPPos.x_1y0z0.yPos).relative(reZ, MBPPos.x_1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos))
                    .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z0.xPos).above(MBPPos.x1y0z0.yPos).relative(reZ, MBPPos.x1y0z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }

            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_1.xPos).above(MBPPos.x_1y1z_1.yPos).relative(reZ, MBPPos.x_1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_1.xPos).above(MBPPos.x1y1z_1.yPos).relative(reZ, MBPPos.x1y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z0.xPos).above(MBPPos.x_1y1z0.yPos).relative(reZ, MBPPos.x_1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos))
                    .is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z0.xPos).above(MBPPos.x0y1z0.yPos).relative(reZ, MBPPos.x0y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z0.xPos).above(MBPPos.x1y1z0.yPos).relative(reZ, MBPPos.x1y1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
        }

        if (blockEntity.itemHandler.getStackInSlot(10).is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                && blockEntity.formed0) {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos),
                        DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
        } else {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                    .is(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
        }
    }
}
