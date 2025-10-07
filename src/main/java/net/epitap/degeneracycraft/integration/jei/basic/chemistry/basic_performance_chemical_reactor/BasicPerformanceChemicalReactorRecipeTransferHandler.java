package net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_chemical_reactor;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicPerformanceChemicalReactorRecipeTransferHandler<T extends BasicPerformanceCompoundPurifierMenu, R extends BasicPerformanceChemicalReactorRecipe>
        implements IRecipeTransferHandler<T, BasicPerformanceChemicalReactorRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicPerformanceChemicalReactorRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicPerformanceChemicalReactorRecipe> getRecipeClass() {
        return BasicPerformanceChemicalReactorRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicPerformanceCompoundPurifierMenu container,
            BasicPerformanceChemicalReactorRecipe recipe,
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