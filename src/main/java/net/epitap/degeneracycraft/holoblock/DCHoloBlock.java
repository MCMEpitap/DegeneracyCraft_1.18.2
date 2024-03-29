package net.epitap.degeneracycraft.holoblock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DCHoloBlock extends Block {
    public DCHoloBlock(Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE =
            Block.box(0, 1, 0, 16, 16, 16);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext pContext) {
        return SHAPE;
    }


    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        return true;
    }
}
