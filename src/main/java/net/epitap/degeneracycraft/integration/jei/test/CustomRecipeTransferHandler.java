//package net.epitap.degeneracycraft.integration.jei.test;
//
//import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
//import mezz.jei.api.recipe.transfer.IRecipeTransferError;
//import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
//import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipe;
//import net.minecraft.world.entity.player.Player;
//import net.minecraftforge.items.CapabilityItemHandler;
//
//public class CustomRecipeTransferHandler extends CommonRecipeTransferHandler<BasicPerformanceDesignatedDataInjectorMenu, BasicPerformanceDesignatedDataInjectorRecipe> {
//
//    public CustomRecipeTransferHandler() {
//        super(BasicPerformanceDesignatedDataInjectorMenu.class, 0, 5, 8, 36); // 入力0〜4, プレイヤーインベントリ8〜43
//    }
//
//    @Override
//    public IRecipeTransferError transferRecipe(BasicPerformanceDesignatedDataInjectorMenu container,
//                                               BasicPerformanceDesignatedDataInjectorRecipe recipe,
//                                               IRecipeSlotsView recipeSlots,
//                                               Player player,
//                                               boolean maxTransfer,
//                                               boolean doTransfer) {
//
//        container.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
//            // 入力スロット0〜4にRecipeのアイテムを直接挿入
//            handler.insertItem(0, recipe.getInput0Item().copy(), false);
//            handler.insertItem(1, recipe.getInput1Item().copy(), false);
//            handler.insertItem(2, recipe.getInput2Item().copy(), false);
//            handler.insertItem(3, recipe.getInput3Item().copy(), false);
//            handler.insertItem(4, recipe.getInput4Item().copy(), false);
//        });
//
//        return null; // エラーなし
//    }
//}
//
