package net.epitap.degeneracycraft.item;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCAdvancementIcon extends CreativeModeTab {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Degeneracycraft.MOD_ID);

    public static final RegistryObject<Item> ASTRONOMY_ICON = ITEMS.register("astronomy_icon",()-> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> BIOLOGY_ICON = ITEMS.register("biology_icon",()-> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> CHEMISTRY_ICON = ITEMS.register("chemistry_icon",()-> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> DEGENERACYCRAFT_ICON = ITEMS.register("degeneracycraft_icon",()-> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> ENGINEERING_ICON = ITEMS.register("engineering_icon",()-> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> FAUX_MAGIC_ENGINEERING_ICON = ITEMS.register("faux_magic_engineering_icon",()-> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> GEO_SCIENCE_ICON = ITEMS.register("geo_science_icon", () -> new Item(new Item.Properties().stacksTo(0)));
    public static final RegistryObject<Item> HYBRID_PHYSICS_ICON = ITEMS.register("hybrid_physics_icon", () -> new Item(new Item.Properties().stacksTo(0)));

    public DCAdvancementIcon(String label) {
        super(label);
    }

    public DCAdvancementIcon(int pId, String pLangId) {
        super(pId, pLangId);
    }


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    @Override
    public ItemStack makeIcon() {
        return null;
    }

}
