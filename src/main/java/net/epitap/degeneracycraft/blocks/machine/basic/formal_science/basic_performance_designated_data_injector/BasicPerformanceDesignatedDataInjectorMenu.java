package net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.base.DCMenuTypes;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class BasicPerformanceDesignatedDataInjectorMenu extends AbstractContainerMenu {
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    public static final int TE_INVENTORY_SLOT_COUNT = 8;
    public final BasicPerformanceDesignatedDataInjectorBlockEntity blockEntity;
    public final Level level;
    public final ContainerData data;

    public BasicPerformanceDesignatedDataInjectorMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        this(id, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public BasicPerformanceDesignatedDataInjectorMenu(int id, Inventory inv, BlockEntity entity, ContainerData data) {
        super(DCMenuTypes.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_MENU.get(), id);
        blockEntity = (BasicPerformanceDesignatedDataInjectorBlockEntity) entity;
        this.level = inv.player.level;
        this.data = data;
        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new SlotItemHandler(handler, 0, 8, 7));
            this.addSlot(new SlotItemHandler(handler, 1, 44, 7));
            this.addSlot(new SlotItemHandler(handler, 2, 26, 25));
            this.addSlot(new SlotItemHandler(handler, 3, 8, 43));
            this.addSlot(new SlotItemHandler(handler, 4, 44, 43));
            this.addSlot(new SlotItemHandler(handler, 5, 116, 25));
            this.addSlot(new SlotItemHandler(handler, 6, 71, 59));
            this.addSlot(new SlotItemHandler(handler, 7, 98, 62));
        });
        addDataSlots(data);
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getProgressPercent() {
        return data.get(1);
    }

    public DCIEnergyStorageFloat getEnergy() {
        return blockEntity.getEnergyStorage();
    }

    public BasicPerformanceDesignatedDataInjectorBlockEntity getBlockEntity() {
        return this.blockEntity;
    }

//    @Override
//    public ItemStack quickMoveStack(Player playerIn, int index) {
//        Slot sourceSlot = slots.get(index);
//        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
//        ItemStack sourceStack = sourceSlot.getItem();
//        ItemStack copyOfSourceStack = sourceStack.copy();
//
//        // Check if the slot clicked is one of the vanilla container slots
//        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
//            // This is a vanilla container slot so merge the stack into the tile inventory
//            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
//                    + TE_INVENTORY_SLOT_COUNT, false)) {
//                return ItemStack.EMPTY;  // EMPTY_ITEM
//            }
//        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
//            // This is a TE slot so merge the stack into the players inventory
//            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
//                return ItemStack.EMPTY;
//            }
//        } else {
//            System.out.println("Invalid slotIndex:" + index);
//            return ItemStack.EMPTY;
//        }
//        // If stack size == 0 (the entire stack was moved) set slot contents to null
//        if (sourceStack.getCount() == 0) {
//            sourceSlot.set(ItemStack.EMPTY);
//        } else {
//            sourceSlot.setChanged();
//        }
//        sourceSlot.onTake(playerIn, sourceStack);
//        return copyOfSourceStack;
//
//    }
    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;

        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // --- プレイヤー側から機械へ ---
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // 入力スロット (0〜4)
            if (tryMoveToRange(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + 5)) {
            }
            // 出力スロット (5) → 直接は入れない
            else if (tryMoveToRange(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX + 6, TE_INVENTORY_FIRST_SLOT_INDEX + 8)) {
            }
            else {
                return ItemStack.EMPTY;
            }
        }
        // --- 機械側からプレイヤーへ ---
        else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX,
                    VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }

        if (sourceStack.isEmpty()) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    private boolean tryMoveToRange(ItemStack stack, int start, int end) {
        return this.moveItemStackTo(stack, start, end, false);
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                player, DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
