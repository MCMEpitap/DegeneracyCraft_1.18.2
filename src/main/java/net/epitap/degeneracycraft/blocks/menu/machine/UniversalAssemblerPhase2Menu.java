//package net.epitap.degeneracycraft.blocks.menu.machine;
//
//import net.epitap.degeneracycraft.blocks.base.DCBlocks;
//import net.epitap.degeneracycraft.blocks.entity.machine.UniversalAssemblerPhase2BlockEntity;
//import net.epitap.degeneracycraft.blocks.base.DCMenuTypes;
//import net.epitap.degeneracycraft.blocks.screen.slot.DCResultSlot;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.*;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraftforge.items.CapabilityItemHandler;
//import net.minecraftforge.items.SlotItemHandler;
//
//public class UniversalAssemblerPhase2Menu extends AbstractContainerMenu {
//    private final UniversalAssemblerPhase2BlockEntity blockEntity;
//    private final Level level;
//    private final ContainerData data;
//
//    public UniversalAssemblerPhase2Menu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
//        this(pContainerId, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
//    }
//
//    public UniversalAssemblerPhase2Menu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
//        super(DCMenuTypes.UNIVERSAL_ASSEMBLER_Phase2_MENU.get(), pContainerId);
//        blockEntity = ((UniversalAssemblerPhase2BlockEntity) entity);
//        this.level = inv.player.level;
//        this.data = data;
//
//        addPlayerInventory(inv);
//        addPlayerHotbar(inv);
//
//        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
//
//
//            for(int j = 0; j < 3; ++j) {
//                this.addSlot(new SlotItemHandler(handler, j, 62 + j * 18, 0));
//            }
//
//
//            for(int i = 0; i < 3; ++i) {
//                for(int j = 0; j < 5; ++j) {
//                    this.addSlot(new SlotItemHandler(handler, 3 +(j + i * 5), 44 + j * 18, 18+ i * 18));
//                }
//            }
//
//            for(int j = 0; j < 3; ++j) {
//                this.addSlot(new SlotItemHandler(handler, 18 + j, 62 + j * 18, 72));
//            }
//
//            this.addSlot(new DCResultSlot(handler, 21,  170, 36));
//        });
//
//        addDataSlots(data);
//    }
//
//    public boolean isCrafting() {
//        return data.get(0) > 0;
//    }
//
//    public int getScaledProgress() {
//        int getProgressPercent = this.data.get(0);
//        int maxProgress = this.data.get(1);  // Max Progress
//        int progressArrowSize = 38; // This is the height in pixels of your arrow
//
//        return maxProgress != 0 && getProgressPercent != 0 ? getProgressPercent * progressArrowSize / maxProgress : 0;
//    }
//
//    // CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
//    // must assign a slot number to each of the slots used by the GUI.
//    // For this container, we can see both the tile inventory's slots as well as the player inventory slots and the hotbar.
//    // Each time we add a Slot to the container, it automatically increases the slotIndex, which means
//    //  0 - 8 = hotbar slots (which will map to the InventoryPlayer slot numbers 0 - 8)
//    //  9 - 35 = player inventory slots (which map to the InventoryPlayer slot numbers 9 - 35)
//    //  36 - 44 = TileInventory slots, which map to our blockentity slot numbers 0 - 8)
//    private static final int HOTBAR_SLOT_COUNT = 9;
//    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
//    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
//    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
//    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
//    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
//    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
//
//    // THIS YOU HAVE TO DEFINE!
//    private static final int TE_INVENTORY_SLOT_COUNT = 22;  // must be the number of slots you have!
//
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
//    }
//
//    @Override
//    public boolean stillValid(Player pPlayer) {
//        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
//                pPlayer, DCBlocks.UNIVERSAL_ASSEMBLER_PHASE2_BLOCK.get());
//    }
//
//    private void addPlayerInventory(Inventory playerInventory) {
//        for (int i = 0; i < 3; ++i) {
//            for (int l = 0; l < 9; ++l) {
//                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, -10 + l * 18, 130 + i * 18));
//            }
//        }
//    }
//
//    private void addPlayerHotbar(Inventory playerInventory) {
//        for (int i = 0; i < 9; ++i) {
//            this.addSlot(new Slot(playerInventory, i, -10 + i * 18, 188));
//        }
//    }
//}
