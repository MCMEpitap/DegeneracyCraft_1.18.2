package net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.base.DCMenuTypes;
import net.epitap.degeneracycraft.energy.DCIEnergyStorageFloat;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import java.util.Optional;

public class BasicTechnologyUniversalAssemblerMenu extends AbstractContainerMenu {

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 12;
    public final BasicTechnologyUniversalAssemblerBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public BasicTechnologyUniversalAssemblerMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public BasicTechnologyUniversalAssemblerMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(DCMenuTypes.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_MENU.get(), pContainerId);
        blockEntity = ((BasicTechnologyUniversalAssemblerBlockEntity) entity);
        this.level = inv.player.level;
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {

            for (int i = 0; i < 3; ++i) {
                for (int l = 0; l < 3; ++l) {
                    this.addSlot(new SlotItemHandler(handler, (l + i * 3), 8 + l * 18, 7 + i * 18));
                }
            }
            this.addSlot(new SlotItemHandler(handler, 9, 116, 25));
            this.addSlot(new SlotItemHandler(handler, 10, 71, 59));
            this.addSlot(new SlotItemHandler(handler, 11, 98, 62));
        });

        addDataSlots(data);
    }

    public float getProgressPercent() {
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        Optional<BasicTechnologyUniversalAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(BasicTechnologyUniversalAssemblerRecipe.Type.INSTANCE, inventory, level);
        if (match.isPresent()) {
            int getProgressPercent = (int) (this.data.get(0) / match.get().getRequiredTime() * 20F);
            return getProgressPercent;
        }
        return 0F;
    }

    public DCIEnergyStorageFloat getEnergy() {
        return blockEntity.getEnergyStorage();
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public BasicTechnologyUniversalAssemblerBlockEntity getBlockEntity() {
        return this.blockEntity;
    }


    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get());
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
