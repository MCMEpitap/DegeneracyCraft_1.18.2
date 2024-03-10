//package net.epitap.degeneracycraft.blocks.block.machine;
//
//import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
//import net.minecraft.ChatFormatting;
//import net.minecraft.core.BlockPos;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResult;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.TooltipFlag;
//import net.minecraft.world.item.context.BlockPlaceContext;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.*;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityTicker;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.StateDefinition;
//import net.minecraft.world.level.block.state.properties.BlockStateProperties;
//import net.minecraft.world.level.block.state.properties.DirectionProperty;
//import net.minecraft.world.phys.BlockHitResult;
//import net.minecraft.world.phys.shapes.CollisionContext;
//import net.minecraft.world.phys.shapes.VoxelShape;
//import net.minecraftforge.network.NetworkHooks;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.List;
//
//public class UniversalAssemblerPhase2Block extends BaseEntityBlock {
//
//    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
//
//    public UniversalAssemblerPhase2Block(Properties properties) {
//        super(properties);
//    }
//
//    @Override
//    public void appendHoverText(ItemStack stack, @javax.annotation.Nullable BlockGetter reader, List<Component> list, TooltipFlag flags) {
//        list.add(new TranslatableComponent("message.degeneracycraft_assembler").withStyle(ChatFormatting.WHITE));
//    }
//    private static final VoxelShape SHAPE =  Block.box(0, 0, 0, 16, 16, 16);
//
//    @Override
//    public VoxelShape getShape(BlockState pState, BlockGetter level, BlockPos pPos, CollisionContext pContext) {
//        return SHAPE;
//    }
//
//    /* FACING */
//
//    @Override
//    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
//        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
//    }
//
//    @Override
//    public BlockState rotate(BlockState pState, Rotation pRotation) {
//        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
//    }
//
//    @Override
//    public BlockState mirror(BlockState pState, Mirror pMirror) {
//        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
//    }
//
//    @Override
//    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
//        pBuilder.add(FACING);
//    }
//
//    /* BLOCK ENTITY */
//
//    @Override
//    public RenderShape getRenderShape(BlockState pState) {
//        return RenderShape.MODEL;
//    }
//
//    @Override
//    public void onRemove(BlockState pState, Level level, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
//        if (pState.getBlock() != pNewState.getBlock()) {
//            BlockEntity blockEntity = level.getBlockEntity(pPos);
//            if (blockEntity instanceof UniversalAssemblerPhase2BlockEntity) {
//                ((UniversalAssemblerPhase2BlockEntity) blockEntity).drops();
//            }
//        }
//        super.onRemove(pState, level, pPos, pNewState, pIsMoving);
//    }
//
//    @Override
//    public InteractionResult use(BlockState pState, Level level, BlockPos pPos,
//                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
//        if (!level.isClientSide()) {
//            BlockEntity entity = level.getBlockEntity(pPos);
//            if(entity instanceof UniversalAssemblerPhase2BlockEntity) {
//                NetworkHooks.openGui(((ServerPlayer)pPlayer), (UniversalAssemblerPhase2BlockEntity)entity, pPos);
//            } else {
//                throw new IllegalStateException("Our Container provider is missing!");
//            }
//        }
//
//        return InteractionResult.sidedSuccess(level.isClientSide());
//    }
//
//    @Nullable
//    @Override
//    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
//        return new UniversalAssemblerPhase2BlockEntity(pPos, pState);
//    }
//
//    @Nullable
//    @Override
//    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState pState, BlockEntityType<T> blockEntityType) {
//        return createTickerHelper(blockEntityType, DCBlockEntities.UNIVERSAL_ASSEMBLER_PHASE2_BLOCK_ENTITY.get(),
//                UniversalAssemblerPhase2BlockEntity::tick);
//    }
//}
