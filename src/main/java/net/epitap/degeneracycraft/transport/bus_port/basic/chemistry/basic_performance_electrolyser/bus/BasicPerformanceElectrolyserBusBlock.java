package net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.bus;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortBlockBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.energy.CapabilityEnergy;

public class BasicPerformanceElectrolyserBusBlock extends PortBlockBase {

    public BasicPerformanceElectrolyserBusBlock(Properties properties) {
        super();
    }

    public boolean enabledConnectTo(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockEntity blockEntity = world.getBlockEntity(pos.relative(facing));
        return blockEntity != null && (blockEntity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite()).isPresent()
                || (blockEntity.getBlockState().is(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.get())
                && blockEntity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite()).isPresent()));
    }

    public boolean judgePort(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockState state = world.getBlockState(pos.relative(facing));
        return state.getBlock().equals(this);
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BasicPerformanceElectrolyserBusBlockEntity(pos, state);
    }

    public InteractionResult portSideLaunch(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, Direction facing) {
        BlockEntity blockentity = world.getBlockEntity(pos);
        if (blockentity instanceof BasicPerformanceElectrolyserBusBlockEntity && this.portExtracting(world, pos, facing)) {
            if (world.isClientSide) {
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.SUCCESS;
        }
        return super.portSideLaunch(state, world, pos, player, hand, hit, facing);
    }
}
