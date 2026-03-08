package net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_power_steam_generator;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserStructure;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.DCEnergySyncS2CPacket;
import net.epitap.degeneracycraft.util.WrappedHandler;
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
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

public class BasicPowerSteamGeneratorBlockEntity extends BlockEntity implements MenuProvider {
    public float MACHINE_CAPACITY = 40000F;
    public float MACHINE_TRANSFER = 16F;
    public float MACHINE_OUTPUT = 16F;
    public float MACHINE_OUTPUT_FORMED = MACHINE_OUTPUT * 2F;
    public float MACHINE_OUTPUT_POWERED_0 = MACHINE_OUTPUT * 3F;

    public int MACHINE_WATER_CAPACITY = 10000;
    protected final ContainerData data;
    public int counter;
    public int waterCounter;

    public boolean isFormed;
    public boolean isPowered0;

    public int hologramLevel = -1;
    public int multiblockLevel = -1;

    public boolean forceHalt = false;

    public static final int DATA_COUNTER      = 0;
    public static final int DATA_WATER     = 1;
    public static final int DATA_HOLOGRAM     = 2;
    public static final int DATA_FORCE_STOP   = 3;
    public static final int DATA_MULTIBLOCK   = 4;
    
    public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
            return switch (slot) {
                case 0 -> ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0;
                case 1 -> false;
                case 2 -> stack.getItem() == DCItems.WATER_CONTAINER.get();
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
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 1, (out, stack) -> false)),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0 || in == 2,
                            (in, stack) -> itemHandler.isItemValid(0, stack) || itemHandler.isItemValid(2, stack)))
            );

    public BasicPowerSteamGeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_STEAM_GENERATOR_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case DATA_COUNTER    -> counter;
                    case DATA_WATER   -> waterCounter;
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
                    case DATA_WATER -> waterCounter = value;
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
        return new TextComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new BasicPowerSteamGeneratorMenu(id, inventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @org.jetbrains.annotations.Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY && (side == Direction.UP || side == Direction.DOWN)) {
            return lazyEnergyHandler.cast();
        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(BasicPowerSteamGeneratorBlock.FACING);

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
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putFloat("energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        nbt.putInt("waterCounter", waterCounter);
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
        waterCounter = nbt.getInt("waterCounter");
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

    public static void tick(Level level, BlockPos pos, BlockState state, BasicPowerSteamGeneratorBlockEntity blockEntity) {
        if(BasicPowerSteamGeneratorStructure.isPowered1(level, pos, state, blockEntity)){
            blockEntity.multiblockLevel = 1;
        } else if(BasicPowerSteamGeneratorStructure.isFormed(level, pos, state, blockEntity)){
            blockEntity.multiblockLevel = 0;
        } else {
            blockEntity.multiblockLevel = -1;
        }
        BasicPowerSteamGeneratorStructure.hologram(level, pos, state, blockEntity);


        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(1e-20F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(1e-20F, false);
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());

        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        if (level.isClientSide()) {
            return;
        }

        if (blockEntity.forceHalt) {
            blockEntity.counter = 0;
            setChanged(level, pos, state);
            return;
        }


        if (blockEntity.counter > 0 && blockEntity.waterCounter > 0) {
            if (blockEntity.multiblockLevel == 1) {
                blockEntity.counter--;
                blockEntity.waterCounter--;
                blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.MACHINE_OUTPUT_POWERED_0, false);
                setChanged(level, pos, state);
            } else if (blockEntity.multiblockLevel == 0) {
                blockEntity.counter--;
                blockEntity.waterCounter--;
                blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.MACHINE_OUTPUT_FORMED, false);
                setChanged(level, pos, state);
            } else {
                blockEntity.counter--;
                blockEntity.waterCounter--;
                blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.MACHINE_OUTPUT, false);
                setChanged(level, pos, state);
            }

            if (blockEntity.counter > 0 && blockEntity.waterCounter <= 0) {
                blockEntity.counter--;
            }

            ItemStack stack = blockEntity.itemHandler.getStackInSlot(0);
            int burnTime = ForgeHooks.getBurnTime(stack, RecipeType.SMELTING);
            if (burnTime > 0 && blockEntity.counter <= 0) {
                blockEntity.itemHandler.extractItem(0, 1, false);
                blockEntity.counter = burnTime;
            }

            if (blockEntity.itemHandler.getStackInSlot(2).is(DCItems.WATER_CONTAINER.get())
                    && blockEntity.waterCounter < blockEntity.MACHINE_WATER_CAPACITY - 1000
                    && hasNotReachedStackLimit(blockEntity)) {
                blockEntity.itemHandler.extractItem(2, 1, false);
                blockEntity.waterCounter += 1000;
                blockEntity.itemHandler.setStackInSlot(1, new ItemStack(DCItems.EMPTY_CONTAINER.get(),
                        blockEntity.itemHandler.getStackInSlot(1).getCount() + 1));
            }
        }
        setChanged(level, pos, state);
    }

    private static boolean hasNotReachedStackLimit(BasicPowerSteamGeneratorBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(1).getCount() < blockEntity.itemHandler.getStackInSlot(1).getMaxStackSize();
    }
}