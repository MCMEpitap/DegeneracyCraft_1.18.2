package net.epitap.degeneracycraft.transport.port.portbase;

import net.epitap.degeneracycraft.item.DCCreativeTab;
import net.epitap.degeneracycraft.item.tool.WrenchItem;
import net.epitap.degeneracycraft.transport.parametor.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public abstract class PortBlockBase extends Block implements IItemBlock, SimpleWaterloggedBlock, EntityBlock {
    public static final BooleanProperty DOWN = BooleanProperty.create("down");
    public static final BooleanProperty UP = BooleanProperty.create("up");
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty HAS_DATA = BooleanProperty.create("has_data");
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected PortBlockBase() {
        super(Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(0.5F));

        registerDefaultState(stateDefinition.any()
                .setValue(UP, false)
                .setValue(DOWN, false)
                .setValue(NORTH, false)
                .setValue(SOUTH, false)
                .setValue(EAST, false)
                .setValue(WEST, false)
                .setValue(HAS_DATA, false)
                .setValue(WATERLOGGED, false)
        );
    }

    @Override
    public Item toItem() {
        return new BlockItem(this, new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB)).setRegistryName(getRegistryName());
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return new PipeBlockEntityTicker<>();
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        Direction side = getSelection(state, level, pos, player).getKey();
        if (side != null) {
            return portSideLaunch(state, level, pos, player, hand, hit, side);
        } else {
            return super.use(state, level, pos, player, hand, hit);
        }
    }

    public InteractionResult wrenchClicked(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, Direction side) {
        if (!player.isShiftKeyDown()) {
            return InteractionResult.PASS;
        }
        if (side != null) {
            if (level.getBlockState(pos.relative(side)).getBlock() != this) {
                boolean extracting = portExtracting(level, pos, side);
                if (extracting) {
                    setPortExtracting(level, pos, side, false);
                    setPortDisconnected(level, pos, side, true);
                } else {
                    setPortExtracting(level, pos, side, true);
                    setPortDisconnected(level, pos, side, false);
                }
            } else {
                setPortDisconnected(level, pos, side, true);
            }
        } else {
            side = hit.getDirection();
            if (level.getBlockState(pos.relative(side)).getBlock() != this) {
                setPortExtracting(level, pos, side, false);
                if (enableConnect(level, pos, side)) {
                    setPortDisconnected(level, pos, side, false);
                }
            } else {
                setPortDisconnected(level, pos, side, false);
                setPortDisconnected(level, pos.relative(side), side.getOpposite(), false);
            }

        }
        PortBlockEntityBase.detectPortBlock(level, pos);
        return InteractionResult.SUCCESS;
    }

    public InteractionResult portSideLaunch(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, Direction direction) {
        return super.use(state, level, pos, player, hand, hit);
    }

    public InteractionResult wrenchPortSideLaunch(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, @Nullable Direction side) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (WrenchItem.isWrench(heldItem)) {
            return wrenchClicked(state, world, pos, player, hand, hit, side);
        }

        return InteractionResult.PASS;
    }

    public BooleanProperty getDirectionProperty(Direction side) {
        switch (side) {
            case NORTH:
                return NORTH;
            case SOUTH:
                return SOUTH;
            case EAST:
                return EAST;
            case WEST:
                return WEST;
            case UP:
                return UP;
            case DOWN:
            default:
                return DOWN;
        }
    }

    public boolean portExtracting(LevelAccessor world, BlockPos pos, Direction side) {
        PortBlockEntityBase port = getBlockEntity(world, pos);
        if (port == null) {
            return false;
        }
        return port.portExtracting(side);
    }

    public boolean portDisconnected(LevelAccessor world, BlockPos pos, Direction side) {
        PortBlockEntityBase port = getBlockEntity(world, pos);
        if (port == null) {
            return false;
        }
        return port.portDisconnected(side);
    }

    public void setHasData(Level world, BlockPos pos, boolean hasData) {
        BlockState blockState = world.getBlockState(pos);
        world.setBlockAndUpdate(pos, blockState.setValue(HAS_DATA, hasData));
    }

    public void setPortExtracting(Level world, BlockPos pos, Direction side, boolean extracting) {
        PortBlockEntityBase portEntity = getBlockEntity(world, pos);
        if (portEntity == null) {
            if (extracting) {
                setHasData(world, pos, true);
                portEntity = getBlockEntity(world, pos);
                if (portEntity != null) {
                    portEntity.setPortExtracting(side, extracting);
                }
            }
        } else {
            portEntity.setPortExtracting(side, extracting);
            if (!portEntity.hasReasonToStay()) {
                setHasData(world, pos, false);
            }
        }
        BlockState blockState = world.getBlockState(pos);
        BooleanProperty sideProperty = getDirectionProperty(side);
        boolean connected = blockState.getValue(sideProperty);
        world.setBlockAndUpdate(pos, blockState.setValue(sideProperty, !connected));
        world.setBlockAndUpdate(pos, blockState.setValue(sideProperty, connected));
    }

    public void setPortDisconnected(Level world, BlockPos pos, Direction side, boolean disconnected) {
        PortBlockEntityBase portEntity = getBlockEntity(world, pos);
        if (portEntity == null) {
            if (disconnected) {
                setHasData(world, pos, true);
                portEntity = getBlockEntity(world, pos);
                if (portEntity != null) {
                    portEntity.setPortDisconnected(side, disconnected);
                    world.setBlockAndUpdate(pos, world.getBlockState(pos).setValue(getDirectionProperty(side), false));
                }
            }
        } else {
            portEntity.setPortDisconnected(side, disconnected);
            if (!portEntity.hasReasonToStay()) {
                setHasData(world, pos, false);
            }
            world.setBlockAndUpdate(pos, world.getBlockState(pos).setValue(getDirectionProperty(side), !disconnected));
        }
    }

    public PortBlockEntityBase getBlockEntity(LevelAccessor world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof PortBlockEntityBase) {
            return (PortBlockEntityBase) blockEntity;
        }
        return null;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return getBlockState(context.getLevel(), context.getClickedPos(), null);
    }

    private BlockState getBlockState(Level world, BlockPos pos, @Nullable BlockState oldState) {
        FluidState fluidState = world.getFluidState(pos);
        boolean hasData = false;
        if (oldState != null && oldState.getBlock() == this) {
            hasData = oldState.getValue(HAS_DATA);
        }
        return defaultBlockState()
                .setValue(UP, portConnected(world, pos, Direction.UP))
                .setValue(DOWN, portConnected(world, pos, Direction.DOWN))
                .setValue(NORTH, portConnected(world, pos, Direction.NORTH))
                .setValue(SOUTH, portConnected(world, pos, Direction.SOUTH))
                .setValue(EAST, portConnected(world, pos, Direction.EAST))
                .setValue(WEST, portConnected(world, pos, Direction.WEST))
                .setValue(HAS_DATA, hasData)
                .setValue(WATERLOGGED, fluidState.is(FluidTags.WATER) && fluidState.getAmount() == 8);
    }

    public boolean portConnected(LevelAccessor world, BlockPos pos, Direction facing) {
        PortBlockEntityBase port = getBlockEntity(world, pos);
        PortBlockEntityBase other = getBlockEntity(world, pos.relative(facing));

        if (!enableConnect(world, pos, facing)) {
            return false;
        }
        boolean canSelfConnect = port == null || !port.portDisconnected(facing);
        if (!canSelfConnect) {
            return false;
        }
        boolean canSideConnect = other == null || !other.portDisconnected(facing.getOpposite());
        return canSideConnect;
    }

    public boolean enableConnect(LevelAccessor world, BlockPos pos, Direction facing) {
        return judgePort(world, pos, facing) || enabledConnectTo(world, pos, facing);
    }

    public abstract boolean enabledConnectTo(LevelAccessor world, BlockPos pos, Direction facing);

    public abstract boolean judgePort(LevelAccessor world, BlockPos pos, Direction facing);

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos toPos, Block block, BlockPos fromPos, boolean b) {
        super.neighborChanged(state, world, toPos, block, fromPos, b);
        BlockState newState = getBlockState(world, toPos, state);
        if (!state.getProperties().stream().allMatch(property -> state.getValue(property).equals(newState.getValue(property)))) {
            world.setBlockAndUpdate(toPos, newState);
            PortBlockEntityBase.detectPortBlock(world, toPos);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(UP, DOWN, NORTH, SOUTH, EAST, WEST, HAS_DATA, WATERLOGGED);
    }

    public static final VoxelShape SHAPE_NORTH = Block.box(0D, 0D, 0D, 16D, 16D, 1D);
    public static final VoxelShape SHAPE_SOUTH = Block.box(0D, 0D, 15D, 16D, 16D, 16D);
    public static final VoxelShape SHAPE_EAST = Block.box(15D, 0D, 0D, 16D, 16D, 16D);
    public static final VoxelShape SHAPE_WEST = Block.box(0D, 0D, 0D, 1D, 16D, 16D);
    public static final VoxelShape SHAPE_UP = Block.box(0D, 15D, 0D, 16D, 16D, 16D);
    public static final VoxelShape SHAPE_DOWN = Block.box(0D, 0D, 0D, 16D, 1D, 16D);
    public static final VoxelShape SHAPE_CORE = Block.box(1D, 1D, 1D, 15D, 15D, 15D);
    public static final VoxelShape SHAPE_EXTRACT_NORTH = TransportVoxelShape.combine(SHAPE_NORTH, Block.box(0D, 0D, 0D, 16D, 16D, 2D));
    public static final VoxelShape SHAPE_EXTRACT_SOUTH = TransportVoxelShape.combine(SHAPE_SOUTH, Block.box(0D, 0D, 14D, 16D, 16D, 16D));
    public static final VoxelShape SHAPE_EXTRACT_EAST = TransportVoxelShape.combine(SHAPE_EAST, Block.box(14D, 0D, 0D, 16D, 16D, 16D));
    public static final VoxelShape SHAPE_EXTRACT_WEST = TransportVoxelShape.combine(SHAPE_WEST, Block.box(0D, 0D, 0D, 2D, 16D, 16D));
    public static final VoxelShape SHAPE_EXTRACT_UP = TransportVoxelShape.combine(SHAPE_UP, Block.box(0D, 14D, 0D, 16D, 16D, 16D));
    public static final VoxelShape SHAPE_EXTRACT_DOWN = TransportVoxelShape.combine(SHAPE_DOWN, Block.box(0D, 0D, 0D, 16D, 2D, 16D));


    public VoxelShape getShape(BlockGetter blockReader, BlockPos pos, BlockState state, boolean advanced) {
        PortBlockEntityBase port = null;
        if (advanced && blockReader instanceof LevelAccessor) {
            port = getBlockEntity((LevelAccessor) blockReader, pos);
        }

        VoxelShape shape = SHAPE_CORE;
        if (state.getValue(UP)) {
            if (port != null && port.portExtracting(Direction.UP)) {
                shape = TransportVoxelShape.combine(shape, SHAPE_EXTRACT_UP);
            } else {
                shape = TransportVoxelShape.combine(shape, SHAPE_UP);
            }
        }
        if (state.getValue(DOWN)) {
            if (port != null && port.portExtracting(Direction.DOWN)) {
                shape = TransportVoxelShape.combine(shape, SHAPE_EXTRACT_DOWN);
            } else {
                shape = TransportVoxelShape.combine(shape, SHAPE_DOWN);
            }
        }
        if (state.getValue(SOUTH)) {
            if (port != null && port.portExtracting(Direction.SOUTH)) {
                shape = TransportVoxelShape.combine(shape, SHAPE_EXTRACT_SOUTH);
            } else {
                shape = TransportVoxelShape.combine(shape, SHAPE_SOUTH);
            }
        }
        if (state.getValue(NORTH)) {
            if (port != null && port.portExtracting(Direction.NORTH)) {
                shape = TransportVoxelShape.combine(shape, SHAPE_EXTRACT_NORTH);
            } else {
                shape = TransportVoxelShape.combine(shape, SHAPE_NORTH);
            }
        }
        if (state.getValue(EAST)) {
            if (port != null && port.portExtracting(Direction.EAST)) {
                shape = TransportVoxelShape.combine(shape, SHAPE_EXTRACT_EAST);
            } else {
                shape = TransportVoxelShape.combine(shape, SHAPE_EAST);
            }
        }
        if (state.getValue(WEST)) {
            if (port != null && port.portExtracting(Direction.WEST)) {
                shape = TransportVoxelShape.combine(shape, SHAPE_EXTRACT_WEST);
            } else {
                shape = TransportVoxelShape.combine(shape, SHAPE_WEST);
            }
        }
        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (context instanceof EntityCollisionContext collisionContext) {
            if (collisionContext.getEntity() instanceof Player player) {
                if (player.level.isClientSide) {
                    return getSelectionShape(state, level, pos, player);
                }
            }
        }
        return getShape(level, pos, state, true);
    }

    public VoxelShape getSelectionShape(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        Value2D<Direction, VoxelShape> selection = getSelection(state, world, pos, player);

        if (selection.getKey() == null) {
            return getShape(world, pos, state, true);
        }

        if (world.getBlockState(pos.relative(selection.getKey())).getBlock() == this) {
            if (!WrenchItem.isHoldingWrench(player)) {
                return getShape(world, pos, state, true);
            }
        }

        return selection.getValue();
    }

    private static final List<Value3D<VoxelShape, BooleanProperty, Direction>> SHAPES = Arrays.asList(
            new Value3D<>(SHAPE_NORTH, NORTH, Direction.NORTH),
            new Value3D<>(SHAPE_SOUTH, SOUTH, Direction.SOUTH),
            new Value3D<>(SHAPE_WEST, WEST, Direction.WEST),
            new Value3D<>(SHAPE_EAST, EAST, Direction.EAST),
            new Value3D<>(SHAPE_UP, UP, Direction.UP),
            new Value3D<>(SHAPE_DOWN, DOWN, Direction.DOWN)
    );

    private static final List<Value2D<VoxelShape, Direction>> EXTRACT_SHAPES = Arrays.asList(
            new Value2D<>(SHAPE_EXTRACT_NORTH, Direction.NORTH),
            new Value2D<>(SHAPE_EXTRACT_SOUTH, Direction.SOUTH),
            new Value2D<>(SHAPE_EXTRACT_WEST, Direction.WEST),
            new Value2D<>(SHAPE_EXTRACT_EAST, Direction.EAST),
            new Value2D<>(SHAPE_EXTRACT_UP, Direction.UP),
            new Value2D<>(SHAPE_EXTRACT_DOWN, Direction.DOWN)
    );

    public Value2D<Direction, VoxelShape> getSelection(BlockState state, BlockGetter blockReader, BlockPos pos, Player player) {
        Vec3 start = player.getEyePosition(1F);
        Vec3 end = start.add(player.getLookAngle().normalize().scale(getBlockReachDistance(player)));

        Direction direction = null;
        VoxelShape voxelShape = null;
        double shortest = Double.MAX_VALUE;

        double d = checkShape(state, blockReader, pos, start, end, SHAPE_CORE, null);
        if (d < shortest) {
            shortest = d;
        }

        if (!(blockReader instanceof LevelAccessor)) {
            return new Value2D<>(direction, voxelShape);
        }

        PortBlockEntityBase port = getBlockEntity((LevelAccessor) blockReader, pos);

        for (int i = 0; i < Direction.values().length; i++) {
            Value2D<VoxelShape, Direction> extract = EXTRACT_SHAPES.get(i);
            Value3D<VoxelShape, BooleanProperty, Direction> shape = SHAPES.get(i);
            if (port != null && port.portExtracting(extract.getValue())) {
                d = checkShape(state, blockReader, pos, start, end, extract.getKey(), port, extract.getValue());
                if (d < shortest) {
                    shortest = d;
                    direction = extract.getValue();
                    voxelShape = extract.getKey();
                }
            } else {
                d = checkShape(state, blockReader, pos, start, end, shape.getValue1(), shape.getValue2());
                if (d < shortest) {
                    shortest = d;
                    direction = shape.getValue3();
                    voxelShape = shape.getValue1();
                }
            }
        }
        return new Value2D<>(direction, voxelShape);
    }

    public float getBlockReachDistance(Player player) {
        float distance = (float) player.getAttribute(net.minecraftforge.common.ForgeMod.REACH_DISTANCE.get()).getValue();
        return player.isCreative() ? distance : distance - 0.5F;
    }

    private double checkShape(BlockState state, BlockGetter world, BlockPos pos, Vec3 start, Vec3 end, VoxelShape shape, BooleanProperty direction) {
        if (direction != null && !state.getValue(direction)) {
            return Double.MAX_VALUE;
        }
        BlockHitResult blockRayTraceResult = world.clipWithInteractionOverride(start, end, pos, shape, state);
        if (blockRayTraceResult == null) {
            return Double.MAX_VALUE;
        }
        return blockRayTraceResult.getLocation().distanceTo(start);
    }

    private double checkShape(BlockState state, BlockGetter world, BlockPos pos, Vec3 start, Vec3 end, VoxelShape shape, @Nullable PortBlockEntityBase port, Direction side) {
        if (port != null && !port.portExtracting(side)) {
            return Double.MAX_VALUE;
        }
        BlockHitResult blockRayTraceResult = world.clipWithInteractionOverride(start, end, pos, shape, state);
        if (blockRayTraceResult == null) {
            return Double.MAX_VALUE;
        }
        return blockRayTraceResult.getLocation().distanceTo(start);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.is(newState.getBlock())) {
            if (!newState.getValue(HAS_DATA)) {
                level.removeBlockEntity(pos);
            }
        }
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter level, BlockPos pos) {
        return getShape(level, pos, state, false);
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return getShape(reader, pos, state, false);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getShape(level, pos, state, false);
    }

    @Override
    public VoxelShape getBlockSupportShape(BlockState state, BlockGetter reader, BlockPos pos) {
        return getShape(reader, pos, state, false);
    }

    @Override
    public VoxelShape getInteractionShape(BlockState state, BlockGetter level, BlockPos pos) {
        return getShape(level, pos, state, false);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (state.getValue(HAS_DATA)) {
            return createBlockEntity(pos, state);
        } else {
            return null;
        }
    }

    public abstract BlockEntity createBlockEntity(BlockPos pos, BlockState state);
}
