package net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator;

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
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_power_steam_generator.BasicPowerSteamGeneratorBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class BasicPowerSteamGeneratorRecipeCategory implements IRecipeCategory<BasicPowerSteamGeneratorRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Degeneracycraft.MOD_ID, "basic_power_steam_generator_recipe");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/basic/engineering/basic_power_steam_generator/basic_power_steam_generator_uid.png");
    BasicPowerSteamGeneratorBlockEntity blockEntity;
    private final IDrawable background;
    private final IDrawable icon;

    public BasicPowerSteamGeneratorRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 151);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends BasicPowerSteamGeneratorRecipe> getRecipeClass() {
        return BasicPowerSteamGeneratorRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("");
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
    public void draw(BasicPowerSteamGeneratorRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
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

    protected void drawRequiredEnergy(BasicPowerSteamGeneratorRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredenergy."), 17, 87, 0xFFFFFF);
        fontRenderer.draw(poseStack, (blockEntity.BP_STEAM_GENERATOR_OUTPUT + " FE"), 17, 97, 0xFFFFFF);
    }

    protected void drawRequiredEnergyUsage(BasicPowerSteamGeneratorRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredenergyusage."), 17, 107, 0xFFFFFF);
        fontRenderer.draw(poseStack, (blockEntity.BP_STEAM_GENERATOR_OUTPUT + " FE/t"), 17, 117, 0xFFFFFF);

    }

    protected void drawRequiredTime(BasicPowerSteamGeneratorRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredtime."), 17, 127, 0xFFFFFF);
        fontRenderer.draw(poseStack, blockEntity.BP_STEAM_GENERATOR_OUTPUT + " Sec" + ")", 17, 137, 0xFFFFFF);
    }


    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, BasicPowerSteamGeneratorRecipe recipe, IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 8, 7).addItemStack(recipe.getInput0Item());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 25).addItemStack(recipe.getOutput0Item());
    }
}



