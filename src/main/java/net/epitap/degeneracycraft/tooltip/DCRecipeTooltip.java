//package net.epitap.degeneracycraft.tooltip;
//
//import net.epitap.degeneracycraft.item.DCAdvancementIcon;
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
//public class DCRecipeTooltip extends Item {
//    public DCRecipeTooltip(Item.Properties properties) {
//        super(properties);
//    }
//
//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
//
//        if (Screen.hasShiftDown()) {
//            if (this == DCAdvancementIcon.IRON_BEARING_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_BOLT_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_CAM_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_CHAIN_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_GEAR_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_JOINT_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_KEY_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_NUT_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_PIPE_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_PIPEJOINT_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_PLATE_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_ROD_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_SHAFT_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_SHAFTCOUPLING_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_SHAPESTEEL_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else if (this == DCAdvancementIcon.IRON_SPRING_RECIPE_TOOLTIP_PHASE0.get()) {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_tooltip_0").withStyle(ChatFormatting.GREEN));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_energy_usage_tooltip_0").withStyle(ChatFormatting.YELLOW));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.required_time_tooltip_0").withStyle(ChatFormatting.AQUA));
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.multiblock_structure_multiplication_1_1").withStyle(ChatFormatting.GRAY));
//            } else {
//                tooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
//            }
//        }
//    }
//}
