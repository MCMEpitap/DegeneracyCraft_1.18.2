package net.epitap.degeneracycraft.blocks.entity.machine.basic;

import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.epitap.degeneracycraft.blocks.block.DCHoloBlocks;
import net.epitap.degeneracycraft.blocks.block.machine.basic.BasicPowerCompositeStructureTypeThermalGeneratorBlock;
import net.epitap.degeneracycraft.blocks.entity.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.menu.machine.basic.BasicPowerCompositeStructureTypeThermalGeneratorMenu;
import net.epitap.degeneracycraft.dcenum.MBPPos;
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
import net.minecraft.world.level.block.Blocks;
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

public class BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity extends BlockEntity implements MenuProvider {

    public float BP_CS_T_THERMAL_GENERATOR_CAPACITY = 40000F;
    public float BP_CS_T_THERMAL_GENERATOR_TRANSFER = 400F;
    public float BP_CS_T_THERMAL_GENERATOR_OUTPUT = 16F;
    public float BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED = 40000F * 20;
    private final ItemStackHandler itemHandler = new ItemStackHandler(2) {

        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
            return switch (slot) {
                case 0 -> ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0;
                case 1 -> stack.getItem() == DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get();
                default -> super.isItemValid(slot, stack);
            };
        }

        @Nonnull
        @Override
        public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
            if (slot == 0) {
                if (ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) <= 0) {
                    return stack;
                }
            }
            return super.insertItem(slot, stack, simulate);
        }
    };


    private final DCEnergyStorageFloatBase ENERGY_STORAGE = new DCEnergyStorageFloatBase(BP_CS_T_THERMAL_GENERATOR_CAPACITY, BP_CS_T_THERMAL_GENERATOR_TRANSFER) {
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


    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            Map.of(Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (in) -> in == 0, (in, stack) -> itemHandler.isItemValid(0, stack)))
            );

    private LazyOptional<DCIEnergyStorageFloat> lazyEnergyHandler = LazyOptional.empty();

    protected final ContainerData data;
    public int counter;

    public BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(DCBlockEntities.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity.this.counter;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                if (index == 0) {
                    BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity.this.counter = value;
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
        return new TextComponent("CS-T Thermal Generator Tier1");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new BasicPowerCompositeStructureTypeThermalGeneratorMenu(id, inventory, this, this.data);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY) {
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
        nbt.putFloat("bp_cs_t_thermal_generator.energy", ENERGY_STORAGE.getEnergyStoredFloat());
        nbt.putInt("counter", counter);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        ENERGY_STORAGE.setEnergyFloat(nbt.getFloat("bp_cs_t_thermal_generator.energy"));
        counter = nbt.getInt("counter");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }




    public static void tick(Level level, BlockPos pos, BlockState state, BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity pEntity) {
        pEntity.formed0 = pEntity.isFormed0(level, pos, state);
        pEntity.formed1 = pEntity.isFormed1(level, pos, state);
        pEntity.formed2 = pEntity.isFormed2(level, pos, state);
        pEntity.isFormed = pEntity.isFormed();
        pEntity.ENERGY_STORAGE.receiveEnergyFloat(0.0000000000000000001F, false);
        pEntity.ENERGY_STORAGE.extractEnergyFloat(0.0000000000000000001F, false);
        pEntity.hologram(level, pos, state, pEntity);

        if (level.isClientSide()) {
            return;
        }

        if (pEntity.counter > 0) {
            if (pEntity.isFormed) {
                pEntity.counter--;
                pEntity.ENERGY_STORAGE.receiveEnergyFloat(pEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT_FORMED, false);
                setChanged(level, pos, state);
            } else {
                pEntity.counter--;
                pEntity.ENERGY_STORAGE.receiveEnergyFloat(pEntity.BP_CS_T_THERMAL_GENERATOR_OUTPUT, false);
                setChanged(level, pos, state);
            }
        } else {
            ItemStack stack = pEntity.itemHandler.getStackInSlot(0);
            int burnTime = ForgeHooks.getBurnTime(stack, RecipeType.SMELTING);
            if (burnTime > 0) {
                pEntity.itemHandler.extractItem(0, 1, false);
                pEntity.counter = burnTime;
            }
            setChanged(level, pos, state);
        }
        setChanged(level, pos, state);
    }

    public boolean isFormed0(Level level, BlockPos pos, BlockState state) {
        Direction dir = state.getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);
        BlockPos blockpos = new BlockPos(this.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

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
                .is(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());

        setChanged(level, pos, state);
        return formed2 = pos0 && pos1 && pos2 && pos3 && pos4;
    }

    public boolean formed0;
    public boolean formed1;
    public boolean formed2;
    public boolean isFormed (){
        return isFormed = formed0 && formed1 && formed2;
    }
    public boolean isFormed;
    public void hologram(Level level, BlockPos pos, BlockState state, BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity pEntity) {
        Direction dir = state.getValue(BasicPowerCompositeStructureTypeThermalGeneratorBlock.FACING);
        BlockPos blockpos = new BlockPos(this.getBlockPos());
        Direction reX = dir.getCounterClockWise();
        Direction reZ = dir;

        if (pEntity.itemHandler.getStackInSlot(1).is(DCItems.MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER.get())) {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos)).isAir()) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos),
                        DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
            }
            setChanged(level, pos, state);
            if (pEntity.formed0) {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos)).isAir()) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos),
                            DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                }
                setChanged(level, pos, state);
                if (formed1) {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos),
                                DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos),
                                DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos),
                                DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos),
                                DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos)).isAir()) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos),
                                DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get().defaultBlockState(), 1);
                    }
                } else {
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos))
                            .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                            .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                            .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                            .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                    if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                            .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                        level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                    }
                }
            } else {
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
                if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                        .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                    level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
                }
            }
        } else {
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_3.xPos).above(MBPPos.x_1y_1z_3.yPos).relative(reZ, MBPPos.x_1y_1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_3.xPos).above(MBPPos.x0y_1z_3.yPos).relative(reZ, MBPPos.x0y_1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_3.xPos).above(MBPPos.x1y_1z_3.yPos).relative(reZ, MBPPos.x1y_1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_2.xPos).above(MBPPos.x_1y_1z_2.yPos).relative(reZ, MBPPos.x_1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_2.xPos).above(MBPPos.x0y_1z_2.yPos).relative(reZ, MBPPos.x0y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_2.xPos).above(MBPPos.x1y_1z_2.yPos).relative(reZ, MBPPos.x1y_1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y_1z_1.xPos).above(MBPPos.x_1y_1z_1.yPos).relative(reZ, MBPPos.x_1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z_1.xPos).above(MBPPos.x0y_1z_1.yPos).relative(reZ, MBPPos.x0y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y_1z_1.xPos).above(MBPPos.x1y_1z_1.yPos).relative(reZ, MBPPos.x1y_1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y_1z0.xPos).above(MBPPos.x0y_1z0.yPos).relative(reZ, MBPPos.x0y_1z0.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_3.xPos).above(MBPPos.x_1y0z_3.yPos).relative(reZ, MBPPos.x_1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y0z_3.xPos).above(MBPPos.x0y0z_3.yPos).relative(reZ, MBPPos.x0y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_3.xPos).above(MBPPos.x1y0z_3.yPos).relative(reZ, MBPPos.x1y0z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_2.xPos).above(MBPPos.x_1y0z_2.yPos).relative(reZ, MBPPos.x_1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_2.xPos).above(MBPPos.x1y0z_2.yPos).relative(reZ, MBPPos.x1y0z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y0z_1.xPos).above(MBPPos.x_1y0z_1.yPos).relative(reZ, MBPPos.x_1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y0z_1.xPos).above(MBPPos.x1y0z_1.yPos).relative(reZ, MBPPos.x1y0z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_3.xPos).above(MBPPos.x0y1z_3.yPos).relative(reZ, MBPPos.x0y1z_3.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x_1y1z_2.xPos).above(MBPPos.x_1y1z_2.yPos).relative(reZ, MBPPos.x_1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_2.xPos).above(MBPPos.x0y1z_2.yPos).relative(reZ, MBPPos.x0y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x1y1z_2.xPos).above(MBPPos.x1y1z_2.yPos).relative(reZ, MBPPos.x1y1z_2.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
            if (level.getBlockState(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos))
                    .is(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get())) {
                level.setBlock(blockpos.relative(reX, MBPPos.x0y1z_1.xPos).above(MBPPos.x0y1z_1.yPos).relative(reZ, MBPPos.x0y1z_1.zPos), Blocks.AIR.defaultBlockState(), 1);
            }
        }
        setChanged(level, pos, state);
    }
}