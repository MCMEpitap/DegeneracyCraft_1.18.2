package net.epitap.degeneracycraft.integration.jei.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver;

import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.transfer.IRecipeTransferError;
import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverMenu;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.networking.packet.TransferRecipeC2SPacket;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class BasicTechnologyImitationMagicEngraverRecipeTransferHandler<T extends BasicTechnologyImitationMagicEngraverMenu, R extends BasicTechnologyImitationMagicEngraverRecipe>
        implements IRecipeTransferHandler<T, BasicTechnologyImitationMagicEngraverRecipe> {

    private final Class<T> containerClass;
    private final int recipeSlotStart;
    private final int recipeSlotCount;
    private final int inventorySlotStart;
    private final int inventorySlotCount;

    public BasicTechnologyImitationMagicEngraverRecipeTransferHandler(Class<T> containerClass,
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
    public Class<BasicTechnologyImitationMagicEngraverRecipe> getRecipeClass() {
        return BasicTechnologyImitationMagicEngraverRecipe.class;
    }


    @Override
    public @Nullable IRecipeTransferError transferRecipe(
            BasicTechnologyImitationMagicEngraverMenu container,
            BasicTechnologyImitationMagicEngraverRecipe recipe,
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