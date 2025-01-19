package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;


import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PortBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);

//    public static final BasicPowerSteamGeneratorBusBlock BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK = new BasicPowerSteamGeneratorBusBlock() {
//    };
//    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK = registerHoloBlock("basic_power_steam_generator_bus_holo_block", () ->
//            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

//    public static final BasicPowerSteamGeneratorPortBlock BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK = new BasicPowerSteamGeneratorPortBlock() {
//    };
//    public static final RegistryObject<Block> BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK = registerHoloBlock("basic_power_steam_generator_port_holo_block", () ->
//            new DCHoloBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).destroyTime(0.0F).strength(0.0F)));

    //        public static final TestBlock TEST_BLOCK = new TestBlock() {
//    };
    public PortBlocks() {
    }

    public static void registerBlocks(RegistryEvent.Register<Block> register) {
        register.getRegistry().registerAll(
//                BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK,
//                BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK,
//                TEST_BLOCK
        );
    }

    public static void registerItems(RegistryEvent.Register<Item> register) {
        register.getRegistry().registerAll(
//                BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.toItem(),
//                BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.toItem(),
//                TEST_BLOCK.toItem()
        );
    }

}

