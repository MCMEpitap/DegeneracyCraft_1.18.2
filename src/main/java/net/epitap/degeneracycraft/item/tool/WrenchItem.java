package net.epitap.degeneracycraft.item.tool;

import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
public class WrenchItem extends Item {

    public WrenchItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.wrench").withStyle(ChatFormatting.WHITE));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.wrenchitem").withStyle(ChatFormatting.YELLOW));
        }
        super.appendHoverText(stack, level, tooltip, flagIn);
    }

    public static boolean isWrench(ItemStack stack) {
        return stack.is(DCItems.WRENCH.get());
    }

    public static boolean isHoldingWrench(Player player) {
        for (ItemStack stack : player.getHandSlots()) {
            if (isWrench(stack)) {
                return true;
            }
        }
        return false;
    }
}
