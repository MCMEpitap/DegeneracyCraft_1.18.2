package net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
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
    public float BP_STEAM_GENERATOR_CAPACITY = 40000F;
    public float BP_STEAM_GENERATOR_TRANSFER = 16F;
    public float BP_STEAM_GENERATOR_OUTPUT = 16F;
    public float BP_STEAM_GENERATOR_OUTPUT_FORMED = BP_STEAM_GENERATOR_OUTPUT * 2F;
    public float BP_STEAM_GENERATOR_OUTPUT_POWERED_0 = BP_STEAM_GENERATOR_OUTPUT * 3F;

    public int BP_STEAM_GENERATOR_WATER_CAPACITY = 10000;
    protected final ContainerData data;
    public int counter;
    public int waterCounter;
    public boolean formed0;
    public boolean formed1;
    public boolean formed2;
    public boolean powered0_1;
    public boolean isFormed;
    public boolean isPowered0;

    public final ItemStackHandler itemHandler = new ItemStackHandler(5) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
//            if (slot == 0
////                    && !stack.is(DCItems.EMPTY_CONTAINER.get())
////                    && !stack.is(DCItems.WATER_CONTAINER.get())
//                    && !stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
//                    && !stack.is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
//                    && !stack.is(DCItems.MACHINE_HALT_DEVICE.get())) {
//                return ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0;
////                return true;
//            }
//            if (slot == 1) {
//                return stack.is(DCItems.EMPTY_CONTAINER.get());
////                return true;
//            }
//            if (slot == 2) {
//                return stack.is(DCItems.WATER_CONTAINER.get());
////                return true;
//            }
//            if (slot == 3) {
//                return stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
//                        || stack.is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
//            }
//            if (slot == 4) {
//                return stack.is(DCItems.MACHINE_HALT_DEVICE.get());
//            }
//
////            stack.getItem()
//            return false;
//        }
//
//            if (slot == 0) {
//                return ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0;
//            }
            return switch (slot) {
                case 0 -> ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0;
                case 1 -> false;
                case 2 -> stack.getItem() == DCItems.WATER_CONTAINER.get();
                case 3 -> stack.getItem() == DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get()
                        || stack.getItem() == DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get();
                case 4 -> stack.getItem() == DCItems.MACHINE_HALT_DEVICE.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };
    private final DCEnergyStorageFloatBase ENERGY_STORAGE = new DCEnergyStorageFloatBase(BP_STEAM_GENERATOR_CAPACITY, BP_STEAM_GENERATOR_TRANSFER) {
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
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (outputSlot) -> outputSlot == 1, (outputSlot, stack) -> false)),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 0 || index == 2,
                            (index, stack) -> itemHandler.isItemValid(0, stack) || itemHandler.isItemValid(2, stack)))
            );

    public BasicPowerSteamGeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_STEAM_GENERATOR_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicPowerSteamGeneratorBlockEntity.this.counter;
                    case 1 -> BasicPowerSteamGeneratorBlockEntity.this.waterCounter;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicPowerSteamGeneratorBlockEntity.this.counter = value;
                }
                if (index == 1) {
                    BasicPowerSteamGeneratorBlockEntity.this.waterCounter = value;
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
        return new TextComponent("BP-CS-T Steam Generator");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new BasicPowerSteamGeneratorMenu(id, inventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @org.jetbrains.annotations.Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY && (side == Direction.UP || side == Direction.DOWN || side == Direction.NORTH)) {
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
        nbt.putInt("water_counter", waterCounter);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("energy"));
        counter = nbt.getInt("counter");
        waterCounter = nbt.getInt("water_counter");
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
//        blockEntity.formed0 = BasicPowerSteamGeneratorStructure.isFormed0(level, pos, state, blockEntity);
//        blockEntity.formed1 = BasicPowerSteamGeneratorStructure.isFormed1(level, pos, state, blockEntity);
//        blockEntity.formed2 = BasicPowerSteamGeneratorStructure.isFormed2(level, pos, state, blockEntity);
//        blockEntity.powered0_1 = BasicPowerSteamGeneratorStructure.powered0_1(level, pos, state, blockEntity);
        blockEntity.isFormed = BasicPowerSteamGeneratorStructure.isFormed(level, pos, state, blockEntity);
//        blockEntity.isPowered0 = BasicPowerSteamGeneratorStructure.isPowered0(blockEntity);

//        BasicPowerSteamGeneratorStructure.hologram(level, pos, state, blockEntity);
        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(0.0000000000000000001F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(0.0000000000000000001F, false);
        if (level.isClientSide()) {
            return;
        }
        if (!isHaltDevice(blockEntity)) {
            if (blockEntity.counter > 0 && blockEntity.waterCounter > 0) {
                if (blockEntity.isPowered0) {
                    blockEntity.counter--;
                    blockEntity.waterCounter--;
                    blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.BP_STEAM_GENERATOR_OUTPUT_POWERED_0, false);
                    setChanged(level, pos, state);
                } else if (blockEntity.isFormed) {
                    blockEntity.counter--;
                    blockEntity.waterCounter--;
                    blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.BP_STEAM_GENERATOR_OUTPUT_FORMED, false);
                    setChanged(level, pos, state);
                } else {
                    blockEntity.counter--;
                    blockEntity.waterCounter--;
                    blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.BP_STEAM_GENERATOR_OUTPUT, false);
                    setChanged(level, pos, state);
                }
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
                    && blockEntity.waterCounter < blockEntity.BP_STEAM_GENERATOR_WATER_CAPACITY - 1000
                    && hasNotReachedStackLimit(blockEntity)) {
                blockEntity.itemHandler.extractItem(2, 1, false);
                blockEntity.waterCounter += 1000;
                blockEntity.itemHandler.setStackInSlot(1, new ItemStack(DCItems.EMPTY_CONTAINER.get(),
                        blockEntity.itemHandler.getStackInSlot(1).getCount() + 1));
            }
        }
        setChanged(level, pos, state);
    }

    public static boolean isHaltDevice(BasicPowerSteamGeneratorBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(4).is(DCItems.MACHINE_HALT_DEVICE.get());
    }

    private static boolean hasNotReachedStackLimit(BasicPowerSteamGeneratorBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(1).getCount() < blockEntity.itemHandler.getStackInSlot(1).getMaxStackSize();
    }
}