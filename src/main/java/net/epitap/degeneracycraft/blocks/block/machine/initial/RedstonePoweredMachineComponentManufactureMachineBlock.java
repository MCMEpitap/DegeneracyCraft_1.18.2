package net.epitap.degeneracycraft.blocks.block.machine.initial;

import net.epitap.degeneracycraft.blocks.block.machine.BlockBase;
import net.epitap.degeneracycraft.blocks.entity.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.entity.machine.initial.RedstonePoweredMachineComponentManufactureMachineBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class RedstonePoweredMachineComponentManufactureMachineBlock extends BlockBase {

    public RedstonePoweredMachineComponentManufactureMachineBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onRemove(BlockState pState, Level level, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = level.getBlockEntity(pPos);
            if (blockEntity instanceof RedstonePoweredMachineComponentManufactureMachineBlockEntity) {
                ((RedstonePoweredMachineComponentManufactureMachineBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, level, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level level, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!level.isClientSide()) {
            BlockEntity entity = level.getBlockEntity(pPos);
            if(entity instanceof RedstonePoweredMachineComponentManufactureMachineBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer)pPlayer), (RedstonePoweredMachineComponentManufactureMachineBlockEntity)entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RedstonePoweredMachineComponentManufactureMachineBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state,
                                                                  @NotNull BlockEntityType<T> type) {
        return createTickerHelper(type, DCBlockEntities.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK_ENTITY.get(),
                RedstonePoweredMachineComponentManufactureMachineBlockEntity::tick);
    }

    @Nullable
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> createTickerHelper(BlockEntityType<A> pServerType, BlockEntityType<E> pClientType, BlockEntityTicker<? super E> pTicker) {
        return pClientType == pServerType ? (BlockEntityTicker<A>)pTicker : null;
    }
}
