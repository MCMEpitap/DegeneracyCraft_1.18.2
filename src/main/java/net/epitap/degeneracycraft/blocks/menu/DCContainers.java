//package net.epitap.degeneracycraft.block.menu;
//
//import net.epitap.degeneracycraft.Degeneracycraft;
//import net.epitap.degeneracycraft.PipePara.DCExtractContainer;
//import net.epitap.degeneracycraft.PipePara.DCFilterContainer;
//import net.epitap.degeneracycraft.PipePara.DCPipeContainerFactory;
//import net.epitap.degeneracycraft.PipePara.DCFilterContainerFactory;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.inventory.MenuType;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraftforge.event.RegistryEvent;
//public class DCContainers {
//    public static MenuType<DCExtractContainer> EXTRACT;
//    public static MenuType<DCFilterContainer> FILTER;
//
//    @OnlyIn(Dist.CLIENT)
//    public static void clientSetup() {
//    }
//
//    public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
//
//        EXTRACT = new MenuType<>(new DCPipeContainerFactory<>(DCExtractContainer::new));
//        EXTRACT.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "extract"));
//        event.getRegistry().register(EXTRACT);
//
//        FILTER = new MenuType<>(new DCFilterContainerFactory<>(DCFilterContainer::new));
//        FILTER.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "filter"));
//        event.getRegistry().register(FILTER);
//    }
//
//}
