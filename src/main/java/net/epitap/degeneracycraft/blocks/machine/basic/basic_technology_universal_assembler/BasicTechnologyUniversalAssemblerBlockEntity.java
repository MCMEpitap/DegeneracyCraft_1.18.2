package net.epitap.degeneracycraft.blocks.machine.basic.basic_technology_universal_assembler;

import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_power_composite_structure_type_thermal_generator.BasicPowerCompositeStructureTypeThermalGeneratorBlock;
import net.epitap.degeneracycraft.dcenum.MBPPos;
import net.epitap.degeneracycraft.energy.DCEnergyStorageFloatBase;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.test.BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure;
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
import net.minecraft.world.level.block.Blocks;
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

    protected final ContainerData data;

    public int counter;
    public boolean formed0;
    public boolean formed1;
    public boolean formed2;
    public boolean isFormed;
    public final ItemStackHandler itemHandler = new ItemStackHandler(12) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            for (int i = 0; i < 10; i++) {
                if (slot == i && !stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get()) && !stack.is(DCItems.MACHINE_HALT_DEVICE.get())) {
                    return true;
                }
            }
            if (slot == 10) {
                return stack.is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get());
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
            Map.of(Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (out) -> out == 9, (in, stack) -> false)),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack))));

    public BasicTechnologyUniversalAssemblerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DCBlockEntities.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicTechnologyUniversalAssemblerBlockEntity.this.counter;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicTechnologyUniversalAssemblerBlockEntity.this.counter = value;
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
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new BasicTechnologyUniversalAssemblerMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY && (side == Direction.UP || side == Direction.DOWN || side == Direction.NORTH)) {
            return lazyEnergyHandler.cast();
        } else if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);

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
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("bt_u_assembler.energy"));
        counter = nbt.getInt("counter");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        blockEntity.formed0 = blockEntity.isFormed0(level, pos, state);
        blockEntity.formed1 = blockEntity.isFormed1(level, pos, state);
        blockEntity.formed2 = blockEntity.isFormed2(level, pos, state);
        blockEntity.isFormed = blockEntity.isFormed();
        blockEntity.hologram(level, pos, state, blockEntity);

        blockEntity.ENERGY_STORAGE.receiveEnergyFloat(0.0000000000000000001F, false);
        blockEntity.ENERGY_STORAGE.extractEnergyFloat(0.0000000000000000001F, false);
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }
        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

        if (hasRecipe(blockEntity) && hasAmountRecipe(blockEntity) && hasAmountEnergyRecipe(blockEntity) && !isHaltDevice(blockEntity)) {
            if (hasNotReachedStackLimit(blockEntity) && canInsertItemIntoOutputSlot(inventory, match.get().getOutput0Item())) {
                blockEntity.counter++;
                if (craftCheck(blockEntity)) {
                    craftItem(blockEntity);
                }
                blockEntity.ENERGY_STORAGE.extractEnergyFloat(match.get().getRequiredEnergy() / match.get().getRequiredTime() / 20, false);
                setChanged(level, pos, state);
            } else {
                blockEntity.resetProgress();
                setChanged(level, pos, state);
            }
        } else {
            blockEntity.resetProgress();
            setChanged(level, pos, state);
        }
    }

    private static boolean hasAmountEnergyRecipe(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<BasicMachineElementProcessorRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicMachineElementProcessorRecipe.Type.INSTANCE, inventory, level);

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

        Optional<RedstonePoweredMachineElementManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE, inventory, level);

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

        Optional<RedstonePoweredMachineElementManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent();
    }

    public static boolean hasAmountRecipe(BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<RedstonePoweredMachineElementManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE, inventory, level);

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

        Optional<RedstonePoweredMachineElementManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE, inventory, level);

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

        Optional<RedstonePoweredMachineElementManufactureMachineRecipe> match = level.getRecipeManager()
                .getRecipeFor(RedstonePoweredMachineElementManufactureMachineRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            return (this.data.get(0) / (match.get().getRequiredTime() * 20)) * 100;
        }
        return 0;
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

    public boolean isFormed() {
        return isFormed = formed0 && formed1 && formed2;
    }

    public boolean isFormed0(Level level, BlockPos pos, BlockState state) {
        Direction dir = state.getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);
        BlockPos blockpos = new BlockPos(this.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        Optional<BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure> match = level.getRecipeManager()
                .getRecipeFor(BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.Type.INSTANCE, inventory, level);

        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
        boolean pos9 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());

        setChanged(level, pos, state);
        return formed0 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8 && pos9;
    }

    public boolean isFormed1(Level level, BlockPos pos, BlockState state) {
        Direction dir = state.getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(this.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        Optional<BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure> match = level.getRecipeManager()
                .getRecipeFor(BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.Type.INSTANCE, inventory, level);


        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_2.xPos).above(MBPPos.x0y0z_2.yPos).relative(reZ, MBPPos.x0y0z_2.zPos))
                .isAir();
        boolean pos5 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());
        boolean pos6 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos7 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_1.xPos).above(MBPPos.x0y0z_1.yPos).relative(reZ, MBPPos.x0y0z_1.zPos))
                .isAir();
        boolean pos8 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());

        setChanged(level, pos, state);
        return formed1 = pos0 && pos1 && pos2 && pos3 && pos4 && pos5 && pos6 && pos7 && pos8;
    }

    public boolean isFormed2(Level level, BlockPos pos, BlockState state) {
        Direction dir = state.getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);
        /*relative position getCounterClockWise=+x,above=+y,nothing=+z*/
        BlockPos blockpos = new BlockPos(this.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        boolean pos0 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos1 = level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos2 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos3 = level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        boolean pos4 = level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                .is(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get());

        setChanged(level, pos, state);
        return formed2 = pos0 && pos1 && pos2 && pos3 && pos4;
    }

    public void hologram(Level level, BlockPos pos, BlockState state, BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
        Direction dir = state.getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);
        BlockPos blockpos = new BlockPos(this.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        if (blockEntity.itemHandler.getStackInSlot(1).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos),
                        DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            setChanged(level, pos, state);
            if (blockEntity.formed0) {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos),
                            DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                setChanged(level, pos, state);
                if (formed1) {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos),
                                DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos),
                                DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos),
                                DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                } else {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                            .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                }
            } else {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                        .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
            }
        } else {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                    .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
        }
        setChanged(level, pos, state);
    }

}

