package net.epitap.degeneracycraft;

import com.electronwill.nightconfig.core.Config;
import com.mojang.logging.LogUtils;
import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.epitap.degeneracycraft.blocks.block.DCHoloBlocks;
import net.epitap.degeneracycraft.blocks.entity.DCBlockEntities;
import net.epitap.degeneracycraft.blocks.menu.DCMenuTypes;
import net.epitap.degeneracycraft.blocks.screen.BoltManufactureMachineScreen.BasicPhaseBoltManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.screen.PulverizerScreen;
import net.epitap.degeneracycraft.blocks.screen.UniversalAssemblerPhase1Screen;
import net.epitap.degeneracycraft.blocks.screen.basic.BasicPowerCompositeStructureTypeThermalGeneratorScreen;
import net.epitap.degeneracycraft.blocks.screen.infinity.InfinityPoweredAllInOneCompressorMachineScreen;
import net.epitap.degeneracycraft.blocks.screen.initial.RedstonePoweredMachineComponentManufactureMachineScreen;
import net.epitap.degeneracycraft.integration.jei.DCRecipeTypes;
import net.epitap.degeneracycraft.item.DCAdvancementIcon;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.pipe.block.PipeBlocks;
import net.epitap.degeneracycraft.pipe.entity.PipeBlockClickEvent;
import net.epitap.degeneracycraft.pipe.entity.PipeBlockEntities;
import net.epitap.degeneracycraft.pipe.render.PipeModelRegistry;
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
        DCHoloBlocks.register(eventBus);
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
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(DCMessages::register);
        MinecraftForge.EVENT_BUS.register(new PipeBlockClickEvent());
    }


    private void setup(final FMLCommonSetupEvent event) {}

    private void clientSetup(final FMLClientSetupEvent event){

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.PULVERIZER_MENU.get(), PulverizerScreen::new);
        MenuScreens.register(DCMenuTypes.UNIVERSAL_ASSEMBLER_Phase1_MENU.get(), UniversalAssemblerPhase1Screen::new);


        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachineComponentManufactureMachineScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_MENU.get(), BasicPowerCompositeStructureTypeThermalGeneratorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU.get(), BasicPhaseBoltManufactureMachineScreen::new);

        ItemBlockRenderTypes.setRenderLayer(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU.get(), InfinityPoweredAllInOneCompressorMachineScreen::new);
        PipeBlockEntities.clientSetup();
    }

}
