package net.epitap.degeneracycraft.transport.pipe.blocks;


import net.epitap.degeneracycraft.transport.pipe.basic.BasicItemPipeBlock;
import net.epitap.degeneracycraft.transport.pipe.energy.BasicEnergyPipeBlock;
import net.epitap.degeneracycraft.transport.pipe.energy.floa.FloatEnergyPipeBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class PipeBlocks {
    public static final BasicItemPipeBlock BASIC_ITEM_PIPE_BLOCK = new BasicItemPipeBlock() {
    };
    public static final BasicEnergyPipeBlock BASIC_ENERGY_PIPE_BLOCK = new BasicEnergyPipeBlock(){
    };
    public static final FloatEnergyPipeBlock FLOAT_ENERGY_PIPE_BLOCK = new FloatEnergyPipeBlock(){
    };

    public PipeBlocks() {
    }
    public static void registerBlocks(RegistryEvent.Register<Block> register) {
        register.getRegistry().registerAll(
                BASIC_ITEM_PIPE_BLOCK,
                BASIC_ENERGY_PIPE_BLOCK,
                FLOAT_ENERGY_PIPE_BLOCK
        );
    }
    public static void registerItems(RegistryEvent.Register<Item> register) {
        register.getRegistry().registerAll(
                BASIC_ITEM_PIPE_BLOCK.toItem(),
                BASIC_ENERGY_PIPE_BLOCK.toItem(),
                FLOAT_ENERGY_PIPE_BLOCK.toItem()
        );
    }
}

