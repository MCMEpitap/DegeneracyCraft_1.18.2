package net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class CommonRecipeTransferHandler<T extends BasicPerformanceDesignatedDataInjectorMenu, R extends BasicPerformanceDesignatedDataInjectorRecipe>
        implements IRecipeTransferHandler<T, BasicPerformanceDesignatedDataInjectorRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public CommonRecipeTransferHandler(Class<T> containerClass,
                                       int recipeSlotStart, int recipeSlotCount,
                                       int inventorySlotStart, int inventorySlotCount) {
        this.containerClass = containerClass;
        this.recipeSlotStart = recipeSlotStart;
        this.recipeSlotCount = recipeSlotCount;
        this.inventorySlotStart = inventorySlotStart;
        this.inventorySlotCount = inventorySlotCount;
    }

    @Override
    public Class<T> getContainerClass() {
        return containerClass;
    }

    @Override
    public Class<BasicPerformanceDesignatedDataInjectorRecipe> getRecipeClass() {
        return BasicPerformanceDesignatedDataInjectorRecipe.class;
    }

    //    @Override
//    public IRecipeTransferError transferRecipe(
//            BasicPerformanceDesignatedDataInjectorMenu container,
//            BasicPerformanceDesignatedDataInjectorRecipe recipe,
//            IRecipeSlotsView recipeSlots,
//            Player player,
//            boolean maxTransfer,
//            boolean doTransfer
//    ) {
//        if (!doTransfer) return null;
//            IItemHandler playerInv = new InvWrapper(player.getInventory());
//
//        // マシンのインベントリ
//        if (!player.level.isClientSide && doTransfer) {
//            container.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(machineHandler -> {
//                moveItemStack(playerInv, machineHandler, recipe.getInput0Item(), 0);
//                moveItemStack(playerInv, machineHandler, recipe.getInput1Item(), 1);
//                moveItemStack(playerInv, machineHandler, recipe.getInput2Item(), 2);
//                moveItemStack(playerInv, machineHandler, recipe.getInput3Item(), 3);
//                moveItemStack(playerInv, machineHandler, recipe.getInput4Item(), 4);
//            });
//        }
//
//        return null;
//    }
//
//    private void moveItemStack(IItemHandler from, IItemHandler to, ItemStack required, int targetSlot) {
//        if (required.isEmpty()) return;
//
//        int needed = required.getCount();
//
//        // プレイヤーインベントリを走査
//        for (int slot = 0; slot < from.getSlots() && needed > 0; slot++) {
//            ItemStack inSlot = from.getStackInSlot(slot);
//            if (ItemStack.isSameItemSameTags(inSlot, required)) {
//                int extractCount = Math.min(needed, inSlot.getCount());
//                ItemStack extracted = from.extractItem(slot, extractCount, false);
//                ItemStack remainder = to.insertItem(targetSlot, extracted, false);
//
//                if (!remainder.isEmpty()) {
//                    // 入りきらなかったら返却
//                    from.insertItem(slot, remainder, false);
//                }
//
//                needed -= extractCount - remainder.getCount();
//            }
//        }
//    }
//}
    @Override
    public IRecipeTransferError transferRecipe(
            BasicPerformanceDesignatedDataInjectorMenu container,
            BasicPerformanceDesignatedDataInjectorRecipe recipe,
            IRecipeSlotsView recipeSlots,
            Player player,
            boolean maxTransfer,
            boolean doTransfer
    ) {
        // doTransfer が false の場合はチェックだけで終了
        if (!doTransfer) return null;

        DCMessages.sendToServer(new TransferRecipeC2SPacket(container.blockEntity.getBlockPos(), recipe));
//        // サーバー側でのみ処理する
//        if (!player.level.isClientSide) {

            // プレイヤーのインベントリを IItemHandler に変換
            IItemHandler playerInv = new InvWrapper(player.getInventory());

            container.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(machineHandler -> {

                // マシンの各スロットにレシピアイテムを転送
                insertItemFromPlayer(playerInv, machineHandler, recipe.getInput0Item(), 0);
                insertItemFromPlayer(playerInv, machineHandler, recipe.getInput1Item(), 1);
                insertItemFromPlayer(playerInv, machineHandler, recipe.getInput2Item(), 2);
                insertItemFromPlayer(playerInv, machineHandler, recipe.getInput3Item(), 3);
                insertItemFromPlayer(playerInv, machineHandler, recipe.getInput4Item(), 4);
            });
//        }

        return null;
    }

    // プレイヤーのインベントリからマシンへアイテムを移動するヘルパー関数
    private void insertItemFromPlayer(IItemHandler playerInv, IItemHandler machineHandler, ItemStack stack, int slotIndex) {
        if (stack == null || stack.isEmpty()) return;

        int remaining = stack.getCount();
        for (int i = 0; i < playerInv.getSlots(); i++) {
            ItemStack fromSlot = playerInv.getStackInSlot(i);
            if (fromSlot.isEmpty()) continue;
            if (!fromSlot.sameItem(stack)) continue;

            int toExtract = Math.min(remaining, fromSlot.getCount());
            ItemStack extracted = ((ItemStackHandler) playerInv).extractItem(i, toExtract, false);
            ItemStack leftover = machineHandler.insertItem(slotIndex, extracted, false);
            remaining = leftover.getCount();
            if (remaining <= 0) break;
        }
    }
}