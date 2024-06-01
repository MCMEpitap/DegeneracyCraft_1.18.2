package net.epitap.degeneracycraft;

import com.electronwill.nightconfig.core.Config;
import com.mojang.logging.LogUtils;
import net.epitap.degeneracycraft.blocks.base.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.epitap.degeneracycraft.blocks.base.DCMenuTypes;
import net.epitap.degeneracycraft.blocks.base.DCUniqueBlocks;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_machine_element_processor.BasicMachineElementProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.basic_power_composite_structure_type_thermal_generator.BasicPowerCompositeStructureTypeThermalGeneratorScreen;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_component_manufacture_machine.RedstonePoweredMachineComponentManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.screen.PulverizerScreen;
import net.epitap.degeneracycraft.blocks.screen.UniversalAssemblerPhase1Screen;
import net.epitap.degeneracycraft.blocks.storage.basic.energystorage.basic_strength_multiblock_energy_storage.BasicStrengthMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.materialstorage.basic_strength_multiblock_material_storage.BasicStrengthMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.integration.jei.DCRecipeTypes;
import net.epitap.degeneracycraft.item.DCAdvancementIcon;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlockClickEvent;
import net.epitap.degeneracycraft.transport.pipe.blocks.PipeBlocks;
import net.epitap.degeneracycraft.transport.pipe.entities.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.render.PipeModelRegistry;
import net.epitap.degeneracycraft.transport.port.blocks.PortBlockClickEvent;
import net.epitap.degeneracycraft.transport.port.blocks.PortBlocks;
import net.epitap.degeneracycraft.transport.port.entities.PortBlockEntities;
import net.epitap.degeneracycraft.transport.port.render.PortModelRegistry;
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
        DCAdvancementIcon.register(eventBus);
        DCBlocks.register(eventBus);
        DCUniqueBlocks.register(eventBus);
        DCBlockEntities.register(eventBus);
        DCMenuTypes.register(eventBus);
        DCRecipeTypes.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, PipeBlocks::registerItems);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, PipeBlocks::registerBlocks);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(BlockEntityType.class, PipeBlockEntities::registerBlockEntities);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(PipeModelRegistry::onModelRegister);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(PipeModelRegistry::onModelBake);

        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, PortBlocks::registerItems);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, PortBlocks::registerBlocks);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(BlockEntityType.class, PortBlockEntities::registerBlockEntities);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(PortModelRegistry::onModelRegister);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(PortModelRegistry::onModelBake);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(DCMessages::register);
        MinecraftForge.EVENT_BUS.register(new PipeBlockClickEvent());
        MinecraftForge.EVENT_BUS.register(new PortBlockClickEvent());
    }


    private void setup(final FMLCommonSetupEvent event) {}

    private void clientSetup(final FMLClientSetupEvent event){

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.PULVERIZER_MENU.get(), PulverizerScreen::new);
        MenuScreens.register(DCMenuTypes.UNIVERSAL_ASSEMBLER_Phase1_MENU.get(), UniversalAssemblerPhase1Screen::new);


        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachineComponentManufactureMachineScreen::new);
        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachinePartManufactureMachineScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK_MENU.get(), BasicStrengthMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_MENU.get(), BasicStrengthMultiblockMaterialStorageScreen::new);


        MenuScreens.register(DCMenuTypes.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_MENU.get(), BasicPowerCompositeStructureTypeThermalGeneratorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_MACHINE_ELEMENT_PROCESSOR_MACHINE_MENU.get(), BasicMachineElementProcessorScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU.get(), BasicPhaseBoltManufactureMachineScreen::new);
//
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU.get(), InfinityPoweredAllInOneCompressorMachineScreen::new);

        PipeBlockEntities.clientSetup();
        PortBlockEntities.clientSetup();

    }

}
