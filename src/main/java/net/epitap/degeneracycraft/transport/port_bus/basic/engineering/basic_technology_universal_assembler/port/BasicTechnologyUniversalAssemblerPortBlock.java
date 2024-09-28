package net.epitap.degeneracycraft.transport.port_bus.basic.engineering.basic_technology_universal_assembler.port;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortBlockBase;
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
import net.minecraftforge.items.CapabilityItemHandler;

public class BasicTechnologyUniversalAssemblerPortBlock extends PortBlockBase {

    public BasicTechnologyUniversalAssemblerPortBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean enabledConnectTo(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockEntity blockEntity = world.getBlockEntity(pos.relative(facing));
        return (blockEntity != null && (blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, facing.getOpposite()).isPresent()
                || blockEntity.getBlockState().is(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get())));
    }

    @Override
    public boolean judgePort(LevelAccessor world, BlockPos pos, Direction facing) {
        BlockState blockState = world.getBlockState(pos.relative(facing));
        return blockState.getBlock().equals(this);
    }


    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BasicTechnologyUniversalAssemblerPortBlockEntity(pos, state);
    }

    @Override
    public InteractionResult portSideLaunch(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, Direction direction) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if ((blockentity instanceof BasicTechnologyUniversalAssemblerPortBlockEntity) && portExtracting(level, pos, direction)) {
            if (level.isClientSide) {
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.SUCCESS;
        }
        return super.portSideLaunch(state, level, pos, player, hand, hit, direction);
    }
}
