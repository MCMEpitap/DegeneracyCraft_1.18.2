package net.epitap.degeneracycraft.blocks.entity.machine;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.menu.machine.PulverizerMenu;
import net.epitap.degeneracycraft.integration.jei.Pulverization;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
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
import java.util.Optional;

public class PulverizerBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;

    public PulverizerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.PULVERIZER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0: return PulverizerBlockEntity.this.progress;
                    case 1: return PulverizerBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: PulverizerBlockEntity.this.progress = value; break;
                    case 1: PulverizerBlockEntity.this.maxProgress = value; break;
                }
            }

            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Gem Cutting Station");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new PulverizerMenu(pContainerId, pInventory, this, this.data);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("pulverization.getProgressPercent", progress);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("pulverization.getProgressPercent");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pPos, BlockState pState, PulverizerBlockEntity blockEntity) {
        if(hasRecipe(blockEntity)) {
            blockEntity.progress++;
            setChanged(level, pPos, pState);
            if(blockEntity.progress > blockEntity.maxProgress) {
                craftItem(blockEntity);
            }
        } else {
            blockEntity.resetProgress();
            setChanged(level, pPos, pState);
        }
    }

    private static boolean hasRecipe(PulverizerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<Pulverization> match = level.getRecipeManager()
                .getRecipeFor(Pulverization.Type.INSTANCE, inventory, level);

        return match.isPresent();
//                && canInsertAmountIntoOutputSlot(inventory)
//                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
    }


    private static void craftItem(PulverizerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<Pulverization> match = level.getRecipeManager()
                .getRecipeFor(Pulverization.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(0,1, false);
            entity.itemHandler.extractItem(1,1, false);
            entity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(2).getCount() + 1));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

//    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
//        return inventory.getItem(1).getItem() == output.getItem() || inventory.getItem(1).isEmpty();
//    }
//
//    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
//        return inventory.getItem(1).getMaxStackSize() > inventory.getItem(1).getCount();
//    }
}
//    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
//        @Override
//        protected void onContentsChanged(int slot) {
//            setChanged();
//        }
//    };
//
//    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
//
//    protected final ContainerData data;
//    private int getProgressPercent = 0;
//    private int maxProgress = 72;
//    int levels;
//
//    public PulverizerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
//        super(DCBlockEntities.PULVERIZER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
//        this.data = new ContainerData() {
//            public int get(int index) {
//                switch (index) {
//                    case 0:
//                        return PulverizerBlockEntity.this.getProgressPercent;
//                    case 1:
//                        return PulverizerBlockEntity.this.maxProgress;
//                    default:
//                        return 0;
//                }
//            }
//
//            public void set(int index, int value) {
//                switch (index) {
//                    case 0:
//                        PulverizerBlockEntity.this.getProgressPercent = value;
//                        break;
//                    case 1:
//                        PulverizerBlockEntity.this.maxProgress = value;
//                        break;
//                }
//            }
//
//            public int getCount() {
//                return 2;
//            }
//        };
//    }
//
//    @Override
//    public Component getDisplayName() {
//        return new TranslatableComponent("screen.degeneracycraft_pulverizer");
//    }
//
//    @Nullable
//    @Override
//    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
//        return new PulverizerMenu(pContainerId, pInventory, this, this.data);
//    }
//
//    @Nonnull
//    @Override
//    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
//        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
//            return lazyItemHandler.cast();
//        }
//
//        return super.getCapability(cap, side);
//    }
//
//    @Override
//    public void onLoad() {
//        super.onLoad();
//        lazyItemHandler = LazyOptional.of(() -> itemHandler);
//    }
//
//    @Override
//    public void invalidateCaps() {
//        super.invalidateCaps();
//        lazyItemHandler.invalidate();
//    }
//
//    @Override
//    protected void saveAdditional(@NotNull CompoundTag tag) {
//        tag.put("inventory", itemHandler.serializeNBT());
//        tag.putInt("pulverization.getProgressPercent", getProgressPercent);
//        super.saveAdditional(tag);
//    }
//
//    @Override
//    public void load(CompoundTag nbt) {
//        super.load(nbt);
//        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
//        getProgressPercent = nbt.getInt("pulverization.getProgressPercent");
//    }
//
//    public void drops() {
//        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
//        for (int i = 0; i < itemHandler.getSlots(); i++) {
//            inventory.setItem(i, itemHandler.getStackInSlot(i));
//        }
//
//        Containers.dropContents(this.level, this.worldPosition, inventory);
//    }
//
//    private void resetProgress() {
//        this.getProgressPercent = 0;
//    }

//    boolean formed0;
//
//    public static void tick(Level level, BlockPos pPos, BlockState pState, PulverizerBlockEntity blockEntity) {
//        int i = pPos.getX();
//        int j = pPos.getY();
//        int k = pPos.getZ();
//        blockEntity.formed0 = isFormed0(level, i, j, k);
//        if (blockEntity.formed0) {
//            if ((hasNotReachedStackLimit(blockEntity)
//                    && Iron_dustRecipe(blockEntity)
////                || iron_keyRecipe(blockEntity)
////                || iron_springRecipe(blockEntity)
////                || iron_rodRecipe(blockEntity)
////                || iron_bearingRecipe(blockEntity)
//            )) {
//                setChanged(level, pPos, pState);
//                blockEntity.getProgressPercent++;
//
//                if (Iron_dustRecipe(blockEntity) && blockEntity.getProgressPercent > pBlockEntity.maxProgress
//                        && ((pBlockEntity.itemHandler.getStackInSlot(2).getItem() == DCItems.IRON_DUST.get())
//                        || (pBlockEntity.itemHandler.getStackInSlot(2).isEmpty()))) {
//                    Iron_dustCraft(pBlockEntity);
//                    pBlockEntity.itemHandler.setStackInSlot(2, new ItemStack(DCItems.IRON_DUST.get(),
//                            pBlockEntity.itemHandler.getStackInSlot(2).getCount() + 1));
//                }
//
//
//            } else {
//                pBlockEntity.resetProgress();
//                setChanged(level, pPos, pState);
//            }
//        }
//    }
//
//    private static boolean isFormed0(Level level, int pX, int pY, int pZ) {
//            boolean formed0 = level.getBlockState(new BlockPos(pX, pY + 1, pZ)).is(DCBlocks.LOW_STERNGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get())
//                          && level.getBlockState(new BlockPos(pX, pY + 2, pZ)).is(DCBlocks.LOW_STERNGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
//        return formed0;
//    }
//
//    private static boolean Iron_dustRecipe(PulverizerBlockEntity entity) {
//        boolean slot1 = entity.itemHandler.getStackInSlot(1).getItem() == Items.RAW_IRON;
//        return slot1;
//    }
//
//
//    private static void Iron_dustCraft(PulverizerBlockEntity entity) {
//        entity.itemHandler.extractItem(1, 1, false);
//        entity.resetProgress();
//    }
//

//
//    private static boolean hasNotReachedStackLimit(PulverizerBlockEntity entity) {
//        return entity.itemHandler.getStackInSlot(2).getCount() < entity.itemHandler.getStackInSlot(2).getMaxStackSize();
//    }

//}

//    public static void tick(Level level, BlockPos pPos, BlockState pState, PulverizerBlockEntity pBlockEntity) {
//        if (hasRecipe(pBlockEntity)) {
//            pBlockEntity.getProgressPercent++;
//            setChanged(level, pPos, pState);
//            if (pBlockEntity.getProgressPercent > pBlockEntity.maxProgress) {
//                craftItem(pBlockEntity);
//            }
//        } else {
//            pBlockEntity.resetProgress();
//            setChanged(level, pPos, pState);
//        }
//
//    }
//
//    private static boolean hasRecipe(PulverizerBlockEntity entity) {
//        Level level = entity.level;
//        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
//        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<Pulverization> match = level.getRecipeManager()
//                .getRecipeFor(Pulverization.Type.INSTANCE, inventory, level);
//
//        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
//                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
//    }
//
//
//    private static void craftItem(PulverizerBlockEntity entity) {
//        Level level = entity.level;
//        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
//        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<Pulverization> match = level.getRecipeManager()
//                .getRecipeFor(Pulverization.Type.INSTANCE, inventory, level);
//
//        if (match.isPresent()) {
//            entity.itemHandler.extractItem(0, 1, false);
//
//            entity.itemHandler.setStackInSlot(1, new ItemStack(match.get().getResultItem().getItem(),
//                    entity.itemHandler.getStackInSlot(1).getCount() + 1));
//
//            entity.resetProgress();
//        }
//
//    }
//
//
//    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
//        return inventory.getItem(1).getItem() == output.getItem() || inventory.getItem(1).isEmpty();
//    }
//
//    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
//        return inventory.getItem(1).getMaxStackSize() > inventory.getItem(1).getCount();
//    }
//}
