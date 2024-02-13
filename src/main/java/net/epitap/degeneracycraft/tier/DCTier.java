package net.epitap.degeneracycraft.tier;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.tag.DCTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class DCTier {

    public static Tier CAMMDA_TIER1;

    static {
        CAMMDA_TIER1 = TierSortingRegistry.registerTier(
                new ForgeTier(2,-1,5.0f,2.5f,0,
                        DCTags.Blocks.NEEDS_CAMMDA_TIER1,()-> Ingredient.of(DCItems.CAMMDA_TIER1.get())),
                new ResourceLocation(Degeneracycraft.MOD_ID,"cammda_tier1"), List.of(Tiers.NETHERITE),List.of());

    }
}
