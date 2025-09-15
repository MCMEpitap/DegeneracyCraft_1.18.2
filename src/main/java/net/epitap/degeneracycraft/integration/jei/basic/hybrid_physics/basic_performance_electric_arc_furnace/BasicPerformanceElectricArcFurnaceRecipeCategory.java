package net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace;

import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;


public class BasicPerformanceElectricArcFurnaceRecipeCategory implements IRecipeCategory<BasicPerformanceElectricArcFurnaceRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Degeneracycraft.MOD_ID, "basic_performance_electric_arc_furnace_recipe");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_uid.png");
    private final IDrawable background;
    private final IDrawable icon;

    public BasicPerformanceElectricArcFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 154);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends BasicPerformanceElectricArcFurnaceRecipe> getRecipeClass() {
        return BasicPerformanceElectricArcFurnaceRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.degeneracycraft_basic_performance_electric_arc_furnace");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    public static final RecipeType<BasicPerformanceElectricArcFurnaceRecipe> TYPE =
            new RecipeType<>(UID, BasicPerformanceElectricArcFurnaceRecipe.class);

    @Override
    public void draw(BasicPerformanceElectricArcFurnaceRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        drawPhase(stack);
        drawRequiredEnergy(recipe, stack);
        drawRequiredEnergyUsage(recipe, stack);
        drawRequiredTime(recipe, stack);
    }

    protected void drawPhase(PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("screen." + "degeneracycraft" + ".phase1"), 15, 67, 0xFF0000);
    }

    protected void drawRequiredEnergy(BasicPerformanceElectricArcFurnaceRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredenergy."), 17, 87, 0xFFFFFF);
        float energyRequired = recipe.getRequiredEnergy();
        if (energyRequired >= 1E3F) {
            fontRenderer.draw(poseStack, (energyRequired / 1E3F + " kFE/t"), 17, 97, 0xFFFFFF);
        } else if (energyRequired >= 0F) {
            fontRenderer.draw(poseStack, (energyRequired + " FE/t"), 17, 97, 0xFFFFFF);
        }
    }

    protected void drawRequiredEnergyUsage(BasicPerformanceElectricArcFurnaceRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredenergyusage."), 17, 107, 0xFFFFFF);

        float energyUsage = (recipe.getRequiredEnergy() / (recipe.getRequiredTime() * 20F));
        if (energyUsage >= 1E3F) {
            fontRenderer.draw(poseStack, (energyUsage / 1E3F + " kFE/t"), 17, 117, 0xFFFFFF);
        } else if (energyUsage >= 0F) {
            fontRenderer.draw(poseStack, (energyUsage + " FE/t"), 17, 117, 0xFFFFFF);
        }

    }

    protected void drawRequiredTime(BasicPerformanceElectricArcFurnaceRecipe recipe, PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        fontRenderer.draw(poseStack, new TranslatableComponent("tooltip.degeneracycraft.requiredtime."), 17, 127, 0xFFFFFF);
        fontRenderer.draw(poseStack, recipe.getRequiredTime() * 20 + " tick" + " " + "(" + recipe.getRequiredTime() + " Sec" + ")", 17, 137, 0xFFFFFF);
    }


    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull BasicPerformanceElectricArcFurnaceRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 26, 7).addItemStack(recipe.getInput0Item());
        builder.addSlot(RecipeIngredientRole.INPUT, 26, 25).addItemStack(recipe.getInput1Item());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 25).addItemStack(recipe.getOutput0Item());
    }
}

