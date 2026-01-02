package net.epitap.degeneracycraft.item.sefirah_core;

import io.netty.buffer.Unpooled;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SefirahCoreItem extends Item {

//    private final SefirahType sefirahType;

    public SefirahCoreItem(Properties properties) {
        super(properties);
//        this.sefirahType = type;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.openMenu(new MenuProvider() {

                @Override
                public AbstractContainerMenu createMenu(int id, Inventory inv, Player p) {
                    return new SefirahCoreMenu(id, inv, null);
                }

                @Override
                public Component getDisplayName() {
                    return new TranslatableComponent("sefirah_core");
                }
            });
        }

        return InteractionResultHolder.success(player.getItemInHand(hand));
    }



    private FriendlyByteBuf createBuf() {
        return new FriendlyByteBuf(Unpooled.buffer());
    }
}

