package net.epitap.degeneracycraft.blocks.machine.basic.basic_machine_part_processor;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachinePartProcessorRecipe;
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
import net.minecraft.world.level.ItemLike;
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

public class BasicMachinePartProcessorBlockEntity extends BlockEntity implements MenuProvider {
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
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            Map.of(Direction.DOWN, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 2, (in, stack) -> false)),
                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (in, stack) -> itemHandler.isItemValid(1, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 9, (in, stack) -> false)),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (in, stack) -> itemHandler.isItemValid(1, stack))),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1 || out == 2, (in, stack) -> itemHandler.isItemValid(1, stack) || itemHandler.isItemValid(2, stack))));
    public int progress = 0;
    public float maxProgress = 100;
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public BasicMachinePartProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_MACHINE_PART_PROCESSOR_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < 9; i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0:
                        return BasicMachinePartProcessorBlockEntity.this.progress;
                    case 1:
                        return (int) BasicMachinePartProcessorBlockEntity.this.maxProgress;
                    default:
                        return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        BasicMachinePartProcessorBlockEntity.this.progress = value;
                        break;
                    case 1:
                        BasicMachinePartProcessorBlockEntity.this.maxProgress = value;
                        break;
                }
            }

            public int getCount() {
                return 2;
            }
        };

    }

    private static boolean hasNotReachedStackLimit(BasicMachinePartProcessorBlockEntity pBlockEntity) {
        return pBlockEntity.itemHandler.getStackInSlot(9).getCount() < pBlockEntity.itemHandler.getStackInSlot(9).getMaxStackSize();
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new BasicMachinePartProcessorMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(BasicMachinePartProcessorBlock.FACING);

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

    private static boolean hasAmountRecipe(BasicMachinePartProcessorBlockEntity pBlockEntity) {
        Level level = pBlockEntity.level;
        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachinePartProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachinePartProcessorRecipe.Type.INSTANCE, inventory, level);

        return pBlockEntity.itemHandler.getStackInSlot(0).getCount() >= match.get().getInput0Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(1).getCount() >= match.get().getInput1Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(2).getCount() >= match.get().getInput2Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(3).getCount() >= match.get().getInput3Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(4).getCount() >= match.get().getInput4Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(5).getCount() >= match.get().getInput5Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(6).getCount() >= match.get().getInput6Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(7).getCount() >= match.get().getInput7Item().getCount()
                && pBlockEntity.itemHandler.getStackInSlot(8).getCount() >= match.get().getInput8Item().getCount();
    }
    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    public static void tick(Level level, BlockPos pPos, BlockState pState, BasicMachinePartProcessorBlockEntity blockEntity) {
        if (hasRecipe(blockEntity)
//                && hasAmountRecipe(blockEntity)
                ){
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

    public static boolean craftCheck(BasicMachinePartProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachinePartProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachinePartProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) > match.get().getRequiredTime() * 20;
        }
        return false;
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    private static boolean hasRecipe(BasicMachinePartProcessorBlockEntity pBlockEntity) {
        Level level = pBlockEntity.level;
        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachinePartProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachinePartProcessorRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    private static void craftItem(BasicMachinePartProcessorBlockEntity pBlockEntity) {
        Level level = pBlockEntity.level;
        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachinePartProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachinePartProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
//            pBlockEntity.itemHandler.extractItem(0, match.get().getInput0Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(1, match.get().getInput1Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(2, match.get().getInput2Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(3, match.get().getInput3Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(4, match.get().getInput4Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(5, match.get().getInput5Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(6, match.get().getInput6Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(7, match.get().getInput7Item().getCount(), false);
//            pBlockEntity.itemHandler.extractItem(8, match.get().getInput8Item().getCount(), false);
            int i;
            for (i = 0; i < 9; i++) {
                pBlockEntity.itemHandler.extractItem(i, 1, false);
            }
//            pBlockEntity.itemHandler.setStackInSlot(9, new ItemStack(match.get().getOutput0Item().getItem(),
//                    pBlockEntity.itemHandler.getStackInSlot(9).getCount() + match.get().getOutput0Item().getCount()));
            pBlockEntity.itemHandler.setStackInSlot(9, new ItemStack((ItemLike) match.get().at(9),
                    pBlockEntity.itemHandler.getStackInSlot(9).getCount() + match.get().getOutput0Item().getCount()));

            pBlockEntity.resetProgress();
        }
    }

    public float getProgressPercent() {
        Level level = this.level;
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachinePartProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachinePartProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return (this.data.get(0) / (match.get().getRequiredTime() * 20)) * 100;
        }
        return 0;
    }

    public void resetProgress() {
        this.progress = 0;
    }
}
