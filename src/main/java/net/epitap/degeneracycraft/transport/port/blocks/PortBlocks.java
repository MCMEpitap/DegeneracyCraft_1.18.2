//package net.epitap.degeneracycraft.transport.port.blocks;
//
//import net.epitap.degeneracycraft.Degeneracycraft;
//import net.epitap.degeneracycraft.item.DCItems;
//import net.minecraft.world.item.BlockItem;
//import net.minecraft.world.item.CreativeModeTab;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.level.block.Block;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//import java.util.function.Supplier;
//
//public class PortBlocks {
//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);
//
////    public static final BasicPowerCompositeStructureTypeThermalGeneratorPortBlock BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK = new BasicPowerCompositeStructureTypeThermalGeneratorPortBlock() {
////    };
//
//
////    public static final RegistryObject<Block> BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK = registerBlock("basic_machine_element_processor_port_block", () ->
////            new BasicPowerCompositeStructureTypeThermalGeneratorPortBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//
//
//    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
//        RegistryObject<T> toReturn = BLOCKS.register(name, block);
//        registerBlockItem(name, toReturn, tab);
//        return toReturn;
//    }
//
//    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
//        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
//    }
//
//    //    public static void registerBlocks(RegistryEvent.Register<Block> register) {
////        register.getRegistry().registerAll(
////                BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK
////        );
////    }
////
////    public static void registerItems(RegistryEvent.Register<Item> register) {
////        register.getRegistry().registerAll(
////                BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.toItem()
////        );
////    }
//    public static void register(IEventBus eventBus) {
//        BLOCKS.register(eventBus);
//    }
//}
//
