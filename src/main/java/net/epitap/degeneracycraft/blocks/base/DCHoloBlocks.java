package net.epitap.degeneracycraft.blocks.base;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DCHoloBlocks {
    public static final DeferredRegister<Block> HOLOBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);


//    public static final RegistryObject<Block> LOW_STERNGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK = registerBlock("low_strength_multiblock_structure_frame_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
//    public static final RegistryObject<Block> LOW_STERNGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK = registerBlock("low_strength_multiblock_structure_glass_block",()->  new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);




    public static void register(IEventBus eventBus) {
        HOLOBLOCKS.register(eventBus);
    }

}
