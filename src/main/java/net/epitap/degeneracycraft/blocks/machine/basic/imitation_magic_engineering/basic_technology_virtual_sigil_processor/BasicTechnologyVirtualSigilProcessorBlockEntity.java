package net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserBlock;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserStructure;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorRecipe;
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

import javax.annotation.Nonnull;
import java.util.*;

public class BasicTechnologyVirtualSigilProcessorBlockEntity extends BlockEntity implements MenuProvider {
    public float MACHINE_CAPACITY = 30000F;
    public float MACHINE_TRANSFER = 32F;
    public float MACHINE_MANUFACTURING_SPEED_MODIFIER_FORMED = 2F;
    public float MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_1 = 3F;
    public float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED = 1.5F;
    public float MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_1 = 2.0F;
    public final ContainerData data;
    public int counter;
    public int getProgressPercent;

    public int hologramLevel = -1;
    public int multiblockLevel = -1;

    public int minX;
    public int maxY;
    public int minZ;

    public boolean forceHalt = false;
    public static final int RECIPE_COUNT      = 5;
    public static final int OUTPUT_COUNT      = 1;

    private final ItemStack[] inputLockedRecipe = new ItemStack[RECIPE_COUNT];
    public boolean inputLocked = false;
    public static final int DATA_COUNTER      = 0;
    public static final int DATA_PROGRESS     = 1;
    public static final int DATA_HOLOGRAM     = 2;
    public static final int DATA_FORCE_STOP   = 3;
    public static final int DATA_MULTIBLOCK   = 4;
    public static final int DATA_RECIPE_LOCK   = 5;

    public static final int IN_0   = 0;
    public static final int IN_1   = 1;
    public static final int IN_2   = 2;
    public static final int IN_3   = 3;
    public static final int IN_4   = 4;
    public static final int OUT_0   = 5;

    private final List<DCIEnergyStorageFloat> energyInputs = new ArrayList<>();
    private final List<DCIEnergyStorageFloat> energyOutputs = new ArrayList<>();
    private final List<IItemHandler> itemInputs = new ArrayList<>();
    private final List<IItemHandler> itemOutputs = new ArrayList<>();

    public final ItemStackHandler itemHandler = new ItemStackHandler(6) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case OUT_0 -> false;
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
                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == IN_0, (in, stack) -> itemHandler.isItemValid(IN_0, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == IN_0, (in, stack) -> itemHandler.isItemValid(IN_0, stack))),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == OUT_0, (out, stack) -> false)),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == IN_0, (in, stack) -> itemHandler.isItemValid(IN_0, stack)))
            );

    public BasicTechnologyVirtualSigilProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_VIRTUAL_SIGIL_PROCESSOR_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case DATA_COUNTER    -> counter;
                    case DATA_PROGRESS   -> getProgressPercent;
                    case DATA_HOLOGRAM   -> hologramLevel;
                    case DATA_FORCE_STOP -> forceHalt ? 1 : 0;
                    case DATA_MULTIBLOCK   -> multiblockLevel;
                    case DATA_RECIPE_LOCK   -> inputLocked ? 1 : 0;
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
                    case DATA_RECIPE_LOCK -> inputLocked = value != 0;
                }
            }

            @Override
            public int getCount() {
                return 6;
            }
        };
    }


    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new BasicTechnologyVirtualSigilProcessorMenu(pContainerId, pInventory, this, this.data);
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
                Direction localDir = this.getBlockState().getValue(BasicTechnologyVirtualSigilProcessorBlock.FACING);

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
        super.saveAdditional(nbt);
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putFloat("energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        nbt.putInt("getProgressPercent", getProgressPercent);
        nbt.putInt("hologramLevel", hologramLevel);
        nbt.putBoolean("forceHalt", forceHalt);
        nbt.putInt("multiblockLevel", multiblockLevel);
        nbt.putBoolean("inputLocked", inputLocked);
        for (int i = 0; i < inputLockedRecipe.length; i++) {
            CompoundTag itemTag = new CompoundTag();
            inputLockedRecipe[i].save(itemTag);
            nbt.put("inputLockedRecipe" + i, itemTag);
        }
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("energy"));
        counter = nbt.getInt("counter");
        getProgressPercent = nbt.getInt("getProgressPercent");
        hologramLevel = nbt.getInt("hologramLevel");
        forceHalt = nbt.getBoolean("forceHalt");
        multiblockLevel = nbt.getInt("multiblockLevel");
        inputLocked = nbt.getBoolean("inputLocked");
        for (int i = 0; i < inputLockedRecipe.length; i++) {
            if (nbt.contains("inputLockedRecipe" + i)) {
                inputLockedRecipe[i] = ItemStack.of(nbt.getCompound("inputLockedRecipe" + i));
            } else {
                inputLockedRecipe[i] = ItemStack.EMPTY;
            }

            if (inputLockedRecipe[i] == null) {
                inputLockedRecipe[i] = ItemStack.EMPTY;
            }
        }
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        if(BasicTechnologyVirtualSigilProcessorStructure.isPowered1(level, pos, state, blockEntity)){
            blockEntity.multiblockLevel = 1;
        } else if(BasicTechnologyVirtualSigilProcessorStructure.isFormed(level, pos, state, blockEntity)){
            blockEntity.multiblockLevel = 0;
        } else {
            blockEntity.multiblockLevel = -1;
        }
        BasicTechnologyVirtualSigilProcessorStructure.hologram(level, pos, state, blockEntity);

        blockEntity.getProgressPercent = 0;

        blockEntity.scanMultiblockStorages(level);

        blockEntity.pullEnergyFromInputs();
        blockEntity.pullItemsFromInputs();

        if (!blockEntity.forceHalt) {
            blockEntity.pushEnergyToOutputs();
            blockEntity.pushItemsToOutputs();
        }

        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(1e-20F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(1e-20F, false);

        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());

        if (level.isClientSide()) {
            setChanged(level, pos, state);
            return;
        }
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }
        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        if (blockEntity.forceHalt) {
            blockEntity.resetProgress();
            setChanged(level, pos, state);
            return;
        }

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasEnergyRecipe(blockEntity)
                && hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(blockEntity)) {

            if (blockEntity.hologramLevel == 1) {
                blockEntity.counter += blockEntity.MACHINE_MANUFACTURING_SPEED_MODIFIER_POWERED_1;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.MACHINE_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_1
                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
            } else if (blockEntity.hologramLevel == 0) {
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
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    private void scanMultiblockStorages(Level level) {
        if (level.isClientSide) return;
        if (multiblockLevel < 0) return;

        Direction facing = getBlockState().getValue(BasicTechnologyVirtualSigilProcessorBlock.FACING);
        BlockPos basePos = this.getBlockPos();
        energyInputs.clear();
        energyOutputs.clear();
        itemInputs.clear();
        itemOutputs.clear();


        String[][][] structure = switch (multiblockLevel) {
            case 0 -> BasicTechnologyVirtualSigilProcessorStructure.structure0;
            case 1 -> BasicTechnologyVirtualSigilProcessorStructure.structure1;
            default -> new String[0][][];
        };

        this.minX = switch (multiblockLevel){
            case 0 -> BasicTechnologyVirtualSigilProcessorStructure.minX0;
            case 1 -> BasicTechnologyVirtualSigilProcessorStructure.minX1;
            default -> 0;
        };

        this.maxY = switch (multiblockLevel){
            case 0 -> BasicTechnologyVirtualSigilProcessorStructure.maxY0;
            case 1 -> BasicTechnologyVirtualSigilProcessorStructure.maxY1;
            default -> 0;
        };

        this.minZ = switch (multiblockLevel){
            case 0 -> BasicTechnologyVirtualSigilProcessorStructure.maxZ0;
            case 1 -> BasicTechnologyVirtualSigilProcessorStructure.maxZ1;
            default -> 0;
        };

        for (int y = 0; y < structure.length; y++) {
            for (int z = 0; z < structure[y].length; z++) {
                for (int x = 0; x < structure[y][z].length; x++) {
                    String key = structure[y][z][x];

                    BlockPos targetPos = BasicTechnologyVirtualSigilProcessorStructure.getRelativePos(basePos,
                            x + this.minX,
                            this.maxY - y,
                            z + this.minZ, facing);

                    BlockEntity be = level.getBlockEntity(targetPos);
                    if (be == null || be == this) continue;

                    if (!key.equals("1") && !key.equals("2") && !key.equals("3") && !key.equals("4")) continue;

                    switch (key) {
                        case "1":
                            be.getCapability(CapabilityEnergy.ENERGY)
                                    .ifPresent(storage ->
                                            energyInputs.add((DCIEnergyStorageFloat) storage));
                            break;

                        case "2":
                            be.getCapability(CapabilityEnergy.ENERGY)
                                    .ifPresent(storage ->
                                            energyOutputs.add((DCIEnergyStorageFloat) storage));
                            break;

                        case "3":
                            be.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
                                    .ifPresent(itemInputs::add);
                            break;

                        case "4":
                            be.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
                                    .ifPresent(itemOutputs::add);
                            break;
                    }
                }
            }
        }
    }

    private void pullEnergyFromInputs() {
        float needed = MACHINE_CAPACITY - ENERGY_STORAGE.getEnergyStoredFloat();
        if (needed <= 0) return;

        for (DCIEnergyStorageFloat input : energyInputs) {

            if (needed <= 0) break;

            float extracted = input.extractEnergyFloat(needed, false);
            if (extracted > 0) {
                ENERGY_STORAGE.receiveEnergyFloat(extracted, false);
                needed -= extracted;
            }
        }
    }

    private void pushEnergyToOutputs() {
        float stored = ENERGY_STORAGE.getEnergyStoredFloat();
        float reserve = this.MACHINE_CAPACITY - this.MACHINE_TRANSFER;

        float transferable = stored - reserve;
        if (transferable <= 0) return;

        for (DCIEnergyStorageFloat output : energyOutputs) {

            if (transferable <= 0) break;

            float accepted = output.receiveEnergyFloat(transferable, false);

            if (accepted > 0) {
                ENERGY_STORAGE.extractEnergyFloat(accepted, false);
                transferable -= accepted;
            }
        }
    }

    public void toggleInputLock() {
        inputLocked = !inputLocked;
        if (inputLocked) {
            for (int i = 0; i < itemHandler.getSlots(); i++) {
                ItemStack stack = itemHandler.getStackInSlot(i);
                if (!stack.isEmpty()) {
                    inputLockedRecipe[i] = stack.copy();
                } else {
                    inputLockedRecipe[i] = ItemStack.EMPTY;
                }
            }
        } else {
            Arrays.fill(inputLockedRecipe, ItemStack.EMPTY);
        }

        setChanged();
    }

    private void pullItemsFromInputs() {
        for (IItemHandler input : itemInputs) {
            for (int inputSlot = 0; inputSlot < input.getSlots(); inputSlot++) {
                ItemStack stack = input.getStackInSlot(inputSlot);
                if (stack.isEmpty()) continue;

                for (int machineSlot = IN_0; machineSlot <= RECIPE_COUNT - 1; machineSlot++) {
                    if (inputLocked) {

                        ItemStack lock = inputLockedRecipe[machineSlot];

                        if (lock.isEmpty()) continue;

                        if (!ItemStack.isSameItemSameTags(stack, lock)) continue;

                        if(lock == null) lock = ItemStack.EMPTY;

                        int current = itemHandler.getStackInSlot(machineSlot).getCount();
                        int limit = lock.getCount();

                        if (current >= limit) continue;
                    }

                    ItemStack simulated = itemHandler.insertItem(machineSlot, stack.copy(), true);
                    int insertable = stack.getCount() - simulated.getCount();

                    if (insertable > 0) {
                        if (inputLocked) {

                            int current = itemHandler.getStackInSlot(machineSlot).getCount();
                            int limit = inputLockedRecipe[machineSlot].getCount();
                            int remain = limit - current;

                            insertable = Math.min(insertable, remain);
                        }

                        ItemStack extracted = input.extractItem(inputSlot, insertable, false);
                        itemHandler.insertItem(machineSlot, extracted, false);

                        return;
                    }
                }
            }
        }
    }

    private void pushItemsToOutputs() {
        for (int machineSlot = OUT_0; machineSlot <= OUT_0 + OUTPUT_COUNT - 1; machineSlot++) {
            ItemStack stack = itemHandler.getStackInSlot(machineSlot);
            if (stack.isEmpty()) continue;

            for (IItemHandler output : itemOutputs) {

                for (int outputSlot = 0; outputSlot < output.getSlots(); outputSlot++) {

                    ItemStack leftover = output.insertItem(outputSlot, stack.copy(), false);

                    if (leftover.isEmpty()) {
                        itemHandler.setStackInSlot(machineSlot, ItemStack.EMPTY);
                        return;
                    }
                    else if (leftover.getCount() < stack.getCount()) {
                        itemHandler.setStackInSlot(machineSlot, leftover);
                        return;
                    }
                }
            }
        }
    }

    public static boolean craftCheck(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) >= match.get().getRequiredTime() * 20;
        }
        return false;
    }

    private static boolean hasRecipe(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    private static boolean hasAmountRecipe(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(IN_0).getCount() >= match.get().getInput0Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(IN_1).getCount() >= match.get().getInput1Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(IN_2).getCount() >= match.get().getInput2Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(IN_3).getCount() >= match.get().getInput3Item().getCount()
                && blockEntity.itemHandler.getStackInSlot(IN_4).getCount() >= match.get().getInput4Item().getCount();
    }

    private static boolean hasEnergyRecipe(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.ENERGY_STORAGE.getEnergyStoredFloat() >= match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F;
    }

    private static void craftItem(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            blockEntity.itemHandler.extractItem(IN_0, match.get().getInput0Item().getCount(), false);
            blockEntity.itemHandler.extractItem(IN_1, match.get().getInput1Item().getCount(), false);
            blockEntity.itemHandler.extractItem(IN_2, match.get().getInput2Item().getCount(), false);
            blockEntity.itemHandler.extractItem(IN_3, match.get().getInput3Item().getCount(), false);
            blockEntity.itemHandler.extractItem(IN_4, match.get().getInput4Item().getCount(), false);
            blockEntity.itemHandler.setStackInSlot(OUT_0, new ItemStack(match.get().getOutput0Item().getItem(),
                    blockEntity.itemHandler.getStackInSlot(OUT_0).getCount() + match.get().getOutput0Item().getCount()));
            blockEntity.resetProgress();
        }
    }

    public void resetProgress() {
        this.counter = 0;
    }

    private static boolean hasNotReachedStackLimit(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(OUT_0).getCount() + match.get().getOutput0Item().getCount() <= blockEntity.itemHandler.getStackInSlot(OUT_0).getMaxStackSize();
    }

    private static boolean canInsertItemIntoOutputSlot(BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyVirtualSigilProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyVirtualSigilProcessorRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.itemHandler.getStackInSlot(OUT_0).getItem() == match.get().getOutput0Item().getItem() || blockEntity.itemHandler.getStackInSlot(OUT_0).isEmpty();
    }

    public void insertRecipeInputsFromPlayer(Player player, Recipe<?> recipe, boolean shift) {
        if (!(recipe instanceof BasicTechnologyVirtualSigilProcessorRecipe recipeData)) return;

        player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(playerInv -> {
            this.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(machineInv -> {

                ItemStack[] recipeInputs = new ItemStack[]{
                        recipeData.getInput0Item(), recipeData.getInput1Item(), recipeData.getInput2Item(),
                        recipeData.getInput3Item(), recipeData.getInput4Item()
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
