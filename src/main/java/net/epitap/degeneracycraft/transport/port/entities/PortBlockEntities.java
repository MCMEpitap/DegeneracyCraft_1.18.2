//package net.epitap.degeneracycraft.transport.port.entities;
//
//import net.epitap.degeneracycraft.Degeneracycraft;
//import net.epitap.degeneracycraft.blocks.base.DCBlocks;
//import net.epitap.degeneracycraft.transport.port.basic.basic_machine_element_processor.BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//public class PortBlockEntities {
//
//    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
//            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Degeneracycraft.MOD_ID);
//
//
//    public static final RegistryObject<BlockEntityType<BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity>> BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY =
//            BLOCK_ENTITIES.register("basic_machine_element_processor_port_block_entity", () ->
//                    BlockEntityType.Builder.of(BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity::new, DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get()).build(null));
////    public static BlockEntityType<BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity> BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK;
////
////    public static void registerBlockEntities(RegistryEvent.Register<BlockEntityType<?>> register) {
////
////        BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK = BlockEntityType.Builder.of(BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity::new, PortBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK).build(null);
////        BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.setRegistryName(new ResourceLocation(Degeneracycraft.MOD_ID, "basic_machine_element_processor_port_block_entity"));
////        register.getRegistry().register(BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK);
////
////    }
////
////    @OnlyIn(Dist.CLIENT)
////    public static void clientSetup() {
////        BlockEntityRenderers.register(BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK, BasicMachineElementProcessorPortRenderer::new);
////    }
//
//    public static void register(IEventBus eventBus) {
//        BLOCK_ENTITIES.register(eventBus);
//    }
//}
