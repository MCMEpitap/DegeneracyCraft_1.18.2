//package net.epitap.degeneracycraft.tooltip;
//
//
//import net.minecraft.ChatFormatting;
//import net.minecraft.client.gui.screens.Screen;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.TooltipFlag;
//import net.minecraft.world.level.Level;
//
//import javax.annotation.Nullable;
//import java.util.List;
//
//import static net.epitap.degeneracycraft.item.DCItems.*;
//
//public class DCItemTooltip extends Item {
//
//    public DCItemTooltip(Properties properties) {
//        super(properties);
//    }
//
//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
//
//        if (Screen.hasShiftDown()) {
//            if (this == (IRON_BEARING.get())) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_BOLT.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_CAM.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_CHAIN.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_GEAR.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_GEAR.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_JOINT.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_KEY.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_NUT.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_PIPE.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_PIPEJOINT.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_PLATE.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_ROD.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_SHAFT.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_SHAFTCOUPLING.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_SHAPESTEEL.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_SPRING.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_DUST.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase2").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_PUREDUST.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase3").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_LEACHATE.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase4").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_CONCENTRATE.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase5").withStyle(ChatFormatting.DARK_GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_PLASMA.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase6").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_DEGENERATEMATTER.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase7").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_SOUP.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase8").withStyle(ChatFormatting.DARK_BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_IMAGINARYMATTER.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase9").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == STABLE_IRON_IMAGINARYMATTER.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phaseinf").withStyle(ChatFormatting.DARK_GRAY));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_TACHYON.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase9").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_ANTIMATTER.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase8").withStyle(ChatFormatting.DARK_BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_ULTRAHOTPLASMA.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase7").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_OVERFLUID.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase6").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_CRYSTAL.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase5").withStyle(ChatFormatting.DARK_GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_PRECIPITATE.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase4").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_WASHEDDUST.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase3").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            } else if (this == IRON_ORESINTER.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase2").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//            }
//        } else {
//            tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
//        }
//
//
//    }
//}
