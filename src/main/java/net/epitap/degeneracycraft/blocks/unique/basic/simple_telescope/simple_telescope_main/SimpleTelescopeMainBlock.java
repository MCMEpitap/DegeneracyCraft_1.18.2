package net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.simple_telescope_main;

import net.epitap.degeneracycraft.blocks.base.DCUniqueBlockEntities;
import net.epitap.degeneracycraft.blocks.base.UniqueBlockBase;
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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class SimpleTelescopeMainBlock extends UniqueBlockBase {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public SimpleTelescopeMainBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onRemove(BlockState pState, Level level, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = level.getBlockEntity(pPos);
            if (blockEntity instanceof SimpleTelescopeMainBlockEntity) {
                ((SimpleTelescopeMainBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, level, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level level, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!level.isClientSide()) {
            BlockEntity entity = level.getBlockEntity(pPos);

            if (entity instanceof SimpleTelescopeMainBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer) pPlayer), (SimpleTelescopeMainBlockEntity) entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SimpleTelescopeMainBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state,
                                                                  @NotNull BlockEntityType<T> type) {
        return createTickerHelper(type, DCUniqueBlockEntities.SIMPLE_TELESCOPE_MAIN_BLOCK_ENTITY.get(),
                SimpleTelescopeMainBlockEntity::tick);
    }

    @Nullable
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> createTickerHelper(BlockEntityType<A> pServerType, BlockEntityType<E> pClientType, BlockEntityTicker<? super E> pTicker) {
        return pClientType == pServerType ? (BlockEntityTicker<A>) pTicker : null;
    }
}
