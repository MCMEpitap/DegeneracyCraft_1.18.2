//package net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_machine_data_installer;
//
//import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
//import mezz.jei.api.recipe.transfer.IRecipeTransferError;
//import mezz.jei.api.recipe.transfer.IRecipeTransferHandler;
//import mezz.jei.api.recipe.transfer.IRecipeTransferInfo;
//import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
//import net.epitap.degeneracycraft.integration.jei.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorRecipe;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.Slot;
//import net.minecraft.world.item.ItemStack;
//import org.checkerframework.checker.units.qual.C;
//
//public class BasicPerformanceMachineDataInstallerTransferHandler implements IRecipeTransferHandler<BasicPerformanceDesignatedDataInjectorMenu, BasicPerformanceDesignatedDataInjectorRecipe>, IRecipeTransferInfo<C, R> {
//
//    @Override
//    public Class<BasicPerformanceDesignatedDataInjectorMenu> getContainerClass() {
//        return BasicPerformanceDesignatedDataInjectorMenu.class;
//    }
//
//    @Override
//    public Class<BasicPerformanceDesignatedDataInjectorRecipe> getRecipeClass() {
//        return BasicPerformanceDesignatedDataInjectorRecipe.class;
//    }
//
//    @Override
//    public IRecipeTransferError transferRecipe(BasicPerformanceDesignatedDataInjectorMenu menu,
//                                               BasicPerformanceDesignatedDataInjectorRecipe recipe,
//                                               IRecipeSlotsView recipeSlots,
//                                               Player player,
//                                               boolean maxTransfer,
//                                               boolean doTransfer) {
//        // doTransfer == false の場合はチェックだけ
//        if (!doTransfer) {
//            return null;
//        }
//
//        // レシピの入力材料を取り出す
//        var ingredients = recipe.getIngredients();
//
//        // 入力スロット 0〜4 に配置
//        for (int i = 0; i < 5 && i < ingredients.size(); i++) {
//            var matchingStacks = ingredients.get(i).getItems();
//            if (matchingStacks.length > 0) {
//                ItemStack toPlace = matchingStacks[0].copy();
//                Slot slot = menu.getSlot(i);
//                slot.set(toPlace);
//            }
//        }
//
//        // 出力スロット(5)、設定用スロット(6,7)には触れない
//
//        // メニューに変更を通知
//        menu.broadcastChanges();
//        return null; // エラーなし
//    }
//}