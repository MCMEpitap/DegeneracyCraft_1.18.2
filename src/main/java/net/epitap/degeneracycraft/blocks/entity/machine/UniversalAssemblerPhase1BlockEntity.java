package net.epitap.degeneracycraft.blocks.entity.machine;

import net.epitap.degeneracycraft.blocks.block.machine.UniversalAssemblerPhase1Block;
import net.epitap.degeneracycraft.blocks.entity.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.menu.machine.UniversalAssemblerPhase1Menu;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.util.WrappedHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Map;


public class UniversalAssemblerPhase1BlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(10) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return super.isItemValid(slot, stack);
        }

        ;
    };


    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            Map.of(Direction.DOWN, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 2, (in, stack) -> false)),
                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (in, stack) -> itemHandler.isItemValid(1, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 9, (in, stack) -> false)),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (in, stack) -> itemHandler.isItemValid(1, stack))),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1 || out == 2, (in, stack) -> itemHandler.isItemValid(1, stack) || itemHandler.isItemValid(2, stack))));


    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;


    public UniversalAssemblerPhase1BlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.UNIVERSAL_ASSEMBLER_PHASE1_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0:
                        return UniversalAssemblerPhase1BlockEntity.this.progress;
                    case 1:
                        return UniversalAssemblerPhase1BlockEntity.this.maxProgress;
                    default:
                        return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        UniversalAssemblerPhase1BlockEntity.this.progress = value;
                        break;
                    case 1:
                        UniversalAssemblerPhase1BlockEntity.this.maxProgress = value;
                        break;
                }
            }

            public int getCount() {
                return 2;
            }
        };

    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new UniversalAssemblerPhase1Menu(pContainerId, pInventory, this, this.data);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }

            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(UniversalAssemblerPhase1Block.FACING);

                if (side == Direction.UP || side == Direction.DOWN) {
                    return directionWrappedHandlerMap.get(side).cast();
                }

                return switch (localDir) {
                    default -> directionWrappedHandlerMap.get(side.getOpposite()).cast();
                    case EAST -> directionWrappedHandlerMap.get(side.getClockWise()).cast();
                    case SOUTH -> directionWrappedHandlerMap.get(side).cast();
                    case WEST -> directionWrappedHandlerMap.get(side.getCounterClockWise()).cast();
                };
            }
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

//    @Override
//    protected void saveAdditional(@NotNull CompoundTag tag) {
//        tag.put("inventory", itemHandler.serializeNBT());
//        tag.putInt("pulverization.progress", progress);
//        super.saveAdditional(tag);
//    }

//    @Override
//    public void load(CompoundTag nbt) {
//        super.load(nbt);
//        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
//        progress = nbt.getInt("pulverization.progress");
//    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    private static boolean form(Level level, int pX, int pY, int pZ) {

        boolean formed = level.getBlockState(new BlockPos(pX, pY - 1, pZ)).is(Blocks.CHEST);
//                && level.getBlockState(new BlockPos(pX, pY-1, pZ)).is(Blocks.CHEST);
        return formed;
    }

    boolean formed;


    public static void tick(Level level, BlockPos pPos, BlockState pState, UniversalAssemblerPhase1BlockEntity blockEntity) {
        int i = pPos.getX();
        int j = pPos.getY();
        int k = pPos.getZ();
        blockEntity.formed = form(level, i, j, k);

        if (blockEntity.formed) {
            if ((iron_boltRecipe(blockEntity)
                    || iron_keyRecipe(blockEntity)
                    || iron_springRecipe(blockEntity)
                    || iron_rodRecipe(blockEntity)
                    || iron_bearingRecipe(blockEntity))
                    && hasNotReachedStackLimit(blockEntity)) {
                setChanged(level, pPos, pState);
                blockEntity.progress++;

                if (iron_boltRecipe(blockEntity) && blockEntity.progress > blockEntity.maxProgress
                        && ((blockEntity.itemHandler.getStackInSlot(9).getItem() == DCItems.IRON_BOLT.get())
                        || (blockEntity.itemHandler.getStackInSlot(9).isEmpty()))) {
                    iron_boltCraft(blockEntity);
                    blockEntity.itemHandler.setStackInSlot(9, new ItemStack(DCItems.IRON_BOLT.get(),
                            blockEntity.itemHandler.getStackInSlot(9).getCount() + 1));
                } else {

                }

                if (iron_keyRecipe(blockEntity) && blockEntity.progress > blockEntity.maxProgress
                        && ((blockEntity.itemHandler.getStackInSlot(9).getItem() == DCItems.IRON_KEY.get())
                        || (blockEntity.itemHandler.getStackInSlot(9).isEmpty()))) {
                    iron_keyCraft(blockEntity);
                    blockEntity.itemHandler.setStackInSlot(9, new ItemStack(DCItems.IRON_KEY.get(),
                            blockEntity.itemHandler.getStackInSlot(9).getCount() + 1));
                }
            } else {
                blockEntity.resetProgress();
                setChanged(level, pPos, pState);
            }
        } else {
            blockEntity.resetProgress();
            setChanged(level, pPos, pState);
        }

    }


    private static boolean iron_boltRecipe(UniversalAssemblerPhase1BlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(4).getItem() == Items.IRON_INGOT;
        boolean otherslot
                 = entity.itemHandler.getStackInSlot(0).isEmpty()
                && entity.itemHandler.getStackInSlot(2).isEmpty()
                && entity.itemHandler.getStackInSlot(3).isEmpty()
                && entity.itemHandler.getStackInSlot(5).isEmpty()
                && entity.itemHandler.getStackInSlot(6).isEmpty()
                && entity.itemHandler.getStackInSlot(7).isEmpty()
                && entity.itemHandler.getStackInSlot(8).isEmpty();
        return slot1 && slot2 && otherslot;
    }


    private static void iron_boltCraft(UniversalAssemblerPhase1BlockEntity entity) {
        entity.itemHandler.extractItem(1, 1, false);
        entity.itemHandler.extractItem(4, 1, false);
        entity.resetProgress();
    }

    private static boolean iron_keyRecipe(UniversalAssemblerPhase1BlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(3).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(4).getItem() == Items.IRON_INGOT;
        boolean slot3 = entity.itemHandler.getStackInSlot(5).getItem() == Items.IRON_INGOT;
        return slot1 && slot2 && slot3;
    }


    private static void iron_keyCraft(UniversalAssemblerPhase1BlockEntity entity) {
        entity.itemHandler.extractItem(3, 1, false);
        entity.itemHandler.extractItem(4, 1, false);
        entity.itemHandler.extractItem(5, 1, false);
        entity.resetProgress();
    }

    private static boolean iron_springRecipe(UniversalAssemblerPhase1BlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(4).getItem() == Items.IRON_INGOT;
        boolean slot3 = entity.itemHandler.getStackInSlot(7).getItem() == Items.IRON_INGOT;
        return slot1 && slot2 && slot3;
    }


    private static void iron_springCraft(UniversalAssemblerPhase1BlockEntity entity) {

        entity.itemHandler.extractItem(1, 1, false);
        entity.itemHandler.extractItem(4, 1, false);
        entity.itemHandler.extractItem(7, 1, false);

        entity.itemHandler.setStackInSlot(9, new ItemStack(DCItems.IRON_SPRING.get(),
                entity.itemHandler.getStackInSlot(9).getCount() + 1));

        entity.resetProgress();
    }

    private static boolean iron_rodRecipe(UniversalAssemblerPhase1BlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(2).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(4).getItem() == Items.IRON_INGOT;
        boolean slot3 = entity.itemHandler.getStackInSlot(6).getItem() == Items.IRON_INGOT;
        return slot1 && slot2 && slot3;
    }


    private static void iron_rodCraft(UniversalAssemblerPhase1BlockEntity entity) {

        entity.itemHandler.extractItem(2, 1, false);
        entity.itemHandler.extractItem(4, 1, false);
        entity.itemHandler.extractItem(6, 1, false);

        entity.itemHandler.setStackInSlot(9, new ItemStack(DCItems.IRON_KEY.get(),
                entity.itemHandler.getStackInSlot(9).getCount() + 1));

        entity.resetProgress();
    }

    private static boolean iron_bearingRecipe(UniversalAssemblerPhase1BlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(3).getItem() == Items.IRON_INGOT;
        boolean slot3 = entity.itemHandler.getStackInSlot(5).getItem() == Items.IRON_INGOT;
        boolean slot4 = entity.itemHandler.getStackInSlot(7).getItem() == Items.IRON_INGOT;
        return slot1 && slot2 && slot3 && slot4;
    }


    private static void iron_bearingCraft(UniversalAssemblerPhase1BlockEntity entity) {

        entity.itemHandler.extractItem(1, 1, false);
        entity.itemHandler.extractItem(3, 1, false);
        entity.itemHandler.extractItem(5, 1, false);
        entity.itemHandler.extractItem(7, 1, false);

        entity.itemHandler.setStackInSlot(9, new ItemStack(DCItems.IRON_ROD.get(),
                entity.itemHandler.getStackInSlot(9).getCount() + 1));

        entity.resetProgress();
    }


    private void resetProgress() {
        this.progress = 0;
    }


    private static boolean hasNotReachedStackLimit(UniversalAssemblerPhase1BlockEntity entity) {
        return entity.itemHandler.getStackInSlot(9).getCount() < entity.itemHandler.getStackInSlot(9).getMaxStackSize();
    }

}

