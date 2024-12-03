package net.epitap.degeneracycraft.integration.jei.test;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.Optional;

public class IngredientToBlockConverter {

    /**
     * Ingredient を Block に変換します。
     *
     * @param ingredient 変換したい Ingredient
     * @return Optional<Block> が返されます。変換に失敗した場合は Optional.empty() を返します。
     */
    public static Optional<Block> ingredientToBlock(Ingredient ingredient) {
        // Ingredient から対応する ItemStack 配列を取得
        for (ItemStack stack : ingredient.getItems()) {
            // ItemStack から Item を取得
            Item item = stack.getItem();

            // Item が BlockItem の場合は Block に変換
            if (item instanceof BlockItem) {
                Block block = ((BlockItem) item).getBlock();
                return Optional.of(block); // Block をラップして返す
            }
        }

        // 変換できない場合は Optional.empty() を返す
        return Optional.empty();
    }
}
