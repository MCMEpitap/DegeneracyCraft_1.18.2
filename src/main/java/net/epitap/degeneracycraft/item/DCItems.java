package net.epitap.degeneracycraft.item;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.item.tool.CAMMDA_Tier1;
import net.epitap.degeneracycraft.item.tool.WrenchItem;
import net.epitap.degeneracycraft.item.tool.test.GunItem;
import net.epitap.degeneracycraft.tier.DCTier;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DCItems extends CreativeModeTab {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Degeneracycraft.MOD_ID);
    public static final RegistryObject<Item> GRAVITATION_INGOT = ITEMS.register("gravitation_ingot",()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final TagKey<Item> BAUXITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"bauxite_multiplied_ore_material"));
    public static final TagKey<Item> BERYL_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"beryl_multiplied_ore_material"));
    public static final TagKey<Item> BORAX_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"borax_multiplied_ore_material"));
    public static final TagKey<Item> CASSITERITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"cassiterite_multiplied_ore_material"));
    public static final TagKey<Item> CHROMITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"chromite_multiplied_ore_material"));
    public static final TagKey<Item> FLUORITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"cassiterite_multiplied_ore_material"));
    public static final TagKey<Item> GRAPHITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"graphite_multiplied_ore_material"));
    public static final TagKey<Item> IRON_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"iron_multiplied_ore_material"));
    public static final TagKey<Item> LATERITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"laterite_multiplied_ore_material"));
    public static final TagKey<Item> LIMESTONE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"limestone_multiplied_ore_material"));
    public static final TagKey<Item> PHOSPHORITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"phosphorite_multiplied_ore_material"));
    public static final TagKey<Item> PEGMATITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"pegmatite_multiplied_ore_material"));
    public static final TagKey<Item> PYROLUSITE_MULTIPLIED_ORE_MATERIAL = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "pyrolusite_multiplied_ore_material"));
    public static final TagKey<Item> QUARTZ_MULTIPLIED_ORE_MATERIAL = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "quartz_multiplied_ore_material"));
    public static final TagKey<Item> RUTILE_MULTIPLIED_ORE_MATERIAL = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "rutile_multiplied_ore_material"));
    public static final TagKey<Item> SPODUMENE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"spodumene_multiplied_ore_material"));
    public static final TagKey<Item> SYLVITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"sylvite_multiplied_ore_material"));
    public static final TagKey<Item> ULEXITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"ulexite_multiplied_ore_material"));
    public static final TagKey<Item> VANADINITE_MULTIPLIED_ORE_MATERIAL =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"vanadinite_multiplied_ore_material"));


    //Bauxite item group
    public static final RegistryObject<Item> RAW_BAUXITE_ORE = ITEMS.register("raw_bauxite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_DUST = ITEMS.register("bauxite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_PUREDUST = ITEMS.register("bauxite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_LEACHATE = ITEMS.register("bauxite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_CONCENTRATE = ITEMS.register("bauxite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_PLASMA = ITEMS.register("bauxite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_DEGENERATEMATTER = ITEMS.register("bauxite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_SOUP = ITEMS.register("bauxite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_IMAGINARYMATTER = ITEMS.register("bauxite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_BAUXITE_IMAGINARYMATTER = ITEMS.register("stable_bauxite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_TACHYON = ITEMS.register("bauxite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_ANTIMATTER = ITEMS.register("bauxite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_ULTRAHOTPLASMA = ITEMS.register("bauxite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_OVERFLUID = ITEMS.register("bauxite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_CRYSTAL = ITEMS.register("bauxite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_PRECIPITATE = ITEMS.register("bauxite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_WASHEDDUST = ITEMS.register("bauxite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_ORESINTER = ITEMS.register("bauxite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BAUXITE_INGOT = ITEMS.register("bauxite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Beryl item group
    public static final RegistryObject<Item> RAW_BERYL_ORE = ITEMS.register("raw_beryl_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_DUST = ITEMS.register("beryl_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_PUREDUST = ITEMS.register("beryl_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_LEACHATE = ITEMS.register("beryl_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_CONCENTRATE = ITEMS.register("beryl_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_PLASMA = ITEMS.register("beryl_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_DEGENERATEMATTER = ITEMS.register("beryl_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_SOUP = ITEMS.register("beryl_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_IMAGINARYMATTER = ITEMS.register("beryl_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_BERYL_IMAGINARYMATTER = ITEMS.register("stable_beryl_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_TACHYON = ITEMS.register("beryl_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_ANTIMATTER = ITEMS.register("beryl_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_ULTRAHOTPLASMA = ITEMS.register("beryl_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_OVERFLUID = ITEMS.register("beryl_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_CRYSTAL = ITEMS.register("beryl_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_PRECIPITATE = ITEMS.register("beryl_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_WASHEDDUST = ITEMS.register("beryl_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_ORESINTER = ITEMS.register("beryl_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BERYL_INGOT = ITEMS.register("beryl_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Borax item group
    public static final RegistryObject<Item> RAW_BORAX_ORE = ITEMS.register("raw_borax_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_DUST = ITEMS.register("borax_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_PUREDUST = ITEMS.register("borax_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_LEACHATE = ITEMS.register("borax_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_CONCENTRATE = ITEMS.register("borax_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_PLASMA = ITEMS.register("borax_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_DEGENERATEMATTER = ITEMS.register("borax_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_SOUP = ITEMS.register("borax_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_IMAGINARYMATTER = ITEMS.register("borax_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_BORAX_IMAGINARYMATTER = ITEMS.register("stable_borax_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_TACHYON = ITEMS.register("borax_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_ANTIMATTER = ITEMS.register("borax_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_ULTRAHOTPLASMA = ITEMS.register("borax_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_OVERFLUID = ITEMS.register("borax_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_CRYSTAL = ITEMS.register("borax_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_PRECIPITATE = ITEMS.register("borax_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_WASHEDDUST = ITEMS.register("borax_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_ORESINTER = ITEMS.register("borax_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> BORAX_INGOT = ITEMS.register("borax_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));
    //Cassiterite item group
    public static final RegistryObject<Item> RAW_CASSITERITE_ORE = ITEMS.register("raw_cassiterite_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_DUST = ITEMS.register("cassiterite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_PUREDUST = ITEMS.register("cassiterite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_LEACHATE = ITEMS.register("cassiterite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_CONCENTRATE = ITEMS.register("cassiterite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_PLASMA = ITEMS.register("cassiterite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_DEGENERATEMATTER = ITEMS.register("cassiterite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_SOUP = ITEMS.register("cassiterite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_IMAGINARYMATTER = ITEMS.register("cassiterite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_CASSITERITE_IMAGINARYMATTER = ITEMS.register("stable_cassiterite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_TACHYON = ITEMS.register("cassiterite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_ANTIMATTER = ITEMS.register("cassiterite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_ULTRAHOTPLASMA = ITEMS.register("cassiterite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_OVERFLUID = ITEMS.register("cassiterite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_CRYSTAL = ITEMS.register("cassiterite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_PRECIPITATE = ITEMS.register("cassiterite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_WASHEDDUST = ITEMS.register("cassiterite_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_ORESINTER = ITEMS.register("cassiterite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CASSITERITE_INGOT = ITEMS.register("cassiterite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));
    //Chromite item group
    public static final RegistryObject<Item> RAW_CHROMITE_ORE = ITEMS.register("raw_chromite_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_DUST = ITEMS.register("chromite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_PUREDUST = ITEMS.register("chromite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_LEACHATE = ITEMS.register("chromite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_CONCENTRATE = ITEMS.register("chromite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_PLASMA = ITEMS.register("chromite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_DEGENERATEMATTER = ITEMS.register("chromite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_SOUP = ITEMS.register("chromite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_IMAGINARYMATTER = ITEMS.register("chromite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_CHROMITE_IMAGINARYMATTER = ITEMS.register("stable_chromite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_TACHYON = ITEMS.register("chromite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_ANTIMATTER = ITEMS.register("chromite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_ULTRAHOTPLASMA = ITEMS.register("chromite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_OVERFLUID = ITEMS.register("chromite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_CRYSTAL = ITEMS.register("chromite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_PRECIPITATE = ITEMS.register("chromite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_WASHEDDUST = ITEMS.register("chromite_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_ORESINTER = ITEMS.register("chromite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> CHROMITE_INGOT = ITEMS.register("chromite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Fluorite item group
    public static final RegistryObject<Item> RAW_FLUORITE_ORE = ITEMS.register("raw_fluorite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_DUST = ITEMS.register("fluorite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_PUREDUST = ITEMS.register("fluorite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_LEACHATE = ITEMS.register("fluorite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_CONCENTRATE = ITEMS.register("fluorite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_PLASMA = ITEMS.register("fluorite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_DEGENERATEMATTER = ITEMS.register("fluorite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_SOUP = ITEMS.register("fluorite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_IMAGINARYMATTER = ITEMS.register("fluorite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_FLUORITE_IMAGINARYMATTER = ITEMS.register("stable_fluorite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_TACHYON = ITEMS.register("fluorite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_ANTIMATTER = ITEMS.register("fluorite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_ULTRAHOTPLASMA = ITEMS.register("fluorite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_OVERFLUID = ITEMS.register("fluorite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_CRYSTAL = ITEMS.register("fluorite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_PRECIPITATE = ITEMS.register("fluorite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_WASHEDDUST = ITEMS.register("fluorite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_ORESINTER = ITEMS.register("fluorite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> FLUORITE_INGOT = ITEMS.register("fluorite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));
    //Graphite item group
    public static final RegistryObject<Item> RAW_GRAPHITE_ORE = ITEMS.register("raw_graphite_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_DUST = ITEMS.register("graphite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_PUREDUST = ITEMS.register("graphite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_LEACHATE = ITEMS.register("graphite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_CONCENTRATE = ITEMS.register("graphite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_PLASMA = ITEMS.register("graphite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_DEGENERATEMATTER = ITEMS.register("graphite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_SOUP = ITEMS.register("graphite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_IMAGINARYMATTER = ITEMS.register("graphite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_GRAPHITE_IMAGINARYMATTER = ITEMS.register("stable_graphite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_TACHYON = ITEMS.register("graphite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_ANTIMATTER = ITEMS.register("graphite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_ULTRAHOTPLASMA = ITEMS.register("graphite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_OVERFLUID = ITEMS.register("graphite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_CRYSTAL = ITEMS.register("graphite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_PRECIPITATE = ITEMS.register("graphite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_WASHEDDUST = ITEMS.register("graphite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_ORESINTER = ITEMS.register("graphite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

//    // Iron item group
//    public static final RegistryObject<Item> IRON_DUST  = ITEMS.register("iron_dust",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_PUREDUST  = ITEMS.register("iron_puredust",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_LEACHATE  = ITEMS.register("iron_leachate",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_CONCENTRATE  = ITEMS.register("iron_concentrate",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_PLASMA  = ITEMS.register("iron_plasma",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_DEGENERATEMATTER  = ITEMS.register("iron_degeneratematter",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_SOUP  = ITEMS.register("iron_soup",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_IMAGINARYMATTER  = ITEMS.register("iron_imaginarymatter",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> STABLE_IRON_IMAGINARYMATTER  = ITEMS.register("stable_iron_imaginarymatter",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_TACHYON  = ITEMS.register("iron_tachyon",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_ANTIMATTER  = ITEMS.register("iron_antimatter",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_ULTRAHOTPLASMA = ITEMS.register("iron_ultrahotplasma", () -> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_OVERFLUID = ITEMS.register("iron_overfluid", () -> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_CRYSTAL = ITEMS.register("iron_crystal", () -> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_PRECIPITATE  = ITEMS.register("iron_precipitate",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_WASHEDDUST  = ITEMS.register("iron_washeddust",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//    public static final RegistryObject<Item> IRON_ORESINTER  = ITEMS.register("iron_oresinter",()-> new DCItemTooltip(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
//
//Laterite item group
public static final RegistryObject<Item> RAW_LATERITE_ORE = ITEMS.register("raw_laterite_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_DUST = ITEMS.register("laterite_dust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_PUREDUST = ITEMS.register("laterite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_LEACHATE = ITEMS.register("laterite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_CONCENTRATE = ITEMS.register("laterite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_PLASMA = ITEMS.register("laterite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_DEGENERATEMATTER = ITEMS.register("laterite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_SOUP = ITEMS.register("laterite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_IMAGINARYMATTER = ITEMS.register("laterite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_LATERITE_IMAGINARYMATTER = ITEMS.register("stable_laterite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_TACHYON = ITEMS.register("laterite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_ANTIMATTER = ITEMS.register("laterite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_ULTRAHOTPLASMA = ITEMS.register("laterite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_OVERFLUID = ITEMS.register("laterite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_CRYSTAL = ITEMS.register("laterite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_PRECIPITATE = ITEMS.register("laterite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_WASHEDDUST = ITEMS.register("laterite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_ORESINTER = ITEMS.register("laterite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LATERITE_INGOT = ITEMS.register("laterite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Limestone item group
    public static final RegistryObject<Item> RAW_LIMESTONE_ORE = ITEMS.register("raw_limestone_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_PUREDUST = ITEMS.register("limestone_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_LEACHATE = ITEMS.register("limestone_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_CONCENTRATE = ITEMS.register("limestone_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_PLASMA = ITEMS.register("limestone_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_DEGENERATEMATTER = ITEMS.register("limestone_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_SOUP = ITEMS.register("limestone_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_IMAGINARYMATTER = ITEMS.register("limestone_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_LIMESTONE_IMAGINARYMATTER = ITEMS.register("stable_limestone_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_TACHYON = ITEMS.register("limestone_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_ANTIMATTER = ITEMS.register("limestone_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_ULTRAHOTPLASMA = ITEMS.register("limestone_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_OVERFLUID = ITEMS.register("limestone_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_CRYSTAL = ITEMS.register("limestone_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_PRECIPITATE = ITEMS.register("limestone_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_WASHEDDUST = ITEMS.register("limestone_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_ORESINTER = ITEMS.register("limestone_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> LIMESTONE_INGOT = ITEMS.register("limestone_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));


    // Pegmatite item group
    public static final RegistryObject<Item> RAW_PEGMATITE_ORE = ITEMS.register("raw_pegmatite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_DUST = ITEMS.register("pegmatite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_PUREDUST = ITEMS.register("pegmatite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_LEACHATE = ITEMS.register("pegmatite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_CONCENTRATE = ITEMS.register("pegmatite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_PLASMA = ITEMS.register("pegmatite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_DEGENERATEMATTER = ITEMS.register("pegmatite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_SOUP = ITEMS.register("pegmatite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_IMAGINARYMATTER = ITEMS.register("pegmatite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_PEGMATITE_IMAGINARYMATTER = ITEMS.register("stable_pegmatite_imaginarymatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_TACHYON = ITEMS.register("pegmatite_tachyon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_ANTIMATTER = ITEMS.register("pegmatite_antimatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_ULTRAHOTPLASMA = ITEMS.register("pegmatite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_OVERFLUID = ITEMS.register("pegmatite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_CRYSTAL = ITEMS.register("pegmatite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_PRECIPITATE = ITEMS.register("pegmatite_precipitate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_WASHEDDUST = ITEMS.register("pegmatite_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_ORESINTER = ITEMS.register("pegmatite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PEGMATITE_INGOT = ITEMS.register("pegmatite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));
    //Pentlandite item group
    public static final RegistryObject<Item> RAW_PENTLANDITE_ORE = ITEMS.register("raw_pentlandite_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_DUST = ITEMS.register("pentlandite_dust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_PUREDUST = ITEMS.register("pentlandite_puredust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_LEACHATE = ITEMS.register("pentlandite_leachate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_CONCENTRATE = ITEMS.register("pentlandite_concentrate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_PLASMA = ITEMS.register("pentlandite_plasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_DEGENERATEMATTER = ITEMS.register("pentlandite_degeneratematter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_SOUP = ITEMS.register("pentlandite_soup", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_IMAGINARYMATTER = ITEMS.register("pentlandite_imaginarymatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_PENTLANDITE_IMAGINARYMATTER = ITEMS.register("stable_pentlandite_imaginarymatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_TACHYON = ITEMS.register("pentlandite_tachyon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_ANTIMATTER = ITEMS.register("pentlandite_antimatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_ULTRAHOTPLASMA = ITEMS.register("pentlandite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_OVERFLUID = ITEMS.register("pentlandite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_CRYSTAL = ITEMS.register("pentlandite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_PRECIPITATE = ITEMS.register("pentlandite_precipitate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_WASHEDDUST = ITEMS.register("pentlandite_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_ORESINTER = ITEMS.register("pentlandite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PENTLANDITE_INGOT = ITEMS.register("pentlandite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Phosphorite item group
    public static final RegistryObject<Item> RAW_PHOSPHORITE_ORE = ITEMS.register("raw_phosphorite_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_DUST = ITEMS.register("phosphorite_dust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_PUREDUST = ITEMS.register("phosphorite_puredust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_LEACHATE = ITEMS.register("phosphorite_leachate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_CONCENTRATE = ITEMS.register("phosphorite_concentrate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_PLASMA = ITEMS.register("phosphorite_plasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_DEGENERATEMATTER = ITEMS.register("phosphorite_degeneratematter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_SOUP = ITEMS.register("phosphorite_soup", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_IMAGINARYMATTER = ITEMS.register("phosphorite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_PHOSPHORITE_IMAGINARYMATTER = ITEMS.register("stable_phosphorite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_TACHYON = ITEMS.register("phosphorite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_ANTIMATTER = ITEMS.register("phosphorite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_ULTRAHOTPLASMA = ITEMS.register("phosphorite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_OVERFLUID = ITEMS.register("phosphorite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_CRYSTAL = ITEMS.register("phosphorite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_PRECIPITATE = ITEMS.register("phosphorite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_WASHEDDUST = ITEMS.register("phosphorite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_ORESINTER = ITEMS.register("phosphorite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PHOSPHORITE_INGOT = ITEMS.register("phosphorite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Pyrolusite item group
    public static final RegistryObject<Item> RAW_PYROLUSITE_ORE = ITEMS.register("raw_pyrolusite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_DUST = ITEMS.register("pyrolusite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_PUREDUST = ITEMS.register("pyrolusite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_LEACHATE = ITEMS.register("pyrolusite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_CONCENTRATE = ITEMS.register("pyrolusite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_PLASMA = ITEMS.register("pyrolusite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_DEGENERATEMATTER = ITEMS.register("pyrolusite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_SOUP = ITEMS.register("pyrolusite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_IMAGINARYMATTER = ITEMS.register("pyrolusite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_PYROLUSITE_IMAGINARYMATTER = ITEMS.register("stable_pyrolusite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_TACHYON = ITEMS.register("pyrolusite_tachyon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_ANTIMATTER = ITEMS.register("pyrolusite_antimatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_ULTRAHOTPLASMA = ITEMS.register("pyrolusite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_OVERFLUID = ITEMS.register("pyrolusite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_CRYSTAL = ITEMS.register("pyrolusite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_PRECIPITATE = ITEMS.register("pyrolusite_precipitate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_WASHEDDUST = ITEMS.register("pyrolusite_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_ORESINTER = ITEMS.register("pyrolusite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> PYROLUSITE_INGOT = ITEMS.register("pyrolusite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Quartz item group
    public static final RegistryObject<Item> RAW_QUARTZ_ORE = ITEMS.register("raw_quartz_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_PUREDUST = ITEMS.register("quartz_puredust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_LEACHATE = ITEMS.register("quartz_leachate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_CONCENTRATE = ITEMS.register("quartz_concentrate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_PLASMA = ITEMS.register("quartz_plasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_DEGENERATEMATTER = ITEMS.register("quartz_degeneratematter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_SOUP = ITEMS.register("quartz_soup", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_IMAGINARYMATTER = ITEMS.register("quartz_imaginarymatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_QUARTZ_IMAGINARYMATTER = ITEMS.register("stable_quartz_imaginarymatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_TACHYON = ITEMS.register("quartz_tachyon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_ANTIMATTER = ITEMS.register("quartz_antimatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_ULTRAHOTPLASMA = ITEMS.register("quartz_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_OVERFLUID = ITEMS.register("quartz_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_CRYSTAL = ITEMS.register("quartz_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_PRECIPITATE = ITEMS.register("quartz_precipitate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_WASHEDDUST = ITEMS.register("quartz_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_ORESINTER = ITEMS.register("quartz_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> QUARTZ_INGOT = ITEMS.register("quartz_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    // Rutile item group
    public static final RegistryObject<Item> RAW_RUTILE_ORE = ITEMS.register("raw_rutile_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_DUST = ITEMS.register("rutile_dust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_PUREDUST = ITEMS.register("rutile_puredust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_LEACHATE = ITEMS.register("rutile_leachate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_CONCENTRATE = ITEMS.register("rutile_concentrate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_PLASMA = ITEMS.register("rutile_plasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_DEGENERATEMATTER = ITEMS.register("rutile_degeneratematter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_SOUP = ITEMS.register("rutile_soup", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_IMAGINARYMATTER = ITEMS.register("rutile_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_RUTILE_IMAGINARYMATTER = ITEMS.register("stable_rutile_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_TACHYON = ITEMS.register("rutile_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_ANTIMATTER = ITEMS.register("rutile_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_ULTRAHOTPLASMA = ITEMS.register("rutile_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_OVERFLUID = ITEMS.register("rutile_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_CRYSTAL = ITEMS.register("rutile_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_PRECIPITATE = ITEMS.register("rutile_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_WASHEDDUST = ITEMS.register("rutile_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_ORESINTER = ITEMS.register("rutile_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUTILE_INGOT = ITEMS.register("rutile_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));


    // Spodumene item group
    public static final RegistryObject<Item> RAW_SPODUMENE_ORE = ITEMS.register("raw_spodumene_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_DUST = ITEMS.register("spodumene_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_PUREDUST = ITEMS.register("spodumene_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_LEACHATE = ITEMS.register("spodumene_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_CONCENTRATE = ITEMS.register("spodumene_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_PLASMA = ITEMS.register("spodumene_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_DEGENERATEMATTER = ITEMS.register("spodumene_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_SOUP = ITEMS.register("spodumene_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_IMAGINARYMATTER = ITEMS.register("spodumene_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_SPODUMENE_IMAGINARYMATTER = ITEMS.register("stable_spodumene_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_TACHYON = ITEMS.register("spodumene_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_ANTIMATTER = ITEMS.register("spodumene_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_ULTRAHOTPLASMA = ITEMS.register("spodumene_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_OVERFLUID = ITEMS.register("spodumene_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_CRYSTAL = ITEMS.register("spodumene_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_PRECIPITATE = ITEMS.register("spodumene_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_WASHEDDUST = ITEMS.register("spodumene_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_ORESINTER = ITEMS.register("spodumene_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SPODUMENE_INGOT = ITEMS.register("spodumene_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    //Sylvite item group
    public static final RegistryObject<Item> RAW_SYLVITE_ORE = ITEMS.register("raw_sylvite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_DUST = ITEMS.register("sylvite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_PUREDUST = ITEMS.register("sylvite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_LEACHATE = ITEMS.register("sylvite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_CONCENTRATE = ITEMS.register("sylvite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_PLASMA = ITEMS.register("sylvite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_DEGENERATEMATTER = ITEMS.register("sylvite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_SOUP = ITEMS.register("sylvite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_IMAGINARYMATTER = ITEMS.register("sylvite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_SYLVITE_IMAGINARYMATTER = ITEMS.register("stable_sylvite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_TACHYON = ITEMS.register("sylvite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_ANTIMATTER = ITEMS.register("sylvite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_ULTRAHOTPLASMA = ITEMS.register("sylvite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_OVERFLUID = ITEMS.register("sylvite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_CRYSTAL = ITEMS.register("sylvite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_PRECIPITATE = ITEMS.register("sylvite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_WASHEDDUST = ITEMS.register("sylvite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_ORESINTER = ITEMS.register("sylvite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> SYLVITE_INGOT = ITEMS.register("sylvite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    // Ulexite item group
    public static final RegistryObject<Item> RAW_ULEXITE_ORE = ITEMS.register("raw_ulexite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_DUST = ITEMS.register("ulexite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_PUREDUST = ITEMS.register("ulexite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_LEACHATE = ITEMS.register("ulexite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_CONCENTRATE = ITEMS.register("ulexite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_PLASMA = ITEMS.register("ulexite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_DEGENERATEMATTER = ITEMS.register("ulexite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_SOUP = ITEMS.register("ulexite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_IMAGINARYMATTER = ITEMS.register("ulexite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_ULEXITE_IMAGINARYMATTER = ITEMS.register("stable_ulexite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_TACHYON = ITEMS.register("ulexite_tachyon",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_ANTIMATTER = ITEMS.register("ulexite_antimatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_ULTRAHOTPLASMA = ITEMS.register("ulexite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_OVERFLUID = ITEMS.register("ulexite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_CRYSTAL = ITEMS.register("ulexite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_PRECIPITATE = ITEMS.register("ulexite_precipitate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_WASHEDDUST = ITEMS.register("ulexite_washeddust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_ORESINTER = ITEMS.register("ulexite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> ULEXITE_INGOT = ITEMS.register("ulexite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));

    // Vanadinite item group
    public static final RegistryObject<Item> RAW_VANADINITE_ORE = ITEMS.register("raw_vanadinite_ore",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_DUST = ITEMS.register("vanadinite_dust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_PUREDUST = ITEMS.register("vanadinite_puredust",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_LEACHATE = ITEMS.register("vanadinite_leachate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_CONCENTRATE = ITEMS.register("vanadinite_concentrate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_PLASMA = ITEMS.register("vanadinite_plasma",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_DEGENERATEMATTER = ITEMS.register("vanadinite_degeneratematter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_SOUP = ITEMS.register("vanadinite_soup",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_IMAGINARYMATTER = ITEMS.register("vanadinite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> STABLE_VANADINITE_IMAGINARYMATTER = ITEMS.register("stable_vanadinite_imaginarymatter",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_TACHYON = ITEMS.register("vanadinite_tachyon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_ANTIMATTER = ITEMS.register("vanadinite_antimatter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_ULTRAHOTPLASMA = ITEMS.register("vanadinite_ultrahotplasma", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_OVERFLUID = ITEMS.register("vanadinite_overfluid", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_CRYSTAL = ITEMS.register("vanadinite_crystal", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_PRECIPITATE = ITEMS.register("vanadinite_precipitate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_WASHEDDUST = ITEMS.register("vanadinite_washeddust", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_ORESINTER = ITEMS.register("vanadinite_oresinter", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB)));
    public static final RegistryObject<Item> VANADINITE_INGOT = ITEMS.register("vanadinite_ingot", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_INGOT_TAB)));


    //Element Item

    public static final RegistryObject<Item> HYDROGEN_GAS = registerAtomicItem("hydrogen_gas", DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "hydrogen", "basic");

    public static final RegistryObject<Item> CHLORINE_GAS = registerAtomicItem("chlorine_gas", DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "chlorine", "basic");


    public static final RegistryObject<Item> SILICON_INGOT = registerAtomicItem("silicon_ingot", DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "silicon", "basic");
    public static final RegistryObject<Item> SILICON_NUGGET = registerAtomicItem("silicon_nugget", DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "silicon", "basic");

    public static final RegistryObject<Item> TIN_INGOT = registerAtomicItem("tin_ingot", DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_NUGGET = registerAtomicItem("tin_nugget", DCCreativeTab.DEGENERACYCRAFT_ELEMENT_ITEM_TAB, "tin", "basic");


    //public static final RegistryObject<Item> PURIFIED_GRAPHITE_ARC_ELECTRODE = ITEMS.register("purified_graphite_arc_electrode", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB)));


    public static final RegistryObject<Item> EMPTY_CONTAINER = ITEMS.register("empty_container", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB)));
    public static final RegistryObject<Item> WATER_CONTAINER = registerChemicalSubstanceItem("water_container", DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB, "water", "basic");


    public static final RegistryObject<Item> POTTASSIUM_NITRATE_DUST = registerChemicalSubstanceItem("potassium_nitrate_dust", DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB, "hydrochloric_acid", "basic");
    public static final RegistryObject<Item> HYDROCHLORIC_ACID_SOLUTION = registerChemicalSubstanceItem("hydrochloric_acid_solution", DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB, "hydrochloric_acid", "basic");
    public static final RegistryObject<Item> HYDROGEN_CHLORIDE_GAS = registerChemicalSubstanceItem("hydrogen_chloride_gas", DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB, "hydrogen_chloride", "basic");

    //Machine Component Group

    public static final TagKey<Item> COPPER_MACHINE_COMPONENT = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "copper_machine_component"));

//    public static final TagKey<Item> BASIC_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"basic_class_iron_machine_component"));
//    public static final TagKey<Item> LOW_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"low_class_iron_machine_component"));
//    public static final TagKey<Item> MEDIUM_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"medium_class_iron_machine_component"));
//    public static final TagKey<Item> HIGH_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"high_class_iron_machine_component"));
//    public static final TagKey<Item> SUPER_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"super_class_iron_machine_component"));
//    public static final TagKey<Item> HYPER_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"hyper_class_iron_machine_component"));
//    public static final TagKey<Item> ULTRA_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"ultra_class_iron_machine_component"));
//    public static final TagKey<Item> ANTI_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"anti_class_iron_machine_component"));
//    public static final TagKey<Item> IMAGINARY_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"imaginary_class_iron_machine_component"));
//    public static final TagKey<Item> INFINITY_CLASS_IRON_MACHINE_COMPONENT =TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(Degeneracycraft.MOD_ID,"infinity_class_iron_machine_component"));

    public static final TagKey<Item> MACHINE_COMPONENT_BASIC_PRECISION_CIRCUIT = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Degeneracycraft.MOD_ID, "machine_component_circuit_phase1"));

    //Copper Machine Component
    public static final RegistryObject<Item> COPPER_BEARING = registerAtomicItem("copper_bearing", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_BOLT = registerAtomicItem("copper_bolt", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_CAM = registerAtomicItem("copper_cam", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_CHAIN = registerAtomicItem("copper_chain", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_GEAR = registerAtomicItem("copper_gear", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_JOINT = registerAtomicItem("copper_joint", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_KEY = registerAtomicItem("copper_key", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_NUT = registerAtomicItem("copper_nut", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_PIPE = registerAtomicItem("copper_pipe", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_PIPEJOINT = registerAtomicItem("copper_pipejoint", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_PLATE = registerAtomicItem("copper_plate", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_RIVET = registerAtomicItem("copper_rivet", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_ROD = registerAtomicItem("copper_rod", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_SHAFT = registerAtomicItem("copper_shaft", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_SHAFTCOUPLING = registerAtomicItem("copper_shaftcoupling", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_SPRING = registerAtomicItem("copper_spring", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_SHAPESTEEL = registerAtomicItem("copper_shapesteel", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");
    public static final RegistryObject<Item> COPPER_WIRE = registerAtomicItem("copper_wire", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "copper", "initial");


    //Basic Class Iron Machine Component
    public static final RegistryObject<Item> IRON_BEARING = registerAtomicItem("iron_bearing", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_BOLT = registerAtomicItem("iron_bolt", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_CAM = registerAtomicItem("iron_cam", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_CHAIN = registerAtomicItem("iron_chain", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_GEAR = registerAtomicItem("iron_gear", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_JOINT = registerAtomicItem("iron_joint", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_KEY = registerAtomicItem("iron_key", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_NUT = registerAtomicItem("iron_nut", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_PIPE = registerAtomicItem("iron_pipe", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_PIPEJOINT = registerAtomicItem("iron_pipejoint", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_PLATE = registerAtomicItem("iron_plate", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_RIVET = registerAtomicItem("iron_rivet", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_ROD = registerAtomicItem("iron_rod", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_SHAFT = registerAtomicItem("iron_shaft", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_SHAFTCOUPLING = registerAtomicItem("iron_shaftcoupling", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_SHAPESTEEL = registerAtomicItem("iron_shapesteel", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_SPRING = registerAtomicItem("iron_spring", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");
    public static final RegistryObject<Item> IRON_WIRE = registerAtomicItem("iron_wire", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "iron", "initial");

    public static final RegistryObject<Item> TIN_BEARING = registerAtomicItem("tin_bearing", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_BOLT = registerAtomicItem("tin_bolt", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_CAM = registerAtomicItem("tin_cam", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_CHAIN = registerAtomicItem("tin_chain", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_GEAR = registerAtomicItem("tin_gear", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_JOINT = registerAtomicItem("tin_joint", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_KEY = registerAtomicItem("tin_key", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_NUT = registerAtomicItem("tin_nut", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_PIPE = registerAtomicItem("tin_pipe", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_PIPEJOINT = registerAtomicItem("tin_pipejoint", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_PLATE = registerAtomicItem("tin_plate", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_RIVET = registerAtomicItem("tin_rivet", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_ROD = registerAtomicItem("tin_rod", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "basic");
    public static final RegistryObject<Item> TIN_SHAFT = registerAtomicItem("tin_shaft", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "initial");
    public static final RegistryObject<Item> TIN_SHAFTCOUPLING = registerAtomicItem("tin_shaftcoupling", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "initial");
    public static final RegistryObject<Item> TIN_SHAPESTEEL = registerAtomicItem("tin_shapesteel", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "initial");
    public static final RegistryObject<Item> TIN_SPRING = registerAtomicItem("tin_spring", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "initial");
    public static final RegistryObject<Item> TIN_WIRE = registerAtomicItem("tin_wire", DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB, "tin", "initial");

    //    public static final RegistryObject<Item> BASIC_CLASS_IRON_BEARING = ITEMS.register("basic_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_BOLT = ITEMS.register("basic_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_CAM = ITEMS.register("basic_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_CHAIN = ITEMS.register("basic_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_GEAR = ITEMS.register("basic_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_JOINT = ITEMS.register("basic_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_KEY = ITEMS.register("basic_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_NUT = ITEMS.register("basic_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_PIPE = ITEMS.register("basic_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_PIPEJOINT = ITEMS.register("basic_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_PLATE = ITEMS.register("basic_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_ROD = ITEMS.register("basic_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_SHAFT = ITEMS.register("basic_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("basic_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_SHAPESTEEL = ITEMS.register("basic_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> BASIC_CLASS_IRON_SPRING = ITEMS.register("basic_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Low Class Iron Machine Component
//    public static final RegistryObject<Item> LOW_CLASS_IRON_BEARING = ITEMS.register("low_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_BOLT = ITEMS.register("low_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_CAM = ITEMS.register("low_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_CHAIN = ITEMS.register("low_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_GEAR = ITEMS.register("low_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_JOINT = ITEMS.register("low_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_KEY = ITEMS.register("low_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_NUT = ITEMS.register("low_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_PIPE = ITEMS.register("low_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_PIPEJOINT = ITEMS.register("low_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_PLATE = ITEMS.register("low_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_ROD = ITEMS.register("low_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_SHAFT = ITEMS.register("low_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("low_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_SHAPESTEEL = ITEMS.register("low_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> LOW_CLASS_IRON_SPRING = ITEMS.register("low_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Medium Class Iron Machine Component
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_BEARING = ITEMS.register("medium_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_BOLT = ITEMS.register("medium_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_CAM = ITEMS.register("medium_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_CHAIN = ITEMS.register("medium_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_GEAR = ITEMS.register("medium_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_JOINT = ITEMS.register("medium_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_KEY = ITEMS.register("medium_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_NUT = ITEMS.register("medium_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_PIPE = ITEMS.register("medium_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_PIPEJOINT = ITEMS.register("medium_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_PLATE = ITEMS.register("medium_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_ROD = ITEMS.register("medium_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_SHAFT = ITEMS.register("medium_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("medium_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_SHAPESTEEL = ITEMS.register("medium_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> MEDIUM_CLASS_IRON_SPRING = ITEMS.register("medium_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //High Class Iron Machine Component
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_BEARING = ITEMS.register("high_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_BOLT = ITEMS.register("high_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_CAM = ITEMS.register("high_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_CHAIN = ITEMS.register("high_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_GEAR = ITEMS.register("high_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_JOINT = ITEMS.register("high_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_KEY = ITEMS.register("high_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_NUT = ITEMS.register("high_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_PIPE = ITEMS.register("high_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_PIPEJOINT = ITEMS.register("high_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_PLATE = ITEMS.register("high_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_ROD = ITEMS.register("high_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_SHAFT = ITEMS.register("high_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("high_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_SHAPESTEEL = ITEMS.register("high_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HIGH_CLASS_IRON_SPRING = ITEMS.register("high_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Super Class Iron Machine Component
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_BEARING = ITEMS.register("super_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_BOLT = ITEMS.register("super_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_CAM = ITEMS.register("super_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_CHAIN = ITEMS.register("super_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_GEAR = ITEMS.register("super_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_JOINT = ITEMS.register("super_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_KEY = ITEMS.register("super_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_NUT = ITEMS.register("super_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_PIPE = ITEMS.register("super_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_PIPEJOINT = ITEMS.register("super_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_PLATE = ITEMS.register("super_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_ROD = ITEMS.register("super_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_SHAFT = ITEMS.register("super_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("super_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_SHAPESTEEL = ITEMS.register("super_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> SUPER_CLASS_IRON_SPRING = ITEMS.register("super_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Hyper Class Iron Machine Component
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_BEARING = ITEMS.register("hyper_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_BOLT = ITEMS.register("hyper_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_CAM = ITEMS.register("hyper_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_CHAIN = ITEMS.register("hyper_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_GEAR = ITEMS.register("hyper_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_JOINT = ITEMS.register("hyper_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_KEY = ITEMS.register("hyper_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_NUT = ITEMS.register("hyper_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_PIPE = ITEMS.register("hyper_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_PIPEJOINT = ITEMS.register("hyper_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_PLATE = ITEMS.register("hyper_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_ROD = ITEMS.register("hyper_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_SHAFT = ITEMS.register("hyper_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("hyper_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_SHAPESTEEL = ITEMS.register("hyper_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> HYPER_CLASS_IRON_SPRING = ITEMS.register("hyper_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Ultra Class Iron Machine Component
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_BEARING = ITEMS.register("ultra_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_BOLT = ITEMS.register("ultra_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_CAM = ITEMS.register("ultra_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_CHAIN = ITEMS.register("ultra_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_GEAR = ITEMS.register("ultra_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_JOINT = ITEMS.register("ultra_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_KEY = ITEMS.register("ultra_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_NUT = ITEMS.register("ultra_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_PIPE = ITEMS.register("ultra_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_PIPEJOINT = ITEMS.register("ultra_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_PLATE = ITEMS.register("ultra_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_ROD = ITEMS.register("ultra_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_SHAFT = ITEMS.register("ultra_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("ultra_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_SHAPESTEEL = ITEMS.register("ultra_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ULTRA_CLASS_IRON_SPRING = ITEMS.register("ultra_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Anti Class Iron Machine Component
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_BEARING = ITEMS.register("anti_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_BOLT = ITEMS.register("anti_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_CAM = ITEMS.register("anti_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_CHAIN = ITEMS.register("anti_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_GEAR = ITEMS.register("anti_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_JOINT = ITEMS.register("anti_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_KEY = ITEMS.register("anti_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_NUT = ITEMS.register("anti_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_PIPE = ITEMS.register("anti_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_PIPEJOINT = ITEMS.register("anti_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_PLATE = ITEMS.register("anti_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_ROD = ITEMS.register("anti_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_SHAFT = ITEMS.register("anti_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("anti_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_SHAPESTEEL = ITEMS.register("anti_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> ANTI_CLASS_IRON_SPRING = ITEMS.register("anti_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Imaginary Class Iron Machine Component
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_BEARING = ITEMS.register("imaginary_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_BOLT = ITEMS.register("imaginary_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_CAM = ITEMS.register("imaginary_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_CHAIN = ITEMS.register("imaginary_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_GEAR = ITEMS.register("imaginary_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_JOINT = ITEMS.register("imaginary_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_KEY = ITEMS.register("imaginary_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_NUT = ITEMS.register("imaginary_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_PIPE = ITEMS.register("imaginary_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_PIPEJOINT = ITEMS.register("imaginary_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_PLATE = ITEMS.register("imaginary_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_ROD = ITEMS.register("imaginary_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_SHAFT = ITEMS.register("imaginary_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("imaginary_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_SHAPESTEEL = ITEMS.register("imaginary_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> IMAGINARY_CLASS_IRON_SPRING = ITEMS.register("imaginary_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//
//    //Infinity Class Iron Machine Component
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_BEARING = ITEMS.register("infinity_class_iron_bearing",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_BOLT = ITEMS.register("infinity_class_iron_bolt",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_CAM = ITEMS.register("infinity_class_iron_cam",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_CHAIN = ITEMS.register("infinity_class_iron_chain",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_GEAR = ITEMS.register("infinity_class_iron_gear",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_JOINT = ITEMS.register("infinity_class_iron_joint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_KEY = ITEMS.register("infinity_class_iron_key",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_NUT = ITEMS.register("infinity_class_iron_nut",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_PIPE = ITEMS.register("infinity_class_iron_pipe",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_PIPEJOINT = ITEMS.register("infinity_class_iron_pipejoint",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_PLATE = ITEMS.register("infinity_class_iron_plate",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_ROD = ITEMS.register("infinity_class_iron_rod",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_SHAFT = ITEMS.register("infinity_class_iron_shaft",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_SHAFTCOUPLING = ITEMS.register("infinity_class_iron_shaftcoupling",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_SHAPESTEEL = ITEMS.register("infinity_class_iron_shapesteel",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
//    public static final RegistryObject<Item> INFINITY_CLASS_IRON_SPRING = ITEMS.register("infinity_class_iron_spring",()-> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_BEARING_INSCRIBED_CIRCUIT = ITEMS.register("bearing_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_BOLT_INSCRIBED_CIRCUIT = ITEMS.register("bolt_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_CAM_INSCRIBED_CIRCUIT = ITEMS.register("cam_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_CHAIN_INSCRIBED_CIRCUIT = ITEMS.register("chain_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_GEAR_INSCRIBED_CIRCUIT = ITEMS.register("gear_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_JOINT_INSCRIBED_CIRCUIT = ITEMS.register("joint_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_KEY_INSCRIBED_CIRCUIT = ITEMS.register("key_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_NUT_INSCRIBED_CIRCUIT = ITEMS.register("nut_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_PIPE_INSCRIBED_CIRCUIT = ITEMS.register("pipe_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_PIPEJOINT_INSCRIBED_CIRCUIT = ITEMS.register("pipejoint_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_PLATE_INSCRIBED_CIRCUIT = ITEMS.register("plate_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_ROD_INSCRIBED_CIRCUIT = ITEMS.register("rod_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_SHAFT_INSCRIBED_CIRCUIT = ITEMS.register("shaft_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_SHAFTCOUPLING_INSCRIBED_CIRCUIT = ITEMS.register("shaftcoupling_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_SHAPESTEEL_INSCRIBED_CIRCUIT = ITEMS.register("shapesteel_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));
    public static final RegistryObject<Item> BASIC_PRECISION_SPRING_INSCRIBED_CIRCUIT = ITEMS.register("spring_inscribed_basic_precision_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));

    public static final RegistryObject<Item> RAW_GRAVITATION_ORE = ITEMS.register("raw_gravitation_ore", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_ELEMENT_TAB)));


    public static final RegistryObject<Item> PURIFIED_GRAPHITE_ARC_ELECTRODE = ITEMS.register("purified_graphite_arc_electrode", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB)));


    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench", () -> new WrenchItem(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER = ITEMS.register("multiblock_structure_hologram_visualizer", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_MULTIBLOCK_STRUCTURE_HOLOGRAM_VISUALIZER = ITEMS.register("basic_technology_multiblock_structure_hologram_visualizer", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_TAB)));
    public static final RegistryObject<Item> COMPRESSED_PLANKS = ITEMS.register("compressed_planks", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB)));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MATERIAL_TAB)));


    public static final RegistryObject<Item> MACHINE_HALT_DEVICE = ITEMS.register("machine_halt_device", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_TAB)));
    public static final RegistryObject<Item> SIMPLE_CONCAVE_LENS = ITEMS.register("simple_concave_lens", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> SIMPLE_CONVEX_LENS = ITEMS.register("simple_convex_lens", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));



    public static final RegistryObject<Item> SIMPLE_CHEMICAL_CONTAINER = ITEMS.register("simple_chemical_container", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));




    public static final RegistryObject<Item> BASIC_CIRCUIT = ITEMS.register("basic_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_COMBINEDSHAFT = ITEMS.register("basic_combinedshaft", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_CONDENSER = ITEMS.register("basic_condenser", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_CONDUCTOR_WIRE = ITEMS.register("basic_conductor_wire", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_CONVEYORBELT = ITEMS.register("basic_conveyorbelt", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_CYLINDER = ITEMS.register("basic_cylinder", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_DIODE = ITEMS.register("basic_diode", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_DRIVECHAIN = ITEMS.register("basic_drivechain", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_EQUIPMENT_CONTAINER = ITEMS.register("basic_equipment_container", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_INSCRIBE_NEEDLE = ITEMS.register("basic_inscribe_needle", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_INSCRIBED_CIRCUIT = ITEMS.register("basic_inscribed_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_LINKAGE = ITEMS.register("basic_linkage", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_MACHINE_SCREEN = ITEMS.register("basic_machine_screen", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_MOTOR = ITEMS.register("basic_motor", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_PROCESSING_BASE = ITEMS.register("basic_processing_base", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_PROCESSING_CIRCUIT = ITEMS.register("basic_processing_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_REDSTONE_BATTERY = ITEMS.register("basic_redstone_battery", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_REINFORCED_PLATE = ITEMS.register("basic_reinforced_plate", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_ROBOT_ARM = ITEMS.register("basic_robot_arm", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TRANSISTOR = ITEMS.register("basic_transistor", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TURBINE = ITEMS.register("basic_turbine", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));

    public static final RegistryObject<Item> BASIC_ASTRONOMY_CIRCUIT = ITEMS.register("basic_astronomy_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_BIOLOGY_CIRCUIT = ITEMS.register("basic_biology_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_CHEMISTRY_CIRCUIT = ITEMS.register("basic_chemistry_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_ENGINEERING_CIRCUIT = ITEMS.register("basic_engineering_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_FORMAL_SCIENCE_CIRCUIT = ITEMS.register("basic_formal_science_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_GEO_SCIENCE_CIRCUIT = ITEMS.register("basic_geo_science_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_HYBRID_PHYSICS_CIRCUIT = ITEMS.register("basic_hybrid_physics_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_IMITATION_MAGIC_ENGINEERING_CIRCUIT = ITEMS.register("basic_imitation_magic_engineering_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));

    public static final RegistryObject<Item> BASIC_ASTRONOMY_MEMORY_CIRCUIT = ITEMS.register("basic_astronomy_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_BIOLOGY_MEMORY_CIRCUIT = ITEMS.register("basic_biology_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_CHEMISTRY_MEMORY_CIRCUIT = ITEMS.register("basic_chemistry_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_ENGINEERING_MEMORY_CIRCUIT = ITEMS.register("basic_engineering_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_FORMAL_SCIENCE_MEMORY_CIRCUIT = ITEMS.register("basic_formal_science_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_GEO_SCIENCE_MEMORY_CIRCUIT = ITEMS.register("basic_geo_science_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_HYBRID_PHYSICS_MEMORY_CIRCUIT = ITEMS.register("basic_hybrid_physics_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_IMITATION_MAGIC_ENGINEERING_MEMORY_CIRCUIT = ITEMS.register("basic_imitation_magic_engineering_memory_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));

    public static final RegistryObject<Item> BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_CIRCUIT = ITEMS.register("basic_performance_astronomical_telescope_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));

    public static final RegistryObject<Item> BASIC_PERFORMANCE_ELECTROLYSER_CIRCUIT = ITEMS.register("basic_performance_electrolyser_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));


    public static final RegistryObject<Item> BASIC_POWER_STEAM_GENERATOR_CIRCUIT = ITEMS.register("basic_power_steam_generator_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_CIRCUIT = ITEMS.register("basic_technology_machine_manufacturer_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_CIRCUIT = ITEMS.register("basic_technology_universal_assembler_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_CIRCUIT = ITEMS.register("basic_technology_circuit_builder_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_CIRCUIT = ITEMS.register("basic_technology_machine_element_processor_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_CIRCUIT = ITEMS.register("basic_technology_machine_part_processor_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_CIRCUIT = ITEMS.register("basic_technology_multiblock_equipment_fabricator_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));









    public static final RegistryObject<Item> BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_CIRCUIT = ITEMS.register("basic_performance_machine_data_installer_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_CIRCUIT = ITEMS.register("basic_performance_designated_data_injector_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));







    public static final RegistryObject<Item> BASIC_PERFORMANCE_ROCK_CRASHER_CIRCUIT = ITEMS.register("basic_performance_rock_crasher_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));


    public static final RegistryObject<Item> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_CIRCUIT = ITEMS.register("basic_performance_electric_arc_furnace_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> BASIC_PERFORMANCE_FORMING_MACHINE_CIRCUIT = ITEMS.register("basic_performance_forming_machine_circuit", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));



    public static final RegistryObject<Item> DESIGNATED_DATA_CHIP_MOON = ITEMS.register("designated_data_chip_moon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));

//    public static final RegistryObject<Item> BASIC_ASTRONOMY_DATA_STORAGE = ITEMS.register("astronomy_data_storage", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));
    public static final RegistryObject<Item> STAR_DATA_STORAGE_MOON = ITEMS.register("star_data_storage_moon", () -> new Item(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_MACHINE_PART_TAB)));


    public static final RegistryObject<Item> CAMMDA_TIER1 = ITEMS.register("cammda_tier1", () -> new CAMMDA_Tier1(DCTier.CAMMDA_TIER1, 0, 0, new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GUN_ITEM = ITEMS.register("gun_item", () -> new GunItem(new Item.Properties().tab(DCCreativeTab.DEGENERACYCRAFT_TAB).stacksTo(1)));

    public DCItems(String label) {
        super(label);
    }

    public DCItems(int pId, String pLangId) {
        super(pId, pLangId);
    }


//    private static  <T extends Item> RegistryObject<Item> registerIronMachineComponentItem (String name, CreativeModeTab tab){
//        return DCItems.ITEMS.register(name, ()-> new Item(new Item.Properties().tab(tab)) {
//            @Override
//            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
//                if (Screen.hasShiftDown()) {
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.phase0").withStyle(ChatFormatting.WHITE));
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_name").withStyle(ChatFormatting.WHITE));
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_number").withStyle(ChatFormatting.GOLD));
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_weight").withStyle(ChatFormatting.LIGHT_PURPLE));
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_melting").withStyle(ChatFormatting.BLUE));
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_boiling").withStyle(ChatFormatting.RED));
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.iron_formula").withStyle(ChatFormatting.AQUA));
//                }else{
//                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
//                }
//            }
//        });
//    }

    private static <T extends Item> RegistryObject<Item> registerChemicalSubstanceItem(String name, CreativeModeTab tab, String chemicalSubstanceName, String phase) {
        return DCItems.ITEMS.register(name, () -> new Item(new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + chemicalSubstanceName + ".formula").withStyle(ChatFormatting.AQUA));
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }

    private static <T extends Item> RegistryObject<Item> registerAtomicItem(String name, CreativeModeTab tab, String atomicName, String phase) {
        return DCItems.ITEMS.register(name, () -> new Item(new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".name").withStyle(ChatFormatting.WHITE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".number").withStyle(ChatFormatting.GOLD));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".weight").withStyle(ChatFormatting.LIGHT_PURPLE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".melting").withStyle(ChatFormatting.BLUE));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".boiling").withStyle(ChatFormatting.RED));
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + atomicName + ".formula").withStyle(ChatFormatting.AQUA));
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }

    private static <T extends Item> RegistryObject<Item> registerCircuitItem(String name, CreativeModeTab tab, String chemicalSubstanceName, String phase) {
        return DCItems.ITEMS.register(name, () -> new Item(new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                if (Screen.hasShiftDown()) {
                    switch (phase) {
                        case "initial" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.WHITE));
                        case "basic" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.RED));
                        case "low" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GOLD));
                        case "medium" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.YELLOW));
                        case "high" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.GREEN));
                        case "super" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GREEN));
                        case "over" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.AQUA));
                        case "ultra" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.BLUE));
                        case "anti" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_BLUE));
                        case "imaginary" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.LIGHT_PURPLE));
                        case "infinity" ->
                                pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.ipp." + phase).withStyle(ChatFormatting.DARK_GRAY));
                        default -> throw new IllegalStateException("Unexpected value: " + phase);
                    }
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft." + chemicalSubstanceName + ".formula").withStyle(ChatFormatting.AQUA));
                } else {
                    pTooltip.add(new TranslatableComponent("tooltip.degeneracycraft.tooltipitem").withStyle(ChatFormatting.YELLOW));
                }
            }
        });
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    @Override
    public ItemStack makeIcon() {
        return null;
    }
}
