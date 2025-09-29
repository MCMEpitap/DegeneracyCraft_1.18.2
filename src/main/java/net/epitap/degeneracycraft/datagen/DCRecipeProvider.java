package net.epitap.degeneracycraft.datagen;


import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.item.DCItems;
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

        ShapedRecipeBuilder.shaped(DCItems.EMPTY_CONTAINER.get())
                .pattern("igi")
                .pattern("g g")
                .pattern("igi")
                .define('i', Items.IRON_NUGGET)
                .define('g', Items.GLASS_PANE)
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DCItems.WATER_CONTAINER.get())
                .pattern("we")
                .pattern("  ")
                .define('w', Items.WATER_BUCKET)
                .define('e', DCItems.EMPTY_CONTAINER.get())
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer)
        ;

        ShapedRecipeBuilder.shaped(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get())
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

        ShapedRecipeBuilder.shaped(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get())
                .pattern("bgb")
                .pattern("pcp")
                .pattern("nrn")
                .define('b', DCItems.IRON_BOLT.get())
                .define('g', DCItems.IRON_GEAR.get())
                .define('p', DCItems.IRON_PLATE.get())
                .define('c', Items.CRAFTING_TABLE)
                .define('n', DCItems.IRON_NUT.get())
                .define('r', DCItems.IRON_BEARING.get())
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get())
                .pattern("iSi")
                .pattern("TMC")
                .pattern("pBp")
                .define('i', DCItems.IRON_PIPE.get())
                .define('S', DCItems.BASIC_MACHINE_SCREEN.get())
                .define('T', DCItems.BASIC_TURBINE.get())
                .define('M', DCItems.BASIC_MOTOR.get())
                .define('C', DCItems.BASIC_CIRCUIT.get())
                .define('p', DCItems.IRON_PLATE.get())
                .define('B', DCItems.BASIC_REDSTONE_BATTERY.get())
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get())
                .pattern("RSR")
                .pattern("MDM")
                .pattern("LBL")
                .define('R', DCItems.BASIC_ROBOT_ARM.get())
                .define('S', DCItems.BASIC_MACHINE_SCREEN.get())
                .define('M', DCItems.BASIC_MOTOR.get())
                .define('D', DCItems.BASIC_DRIVECHAIN.get())
                .define('L', DCItems.BASIC_LINKAGE.get())
                .define('B', DCItems.BASIC_REDSTONE_BATTERY.get())
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DCItems.SIMPLE_ORE_SORTING_FILTER.get())
                .pattern("PLP")
                .pattern("CPC")
                .pattern("PLP")
                .define('P', Items.PAPER)
                .define('L', Items.LAPIS_LAZULI)
                .define('C', Items.COAL)
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(pFinishedRecipeConsumer);
    }
}
