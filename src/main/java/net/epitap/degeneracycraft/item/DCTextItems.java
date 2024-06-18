package net.epitap.degeneracycraft.item;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DCTextItems extends CreativeModeTab {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Degeneracycraft.MOD_ID);


    public DCTextItems(String label) {
        super(label);
    }

    private static <T extends Item> RegistryObject<Item> registerAtomicItem(String name, CreativeModeTab tab, String atomicname, String phase) {
        return DCItems.ITEMS.register(name, () -> new Item(new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicname + ".name").withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicname + ".number").withStyle(ChatFormatting.GOLD));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicname + ".weight").withStyle(ChatFormatting.LIGHT_PURPLE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicname + ".melting").withStyle(ChatFormatting.BLUE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicname + ".boiling").withStyle(ChatFormatting.RED));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicname + ".formula").withStyle(ChatFormatting.AQUA));
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    @Override
    public ItemStack makeIcon() {
        return null;
    }
}
