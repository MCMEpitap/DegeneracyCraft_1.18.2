package net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_precision_telescope;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope.BasicPerformanceAstronomicalTelescopeMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicPerformanceAstronomicalTelescopeRecipeTransferHandler<T extends BasicPerformanceAstronomicalTelescopeMenu, R extends BasicPerformanceAstronomicalTelescopeRecipe>
        implements IRecipeTransferHandler<T, BasicPerformanceAstronomicalTelescopeRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicPerformanceAstronomicalTelescopeRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicPerformanceAstronomicalTelescopeRecipe> getRecipeClass() {
        return BasicPerformanceAstronomicalTelescopeRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicPerformanceAstronomicalTelescopeMenu container,
            BasicPerformanceAstronomicalTelescopeRecipe recipe,
            IRecipeSlotsView recipeSlots,
            Player player,
            boolean maxTransfer,
            boolean doTransfer
    ) {
        if (!doTransfer) {
            return null;
        }

        DCMessages.sendToServer(new TransferRecipeC2SPacket(container.blockEntity.getBlockPos(),recipe.getId(),maxTransfer)
        );

        return null;
    }
}