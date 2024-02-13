package net.epitap.degeneracycraft.blocks.entity.machine.initial;

import net.epitap.degeneracycraft.blocks.block.machine.initial.RedstonePoweredMachineComponentManufactureMachineBlock;
import net.epitap.degeneracycraft.blocks.entity.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.menu.machine.initial.RedstonePoweredMachineComponentManufactureMachineMenu;
import net.epitap.degeneracycraft.integration.jei.initial.RedstonePoweredMachineComponentManufactureMachineRecipe;
import net.epitap.degeneracycraft.util.WrappedHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import java.util.Map;
import java.util.Optional;

public class RedstonePoweredMachineComponentManufactureMachineBlockEntity extends BlockEntity implements MenuProvider {
    public final ItemStackHandler itemHandler = new ItemStackHandler(10) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return super.isItemValid(slot, stack);
        }
    };

    public final ContainerData data;

    public RedstonePoweredMachineComponentManufactureMachineBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < 9; i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0:
                        return RedstonePoweredMachineComponentManufactureMachineBlockEntity.this.progress;
                    case 1:
                        return (int) RedstonePoweredMachineComponentManufactureMachineBlockEntity.this.maxProgress;
                    default:
                        return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        RedstonePoweredMachineComponentManufactureMachineBlockEntity.this.progress = value;
                        break;
                    case 1:
                        RedstonePoweredMachineComponentManufactureMachineBlockEntity.this.maxProgress = value;
                        break;
                }
            }

            public int getCount() {
                return 2;
            }
        };

    }

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            Map.of(Direction.DOWN, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 2, (in, stack) -> false)),
                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (in, stack) -> itemHandler.isItemValid(1, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 9, (in, stack) -> false)),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (in, stack) -> itemHandler.isItemValid(1, stack))),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1 || out == 2, (in, stack) -> itemHandler.isItemValid(1, stack) || itemHandler.isItemValid(2, stack))));


    public int progress = 0;

    public float maxProgress = 100;

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new RedstonePoweredMachineComponentManufactureMachineMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(RedstonePoweredMachineComponentManufactureMachineBlock.FACING);

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

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pPos, BlockState pState, RedstonePoweredMachineComponentManufactureMachineBlockEntity blockEntity) {
        if (hasRecipe(blockEntity)) {
            if (hasNotReachedStackLimit(blockEntity)) {
                blockEntity.progress++;
                setChanged(level, pPos, pState);
                if (craftCheck(blockEntity)) {
                    craftItem(blockEntity);
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

    public static boolean craftCheck(RedstonePoweredMachineComponentManufactureMachineBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<RedstonePoweredMachineComponentManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineComponentManufactureMachineRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) > match.get().getRequiredTime() * 20;
        }
        return false;
    }

    public float getProgressPercent() {
        Level level = this.level;
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        Optional<RedstonePoweredMachineComponentManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineComponentManufactureMachineRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()){
            return (this.data.get(0) / (match.get().getRequiredTime() * 20)) * 5;
        }
        return 0;
    }

    private static boolean hasRecipe(RedstonePoweredMachineComponentManufactureMachineBlockEntity pBlockEntity) {
        Level level = pBlockEntity.level;
        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<RedstonePoweredMachineComponentManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineComponentManufactureMachineRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    private static void craftItem(RedstonePoweredMachineComponentManufactureMachineBlockEntity pBlockEntity) {
        Level level = pBlockEntity.level;
        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<RedstonePoweredMachineComponentManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineComponentManufactureMachineRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            for(int i = 0; i < 9; i++) {
                pBlockEntity.itemHandler.extractItem(i,1,false);
            }
            pBlockEntity.itemHandler.setStackInSlot(9, new ItemStack(match.get().getOutput0Item().getItem(),
                    pBlockEntity.itemHandler.getStackInSlot(9).getCount() + 1));

            pBlockEntity.resetProgress();
        }
    }

    public void resetProgress() {
        this.progress = 0;
    }

    private static boolean hasNotReachedStackLimit(RedstonePoweredMachineComponentManufactureMachineBlockEntity pBlockEntity) {
        return pBlockEntity.itemHandler.getStackInSlot(9).getCount() < pBlockEntity.itemHandler.getStackInSlot(9).getMaxStackSize();
    }

}

