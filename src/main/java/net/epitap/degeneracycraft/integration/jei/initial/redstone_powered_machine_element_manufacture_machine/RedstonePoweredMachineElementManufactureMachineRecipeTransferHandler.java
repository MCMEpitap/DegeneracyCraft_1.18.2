package net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.DCTransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class RedstonePoweredMachineElementManufactureMachineRecipeTransferHandler<T extends RedstonePoweredMachineElementManufactureMachineMenu, R extends RedstonePoweredMachineElementManufactureMachineRecipe>
        implements IRecipeTransferHandler<T, RedstonePoweredMachineElementManufactureMachineRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public RedstonePoweredMachineElementManufactureMachineRecipeTransferHandler(Class<T> containerClass,
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
    public Class<RedstonePoweredMachineElementManufactureMachineRecipe> getRecipeClass() {
        return RedstonePoweredMachineElementManufactureMachineRecipe.class;
    }

    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            RedstonePoweredMachineElementManufactureMachineMenu container,
            RedstonePoweredMachineElementManufactureMachineRecipe recipe,
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