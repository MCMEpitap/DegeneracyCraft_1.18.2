package net.epitap.degeneracycraft;

import com.electronwill.nightconfig.core.Config;
import net.epitap.degeneracycraft.blocks.base.*;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope.BasicPerformanceAstronomicalTelescopeScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceScreen;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineScreen;
import net.epitap.degeneracycraft.blocks.screen.PulverizerScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.energy_storage.basic_strength_astronomy_multiblock_energy_storage.BasicStrengthAstronomyMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.material_storage.basic_strength_astronomy_multiblock_material_storage.BasicStrengthAstronomyMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.energy_storage.basic_strength_biology_multiblock_energy_storage.BasicStrengthBiologyMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.material_storage.basic_strength_biology_multiblock_material_storage.BasicStrengthBiologyMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.energy_storage.basic_strength_chemistry_multiblock_energy_storage.BasicStrengthChemistryMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.material_storage.basic_strength_chemistry_multiblock_material_storage.BasicStrengthChemistryMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energy_storage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.material_storage.basic_strength_engineering_multiblock_material_storage.BasicStrengthEngineeringMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.energy_storage.basic_strength_formal_science_multiblock_energy_storage.BasicStrengthFormalScienceMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.material_storage.basic_strength_formal_science_multiblock_material_storage.BasicStrengthFormalScienceMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.energy_storage.basic_strength_geo_science_multiblock_energy_storage.BasicStrengthGeoScienceMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.material_storage.basic_strength_geo_science_multiblock_material_storage.BasicStrengthGeoScienceMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.energy_storage.basic_strength_hybrid_physics_multiblock_energy_storage.BasicStrengthHybridPhysicsMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.material_storage.basic_strength_hybrid_physics_multiblock_material_storage.BasicStrengthHybridPhysicsMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.energy_storage.basic_strength_imitation_magic_engineering_multiblock_energy_storage.BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageScreen;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.material_storage.basic_strength_imitation_magic_engineering_multiblock_material_storage.BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageScreen;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.simple_telescope_core.SimpleTelescopeCoreScreen;
import net.epitap.degeneracycraft.integration.jei.DCRecipeTypes;
import net.epitap.degeneracycraft.item.DCAdvancementIcon;
import net.epitap.degeneracycraft.item.DCItems;
import net.epitap.degeneracycraft.item.DCTextItems;
import net.epitap.degeneracycraft.networking.DCMessages;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortBlockClickEvent;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortBlockEntities;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortBlocks;
import net.epitap.degeneracycraft.transport.bus_port.bus_portbase.PortModelRegistry;
import net.epitap.degeneracycraft.transport.pipe.parametor.PipeModelRegistry;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlockClickEvent;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlockEntities;
import net.epitap.degeneracycraft.transport.pipe.pipebase.PipeBlocks;
import net.epitap.degeneracycraft.world.dimention.DCDimentions;
import net.epitap.degeneracycraft.world.feature.ore.WorldGenVeinDataLoader;
import net.epitap.degeneracycraft.world.feature.ore.main.DCOresAPI;
import net.epitap.degeneracycraft.world.feature.ore.main.DCOresClient;
import net.epitap.degeneracycraft.world.feature.ore.main.DCOresFeatures;
import net.epitap.degeneracycraft.world.feature.ore.check.*;
import net.epitap.degeneracycraft.world.feature.ore.network.ClientProxy;
import net.epitap.degeneracycraft.world.feature.ore.network.CommonConfig;
import net.epitap.degeneracycraft.world.feature.ore.network.CommonProxy;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;


@Mod(Degeneracycraft.MOD_ID)
public class Degeneracycraft {
    public static final Logger LOGGER = LogManager.getLogger();
    public static CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    public static final String MOD_ID = "degeneracycraft";
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
//        DCStructures.register(eventBus);

        DCDimentions.register();



        eventBus.addGenericListener(Item.class, PipeBlocks::registerItems);
        eventBus.addGenericListener(Block.class, PipeBlocks::registerBlocks);
        eventBus.addGenericListener(BlockEntityType.class, PipeBlockEntities::registerBlockEntities);

        eventBus.addGenericListener(Item.class, PortBlocks::registerItems);
        eventBus.addGenericListener(Block.class, PortBlocks::registerBlocks);
        eventBus.addGenericListener(BlockEntityType.class, PortBlockEntities::registerBlockEntities);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);


        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(PipeModelRegistry::onModelRegister);
        eventBus.addListener(PipeModelRegistry::onModelBake);
        eventBus.addListener(PortModelRegistry::onModelRegister);
        eventBus.addListener(PortModelRegistry::onModelBake);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> DCOresClient::setup);

        this.configSetup();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(DCMessages::register);
        MinecraftForge.EVENT_BUS.register(new PipeBlockClickEvent());
        MinecraftForge.EVENT_BUS.register(new PortBlockClickEvent());

    }

    private void configSetup() {
//        ModLoadingContext.get().registerConfig(Type.CLIENT, ClientConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.COMMON_CONFIG);
        CommonConfig.loadConfig(CommonConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("common.toml"));
    }

    private void setup(final FMLCommonSetupEvent event) {
        DCOresAPI.init();
        proxy.init();
    }

    @SubscribeEvent
    public void onSlashReload(AddReloadListenerEvent evt) {
        evt.addListener(new WorldGenVeinDataLoader());
    }
    @SubscribeEvent
    public void registerCaps(RegisterCapabilitiesEvent event) {
        event.register(VeinCheck.class);
        event.register(ChunkCheck.class);
    }
    @SubscribeEvent
    public void attachWorldCaps(AttachCapabilitiesEvent<Level> event) {
        if (event.getObject().isClientSide()) {
            return;
        }

        try {
            final LazyOptional<IVeinCheck> inst = LazyOptional.of(VeinCheck::new);
            final ICapabilitySerializable<CompoundTag> provider = new ICapabilitySerializable<>() {
                @Override
                public <T> @NotNull LazyOptional<T> getCapability(@NotNull Capability<T> cap, Direction side) {
                    return VeinCheck.CAPABILITY.orEmpty(cap, inst);
                }

                @Override
                public CompoundTag serializeNBT() {
                    IVeinCheck cap = this.getCapability(VeinCheck.CAPABILITY)
                            .orElseThrow(RuntimeException::new);
                    return cap.serializeNBT();
                }

                @Override
                public void deserializeNBT(CompoundTag nbt) {
                    IVeinCheck cap = this.getCapability(VeinCheck.CAPABILITY)
                            .orElseThrow(RuntimeException::new);
                    cap.deserializeNBT(nbt);
                }
            };
            event.addCapability(Contants.VEIN_CAPABILITY_NAME, provider);
            event.addListener(inst::invalidate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            final LazyOptional<IChunkCheck> inst = LazyOptional.of(ChunkCheck::new);
            final ICapabilitySerializable<CompoundTag> provider = new ICapabilitySerializable<>() {
                @Override
                public <T> @NotNull LazyOptional<T> getCapability(@NotNull Capability<T> cap, Direction side) {
                    return ChunkCheck.CAPABILITY.orEmpty(cap, inst);
                }

                @Override
                public CompoundTag serializeNBT() {
                    IChunkCheck cap = this.getCapability(ChunkCheck.CAPABILITY)
                            .orElseThrow(RuntimeException::new);
                    return cap.serializeNBT();
                }

                @Override
                public void deserializeNBT(CompoundTag nbt) {
                    IChunkCheck cap = this.getCapability(ChunkCheck.CAPABILITY)
                            .orElseThrow(RuntimeException::new);
                    cap.deserializeNBT(nbt);
                }
            };
            event.addCapability(Contants.CHUNKGEN_CAPABILITY_NAME, provider);
            event.addListener(inst::invalidate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onFeaturesRegistry(final RegistryEvent.Register<Feature<?>> featureRegistryEvent) {
            DCOresFeatures.register(featureRegistryEvent);
        }
    }



    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.PULVERIZER_MENU.get(), PulverizerScreen::new);


        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachineElementManufactureMachineScreen::new);
        MenuScreens.register(DCMenuTypes.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_MENU.get(), RedstonePoweredMachinePartManufactureMachineScreen::new);


        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthAstronomyMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthAstronomyMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthBiologyMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthBiologyMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthChemistryMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthChemistryMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthEngineeringMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthEngineeringMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthFormalScienceMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthFormalScienceMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthGeoScienceMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthGeoScienceMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthHybridPhysicsMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthHybridPhysicsMultiblockMaterialStorageScreen::new);

        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_MENU.get(), BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_MENU.get(), BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageScreen::new);




        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_ASTROMICAL_TELESCOPE_MENU.get(), BasicPerformanceAstronomicalTelescopeScreen::new);




        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_ELECTROLYSER_MENU.get(), BasicPerformanceElectrolyserScreen::new);


        MenuScreens.register(DCMenuTypes.BASIC_POWER_STEAM_GENERATOR_MENU.get(), BasicPowerSteamGeneratorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_MENU.get(), BasicTechnologyMachineManufacturerScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_MENU.get(), BasicTechnologyUniversalAssemblerScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_MENU.get(), BasicTechnologyCircuitBuilderScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_MACHINE_MENU.get(), BasicTechnologyMachineElementProcessorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_MACHINE_MENU.get(), BasicTechnologyMachinePartProcessorScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_MENU.get(), BasicTechnologyMultiblockEquipmentFabricatorScreen::new);


        MenuScreens.register(DCMenuTypes.BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU.get(), BasicPhaseBoltManufactureMachineScreen::new);




        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_MACHINE_DARA_INSTALLER_MENU.get(), BasicPerformanceMachineDataInstallerScreen::new);



        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_ROCK_CRASHER_MENU.get(), BasicPerformanceRockCrasherScreen::new);



        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_ARC_ELECTRIC_FURNACE_MENU.get(), BasicPerformanceElectricArcFurnaceScreen::new);
        MenuScreens.register(DCMenuTypes.BASIC_PERFORMANCE_FORMING_MACHINE_MENU.get(), BasicPerformanceFormingMachineScreen::new);
//

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(), RenderType.translucent());



        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PRECISION_OBJECTIVE_LENS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PRECISION_OBJECTIVE_LENS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_HOLO_BLOCK.get(), RenderType.translucent());


        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get(), RenderType.translucent());


        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get(), RenderType.translucent());

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

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_HOLO_BLOCK.get(), RenderType.translucent());





        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_SPEED_DATA_READER_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_HOLO_BLOCK.get(), RenderType.translucent());


        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_CRASHING_BASE_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_HOLO_BLOCK.get(), RenderType.translucent());



        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_HOLO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_HOLO_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(DCMenuTypes.INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU.get(), InfinityPoweredAllInOneCompressorMachineScreen::new);


        MenuScreens.register(DCUniqueMenuTypes.SIMPLE_TELESCOPE_CORE_MENU.get(), SimpleTelescopeCoreScreen::new);


        PipeBlockEntities.clientSetup();
        PortBlockEntities.clientSetup();

    }








}
