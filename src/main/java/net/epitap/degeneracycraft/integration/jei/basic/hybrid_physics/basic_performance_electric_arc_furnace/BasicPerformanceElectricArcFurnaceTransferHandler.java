package net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicPerformanceElectricArcFurnaceTransferHandler<T extends BasicPerformanceElectricArcFurnaceMenu, R extends BasicPerformanceElectricArcFurnaceRecipe>
        implements IRecipeTransferHandler<T, BasicPerformanceElectricArcFurnaceRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicPerformanceElectricArcFurnaceTransferHandler(Class<T> containerClass,
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
    public Class<BasicPerformanceElectricArcFurnaceRecipe> getRecipeClass() {
        return BasicPerformanceElectricArcFurnaceRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicPerformanceElectricArcFurnaceMenu container,
            BasicPerformanceElectricArcFurnaceRecipe recipe,
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