package net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_thermal_generator;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlock;
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

public class BasicPowerThermalGeneratorBlockEntity extends BlockEntity implements MenuProvider {
    public float BP_CS_T_THERMAL_GENERATOR_CAPACITY = 40000F;
    public float BP_CS_T_THERMAL_GENERATOR_TRANSFER = 16F;
    public float BP_CS_T_THERMAL_GENERATOR_OUTPUT = 16F;
    public float BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED = BP_CS_T_THERMAL_GENERATOR_OUTPUT * 2F;
    public float BP_CS_T_THERMAL_GENERATOR_OUTPUT_POWERED_0 = BP_CS_T_THERMAL_GENERATOR_OUTPUT * 3F;
    protected final ContainerData data;
    public int counter;
    public boolean formed0;
    public boolean formed1;
    public boolean formed2;
    public boolean powered0_1;
    public boolean isFormed;
    public boolean isPowered0;
    public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
            if (slot == 0 && !stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                    && !stack.is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                    && !stack.is(DCItems.MACHINE_HALT_DEVICE.get())) {
                return ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0;
            }
            if (slot == 1) {
                return stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())
                        || stack.is(DCItems.BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
            }
            if (slot == 2) {
                return stack.is(DCItems.MACHINE_HALT_DEVICE.get());
            }
            return false;
        }
    };
    private final DCEnergyStorageFloatBase ENERGY_STORAGE = new DCEnergyStorageFloatBase(BP_CS_T_THERMAL_GENERATOR_CAPACITY, BP_CS_T_THERMAL_GENERATOR_TRANSFER) {
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
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))));

    public BasicPowerThermalGeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_THERMAL_GENERATOR_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicPowerThermalGeneratorBlockEntity.this.counter;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicPowerThermalGeneratorBlockEntity.this.counter = value;
                }
            }

            @Override
            public int getCount() {
                return 1;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("BP-CS-T Thermal Generator");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new BasicPowerThermalGeneratorMenu(id, inventory, this, this.data);
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
                Direction localDir = this.getBlockState().getValue(BasicTechnologyMachineManufacturerBlock.FACING);

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
        nbt.putFloat("bp_cs_t_thermal_generator.energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("bp_cs_t_thermal_generator.energy"));
        counter = nbt.getInt("counter");
        super.load(nbt);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BasicPowerThermalGeneratorBlockEntity blockEntity) {
        blockEntity.formed0 = BasicPowerThermalGeneratorStructure.isFormed0(level, pos, state, blockEntity);
        blockEntity.formed1 = BasicPowerThermalGeneratorStructure.isFormed1(level, pos, state, blockEntity);
        blockEntity.formed2 = BasicPowerThermalGeneratorStructure.isFormed2(level, pos, state, blockEntity);
        blockEntity.powered0_1 = BasicPowerThermalGeneratorStructure.powered0_1(level, pos, state, blockEntity);
        blockEntity.isFormed = BasicPowerThermalGeneratorStructure.isFormed(blockEntity);
        blockEntity.isPowered0 = BasicPowerThermalGeneratorStructure.isPowered0(blockEntity);

        BasicPowerThermalGeneratorStructure.hologram(level, pos, state, blockEntity);

        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(0.0000000000000000001F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(0.0000000000000000001F, false);
        if (level.isClientSide()) {
            return;
        }
        if (!isHaltDevice(blockEntity)) {
            if (blockEntity.counter > 0) {
                if (blockEntity.isPowered0) {
                    blockEntity.counter--;
                    blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_POWERED_0, false);
                    setChanged(level, pos, state);
                } else if (blockEntity.isFormed) {
                    blockEntity.counter--;
                    blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED, false);
                    setChanged(level, pos, state);
                } else {
                    blockEntity.counter--;
                    blockEntity.ENERGY_STORAGE.receiveEnergyFloat(blockEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT, false);
                    setChanged(level, pos, state);
                }
            } else {
                ItemStack stack = blockEntity.itemHandler.getStackInSlot(0);
                int burnTime = ForgeHooks.getBurnTime(stack, RecipeType.SMELTING);
                if (burnTime > 0) {
                    blockEntity.itemHandler.extractItem(0, 1, false);
                    blockEntity.counter = burnTime;
                }
                setChanged(level, pos, state);
            }
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    public static boolean isHaltDevice(BasicPowerThermalGeneratorBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(2).is(DCItems.MACHINE_HALT_DEVICE.get());
    }
}