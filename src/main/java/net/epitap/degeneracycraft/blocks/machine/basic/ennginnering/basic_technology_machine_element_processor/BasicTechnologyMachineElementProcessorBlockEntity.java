package net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_element_processor;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_machine_element_processor.BasicMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.DCEnergySyncS2CPacket;
import net.epitap.degeneracycraft.util.WrappedHandler;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Optional;

public class BasicTechnologyMachineElementProcessorBlockEntity extends BlockEntity implements MenuProvider {
    public float BT_ME_PROCESSOR_CAPACITY = 20000F;
    public float BT_ME_PROCESSOR_TRANSFER = 16F;
    public float BT_ME_PROCESSOR_MANUFACTURING_SPEED_MODIFIER_FORMED = 2F;
    public float BT_ME_PROCESSOR_MANUFACTURING_SPEED_MODIFIER_POWERED_0 = 3F;
    public float BT_ME_PROCESSOR_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED = 1.5F;
    public float BT_ME_PROCESSOR_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0 = 2.0F;
    public final ContainerData data;
    public int counter;
    public int getProgressPercent = 0;
    public boolean formed0;
    public boolean formed1;
    public boolean formed2;
    public boolean powered0_1;
    public boolean isFormed;
    public boolean isPowered0;
    public final ItemStackHandler itemHandler = new ItemStackHandler(12) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            for (int i = 0; i < 10; i++) {
                if (slot == i && !stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                        && !stack.is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                        && !stack.is(DCItems.MACHINE_HALT_DEVICE.get())) {
                    return true;
                }
            }
            if (slot == 10) {
                return stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                        || stack.is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
            }
            if (slot == 11) {
                return stack.is(DCItems.MACHINE_HALT_DEVICE.get());
            }
            return false;
        }
    };

    private final DCEnergyStorageFloatBase ENERGY_STORAGE = new DCEnergyStorageFloatBase(BT_ME_PROCESSOR_CAPACITY, BT_ME_PROCESSOR_TRANSFER) {
        @Override
        public void onEnergyChanged() {
            setChanged();
            DCMessages.sendToClients(new DCEnergySyncS2CPacket(this.energy, getBlockPos()));
        }
    };


    public DCIEnergyStorageFloat getEnergyStorage() {
        return ENERGY_STORAGE;
    }

    public void setEnergyLevel(float energy) {
        this.ENERGY_STORAGE.setEnergyFloat(energy);
    }

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private LazyOptional<DCIEnergyStorageFloat> lazyEnergyHandler = LazyOptional.empty();
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            Map.of(
                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (outputSlot) -> outputSlot == 9, (outputSlot, stack) -> false)),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (inputSlot) -> inputSlot == 0, (inputSlot, stack) ->
                            itemHandler.isItemValid(0, stack))));

    public BasicTechnologyMachineElementProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.basic_technology_machine_element_processor_block_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicTechnologyMachineElementProcessorBlockEntity.this.counter;
                    case 1 -> BasicTechnologyMachineElementProcessorBlockEntity.this.getProgressPercent;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicTechnologyMachineElementProcessorBlockEntity.this.counter = value;
                } else if (index == 1) {
                    BasicTechnologyMachineElementProcessorBlockEntity.this.getProgressPercent = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }


    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new BasicTechnologyMachineElementProcessorMenu(pContainerId, pInventory, this, this.data);
    }

    public Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY && (side == Direction.UP || side == Direction.NORTH)) {
            return lazyEnergyHandler.cast();
        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(BasicTechnologyMachineElementProcessorBlock.FACING);

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

    public void setHandler(ItemStackHandler itemStackHandler) {
        for (int i = 0; i < itemStackHandler.getSlots(); i++) {
            itemHandler.setStackInSlot(i, itemStackHandler.getStackInSlot(i));
        }
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyEnergyHandler = LazyOptional.of(() -> ENERGY_STORAGE);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putFloat("b_me_processor.energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("b_me_processor.energy"));
        counter = nbt.getInt("counter");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        blockEntity.formed0 = BasicTechnologyMachineElementProcessorStructure.isFormed0(level, pos, state, blockEntity);
        blockEntity.formed1 = BasicTechnologyMachineElementProcessorStructure.isFormed1(level, pos, state, blockEntity);
        blockEntity.formed2 = BasicTechnologyMachineElementProcessorStructure.isFormed2(level, pos, state, blockEntity);
        blockEntity.powered0_1 = BasicTechnologyMachineElementProcessorStructure.powered0_1(level, pos, state, blockEntity);
        blockEntity.isFormed = BasicTechnologyMachineElementProcessorStructure.isFormed(blockEntity);
        blockEntity.isPowered0 = BasicTechnologyMachineElementProcessorStructure.isPowered0(blockEntity);

        BasicTechnologyMachineElementProcessorStructure.hologram(level, pos, state, blockEntity);
        blockEntity.getProgressPercent = 0;

        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(0.0000000000000000001F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(0.0000000000000000001F, false);
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        if (level.isClientSide()) {
            return;
        }

        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }
        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasAmountEnergyRecipe(blockEntity) && !isHaltDevice(blockEntity)
                && hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(inventory, match.get().getOutput0Item())) {
            if (blockEntity.isPowered0) {
                blockEntity.counter += blockEntity.BT_ME_PROCESSOR_MANUFACTURING_SPEED_MODIFIER_POWERED_0;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.BT_ME_PROCESSOR_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0
                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
            } else if (blockEntity.isFormed) {
                blockEntity.counter += blockEntity.BT_ME_PROCESSOR_MANUFACTURING_SPEED_MODIFIER_FORMED;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.BT_ME_PROCESSOR_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED
                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
            } else {
                blockEntity.counter++;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20, false);
            }
            blockEntity.getProgressPercent = (int) (blockEntity.counter / (match.get().getRequiredTime() * 20F) * 100F);
            if (craftCheck(blockEntity)) {
                craftItem(blockEntity);
                blockEntity.resetProgress();
            }
            setChanged(level, pos, state);
        } else {
            blockEntity.resetProgress();
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    public static boolean craftCheck(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) >= match.get().getRequiredTime() * 20;
        }
        return false;
    }

    private static boolean hasRecipe(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    private static boolean hasAmountRecipe(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(0).getCount() >= match.get().getInput0Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(1).getCount() >= match.get().getInput1Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(2).getCount() >= match.get().getInput2Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(3).getCount() >= match.get().getInput3Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(4).getCount() >= match.get().getInput4Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(5).getCount() >= match.get().getInput5Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(6).getCount() >= match.get().getInput6Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(7).getCount() >= match.get().getInput7Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(8).getCount() >= match.get().getInput8Item().getCount();
    }

    private static boolean hasAmountEnergyRecipe(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.getEnergyStorage().getEnergyStoredFloat() >= match.get().getRequiredEnergy() / match.get().getRequiredTime();
    }

    public static boolean isHaltDevice(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(11).is(DCItems.MACHINE_HALT_DEVICE.get());
    }

    private static void craftItem(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.extractItem(0, match.get().getInput0Item().getCount(), false);
            blockEntity.itemHandler.extractItem(1, match.get().getInput1Item().getCount(), false);
            blockEntity.itemHandler.extractItem(2, match.get().getInput2Item().getCount(), false);
            blockEntity.itemHandler.extractItem(3, match.get().getInput3Item().getCount(), false);
            blockEntity.itemHandler.extractItem(4, match.get().getInput4Item().getCount(), false);
            blockEntity.itemHandler.extractItem(5, match.get().getInput5Item().getCount(), false);
            blockEntity.itemHandler.extractItem(6, match.get().getInput6Item().getCount(), false);
            blockEntity.itemHandler.extractItem(7, match.get().getInput7Item().getCount(), false);
            blockEntity.itemHandler.extractItem(8, match.get().getInput8Item().getCount(), false);
            blockEntity.itemHandler.setStackInSlot(9, new ItemStack(match.get().getOutput0Item().getItem(),
                    blockEntity.itemHandler.getStackInSlot(9).getCount() + match.get().getOutput0Item().getCount()));

            blockEntity.resetProgress();
        }
    }

    public float getProgressPercent() {
        Level level = this.level;
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return (this.data.get(0) / (match.get().getRequiredTime() * 20)) * 100;
        }
        return 0;
    }

    public void resetProgress() {
        this.getProgressPercent = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(9).getItem() == output.getItem() || inventory.getItem(9).isEmpty();
    }

    private static boolean hasNotReachedStackLimit(BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(9).getCount() < blockEntity.itemHandler.getStackInSlot(9).getMaxStackSize();
    }
}
