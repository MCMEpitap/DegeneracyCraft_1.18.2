package net.epitap.degeneracycraft.blocks.base;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DCHoloBlocks {
    public static final DeferredRegister<Block> HOLOBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);


//    public static final RegistryObject<Block> LOW_STERNGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("low_strength_multiblock_structure_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> LOW_STERNGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("low_strength_multiblock_structure_glass_block",()->  new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

//
//    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab, String tooltip){
//        RegistryObject<T> toReturn = HOLOBLOCKS.register(name,block);
//        registerBlockItem(name,toReturn);
//        return toReturn;
//
//    }
//    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block, CreativeModeTab tab, String tooltip){
//        return DCItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties().tab(tab)){
//            @Override
//            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
//                pTooltip.add(new TranslatableComponent(tooltip));
//            }
//        });
//    }


}
