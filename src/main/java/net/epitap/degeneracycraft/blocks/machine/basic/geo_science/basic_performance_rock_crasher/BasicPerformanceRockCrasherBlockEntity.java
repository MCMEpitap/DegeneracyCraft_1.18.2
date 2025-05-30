package net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherRecipe;
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

public class BasicPerformanceRockCrasherBlockEntity extends BlockEntity implements MenuProvider {
    public float MACHINE_CAPACITY = 20000F;
    public float MACHINE_TRANSFER = 32F;
    public float MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED = 2F;
    public float MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_0 = 3F;
    public float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED = 1.5F;
    public float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0 = 2.0F;
    public final ContainerData data;
    public int counter;
    public int getProgressPercent;
    private int consumeCounter;
    public double output_Slot1_Random = 0.5F;
    public double output_Slot1_Randomizer;
    public double output_Slot2_Random = 0.25F;
    public double output_Slot2_Randomizer;




    public boolean isFormed;
    public boolean isPowered0;
    public final ItemStackHandler itemHandler = new ItemStackHandler(6) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 1,2,3 -> false;
                case 4 -> stack.getItem() == DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get()
                        || stack.getItem() == DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get();
                case 5 -> stack.getItem() == DCItems.MACHINE_HALT_DEVICE.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private final DCEnergyStorageFloatBase ENERGY_STORAGE = new DCEnergyStorageFloatBase(MACHINE_CAPACITY, MACHINE_TRANSFER) {
        @Override
        public void onEnergyChanged() {
            setChanged();
            getLevel().sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
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
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (outputSlot) -> outputSlot == 1, (outputSlot, stack) -> false)),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (inputSlot) -> inputSlot == 0, (inputSlot, stack) ->
                            itemHandler.isItemValid(0, stack))));

    public BasicPerformanceRockCrasherBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicPerformanceRockCrasherBlockEntity.this.counter;
                    case 1 -> BasicPerformanceRockCrasherBlockEntity.this.getProgressPercent;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicPerformanceRockCrasherBlockEntity.this.counter = value;
                } else if (index == 1) {
                    BasicPerformanceRockCrasherBlockEntity.this.getProgressPercent = value;
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
        return new BasicPerformanceRockCrasherMenu(pContainerId, pInventory, this, this.data);
    }

    public Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY && (side == Direction.UP || side == Direction.DOWN)) {
            return lazyEnergyHandler.cast();
        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(BasicPerformanceRockCrasherBlock.FACING);

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
        nbt.putFloat("energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        nbt.putInt("getProgressPercent", getProgressPercent);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("energy"));
        counter = nbt.getInt("counter");
        getProgressPercent = nbt.getInt("getProgressPercent");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BasicPerformanceRockCrasherBlockEntity blockEntity) {
        blockEntity.isFormed = BasicPerformanceRockCrasherStructure.isFormed(level, pos, state, blockEntity);
        blockEntity.isPowered0 = BasicPerformanceRockCrasherStructure.isPowered0(level, pos, state, blockEntity);

        BasicPerformanceRockCrasherStructure.hologram(level, pos, state, blockEntity);

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
        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasEnergyRecipe(blockEntity) && !isHaltDevice(blockEntity)
                && hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(blockEntity)) {

            if (checkConsumeCount(blockEntity)) {
                consumeItem(blockEntity);
                blockEntity.consumeCount();
            }

            if (blockEntity.isPowered0) {
                blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_0;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0
                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
            } else if (blockEntity.isFormed) {
                blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED
                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
            } else {
                blockEntity.counter++;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20, false);
            }
            blockEntity.getProgressPercent = (int) (blockEntity.counter / (match.get().getRequiredTime() * 20F) * 100F);
            if (craftCheck(blockEntity)) {
                craftItem(blockEntity);
            }
            setChanged(level, pos, state);
        } else {
            blockEntity.resetProgress();
            blockEntity.resetConsumeCount();
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    public static boolean craftCheck(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) >= match.get().getRequiredTime() * 20;
        }
        return false;
    }

    private static boolean hasRecipe(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    private static boolean hasAmountRecipe(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(0).getCount() >= match.get().getInput0Item().getCount();
    }

    private static boolean hasEnergyRecipe(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.ENERGY_STORAGE.getEnergyStoredFloat() >= match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F;
    }

    public static boolean checkConsumeCount(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        return blockEntity.consumeCounter == 0;
    }

    private static void consumeItem(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.extractItem(0, match.get().getInput0Item().getCount(), false);
        }
    }

    public void consumeCount() {
        this.consumeCounter = 1;
    }

    private static void craftItem(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.setStackInSlot(1, new ItemStack(match.get().getOutput0Item().getItem(),
                    blockEntity.itemHandler.getStackInSlot(1).getCount() + match.get().getOutput0Item().getCount()));
            blockEntity.output_Slot1_Randomizer = Math.random();
            blockEntity.output_Slot2_Randomizer = Math.random();

            if (blockEntity.output_Slot1_Randomizer <= blockEntity.output_Slot1_Random){
                blockEntity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getOutput1Item().getItem(),
                        blockEntity.itemHandler.getStackInSlot(2).getCount() + match.get().getOutput1Item().getCount()));
            }
            if (blockEntity.output_Slot2_Randomizer <= blockEntity.output_Slot2_Random){
                blockEntity.itemHandler.setStackInSlot(3, new ItemStack(match.get().getOutput2Item().getItem(),
                        blockEntity.itemHandler.getStackInSlot(3).getCount() + match.get().getOutput2Item().getCount()));
            }
            blockEntity.resetProgress();
            blockEntity.resetConsumeCount();

        }
    }

    public static boolean isHaltDevice(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(5).is(DCItems.MACHINE_HALT_DEVICE.get());
    }

    public void resetProgress() {
        this.counter = 0;
    }

    public void resetConsumeCount() {
        this.consumeCounter = 0;
    }

    private static boolean hasNotReachedStackLimit(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(1).getCount() + match.get().getOutput0Item().getCount() <= blockEntity.itemHandler.getStackInSlot(1).getMaxStackSize()
                && blockEntity.itemHandler.getStackInSlot(2).getCount() + match.get().getOutput1Item().getCount() <= blockEntity.itemHandler.getStackInSlot(2).getMaxStackSize()
                && blockEntity.itemHandler.getStackInSlot(3).getCount() + match.get().getOutput2Item().getCount() <= blockEntity.itemHandler.getStackInSlot(3).getMaxStackSize();
    }

    private static boolean canInsertItemIntoOutputSlot(BasicPerformanceRockCrasherBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceRockCrasherRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceRockCrasherRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(1).getItem() == match.get().getOutput0Item().getItem() || blockEntity.itemHandler.getStackInSlot(1).isEmpty()
                && blockEntity.itemHandler.getStackInSlot(2).getItem() == match.get().getOutput1Item().getItem() || blockEntity.itemHandler.getStackInSlot(2).isEmpty()
                && blockEntity.itemHandler.getStackInSlot(3).getItem() == match.get().getOutput2Item().getItem() || blockEntity.itemHandler.getStackInSlot(3).isEmpty();
    }
}
