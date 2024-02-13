package net.epitap.degeneracycraft.blocks.block;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.holoblock.DCHoloBlock;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class DCHoloBlocks {
    public static final DeferredRegister<Block> HOLOBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);



    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_base_frame_holo_block",()->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_machine_frame_holo_block",()->
        new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_structure_frame_holo_block",()->
        new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    public static final RegistryObject<Block> BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK = registerHoloBlock("basic_strength_multiblock_structure_glass_holo_block",()->
            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

//    public static final RegistryObject<Block> LOW_STERNGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("low_strength_multiblock_structure_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> LOW_STERNGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("low_strength_multiblock_structure_glass_block",()->  new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab, String tooltip){
        RegistryObject<T> toReturn = HOLOBLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;

    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block, CreativeModeTab tab, String tooltip){
        return DCItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltip));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerHoloBlock (String name, Supplier<T> block){
        RegistryObject<T> toReturn = HOLOBLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block){
        return DCItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties().stacksTo(0)));
    }

    public static void register(IEventBus eventBus){
        HOLOBLOCKS.register(eventBus);
    }
}
