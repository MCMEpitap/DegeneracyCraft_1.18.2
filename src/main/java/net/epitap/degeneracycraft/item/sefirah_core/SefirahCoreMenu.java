package net.epitap.degeneracycraft.item.sefirah_core;

import net.epitap.degeneracycraft.blocks.base.DCMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class SefirahCoreMenu extends AbstractContainerMenu {

    public SefirahCoreMenu(int id, Inventory playerInv) {
        super(DCMenuTypes.SEFIRAH_CORE_MENU.get(), id);

    }

    // バッファ付きコンストラクタ（将来用・今は未使用）
    public SefirahCoreMenu(int id, Inventory playerInv, FriendlyByteBuf buf) {
        this(id, playerInv);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

}


