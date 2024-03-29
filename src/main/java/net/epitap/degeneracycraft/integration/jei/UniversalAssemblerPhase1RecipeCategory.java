package net.epitap.degeneracycraft.integration.jei;//package net.epitap.degeneracycraft.jei;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;



public class UniversalAssemblerPhase1RecipeCategory implements IRecipeCategory<UniversalAssemblerPhase1Recipe> {
    public final static ResourceLocation UID = new ResourceLocation(Degeneracycraft.MOD_ID, "universal_assembler_phase1_recipe");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Degeneracycraft.MOD_ID, "textures/gui/universal_assembler_phase1_gui.png");


    private final IDrawable background;
    private final IDrawable icon;

    public UniversalAssemblerPhase1RecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 130);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(DCBlocks.UNIVERSAL_ASSEMBLER_PHASE1_BLOCK.get()));
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.degeneracycraft_universal_assembler_phase1_recipe");
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
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends UniversalAssemblerPhase1Recipe> getRecipeClass() {
        return UniversalAssemblerPhase1Recipe.class;
    }

//    @Override
//    public Class<? extends Pulverization> getRecipeClass() {
//        return Pulverization.class;
//    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull UniversalAssemblerPhase1Recipe recipe, @Nonnull IFocusGroup focusGroup) {

//            builder.addSlot(RecipeIngredientRole.INPUT, 44, 6).addItemStack(new ItemStack(Items.IRON_INGOT));
//            builder.addSlot(RecipeIngredientRole.INPUT, 62, 6).addItemStack(new ItemStack(Items.IRON_INGOT));
//            builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 6).addItemStack(new ItemStack(DCItems.IRON_BOLT.get()));
            builder.addSlot(RecipeIngredientRole.INPUT,  44, 6).addIngredients(recipe.getIngredients().get(0));
            builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 30).addItemStack(recipe.getResultItem());
        }

    }

