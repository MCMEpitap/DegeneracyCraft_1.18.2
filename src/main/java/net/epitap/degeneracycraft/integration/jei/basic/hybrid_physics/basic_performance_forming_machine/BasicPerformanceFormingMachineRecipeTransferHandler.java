package net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.DCTransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicPerformanceFormingMachineRecipeTransferHandler<T extends BasicPerformanceFormingMachineMenu, R extends BasicPerformanceFormingMachineRecipe>
        implements IRecipeTransferHandler<T, BasicPerformanceFormingMachineRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicPerformanceFormingMachineRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicPerformanceFormingMachineRecipe> getRecipeClass() {
        return BasicPerformanceFormingMachineRecipe.class;
    }

    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicPerformanceFormingMachineMenu container,
            BasicPerformanceFormingMachineRecipe recipe,
            IRecipeSlotsView recipeSlots,
            Player player,
            boolean maxTransfer,
            boolean doTransfer
    ) {
        if (!doTransfer) {
            return null;
        }

        DCMessages.sendToServer(new DCTransferRecipeC2SPacket(container.blockEntity.getBlockPos(),recipe.getId(),maxTransfer)
        );

        return null;
    }
}