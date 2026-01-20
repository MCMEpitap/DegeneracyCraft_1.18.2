package net.epitap.degeneracycraft.integration.jei.basic.jenith_void_science.basic_technology_void_world_coordinate_recording_machine;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.jenith_void_science.basic_technology_void_world_coordinate_recording_machine.BasicTechnologyVoidWorldCoordinateRecordingMachineMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicTechnologyVoidWorldCoordinateRecordingMachineRecipeTransferHandler<T extends BasicTechnologyVoidWorldCoordinateRecordingMachineMenu, R extends BasicTechnologyVoidWorldCoordinateRecordingMachineRecipe>
        implements IRecipeTransferHandler<T, BasicTechnologyVoidWorldCoordinateRecordingMachineRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicTechnologyVoidWorldCoordinateRecordingMachineRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicTechnologyVoidWorldCoordinateRecordingMachineRecipe> getRecipeClass() {
        return BasicTechnologyVoidWorldCoordinateRecordingMachineRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicTechnologyVoidWorldCoordinateRecordingMachineMenu container,
            BasicTechnologyVoidWorldCoordinateRecordingMachineRecipe recipe,
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