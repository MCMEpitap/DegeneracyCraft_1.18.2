package net.epitap.degeneracycraft;

import com.electronwill.nightconfig.core.Config;
import com.mojang.logging.LogUtils;
import net.epitap.degeneracycraft.blocks.base.*;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope.BasicPrecisionTelescopeScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_thermal_generator.BasicPowerThermalGeneratorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerScreen;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.screen.PulverizerScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_physics.energystorage.basic_strength_dynamic_physics_multiblock_energy_storage.BasicStrengthDynamicPhysicsMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_physics.materialstorage.basic_strength_dynamic_physics_multiblock_material_storage.BasicStrengthDynamicPhysicsMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energystorage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.materialstorage.basic_strength_engineering_multiblock_material_storage.BasicStrengthEngineeringMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.simple_telescope_core.SimpleTelescopeCoreScreen;
import net.epitap.degeneracycraft.integration.jei.DCRecipeTypes;
import net.epitap.degeneracycraft.item.DCAdvancementIcon;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.item.DCTextItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlockClickEvent;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlocks;
import net.epitap.degeneracycraft.transport.pipe.entities.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.render.PipeModelRegistry;
import net.epitap.degeneracycraft.transport.port_bus.port_busbase.PortBlockClickEvent;
import net.epitap.degeneracycraft.transport.port_bus.render.PortModelRegistry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;

@Mod(Degeneracycraft.MOD_ID)
public class Degeneracycraft {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "degeneracycraft";
    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MOD_ID);
    public static Config config;

    public Degeneracycraft() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DCItems.register(eventBus);
        DCTextItems.register(eventBus);
        DCAdvancementIcon.register(eventBus);
        DCBlocks.register(eventBus);
        DCUniqueBlocks.register(eventBus);
        DCBlockEntities.register(eventBus);
        DCUniqueBlockEntities.register(eventBus);
        DCMenuTypes.register(eventBus);
        DCUniqueMenuTypes.register(eventBus);
        DCRecipeTypes.register(eventBus);

        eventBus.addGenericListener(Item.class, PipeBlocks::registerItems);
        eventBus.addGenericListener(Block.class, PipeBlocks::registerBlocks);
        eventBus.addGenericListener(BlockEntityType.class, PipeBlockEntities::registerBlockEntities);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(PipeModelRegistry::onModelRegister);
        eventBus.addListener(PipeModelRegistry::onModelBake);
        eventBus.addListener(PortModelRegistry::onModelRegister);
        eventBus.addListener(PortModelRegistry::onModelBake);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(DCMessages::register);
        MinecraftForge.EVENT_BUS.register(new PipeBlockClickEvent());
        MinecraftForge.EVENT_BUS.register(new PortBlockClickEvent());
    }


    private void setup(final FMLCommonSetupEvent event) {}

    private void clientSetup(final FMLClientSetupEvent event) {


        ItemBlockRenderTypes.setRenderLayer(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.PULVERIZER_MENU.get(), PulverizerScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthDynamicPhysicsMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthDynamicPhysicsMultiblockMaterialStorageScreen::new);


        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachineElementManufactureMachineScreen::new);
        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachinePartManufactureMachineScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthEngineeringMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthEngineeringMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_PRECISION_TELESCOPE_MENU.get(), BasicPrecisionTelescopeScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_ELECTROLYSER_MENU.get(), BasicPerformanceElectrolyserScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_ARC_ELECTRIC_FURNACE_MENU.get(), BasicPerformanceElectricArcFurnaceScreen::new);


        MenuScreens.register(DCMenuTypes.BASIC_POWER_THERMAL_GENERATOR_MENU.get(), BasicPowerThermalGeneratorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_MENU.get(), BasicTechnologyMachineManufacturerScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_MENU.get(), BasicTechnologyUniversalAssemblerScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_MENU.get(), BasicTechnologyCircuitBuilderScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_MACHINE_MENU.get(), BasicTechnologyMachineElementProcessorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_MACHINE_MENU.get(), BasicTechnologyMachinePartProcessorScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU.get(), BasicPhaseBoltManufactureMachineScreen::new);
//
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU.get(), InfinityPoweredAllInOneCompressorMachineScreen::new);


        MenuScreens.register(DCUniqueMenuTypes.SIMPLE_TELESCOPE_CORE_MENU.get(), SimpleTelescopeCoreScreen::new);


        PipeBlockEntities.clientSetup();
//        PortBlockEntities.clientSetup();


    }

}
