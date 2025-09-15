package net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicTechnologyMachinePartProcessorRecipeTransferHandler<T extends BasicTechnologyMachinePartProcessorMenu, R extends BasicTechnologyMachinePartProcessorRecipe>
        implements IRecipeTransferHandler<T, BasicTechnologyMachinePartProcessorRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicTechnologyMachinePartProcessorRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicTechnologyMachinePartProcessorRecipe> getRecipeClass() {
        return BasicTechnologyMachinePartProcessorRecipe.class;
    }

    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicTechnologyMachinePartProcessorMenu container,
            BasicTechnologyMachinePartProcessorRecipe recipe,
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