package net.epitap.degeneracycraft.transport.pipe.energy.floa;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.tag.DCTags;
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
import net.minecraftforge.energy.CapabilityEnergy;

public class FloatEnergyPipeBlock extends PipeBlockBase {
    protected FloatEnergyPipeBlock() {
        this.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID,"float_energy_pipe"));
    }

    public boolean enabledConnectTo(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockEntity blockEntity = world.getBlockEntity(pos.relative(facing));
        BlockState blockState = world.getBlockState(pos.relative(facing));
        return blockEntity != null && blockEntity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite()).isPresent()
                && blockState.is(DCTags.Blocks.DEGENERACYCRAFT_MACHINES);
    }


    public boolean judgePipe(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockState state = world.getBlockState(pos.relative(facing));
        return state.getBlock().equals(this);
    }
    public boolean judgePort(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockState state = world.getBlockState(pos.relative(facing));
        return state.getBlock().equals(this);
    }
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FloatEnergyPipeBlockEntity(pos, state);
    }

    public InteractionResult pipeSideLaunch(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, Direction facing) {
        BlockEntity blockentity = world.getBlockEntity(pos);
        if (blockentity instanceof FloatEnergyPipeBlockEntity && this.pipeExtracting(world, pos, facing)) {
            if (world.isClientSide) {
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.SUCCESS;
        }
        return super.pipeSideLaunch(state, world, pos, player, hand, hit, facing);
    }

}
