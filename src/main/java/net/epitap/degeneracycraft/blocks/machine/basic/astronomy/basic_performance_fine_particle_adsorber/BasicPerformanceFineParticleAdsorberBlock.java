package net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber;

import net.epitap.degeneracycraft.blocks.base.BlockBase;
import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class BasicPerformanceFineParticleAdsorberBlock extends BlockBase {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public BasicPerformanceFineParticleAdsorberBlock(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level level, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = level.getBlockEntity(pPos);
            if (blockEntity instanceof BasicPerformanceFineParticleAdsorberBlockEntity) {
                ((BasicPerformanceFineParticleAdsorberBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, level, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level level, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!level.isClientSide()) {
            BlockEntity entity = level.getBlockEntity(pPos);
            if (entity instanceof BasicPerformanceFineParticleAdsorberBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer) pPlayer), (BasicPerformanceFineParticleAdsorberBlockEntity) entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new BasicPerformanceFineParticleAdsorberBlockEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState pState, BlockEntityType<T> blockEntityType) {
        return createTickerHelper(blockEntityType, DCBlockEntities.BASIC_PERFORMANCE_FINE_PARTICLE_ADSORBER_BLOCK_ENTITY.get(),
                BasicPerformanceFineParticleAdsorberBlockEntity::tick);
    }

    @javax.annotation.Nullable
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> createTickerHelper(BlockEntityType<A> pServerType, BlockEntityType<E> pClientType, BlockEntityTicker<? super E> pTicker) {
        return pClientType == pServerType ? (BlockEntityTicker<A>) pTicker : null;
    }
}

