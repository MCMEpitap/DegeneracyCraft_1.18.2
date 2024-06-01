package net.epitap.degeneracycraft.blocks.unique.basic.telescope;

import net.epitap.degeneracycraft.blocks.base.UniqueBlockBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class TelescopeRightPillarBlock extends UniqueBlockBase {
    public TelescopeRightPillarBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE_NORTH = Block.box(6, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 0, 10, 16, 16);
    private static final VoxelShape SHAPE_EAST = Block.box(0, 0, 6, 16, 16, 16);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 0, 0, 16, 16, 10);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext pContext) {
        Direction direction = state.getValue(FACING);
        if (direction == Direction.NORTH) {
            return SHAPE_NORTH;
        } else if (direction == Direction.SOUTH) {
            return SHAPE_SOUTH;
        } else if (direction == Direction.EAST) {
            return SHAPE_EAST;
        } else if (direction == Direction.WEST) {
            return SHAPE_WEST;
        }
        return SHAPE_NORTH;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
