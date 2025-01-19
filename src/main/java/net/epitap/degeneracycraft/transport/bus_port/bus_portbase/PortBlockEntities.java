package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;

public class PortBlockEntities {
//    public static BlockEntityType<BasicPowerSteamGeneratorBusBlockEntity> BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY;
//    public static BlockEntityType<BasicPowerSteamGeneratorPortBlockEntity> BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY;

    //    public static BlockEntityType<TestBlockEntity> TEST_BLOCK_ENTITY;
    public static void registerBlockEntities(RegistryEvent.Register<BlockEntityType<?>> register) {

//        BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY = BlockEntityType.Builder.of(BasicPowerSteamGeneratorBusBlockEntity::new, PortBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK).build(null);
//        BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_power_steam_generator_bus"));
//        register.getRegistry().register(BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY);
//
//        BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY = BlockEntityType.Builder.of(BasicPowerSteamGeneratorPortBlockEntity::new, PortBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK).build(null);
//        BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_power_steam_generator_port_block_entity"));
//        register.getRegistry().register(BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY);

//        TEST_BLOCK_ENTITY = BlockEntityType.Builder.of(TestBlockEntity::new, PortBlocks.TEST_BLOCK).build(null);
//        TEST_BLOCK_ENTITY.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "test_pipe"));
//        register.getRegistry().register(TEST_BLOCK_ENTITY);
    }

    @OnlyIn(Dist.CLIENT)
    public static void clientSetup() {
//        BlockEntityRenderers.register(BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_ENTITY, BasicPowerSteamGeneratorBusRenderer::new);
//        BlockEntityRenderers.register(BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_ENTITY, BasicPowerSteamGeneratorPortRenderer::new);

//        BlockEntityRenderers.register(TEST_BLOCK_ENTITY, TestRenderer::new);
    }
}
