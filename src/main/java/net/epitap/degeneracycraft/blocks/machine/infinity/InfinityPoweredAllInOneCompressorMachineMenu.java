package net.epitap.degeneracycraft.blocks.machine.infinity;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.base.DCMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class InfinityPoweredAllInOneCompressorMachineMenu extends AbstractContainerMenu {
    public final InfinityPoweredAllInOneCompressorMachineBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;
    private Container inventory;

    public InfinityPoweredAllInOneCompressorMachineMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        this(id, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public InfinityPoweredAllInOneCompressorMachineMenu(int id, Inventory inv, BlockEntity entity, ContainerData data) {
        super(DCMenuTypes.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU.get(), id);
        blockEntity = (InfinityPoweredAllInOneCompressorMachineBlockEntity) entity;
        this.level = inv.player.level;
        this.data = data;

//        TestCompactStorageInventoryImpl inv = (TestCompactStorageInventoryImpl) playerInventory.player.level.getBlockEntity(pos);

        addPlayerHotbar(inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new SlotItemHandler(handler, 0, -115 + 99, -40));
            this.addSlot(new SlotItemHandler(handler, 1, 173 + 99, -40));
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 2, -115 + 99 + i * 16, -24));
            }
            for (int i = 0; i < 6; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 4, 93 + 99 + i * 16, -24));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 10, -115 + 99 + i * 16, -8));
            }
            for (int i = 0; i < 6; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 12, 93 + 99 + i * 16, -8));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 18, -115 + 99 + i * 16, 8));
            }
            for (int i = 0; i < 16; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 20, -67 + 99 + i * 16, 8));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 36, -115 + 99 + i * 16, 24));
            }
            for (int i = 0; i < 16; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 38, -67 + 99 + i * 16, 24));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 54, -115 + 99 + i * 16, 40));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 56, -99 + 99 + i * 16, 104));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 71, -67 + 99 + i * 16, 40));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 86, -115 + 99 + i * 16, 56));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 88, -99 + 99 + i * 16, 120));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 103, -67 + 99 + i * 16, 56));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 118, -115 + 99 + i * 16, 72));
            }
            for (int i = 0; i < 18; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 120, -99 + 99 + i * 16, 136));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 138, -99 + 99 + i * 16, 152));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 153, -67 + 99 + i * 16, 72));
            }
            for (int i = 0; i < 2; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 168, -115 + 99 + i * 16, 88));
            }
            for (int i = 0; i < 18; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 170, -99 + 99 + i * 16, 168));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 188, -99 + 99 + i * 16, 184));
            }
            for (int i = 0; i < 15; ++i) {
                this.addSlot(new SlotItemHandler(handler, i + 203, -115 + 99 + i * 16, 88));
            }
        });

        addDataSlots(data);
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);  // Max Progress
        int progressArrowSize = 54; // This is the height in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    public InfinityPoweredAllInOneCompressorMachineBlockEntity getBlockEntity() {
        return this.blockEntity;
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = 219;

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                player, DCBlocks.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK.get());
    }

//    private void addPlayerInventory(Inventory playerInventory) {
//        for (int i = 0; i < 3; ++i) {
//            for (int l = 0; l < 9; ++l) {
//                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
//            }
//        }
//    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 188));
        }
    }
}
