package net.epitap.degeneracycraft.integration.jei.basic;

import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class BasicMachinePartProcessorRecipeCategory implements IRecipeCategory<BasicMachinePartProcessorRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Degeneracycraft.MOD_ID, "basic_machine_part_processor_recipe");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/redstone_powered_machine_component_manufacture_machine_uid.png");
    private final IDrawable background;
    private final IDrawable icon;

    public BasicMachinePartProcessorRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 151);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(DCBlocks.BASIC_MACHINE_PART_PROCESSOR_BLOCK.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends BasicMachinePartProcessorRecipe> getRecipeClass() {
        return BasicMachinePartProcessorRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.degeneracycraft_basic_machine_part_processor");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void draw(BasicMachinePartProcessorRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        drawPhase(stack);
        drawRequiredEnergy(recipe, stack);
        drawRequiredEnergyUsage(recipe, stack);
        drawRequiredTime(recipe, stack);
    }

    protected void drawPhase(PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("screen." + "degeneracycraft" + ".phase0"), 15, 67, 0xFFFFFF);
    }

    protected void drawRequiredEnergy(BasicMachinePartProcessorRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredenergy."), 17, 87, 0xFFFFFF);
        fontRenderer.draw(poseStack, (recipe.getRequiredEnergy() + " FE"), 17, 97, 0xFFFFFF);
    }

    protected void drawRequiredEnergyUsage(BasicMachinePartProcessorRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredenergyusage."), 17, 107, 0xFFFFFF);
        fontRenderer.draw(poseStack, (recipe.getRequiredEnergy() / recipe.getRequiredTime() / 20 + " FE/t"), 17, 117, 0xFFFFFF);

    }

    protected void drawRequiredTime(BasicMachinePartProcessorRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredtime."), 17, 127, 0xFFFFFF);
        fontRenderer.draw(poseStack, recipe.getRequiredTime() * 20 + " tick" + " " + "(" + recipe.getRequiredTime() + " Sec" + ")", 17, 137, 0xFFFFFF);
    }


    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, BasicMachinePartProcessorRecipe recipe, IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 8, 7).addItemStack(recipe.getInput0Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 26, 7).addItemStack(recipe.getInput1Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 7).addItemStack(recipe.getInput2Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 8, 25).addItemStack(recipe.getInput3Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 26, 25).addItemStack(recipe.getInput4Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 25).addItemStack(recipe.getInput5Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 8, 43).addItemStack(recipe.getInput6Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 26, 43).addItemStack(recipe.getInput7Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 43).addItemStack(recipe.getInput8Item());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 25).addItemStack(recipe.getOutput0Item());
    }
}



