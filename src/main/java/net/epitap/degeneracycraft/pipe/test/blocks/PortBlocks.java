package net.epitap.degeneracycraft.pipe.test.blocks;

import net.epitap.degeneracycraft.pipe.test.basic.basic_machine_element_processor.BasicMachineElementProcessorPortBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class PortBlocks {
    public static final BasicMachineElementProcessorPortBlock BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK = new BasicMachineElementProcessorPortBlock() {
    };

    public PortBlocks() {
    }

    public static void registerBlocks(RegistryEvent.Register<Block> register) {
        register.getRegistry().registerAll(
                BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK
        );
    }

    public static void registerItems(RegistryEvent.Register<Item> register) {
        register.getRegistry().registerAll(
                BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.toItem()
        );
    }
}

