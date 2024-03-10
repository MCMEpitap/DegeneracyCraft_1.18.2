package net.epitap.degeneracycraft.blocks.entity.machine.infinity;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.menu.machine.infinity.InfinityPoweredAllInOneCompressorMachineMenu;
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

public class InfinityPoweredAllInOneCompressorMachineBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(219) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;

    public InfinityPoweredAllInOneCompressorMachineBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> InfinityPoweredAllInOneCompressorMachineBlockEntity.this.progress;
                    case 1 -> InfinityPoweredAllInOneCompressorMachineBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> InfinityPoweredAllInOneCompressorMachineBlockEntity.this.progress = value;
                    case 1 -> InfinityPoweredAllInOneCompressorMachineBlockEntity.this.maxProgress = value;
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
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new InfinityPoweredAllInOneCompressorMachineMenu(id, inventory, this, this.data);
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
        nbt.putInt("infinity_powered_all_in_one_compressor_machine.progress", this.progress);

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("infinity_powered_all_in_one_compressor_machine.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }


    public static void tick(Level level, BlockPos pPos, BlockState pState, InfinityPoweredAllInOneCompressorMachineBlockEntity pBlockEntity) {

        if ((copper_boltRecipe(pBlockEntity)
                || iron_boltRecipe(pBlockEntity)
                && hasNotReachedStackLimit(pBlockEntity))) {
            setChanged(level, pPos, pState);
            pBlockEntity.progress++;

//            if (copper_boltRecipe(pBlockEntity) && pBlockEntity.progress > pBlockEntity.maxProgress
//                    && ((pBlockEntity.itemHandler.getStackInSlot(2).getItem() == DCItems.COPPER_BOLT.get())
//                    || (pBlockEntity.itemHandler.getStackInSlot(2).isEmpty()))) {
//                boltCraft(pBlockEntity);
//                pBlockEntity.itemHandler.setStackInSlot(2, new ItemStack(DCItems.COPPER_BOLT.get(),
//                        pBlockEntity.itemHandler.getStackInSlot(2).getCount() + 1));
//            }
//
//            if (iron_boltRecipe(pBlockEntity) && pBlockEntity.progress > pBlockEntity.maxProgress
//                    && ((pBlockEntity.itemHandler.getStackInSlot(2).getItem() == DCItems.IRON_BOLT.get())
//                    || (pBlockEntity.itemHandler.getStackInSlot(2).isEmpty()))) {
//                boltCraft(pBlockEntity);
//                pBlockEntity.itemHandler.setStackInSlot(2, new ItemStack(DCItems.IRON_BOLT.get(),
//                        pBlockEntity.itemHandler.getStackInSlot(2).getCount() + 1));
//            }



        } else {
            pBlockEntity.resetProgress();
            setChanged(level, pPos, pState);
        }
    }

    private static boolean copper_boltRecipe(InfinityPoweredAllInOneCompressorMachineBlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(0).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        return slot1 && slot2;
    }


    private static boolean iron_boltRecipe(InfinityPoweredAllInOneCompressorMachineBlockEntity entity) {
        boolean slot1 = entity.itemHandler.getStackInSlot(0).getItem() == Items.IRON_INGOT;
        boolean slot2 = entity.itemHandler.getStackInSlot(1).getItem() == Items.IRON_INGOT;
        return slot1 && slot2;
    }
//
//
//    private static void boltCraft(InfinityPoweredAllInOneCompressorMachineBlockEntity entity) {
//        entity.itemHandler.extractItem(0, 1, false);
//        entity.itemHandler.extractItem(1, 1, false);
//        entity.resetProgress();
//    }

    private void resetProgress() {
        this.progress = 0;
    }


    private static boolean hasNotReachedStackLimit(InfinityPoweredAllInOneCompressorMachineBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(2).getCount() < entity.itemHandler.getStackInSlot(2).getMaxStackSize();
    }
}
