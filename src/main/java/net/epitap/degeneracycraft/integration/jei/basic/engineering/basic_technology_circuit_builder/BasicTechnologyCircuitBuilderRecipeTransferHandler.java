package net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicTechnologyCircuitBuilderRecipeTransferHandler<T extends BasicTechnologyCircuitBuilderMenu, R extends BasicTechnologyCircuitBuilderRecipe>
        implements IRecipeTransferHandler<T, BasicTechnologyCircuitBuilderRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicTechnologyCircuitBuilderRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicTechnologyCircuitBuilderRecipe> getRecipeClass() {
        return BasicTechnologyCircuitBuilderRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicTechnologyCircuitBuilderMenu container,
            BasicTechnologyCircuitBuilderRecipe recipe,
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