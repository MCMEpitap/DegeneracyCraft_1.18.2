package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.entity.machine.PulverizerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_machine_element_processor.BasicMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_composite_structure_type_thermal_generator.BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.energystorage.basic_strength_multiblock_energy_storage.BasicStrengthMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.materialstorage.basic_strength_multiblock_material_storage.BasicStrengthMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_machine_element_processor.BasicMachineElementProcessorPortBlockEntity;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_composite_structure_type_thermal_generator.bus.BasicPowerCompositeStructureTypeThermalGeneratorBusBlockEntity;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_power_composite_structure_type_thermal_generator.port.BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusBlockEntity;
import net.epitap.degeneracycraft.transport.port_bus.basic.basic_technology_machine_manufacturer.port.BasicTechnologyMachineManufacturerPortBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Degeneracycraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<PulverizerBlockEntity>> PULVERIZER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("pulverizer_block_entity", () ->
                    BlockEntityType.Builder.of(PulverizerBlockEntity::new, DCBlocks.PULVERIZER_BLOCK.get()).build(null));


//    public static final RegistryObject<BlockEntityType<UniversalAssemblerPhase2BlockEntity>> UNIVERSAL_ASSEMBLER_PHASE2_BLOCK_ENTITY =
//            BLOCK_ENTITIES.register("universal_assembler_phase2_block_entity",()->
//                    BlockEntityType.Builder.of(UniversalAssemblerPhase2BlockEntity::new, DCBlocks.UNIVERSAL_ASSEMBLER_PHASE2_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<RedstonePoweredMachineElementManufactureMachineBlockEntity>> REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("redstone_powered_machine_element_manufacture_machine_block_entity", () ->
                    BlockEntityType.Builder.of(RedstonePoweredMachineElementManufactureMachineBlockEntity::new, DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<RedstonePoweredMachinePartManufactureMachineBlockEntity>> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("redstone_powered_machine_part_manufacture_machine_block_entity", () ->
                    BlockEntityType.Builder.of(RedstonePoweredMachinePartManufactureMachineBlockEntity::new, DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthMultiblockMaterialStorageBlockEntity>> BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_multiblock_material_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthMultiblockMaterialStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicStrengthMultiblockEnergyStorageBlockEntity>> BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_strength_multiblock_energy_storage_block_entity", () ->
                    BlockEntityType.Builder.of(BasicStrengthMultiblockEnergyStorageBlockEntity::new, DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicMachineElementProcessorBlockEntity>> BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_machine_element_processor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicMachineElementProcessorBlockEntity::new, DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicPhaseBoltManufactureMachineBlockEntity>> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_phase_bolt_manufacture_machine_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPhaseBoltManufactureMachineBlockEntity::new, DCBlocks.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_power_composite_structure_type_thermal_generator_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPowerCompositeStructureTypeThermalGeneratorBlockEntity::new, DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_power_composite_structure_type_thermal_generator_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPowerCompositeStructureTypeThermalGeneratorPortBlockEntity::new, DCBlocks.BASIC_POWER_THERMAL_GENERATOR_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicPowerCompositeStructureTypeThermalGeneratorBusBlockEntity>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_power_composite_structure_type_thermal_generator_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPowerCompositeStructureTypeThermalGeneratorBusBlockEntity::new, DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineManufacturerPortBlockEntity>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_manufacturer_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineManufacturerPortBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineManufacturerBusBlockEntity>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_manufacturer_bus_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineManufacturerBusBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicMachineElementProcessorPortBlockEntity>> BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_machine_element_processor_port_block_entity", () ->
                    BlockEntityType.Builder.of(BasicMachineElementProcessorPortBlockEntity::new, DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<BasicTechnologyUniversalAssemblerBlockEntity>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_universal_assembler_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyUniversalAssemblerBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicTechnologyMachineManufacturerBlockEntity>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("basic_technology_machine_manufacturer_block_entity", () ->
                    BlockEntityType.Builder.of(BasicTechnologyMachineManufacturerBlockEntity::new, DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get()).build(null));


    public static final RegistryObject<BlockEntityType<InfinityPoweredAllInOneCompressorMachineBlockEntity>> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("infinity_powered_all_in_one_compressor_machine_block_entity", () ->
                    BlockEntityType.Builder.of(InfinityPoweredAllInOneCompressorMachineBlockEntity::new, DCBlocks.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK.get()).build(null));


//    public static final RegistryObject<BlockEntityType<TestBlockEntity>> TEST_BLOCK_ENTITY =
//            BLOCK_ENTITIES.register("test_block_entity",()->
//                    BlockEntityType.Builder.of(TestBlockEntity::new, DCBlocks.TEST.get()).build(null));

//    public static RegistryObject<BlockEntityType<TestBlockEntity> > COMPACT_CHEST_ENTITY_TYPE =
//            TestBlockEntity.register("compact_chest", () -> BlockEntityType.Builder.of(TestBlockEntity::new, mapRegistryObjectToBlocks(COMPACT_CHEST_BLOCKS)).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
