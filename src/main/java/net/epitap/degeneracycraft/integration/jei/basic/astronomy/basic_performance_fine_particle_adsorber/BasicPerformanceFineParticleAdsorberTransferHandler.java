package net.epitap.degeneracycraft.integration.jei.basic.astronomy.basic_performance_fine_particle_adsorber;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicPerformanceFineParticleAdsorberTransferHandler<T extends BasicPerformanceFineParticleAdsorberMenu, R extends BasicPerformanceFineParticleAdsorberRecipe>
        implements IRecipeTransferHandler<T, BasicPerformanceFineParticleAdsorberRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicPerformanceFineParticleAdsorberTransferHandler(Class<T> containerClass,
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
    public Class<BasicPerformanceFineParticleAdsorberRecipe> getRecipeClass() {
        return BasicPerformanceFineParticleAdsorberRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicPerformanceFineParticleAdsorberMenu container,
            BasicPerformanceFineParticleAdsorberRecipe recipe,
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