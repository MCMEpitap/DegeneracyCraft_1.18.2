package net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorRecipe;
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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BasicPerformanceStarlightCollectorBlockEntity extends BlockEntity implements MenuProvider {
    public float MACHINE_CAPACITY = 30000F;
    public float MACHINE_TRANSFER = 16F;

    public static float MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED = 2F;
    public static float MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_0 = 3F;
    public static float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED = 1.5F;
    public static float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0 = 2.0F;
    protected final ContainerData data;

    public int counter;
    public int getProgressPercent;
    public int getProgressRandom;
    public long getTime;


    public int hologramLevel = -1;
    public int multiblockLevel = -1;
    public boolean forceHalt = false;
    public boolean isWorking = false;

    public static final int DATA_COUNTER      = 0;
    public static final int DATA_PROGRESS     = 1;
    public static final int DATA_HOLOGRAM     = 2;
    public static final int DATA_FORCE_STOP   = 3;
    public static final int DATA_MULTIBLOCK   = 4;


    public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 2 -> false;
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
            Map.of(Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 2, (out, stack) -> false)));

    public BasicPerformanceStarlightCollectorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_PERFORMANCE_STARLIGHT_COLLECTOR_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case DATA_COUNTER    -> counter;
                    case DATA_PROGRESS   -> getProgressPercent;
                    case DATA_HOLOGRAM   -> hologramLevel;
                    case DATA_FORCE_STOP -> forceHalt ? 1 : 0;
                    case DATA_MULTIBLOCK   -> multiblockLevel;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case DATA_COUNTER -> counter = value;
                    case DATA_PROGRESS -> getProgressPercent = value;
                    case DATA_HOLOGRAM -> hologramLevel = value;
                    case DATA_FORCE_STOP -> forceHalt = value != 0;
                    case DATA_MULTIBLOCK -> multiblockLevel = value;
                }
            }

            @Override
            public int getCount() {
                return 5;
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
        return new BasicPerformanceStarlightCollectorMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY && (side == Direction.UP || side == Direction.DOWN || side == Direction.NORTH)) {
            return lazyEnergyHandler.cast();
        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(BasicPerformanceStarlightCollectorBlock.FACING);

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
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyEnergyHandler = LazyOptional.of(() -> ENERGY_STORAGE);
        super.onLoad();
    }

    @Override
    public void invalidateCaps() {
        lazyItemHandler.invalidate();
        lazyEnergyHandler.invalidate();
        super.invalidateCaps();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putFloat("energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        nbt.putInt("getProgressPercent", getProgressPercent);
        nbt.putInt("hologramLevel", hologramLevel);
        nbt.putBoolean("forceHalt", forceHalt);
        nbt.putInt("multiblockLevel", multiblockLevel);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("energy"));
        counter = nbt.getInt("counter");
        getProgressPercent = nbt.getInt("getProgressPercent");
        hologramLevel = nbt.getInt("hologramLevel");
        forceHalt = nbt.getBoolean("forceHalt");
        multiblockLevel = nbt.getInt("multiblockLevel");
        super.load(nbt);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        if(BasicPerformanceStarlightCollectorStructure.isPowered1(level, pos, state, blockEntity)){
            blockEntity.multiblockLevel = 1;
        } else if(BasicPerformanceStarlightCollectorStructure.isFormed(level, pos, state, blockEntity)){
            blockEntity.multiblockLevel = 0;
        } else {
            blockEntity.multiblockLevel = -1;
        }

        BasicPerformanceStarlightCollectorStructure.hologram(level, pos, state, blockEntity);
        blockEntity.getProgressPercent = 0;

        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(1e-19F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(1e-19F, false);

        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());

        if (level.isClientSide()) {
            setChanged(level, pos, state);
            return;
        }
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }
        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        if (blockEntity.forceHalt) {
            blockEntity.counter = 0;
            blockEntity.isWorking = false;
            setChanged(level, pos, state);
            return;
        }

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasAmountEnergyRecipe(blockEntity)
                && hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(blockEntity)) {
            if(isTime(blockEntity) && isAboveAirBlock(blockEntity)) {
                blockEntity.isWorking = true;
                if (blockEntity.multiblockLevel == 1) {
                    blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_0;
                    blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0
                            * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
                } else if (blockEntity.multiblockLevel == 0) {
                    blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED;
                    blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED
                            * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
                } else {
                    blockEntity.counter++;
                    blockEntity.ENERGY_STORAGE.extractEnergyFloat(match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20, false);
                }
                blockEntity.getProgressPercent = (int) (blockEntity.counter / (match.get().getRequiredTime() * 20F) * 100F);
            }
            if (craftCheck(blockEntity)) {
                craftItem(blockEntity);
            }

            setChanged(level, pos, state);

        } else {
            blockEntity.resetProgress();
            blockEntity.isWorking = false;
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    private static boolean hasAmountEnergyRecipe(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.getEnergyStorage().getEnergyStoredFloat() >= match.get().getRequiredEnergy() / (match.get().getRequiredTime() * 20F);
    }


    private static boolean isTime(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.getLevel();
        if (level != null) {
            blockEntity.getTime = level.getDayTime();
        }
        return 12000 <= blockEntity.getTime && blockEntity.getTime <= 23999;
    }

    private static boolean isAboveAirBlock(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.getLevel();
        BlockPos basePos = blockEntity.getBlockPos();

        int maxY = level.getMaxBuildHeight() - 1;

        int startY = basePos.getY() + 1;

        for (int y = startY; y <= maxY; y++) {
            BlockPos checkPos = new BlockPos(basePos.getX(), y, basePos.getZ());
            if (!level.getBlockState(checkPos).isAir()) {
                return false;
            }
        }

        return true;
    }

    public static boolean craftCheck(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) > match.get().getRequiredTime() * 20;
        }
        return false;
    }

    private static boolean hasRecipe(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    public static boolean hasAmountRecipe(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(0).getCount() >= match.get().getInput0Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(1).getCount() >= match.get().getInput1Item().getCount();
    }


    private static void craftItem(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.extractItem(0, match.get().getInput0Item().getCount(), false);
            blockEntity.itemHandler.extractItem(1, match.get().getInput1Item().getCount(), false);
            blockEntity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getOutput0Item().getItem(),
                    blockEntity.itemHandler.getStackInSlot(2).getCount() + match.get().getOutput0Item().getCount()));

            blockEntity.resetProgress();
        }
    }

    public void resetProgress() {
        this.counter = 0;
    }

    private static boolean hasNotReachedStackLimit(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(2).getCount() + match.get().getOutput0Item().getCount() <= blockEntity.itemHandler.getStackInSlot(2).getMaxStackSize();
    }

    private static boolean canInsertItemIntoOutputSlot(BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceStarlightCollectorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceStarlightCollectorRecipe.Type.INSTANCE, inventory, level);

        return (blockEntity.itemHandler.getStackInSlot(2).getItem() == match.get().getOutput0Item().getItem() || blockEntity.itemHandler.getStackInSlot(2).isEmpty());
    }

    public void insertRecipeInputsFromPlayer(Player player, Recipe<?> recipe, boolean shift) {
        if (!(recipe instanceof BasicPerformanceStarlightCollectorRecipe recipeData)) return;

        player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(playerInv -> {
            this.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(machineInv -> {

                ItemStack[] recipeInputs = new ItemStack[]{
                        recipeData.getInput0Item(), recipeData.getInput1Item()
                };

                Map<Item, Integer> totalCounts = new HashMap<>();
                if (shift) {
                    for (ItemStack input : recipeInputs) {
                        if (!input.isEmpty()) {
                            int count = countItemInInventory(playerInv, input.getItem());
                            totalCounts.put(input.getItem(), count);
                        }
                    }
                }

                for (int slot = 0; slot < recipeInputs.length; slot++) {
                    ItemStack required = recipeInputs[slot];
                    if (required.isEmpty()) continue;

                    if (shift) {
                        long sameCount = Arrays.stream(recipeInputs)
                                .filter(itemStack -> !itemStack.isEmpty() && itemStack.getItem() == required.getItem())
                                .count();

                        int total = totalCounts.getOrDefault(required.getItem(), 0);
                        int perSlot = sameCount > 0 ? total / (int) sameCount : total;
                        perSlot = Math.max(1, perSlot);

                        insertItemFromPlayer(playerInv, machineInv, new ItemStack(required.getItem(), perSlot), slot);
                    } else {
                        insertItemFromPlayer(playerInv, machineInv, required.copy(), slot);
                    }
                }
            });
        });
    }

    private static int countItemInInventory(IItemHandler inventory, Item target) {
        int count = 0;
        for (int i = 0; i < inventory.getSlots(); i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if (!stack.isEmpty() && stack.getItem() == target) {
                count += stack.getCount();
            }
        }
        return count;
    }

    private void insertItemFromPlayer(IItemHandler playerInv, IItemHandler machineInv, ItemStack required, int slotIndex) {
        if (required.isEmpty()) return;

        int needed = required.getCount();

        for (int i = 0; i < playerInv.getSlots() && needed > 0; i++) {
            ItemStack fromSlot = playerInv.getStackInSlot(i);
            if (!fromSlot.sameItem(required)) continue;

            int toExtract = Math.min(needed, fromSlot.getCount());
            ItemStack extracted = playerInv.extractItem(i, toExtract, false);
            ItemStack leftover = machineInv.insertItem(slotIndex, extracted, false);

            if (!leftover.isEmpty()) {
                needed -= (toExtract - leftover.getCount());
                playerInv.insertItem(i, leftover, false);
            } else {
                needed -= toExtract;
            }
        }
    }
}

