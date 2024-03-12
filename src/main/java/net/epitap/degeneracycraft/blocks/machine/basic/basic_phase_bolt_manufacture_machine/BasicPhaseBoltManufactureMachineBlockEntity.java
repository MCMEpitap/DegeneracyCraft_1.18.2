package net.epitap.degeneracycraft.blocks.machine.basic.basic_phase_bolt_manufacture_machine;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

public class BasicPhaseBoltManufactureMachineBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;

    public BasicPhaseBoltManufactureMachineBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicPhaseBoltManufactureMachineBlockEntity.this.progress;
                    case 1 -> BasicPhaseBoltManufactureMachineBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> BasicPhaseBoltManufactureMachineBlockEntity.this.progress = value;
                    case 1 -> BasicPhaseBoltManufactureMachineBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }


    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("Gem Infusing Station");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new BasicPhaseBoltManufactureMachineMenu(id, inventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
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
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("gem_infusing_station.progress", this.progress);

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("gem_infusing_station.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }


    public static void tick(Level level, BlockPos pPos, BlockState pState, BasicPhaseBoltManufactureMachineBlockEntity blockEntity) {

        if ((copper_boltRecipe(blockEntity)
                || iron_boltRecipe(blockEntity)
                && hasNotReachedStackLimit(blockEntity))) {
            setChanged(level, pPos, pState);
            blockEntity.progress++;

            if (copper_boltRecipe(blockEntity) && blockEntity.progress > blockEntity.maxProgress
                    && ((blockEntity.itemHandler.getStackInSlot(2).getItem() == DCItems.COPPER_BOLT.get())
                    || (blockEntity.itemHandler.getStackInSlot(2).isEmpty()))) {
                boltCraft(blockEntity);
                blockEntity.itemHandler.setStackInSlot(2, new ItemStack(DCItems.COPPER_BOLT.get(),
                        blockEntity.itemHandler.getStackInSlot(2).getCount() + 1));
            }

            if (iron_boltRecipe(blockEntity) && blockEntity.progress > blockEntity.maxProgress
                    && ((blockEntity.itemHandler.getStackInSlot(2).getItem() == DCItems.IRON_BOLT.get())
                    || (blockEntity.itemHandler.getStackInSlot(2).isEmpty()))) {
                boltCraft(blockEntity);
                blockEntity.itemHandler.setStackInSlot(2, new ItemStack(DCItems.IRON_BOLT.get(),
                        blockEntity.itemHandler.getStackInSlot(2).getCount() + 1));
            }



        } else {
            blockEntity.resetProgress();
            setChanged(level, pPos, pState);
        }
    }

    private static boolean copper_boltRecipe(BasicPhaseBoltManufactureMachineBlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(0).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        return slot1 && slot2;
    }


    private static boolean iron_boltRecipe(BasicPhaseBoltManufactureMachineBlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(0).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        return slot1 && slot2;
    }


    private static void boltCraft(BasicPhaseBoltManufactureMachineBlockEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);
        entity.itemHandler.extractItem(1, 1, false);
        entity.resetProgress();
    }

    private void resetProgress() {
        this.progress = 0;
    }


    private static boolean hasNotReachedStackLimit(BasicPhaseBoltManufactureMachineBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(2).getCount() < entity.itemHandler.getStackInSlot(2).getMaxStackSize();
    }



//    public static void tick(Level level, BlockPos pos, BlockState state, BasicPhaseBoltManufactureMachineBlockEntity pEntity) {
//        if(level.isClientSide()) {
//            return;
//        }
//
//        if(hasRecipe(pEntity)) {
//            pEntity.progress++;
//            setChanged(level, pos, state);
//
//            if(pEntity.progress >= pEntity.maxProgress) {
//                craftItem(pEntity);
//            }
//        } else {
//            pEntity.resetProgress();
//            setChanged(level, pos, state);
//        }
//    }
//
//
//
//    private void resetProgress() {
//        this.progress = 0;
//    }
//
//    private static void craftItem(BasicPhaseBoltManufactureMachineBlockEntity pEntity) {
//        Level level = pEntity.level;
//        SimpleContainer inventory = new SimpleContainer(pEntity.itemHandler.getSlots());
//        for (int i = 0; i < pEntity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, pEntity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<BasicBoltManufactureRecipe> recipe = level.getRecipeManager()
//                .getRecipeFor(BasicBoltManufactureRecipe.Type.INSTANCE, inventory, level);
//
//        if(hasRecipe(pEntity)) {
//            pEntity.itemHandler.extractItem(0, 1, false);
//            pEntity.itemHandler.extractItem(1, 1, false);
//            pEntity.itemHandler.setStackInSlot(2, new ItemStack(recipe.get().getResultItem().getItem(),
//                    pEntity.itemHandler.getStackInSlot(2).getCount() + 1));
//            pEntity.itemHandler.setStackInSlot(3, new ItemStack(recipe.get().getResultItem().getItem(),
//                    pEntity.itemHandler.getStackInSlot(3).getCount() + 1));
//
//            pEntity.resetProgress();
//        }
//    }
//
//    private static boolean hasRecipe(BasicPhaseBoltManufactureMachineBlockEntity entity) {
//        Level level = entity.level;
//        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
//        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
//            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
//        }
//
//        Optional<BasicBoltManufactureRecipe> recipe = level.getRecipeManager()
//                .getRecipeFor(BasicBoltManufactureRecipe.Type.INSTANCE, inventory, level);
//
//
//        return recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory) &&
//                canInsertItemIntoOutputSlot(inventory, recipe.get().getResultItem());
//    }
//
//    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack stack) {
//        return inventory.getItem(2).getItem() == stack.getItem() || inventory.getItem(2).isEmpty();
//    }
//
//    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
//        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
//    }

}
