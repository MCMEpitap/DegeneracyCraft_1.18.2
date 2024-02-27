package net.epitap.degeneracycraft.datagen;


import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DCRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public DCRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(Items.STICK,16)
                .pattern(" W ")
                .pattern(" W ")
                .pattern("   ")
                .define('W', ItemTags.LOGS)
                .group("degeneracycraft")
                .unlockedBy("has_log", has(ItemTags.LOGS))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(Items.CHEST,4)
                .pattern("WWW")
                .pattern("W W")
                .pattern("WWW")
                .define('W', ItemTags.LOGS)
                .group("degeneracycraft")
                .unlockedBy("has_log", has(ItemTags.LOGS))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(Items.BOWL,16)
                .pattern("   ")
                .pattern("W W")
                .pattern(" W ")
                .define('W', ItemTags.LOGS)
                .group("degeneracycraft")
                .unlockedBy("has_log", has(ItemTags.LOGS))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(Items.BARREL,4)
                .pattern("W W")
                .pattern("W W")
                .pattern("WWW")
                .define('W', ItemTags.LOGS)
                .group("degeneracycraft")
                .unlockedBy("has_log", has(ItemTags.LOGS))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(Items.HOPPER)
                .pattern("iWi")
                .pattern("iWi")
                .pattern(" i ")
                .define('W', ItemTags.LOGS)
                .define('i', Items.IRON_INGOT)
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DCBlocks.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK.get())
                .pattern(" i ")
                .pattern("IcI")
                .pattern(" R ")
                .define('i', Items.IRON_INGOT)
                .define('I', Items.IRON_BLOCK)
                .define('c', Items.CRAFTING_TABLE)
                .define('R', Items.REDSTONE_BLOCK)
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);

    }
}
