package net.epitap.degeneracycraft.tag;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DCTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_CAMMDA_TIER1 = tag("needs_cammda_tier1");
        public static final TagKey<Block> DEGENERACYCRAFT_MACHINES =tag("degeneracycraft_machines");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Degeneracycraft.MOD_ID,name));
        }
    }
    public static class Items{

        public static final TagKey<Item> IRON_MACHINE_COMPONENT = tag("iron_machine_component");

        public static final TagKey<Item> BERYL_MULTIPLIED_ORE_MATERIAL =tag("beryl_multiplied_ore_material");
        public static final TagKey<Item> BORAX_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"borax_multiplied_ore_material"));
        public static final TagKey<Item> CASSITERITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"cassiterite_multiplied_ore_material"));
        public static final TagKey<Item> FLUORITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"cassiterite_multiplied_ore_material"));
        public static final TagKey<Item> GRAPHITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"graphite_multiplied_ore_material"));
        public static final TagKey<Item> IRON_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"iron_multiplied_ore_material"));
        public static final TagKey<Item> PEGMATITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"pegmatite_multiplied_ore_material"));
        public static final TagKey<Item> SPODUMENE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"spodumene_multiplied_ore_material"));
        public static final TagKey<Item> ULEXITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"ulexite_multiplied_ore_material"));


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Degeneracycraft.MOD_ID,name));
        }
    }
}
