package net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
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

import java.util.Map;
import java.util.Optional;


public class BasicTechnologyUniversalAssemblerBlockEntity extends BlockEntity implements MenuProvider {
    public float BT_U_ASSEMBLER_CAPACITY = 20000F;
    public float BT_U_ASSEMBLER_TRANSFER = 16F;
    public float BT_U_ASSEMBLER_MANUFACTURING_SPEED_MODIFIER_FORMED = 2F;
    public float BT_U_ASSEMBLER_MANUFACTURING_SPEED_MODIFIER_POWERED_0 = 3F;
    public float BT_U_ASSEMBLER_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED = 1.5F;
    public float BT_U_ASSEMBLER_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0 = 2.0F;

    protected final ContainerData data;

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

    private final DCEnergyStorageFloatBase ENERGY_STORAGE = new DCEnergyStorageFloatBase(BT_U_ASSEMBLER_CAPACITY, BT_U_ASSEMBLER_TRANSFER) {
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
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 9, (out, stack) -> false)));

    public BasicTechnologyUniversalAssemblerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicTechnologyUniversalAssemblerBlockEntity.this.counter;
                    case 1 -> BasicTechnologyUniversalAssemblerBlockEntity.this.getProgressPercent;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicTechnologyUniversalAssemblerBlockEntity.this.counter = value;
                } else if (index == 1) {
                    BasicTechnologyUniversalAssemblerBlockEntity.this.getProgressPercent = value;
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
        return new BasicTechnologyUniversalAssemblerMenu(pContainerId, pInventory, this, this.data);
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
                Direction localDir = this.getBlockState().getValue(BasicTechnologyUniversalAssemblerBlock.FACING);

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
        nbt.putFloat("bt_u_assembler.energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        nbt.putInt("getProgressPercent", getProgressPercent);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("bt_u_assembler.energy"));
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

    public static void tick(Level level, BlockPos pos, BlockState state, BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        blockEntity.formed0 = BasicTechnologyUniversalAssemblerStructure.isFormed0(level, pos, state, blockEntity);
        blockEntity.formed1 = BasicTechnologyUniversalAssemblerStructure.isFormed1(level, pos, state, blockEntity);
        blockEntity.formed2 = BasicTechnologyUniversalAssemblerStructure.isFormed2(level, pos, state, blockEntity);
        blockEntity.powered0_1 = BasicTechnologyUniversalAssemblerStructure.powered0_1(level, pos, state, blockEntity);
        blockEntity.isFormed = BasicTechnologyUniversalAssemblerStructure.isFormed(blockEntity);
        blockEntity.isPowered0 = BasicTechnologyUniversalAssemblerStructure.isPowered0(blockEntity);

        BasicTechnologyUniversalAssemblerStructure.hologram(level, pos, state, blockEntity);
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
        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasAmountEnergyRecipe(blockEntity) && !isHaltDevice(blockEntity)
                && hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(inventory, match.get().getOutput0Item())) {
            if (blockEntity.isPowered0) {
                blockEntity.counter += blockEntity.BT_U_ASSEMBLER_MANUFACTURING_SPEED_MODIFIER_POWERED_0;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.BT_U_ASSEMBLER_MANUFACTURING_ENERGY_USAGE_MODIFIER_POWERED_0
                        * match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20F, false);
            } else if (blockEntity.isFormed) {
                blockEntity.counter += blockEntity.BT_U_ASSEMBLER_MANUFACTURING_SPEED_MODIFIER_FORMED;
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(blockEntity.BT_U_ASSEMBLER_MANUFACTURING_ENERGY_USAGE_MODIFIER_FORMED
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

    private static boolean hasAmountEnergyRecipe(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);

        return blockEntity.getEnergyStorage().getEnergyStoredFloat() >= match.get().getRequiredEnergy() / match.get().getRequiredTime();
    }

    public static boolean isHaltDevice(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(11).is(DCItems.MACHINE_HALT_DEVICE.get());
    }

    public static boolean craftCheck(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return blockEntity.data.get(0) > match.get().getRequiredTime() * 20;
        }
        return false;
    }

    private static boolean hasRecipe(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    public static boolean hasAmountRecipe(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);

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

    private static void craftItem(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);

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

    public void resetProgress() {
        this.counter = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(9).getItem() == output.getItem() || inventory.getItem(9).isEmpty();
    }

    private static boolean hasNotReachedStackLimit(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        return blockEntity.itemHandler.getStackInSlot(9).getCount() < blockEntity.itemHandler.getStackInSlot(9).getMaxStackSize();
    }
}

