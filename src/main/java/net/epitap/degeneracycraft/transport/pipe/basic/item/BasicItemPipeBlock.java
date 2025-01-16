package net.epitap.degeneracycraft.transport.pipe.basic.item;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlockBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.items.CapabilityItemHandler;

public class BasicItemPipeBlock extends PipeBlockBase {
    public BasicItemPipeBlock() {
        setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_item_pipe"));
    }

    @Override
    public boolean enabledConnectTo(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockEntity blockEntity = world.getBlockEntity(pos.relative(facing));
        return (blockEntity != null && blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, facing.getOpposite()).isPresent());
    }

    @Override
    public boolean judgePipe(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockState blockState = world.getBlockState(pos.relative(facing));
        return blockState.getBlock().equals(this);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BasicItemPipeEntity(pos, state);
    }

    @Override
    public InteractionResult pipeSideLaunch(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, Direction direction) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if ((blockentity instanceof BasicItemPipeEntity) && pipeExtracting(level, pos, direction)) {
            if (level.isClientSide) {
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.SUCCESS;
        }
        return super.pipeSideLaunch(state, level, pos, player, hand, hit, direction);
    }
}
