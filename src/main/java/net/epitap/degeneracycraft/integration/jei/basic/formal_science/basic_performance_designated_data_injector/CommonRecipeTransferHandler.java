package net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

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
        DCMessages.sendToServer(new TransferRecipeC2SPacket(container.blockEntity.getBlockPos(), recipe.getId().toString()));
        return null;
    }

}