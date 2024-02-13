package net.epitap.degeneracycraft.tooltip;

import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;

public class DCRecipevoid extends Item {
    public DCRecipevoid(Item.Properties properties) {
        super(properties);
    }
    public Optional<TooltipComponent> getTooltipImage(ItemStack pStack) {
        return null;
    }

}
