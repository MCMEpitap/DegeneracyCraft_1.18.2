package net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_precision_telescope.BasicPerformanceAstronomicalTelescopeRecipe;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.DCEnergySyncS2CPacket;
import net.epitap.degeneracycraft.util.WrappedHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
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

import java.util.Map;
import java.util.Optional;

public class BasicPerformanceAstronomicalTelescopeBlockEntity extends BlockEntity implements MenuProvider {
    public float MACHINE_CAPACITY = 50000F;
    public float MACHINE_TRANSFER = 16F;

    public float MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED = 2F;
    public float MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_0 = 3F;
    public float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED = 1.5F;
    public float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0 = 2.0F;
    protected final ContainerData data;
    public int counter;
    public int getProgressPercent;
    public int getProgressRandom;
    public long getTime;

    public boolean isFormed;
    public boolean isPowered0;
    public final ItemStackHandler itemHandler = new ItemStackHandler(5) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 2 -> false;
                case 3 -> stack.getItem() == DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get()
                        || stack.getItem() == DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get();
                case 4 -> stack.getItem() == DCItems.MACHINE_HALT_DEVICE.get();
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

    public BasicPerformanceAstronomicalTelescopeBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicPerformanceAstronomicalTelescopeBlockEntity.this.counter;
                    case 1 -> BasicPerformanceAstronomicalTelescopeBlockEntity.this.getProgressPercent;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicPerformanceAstronomicalTelescopeBlockEntity.this.counter = value;
                } else if (index == 1) {
                    BasicPerformanceAstronomicalTelescopeBlockEntity.this.getProgressPercent = value;
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
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new BasicPerformanceAstronomicalTelescopeMenu(pContainerId, pInventory, this, this.data);
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
                Direction localDir = this.getBlockState().getValue(BasicPerformanceAstronomicalTelescopeBlock.FACING);

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
        nbt.putFloat("bp_telescope.energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        nbt.putInt("getProgressPercent", getProgressPercent);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("bp_telescope.energy"));
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

    public static void tick(Level level, BlockPos pos, BlockState state, BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        blockEntity.isFormed = BasicPerformanceAstronomicalTelescopeStructure.isFormed(level, pos, state, blockEntity);
        blockEntity.isPowered0 = BasicPerformanceAstronomicalTelescopeStructure.isPowered0(level, pos, state, blockEntity);


        BasicPerformanceAstronomicalTelescopeStructure.hologram(level, pos, state, blockEntity);
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
        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasAmountEnergyRecipe(blockEntity) && !isHaltDevice(blockEntity)
                && isAboveAirBlock(blockEntity)
                && hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(blockEntity)) {
//            blockEntity.getProgressRandom = (int) (Math.random() * 100);

//            if (blockEntity.isPowered0) {
//                if (blockEntity.getProgressRandom <= 1) {
//                    blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_0;
//                }
//                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0
//                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
//            } else if (blockEntity.isFormed) {
//                if (blockEntity.getProgressRandom <= 0) {
//                    blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED;
//                }
//                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED
//                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
//            } else {
//                if (blockEntity.getProgressRandom <= 0) {
//                    blockEntity.counter++;
//                }
//                blockEntity.ENERGY_STORAGE.extractEnergyFloat(match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20, false);
//            }
            if(isTime(blockEntity)) {
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
            }
            if (craftCheck(blockEntity)) {
                consumeItem(blockEntity);
                craftItem(blockEntity);
            }

            setChanged(level, pos, state);

        } else {
            blockEntity.resetProgress();
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    private static boolean hasAmountEnergyRecipe(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.getEnergyStorage().getEnergyStoredFloat() >= match.get().getRequiredEnergy() / (match.get().getRequiredTime() * 20F);
    }

    public static boolean isHaltDevice(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(4).is(DCItems.MACHINE_HALT_DEVICE.get());
    }

    private static boolean isTime(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.getLevel();
        if (level != null) {
            blockEntity.getTime = level.getDayTime();
        }
        return 12000 <= blockEntity.getTime && blockEntity.getTime <= 23999;
    }

    private static boolean isAboveAirBlock(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
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

    public static boolean craftCheck(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) > match.get().getRequiredTime() * 20;
        }
        return false;
    }

    private static boolean hasRecipe(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    public static boolean hasAmountRecipe(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(0).getCount() >= match.get().getInput0Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(1).getCount() >= match.get().getInput1Item().getCount();
    }

    private static void consumeItem(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.extractItem(0, match.get().getInput0Item().getCount(), false);
            blockEntity.itemHandler.extractItem(1, match.get().getInput1Item().getCount(), false);
        }
    }

    private static void craftItem(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getOutput0Item().getItem(),
                    blockEntity.itemHandler.getStackInSlot(2).getCount() + match.get().getOutput0Item().getCount()));

            blockEntity.resetProgress();
        }
    }

    public void resetProgress() {
        this.counter = 0;
    }

    private static boolean hasNotReachedStackLimit(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(2).getCount() + match.get().getOutput0Item().getCount() <= blockEntity.itemHandler.getStackInSlot(2).getMaxStackSize();
    }

    private static boolean canInsertItemIntoOutputSlot(BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicPerformanceAstronomicalTelescopeRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicPerformanceAstronomicalTelescopeRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(2).getItem() == match.get().getOutput0Item().getItem() || blockEntity.itemHandler.getStackInSlot(2).isEmpty();
    }

    public void insertRecipeInputsFromPlayer(ServerPlayer player, Recipe<?> recipe, boolean shift) {
        if (!(recipe instanceof BasicPerformanceAstronomicalTelescopeRecipe recipeData)) return;

        player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(playerInv -> {
            this.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(machineInv -> {
                insertItemFromPlayer(playerInv, machineInv, recipeData.getInput0Item(), 0, shift);
                insertItemFromPlayer(playerInv, machineInv, recipeData.getInput1Item(), 1, shift);
            });
        });

        this.setChanged();
        this.level.sendBlockUpdated(this.worldPosition, this.getBlockState(), this.getBlockState(), 3);
    }


    private void insertItemFromPlayer(IItemHandler playerInv, IItemHandler machineInv, ItemStack required, int slotIndex, boolean shift) {
        if (required.isEmpty()) return;

        int needed = shift ? Integer.MAX_VALUE : required.getCount();

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

