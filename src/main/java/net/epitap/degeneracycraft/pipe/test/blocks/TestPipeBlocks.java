package net.epitap.degeneracycraft.pipe.test.blocks;


import net.epitap.degeneracycraft.pipe.test.basic.TestBasicItemPipeBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class TestPipeBlocks {
    public static final TestBasicItemPipeBlock TEST_BASIC_ITEM_PIPE_BLOCK = new TestBasicItemPipeBlock() {
    };

    public TestPipeBlocks() {
    }

    public static void registerBlocks(RegistryEvent.Register<Block> register) {
        register.getRegistry().registerAll(
                TEST_BASIC_ITEM_PIPE_BLOCK
        );
    }

    public static void registerItems(RegistryEvent.Register<Item> register) {
        register.getRegistry().registerAll(
                TEST_BASIC_ITEM_PIPE_BLOCK.toItem()
        );
    }
}

