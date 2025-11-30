package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class DCBlockStateProvider extends BlockStateProvider {
    public DCBlockStateProvider(DataGenerator gen,ExistingFileHelper exFileHelper) {
        super(gen, Degeneracycraft.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        registerReinforcedPlanks();

        registerOverworldGravitationOre();
        registerOverworldCassiteriteOre();
        registerDeepslateCassiteriteOre();
        registerNetherCassiteriteOre();
        registerEndCassiteriteOre();

        registerSiliconBlock();
        registerTinBlock();

        registerBasicStrengthAstronomyMultiblockBaseFrame();
        registerBasicStrengthAstronomyMultiblockBaseFrameHolo();
        registerBasicStrengthAstronomyMultiblockMachineFrame();
        registerBasicStrengthAstronomyMultiblockMachineFrameHolo();
        registerBasicStrengthAstronomyMultiblockStructureFrame();
        registerBasicStrengthAstronomyMultiblockStructureFrameHolo();
        registerBasicStrengthAstronomyMultiblockStructureGlass();
        registerBasicStrengthAstronomyMultiblockStructureGlassHolo();
        registerBasicStrengthAstronomyMultiblockEnergyStorage();
        registerBasicStrengthAstronomyMultiblockEnergyStorageHolo();
        registerBasicStrengthAstronomyMultiblockMaterialStorage();
        registerBasicStrengthAstronomyMultiblockMaterialStorageHolo();

        registerBasicStrengthBiologyMultiblockBaseFrame();
        registerBasicStrengthBiologyMultiblockBaseFrameHolo();
        registerBasicStrengthBiologyMultiblockMachineFrame();
        registerBasicStrengthBiologyMultiblockMachineFrameHolo();
        registerBasicStrengthBiologyMultiblockStructureFrame();
        registerBasicStrengthBiologyMultiblockStructureFrameHolo();
        registerBasicStrengthBiologyMultiblockStructureGlass();
        registerBasicStrengthBiologyMultiblockStructureGlassHolo();
        registerBasicStrengthBiologyMultiblockEnergyStorage();
        registerBasicStrengthBiologyMultiblockEnergyStorageHolo();
        registerBasicStrengthBiologyMultiblockMaterialStorage();
        registerBasicStrengthBiologyMultiblockMaterialStorageHolo();

        registerBasicStrengthChemistryMultiblockBaseFrame();
        registerBasicStrengthChemistryMultiblockBaseFrameHolo();
        registerBasicStrengthChemistryMultiblockMachineFrame();
        registerBasicStrengthChemistryMultiblockMachineFrameHolo();
        registerBasicStrengthChemistryMultiblockStructureFrame();
        registerBasicStrengthChemistryMultiblockStructureFrameHolo();
        registerBasicStrengthChemistryMultiblockStructureGlass();
        registerBasicStrengthChemistryMultiblockStructureGlassHolo();
        registerBasicStrengthChemistryMultiblockEnergyStorage();
        registerBasicStrengthChemistryMultiblockEnergyStorageHolo();
        registerBasicStrengthChemistryMultiblockMaterialStorage();
        registerBasicStrengthChemistryMultiblockMaterialStorageHolo();

        registerBasicStrengthDynamicEnergeticsMultiblockBaseFrame();
        registerBasicStrengthDynamicEnergeticsMultiblockBaseFrameHolo();
        registerBasicStrengthDynamicEnergeticsMultiblockMachineFrame();
        registerBasicStrengthDynamicEnergeticsMultiblockMachineFrameHolo();
        registerBasicStrengthDynamicEnergeticsMultiblockStructureFrame();
        registerBasicStrengthDynamicEnergeticsMultiblockStructureFrameHolo();
        registerBasicStrengthDynamicEnergeticsMultiblockStructureGlass();
        registerBasicStrengthDynamicEnergeticsMultiblockStructureGlassHolo();
        registerBasicStrengthDynamicEnergeticsMultiblockEnergyStorage();
        registerBasicStrengthDynamicEnergeticsMultiblockEnergyStorageHolo();
        registerBasicStrengthDynamicEnergeticsMultiblockMaterialStorage();
        registerBasicStrengthDynamicEnergeticsMultiblockMaterialStorageHolo();

        registerBasicStrengthEngineeringMultiblockBaseFrame();
        registerBasicStrengthEngineeringMultiblockBaseFrameHolo();
        registerBasicStrengthEngineeringMultiblockMachineFrame();
        registerBasicStrengthEngineeringMultiblockMachineFrameHolo();
        registerBasicStrengthEngineeringMultiblockStructureFrame();
        registerBasicStrengthEngineeringMultiblockStructureFrameHolo();
        registerBasicStrengthEngineeringMultiblockStructureGlass();
        registerBasicStrengthEngineeringMultiblockStructureGlassHolo();
        registerBasicStrengthEngineeringMultiblockEnergyStorage();
        registerBasicStrengthEngineeringMultiblockEnergyStorageHolo();
        registerBasicStrengthEngineeringMultiblockMaterialStorage();
        registerBasicStrengthEngineeringMultiblockMaterialStorageHolo();

        registerBasicStrengthFormalScienceMultiblockBaseFrame();
        registerBasicStrengthFormalScienceMultiblockBaseFrameHolo();
        registerBasicStrengthFormalScienceMultiblockMachineFrame();
        registerBasicStrengthFormalScienceMultiblockMachineFrameHolo();
        registerBasicStrengthFormalScienceMultiblockStructureFrame();
        registerBasicStrengthFormalScienceMultiblockStructureFrameHolo();
        registerBasicStrengthFormalScienceMultiblockStructureGlass();
        registerBasicStrengthFormalScienceMultiblockStructureGlassHolo();
        registerBasicStrengthFormalScienceMultiblockEnergyStorage();
        registerBasicStrengthFormalScienceMultiblockEnergyStorageHolo();
        registerBasicStrengthFormalScienceMultiblockMaterialStorage();
        registerBasicStrengthFormalScienceMultiblockMaterialStorageHolo();

        registerBasicStrengthGeoScienceMultiblockBaseFrame();
        registerBasicStrengthGeoScienceMultiblockBaseFrameHolo();
        registerBasicStrengthGeoScienceMultiblockMachineFrame();
        registerBasicStrengthGeoScienceMultiblockMachineFrameHolo();
        registerBasicStrengthGeoScienceMultiblockStructureFrame();
        registerBasicStrengthGeoScienceMultiblockStructureFrameHolo();
        registerBasicStrengthGeoScienceMultiblockStructureGlass();
        registerBasicStrengthGeoScienceMultiblockStructureGlassHolo();
        registerBasicStrengthGeoScienceMultiblockEnergyStorage();
        registerBasicStrengthGeoScienceMultiblockEnergyStorageHolo();
        registerBasicStrengthGeoScienceMultiblockMaterialStorage();
        registerBasicStrengthGeoScienceMultiblockMaterialStorageHolo();

        registerBasicStrengthHybridPhysicsMultiblockBaseFrame();
        registerBasicStrengthHybridPhysicsMultiblockBaseFrameHolo();
        registerBasicStrengthHybridPhysicsMultiblockMachineFrame();
        registerBasicStrengthHybridPhysicsMultiblockMachineFrameHolo();
        registerBasicStrengthHybridPhysicsMultiblockStructureFrame();
        registerBasicStrengthHybridPhysicsMultiblockStructureFrameHolo();
        registerBasicStrengthHybridPhysicsMultiblockStructureGlass();
        registerBasicStrengthHybridPhysicsMultiblockStructureGlassHolo();
        registerBasicStrengthHybridPhysicsMultiblockEnergyStorage();
        registerBasicStrengthHybridPhysicsMultiblockEnergyStorageHolo();
        registerBasicStrengthHybridPhysicsMultiblockMaterialStorage();
        registerBasicStrengthHybridPhysicsMultiblockMaterialStorageHolo();

        registerBasicStrengthImitationMagicEngineeringMultiblockBaseFrame();
        registerBasicStrengthImitationMagicEngineeringMultiblockBaseFrameHolo();
        registerBasicStrengthImitationMagicEngineeringMultiblockMachineFrame();
        registerBasicStrengthImitationMagicEngineeringMultiblockMachineFrameHolo();
        registerBasicStrengthImitationMagicEngineeringMultiblockStructureFrame();
        registerBasicStrengthImitationMagicEngineeringMultiblockStructureFrameHolo();
        registerBasicStrengthImitationMagicEngineeringMultiblockStructureGlass();
        registerBasicStrengthImitationMagicEngineeringMultiblockStructureGlassHolo();
        registerBasicStrengthImitationMagicEngineeringMultiblockEnergyStorage();
        registerBasicStrengthImitationMagicEngineeringMultiblockEnergyStorageHolo();
        registerBasicStrengthImitationMagicEngineeringMultiblockMaterialStorage();
        registerBasicStrengthImitationMagicEngineeringMultiblockMaterialStorageHolo();



        registerBasicPerformanceAstronomicalTelescope();
        registerBasicPrecisionObjectiveLens();
        registerBasicPrecisionObjectiveLensHolo();
        registerBasicPerformanceAstronomicalTelescopeBus();
        registerBasicPerformanceAstronomicalTelescopeBusHolo();
        registerBasicPerformanceAstronomicalTelescopePort();
        registerBasicPerformanceAstronomicalTelescopePortHolo();



        registerBasicPerformanceBioReactor();
        registerBasicSpeedCultivationGreenhouse();
        registerBasicSpeedCultivationGreenhouseHolo();
        registerBasicPerformanceBioReactorBus();
        registerBasicPerformanceBioReactorBusHolo();
        registerBasicPerformanceBioReactorPort();
        registerBasicPerformanceBioReactorPortHolo();



        registerBasicPerformanceChemicalReactor();
        registerBasicRateCompoundAgitationSystem();
        registerBasicRateCompoundAgitationSystemHolo();
        registerBasicPerformanceChemicalReactorBus();
        registerBasicPerformanceChemicalReactorBusHolo();
        registerBasicPerformanceChemicalReactorPort();
        registerBasicPerformanceChemicalReactorPortHolo();

        registerBasicPerformanceCompoundPurifier();
        registerBasicDurableHighSpeedChemicalReactor();
        registerBasicDurableHighSpeedChemicalReactorHolo();
        registerBasicPerformanceCompoundPurifierBus();
        registerBasicPerformanceCompoundPurifierBusHolo();
        registerBasicPerformanceCompoundPurifierPort();
        registerBasicPerformanceCompoundPurifierPortHolo();
        
        registerBasicPerformanceElectrolyser();
        registerBasicDurableExpandedElectrolyticCell();
        registerBasicDurableExpandedElectrolyticCellHolo();
        registerBasicPerformanceElectrolyserBus();
        registerBasicPerformanceElectrolyserBusHolo();
        registerBasicPerformanceElectrolyserPort();
        registerBasicPerformanceElectrolyserPortHolo();
        
        

        
        
        
        
        registerBasicPowerSteamGenerator();
        registerBasicEnduranceHighTemperatureCombustionChamber();
        registerBasicEnduranceHighTemperatureCombustionChamberHolo();
        registerBasicPowerSteamGeneratorBus();
        registerBasicPowerSteamGeneratorBusHolo();
        registerBasicPowerSteamGeneratorPort();
        registerBasicPowerSteamGeneratorPortHolo();

        registerBasicTechnologyCompressionCondenser();
        registerBasicPressureCompressionAssistSystem();
        registerBasicPressureCompressionAssistSystemHolo();
        registerBasicTechnologyCompressionCondenserBus();
        registerBasicTechnologyCompressionCondenserBusHolo();
        registerBasicTechnologyCompressionCondenserPort();
        registerBasicTechnologyCompressionCondenserPortHolo();

        registerBasicTechnologyElectromagneticInductor();
        registerBasicDurableInsulatedChamber();
        registerBasicDurableInsulatedChamberHolo();
        registerBasicTechnologyElectromagneticInductorBus();
        registerBasicTechnologyElectromagneticInductorBusHolo();
        registerBasicTechnologyElectromagneticInductorPort();
        registerBasicTechnologyElectromagneticInductorPortHolo();




        registerRedstonePoweredMachineElementManufactureMachine();
        registerRedstonePoweredMachinePartManufactureMachine();
        
        registerBasicTechnologyMachineManufacturer();
        registerBasicEfficiencyMachineProcessingChamber();
        registerBasicEfficiencyMachineProcessingChamberHolo();
        registerBasicTechnologyMachineManufacturerBus();
        registerBasicTechnologyMachineManufacturerBusHolo();
        registerBasicTechnologyMachineManufacturerPort();
        registerBasicTechnologyMachineManufacturerPortHolo();

        registerBasicTechnologyUniversalAssembler();
        registerBasicOperationAssemblingChamber();
        registerBasicOperationAssemblingChamberHolo();
        registerBasicTechnologyUniversalAssemblerBus();
        registerBasicTechnologyUniversalAssemblerBusHolo();
        registerBasicTechnologyUniversalAssemblerPort();
        registerBasicTechnologyUniversalAssemblerPortHolo();
        
        registerBasicTechnologyMachineElementProcessor();
        registerBasicEfficiencyMachineElementProcessorChamber();
        registerBasicEfficiencyMachineElementProcessorChamberHolo();
        registerBasicTechnologyMachineElementProcessorBus();
        registerBasicTechnologyMachineElementProcessorBusHolo();
        registerBasicTechnologyMachineElementProcessorPort();
        registerBasicTechnologyMachineElementProcessorPortHolo();

        registerBasicTechnologyMachinePartProcessor();
        registerBasicEfficiencyMachinePartProcessorChamber();
        registerBasicEfficiencyMachinePartProcessorChamberHolo();
        registerBasicTechnologyMachinePartProcessorBus();
        registerBasicTechnologyMachinePartProcessorBusHolo();
        registerBasicTechnologyMachinePartProcessorPort();
        registerBasicTechnologyMachinePartProcessorPortHolo();

        registerBasicTechnologyMultiblockEquipmentFabricator();
        registerBasicEfficiencyEquipmentProductionAuxiliarySystem();
        registerBasicEfficiencyEquipmentProductionAuxiliarySystemHolo();
        registerBasicTechnologyMultiblockEquipmentFabricatorBus();
        registerBasicTechnologyMultiblockEquipmentFabricatorBusHolo();
        registerBasicTechnologyMultiblockEquipmentFabricatorPort();
        registerBasicTechnologyMultiblockEquipmentFabricatorPortHolo();




        registerBasicPerformanceCircuitBuilder();
        registerBasicPurityCircuitCleanRoom();
        registerBasicPurityCircuitCleanRoomHolo();
        registerBasicPerformanceCircuitBuilderBus();
        registerBasicPerformanceCircuitBuilderBusHolo();
        registerBasicPerformanceCircuitBuilderPort();
        registerBasicPerformanceCircuitBuilderPortHolo();
        
        registerBasicPerformanceMachineDataInstaller();
        registerBasicSpeedDataReader();
        registerBasicSpeedDataReaderHolo();
        registerBasicPerformanceMachineDataInstallerBus();
        registerBasicPerformanceMachineDataInstallerBusHolo();
        registerBasicPerformanceMachineDataInstallerPort();
        registerBasicPerformanceMachineDataInstallerPortHolo();

        registerBasicPerformanceDesignatedDataInjector();
        registerBasicSpeedCalculationAuxiliaryWriteDevice();
        registerBasicSpeedCalculationAuxiliaryWriteDeviceHolo();
        registerBasicPerformanceDesignatedDataInjectorBus();
        registerBasicPerformanceDesignatedDataInjectorBusHolo();
        registerBasicPerformanceDesignatedDataInjectorPort();
        registerBasicPerformanceDesignatedDataInjectorPortHolo();
        
        
        



        registerBasicPerformanceRockCrasher();
        registerBasicCrashingBase();
        registerBasicCrashingBaseHolo();
        registerBasicPerformanceRockCrasherBus();
        registerBasicPerformanceRockCrasherBusHolo();
        registerBasicPerformanceRockCrasherPort();
        registerBasicPerformanceRockCrasherPortHolo();


        registerBasicPerformanceElectricArcFurnace();
        registerBasicFlowCoolingSystem();
        registerBasicFlowCoolingSystemHolo();
        registerBasicPerformanceElectricArcFurnaceBus();
        registerBasicPerformanceElectricArcFurnaceBusHolo();
        registerBasicPerformanceElectricArcFurnacePort();
        registerBasicPerformanceElectricArcFurnacePortHolo();

        registerBasicPerformanceFormingMachine();
        registerBasicPrecisionExtrusionAssistSystem();
        registerBasicPrecisionExtrusionAssistSystemHolo();
        registerBasicPerformanceFormingMachineBus();
        registerBasicPerformanceFormingMachineBusHolo();
        registerBasicPerformanceFormingMachinePort();
        registerBasicPerformanceFormingMachinePortHolo();



        registerBasicTechnologyImitationMagicEngraver();
        registerBasicOutputMysticOpticalProjectionDevice();
        registerBasicOutputMysticOpticalProjectionDeviceHolo();
        registerBasicTechnologyImitationMagicEngraverBus();
        registerBasicTechnologyImitationMagicEngraverBusHolo();
        registerBasicTechnologyImitationMagicEngraverPort();
        registerBasicTechnologyImitationMagicEngraverPortHolo();

        registerBasicTechnologySuspectedMagicCondenser();
        registerBasicEfficiencySealedExtractionCase();
        registerBasicEfficiencySealedExtractionCaseHolo();
        registerBasicTechnologySuspectedMagicCondenserBus();
        registerBasicTechnologySuspectedMagicCondenserBusHolo();
        registerBasicTechnologySuspectedMagicCondenserPort();
        registerBasicTechnologySuspectedMagicCondenserPortHolo();


//        registerTestBus();
    }

    private void registerReinforcedPlanks() {
        BlockModelBuilder model = models().getBuilder("block/reinforced_planks");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/material/basic/common/reinforced_planks"));
        model.texture("up", modLoc("block/material/basic/common/reinforced_planks"));
        model.texture("north", modLoc("block/material/basic/common/reinforced_planks"));
        model.texture("south", modLoc("block/material/basic/common/reinforced_planks"));
        model.texture("east", modLoc("block/material/basic/common/reinforced_planks"));
        model.texture("west", modLoc("block/material/basic/common/reinforced_planks"));
        model.texture("particle", modLoc("block/material/basic/common/reinforced_planks"));
        orientedBlock(DCBlocks.REINFORCED_PLANKS.get(),
                state -> model);
    }


    private void registerOverworldGravitationOre() {
        BlockModelBuilder model = models().getBuilder("block/overworld_gravitation_ore_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        model.texture("up", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        model.texture("north", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        model.texture("south", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        model.texture("east", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        model.texture("west", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        model.texture("particle", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        orientedBlock(DCBlocks.OVERWORLD_GRAVITATION_ORE.get(),
                state -> model);
    }

    private void registerOverworldCassiteriteOre() {
        BlockModelBuilder model = models().getBuilder("block/overworld_cassiterite_ore_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        model.texture("up", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        model.texture("north", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        model.texture("south", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        model.texture("east", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        model.texture("west", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        model.texture("particle", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        orientedBlock(DCBlocks.OVERWORLD_CASSITERITE_ORE.get(),
                state -> model);
    }

    private void registerDeepslateCassiteriteOre() {
        BlockModelBuilder model = models().getBuilder("block/deepslate_cassiterite_ore_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        model.texture("up", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        model.texture("north", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        model.texture("south", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        model.texture("east", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        model.texture("west", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        model.texture("particle", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));

        orientedBlock(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get(),
                state -> model);
    }

    private void registerNetherCassiteriteOre() {
        BlockModelBuilder model = models().getBuilder("block/nether_cassiterite_ore_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        model.texture("up", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        model.texture("north", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        model.texture("south", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        model.texture("east", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        model.texture("west", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        model.texture("particle", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        orientedBlock(DCBlocks.NETHER_CASSITERITE_ORE.get(),
                state -> model);
    }

    private void registerEndCassiteriteOre() {
        BlockModelBuilder model = models().getBuilder("block/end_cassiterite_ore_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        model.texture("up", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        model.texture("north", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        model.texture("south", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        model.texture("east", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        model.texture("west", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        model.texture("particle", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        orientedBlock(DCBlocks.END_CASSITERITE_ORE.get(),
                state -> model);
    }

    private void registerSiliconBlock() {
        BlockModelBuilder model = models().getBuilder("block/silicon_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/material/element/silicon/silicon_block"));
        model.texture("up", modLoc("block/material/element/silicon/silicon_block"));
        model.texture("north", modLoc("block/material/element/silicon/silicon_block"));
        model.texture("south", modLoc("block/material/element/silicon/silicon_block"));
        model.texture("east", modLoc("block/material/element/silicon/silicon_block"));
        model.texture("west", modLoc("block/material/element/silicon/silicon_block"));
        model.texture("particle", modLoc("block/material/element/silicon/silicon_block"));
        orientedBlock(DCBlocks.SILICON_BLOCK.get(),
                state -> model);
    }

    private void registerTinBlock() {
        BlockModelBuilder model = models().getBuilder("block/tin_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/material/element/tin/tin_block"));
        model.texture("up", modLoc("block/material/element/tin/tin_block"));
        model.texture("north", modLoc("block/material/element/tin/tin_block"));
        model.texture("south", modLoc("block/material/element/tin/tin_block"));
        model.texture("east", modLoc("block/material/element/tin/tin_block"));
        model.texture("west", modLoc("block/material/element/tin/tin_block"));
        model.texture("particle", modLoc("block/material/element/tin/tin_block"));
        orientedBlock(DCBlocks.TIN_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_base_frame/basic_strength_astronomy_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_machine_frame/basic_strength_astronomy_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_frame/basic_strength_astronomy_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/basic_strength_astronomy_multiblock_structure_glass/basic_strength_astronomy_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_energy_storage/basic_strength_astronomy_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthAstronomyMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_astronomy_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/storage/basic_strength_astronomy_multiblock_material_storage/basic_strength_astronomy_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ASTRONOMY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_base_frame/basic_strength_biology_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_machine_frame/basic_strength_biology_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_frame/basic_strength_biology_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/basic_strength_biology_multiblock_structure_glass/basic_strength_biology_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_energy_storage/basic_strength_biology_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthBiologyMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_biology_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/storage/basic_strength_biology_multiblock_material_storage/basic_strength_biology_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_BIOLOGY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_base_frame/basic_strength_chemistry_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_machine_frame/basic_strength_chemistry_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_frame/basic_strength_chemistry_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/basic_strength_chemistry_multiblock_structure_glass/basic_strength_chemistry_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_energy_storage/basic_strength_chemistry_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthChemistryMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_chemistry_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/storage/basic_strength_chemistry_multiblock_material_storage/basic_strength_chemistry_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_CHEMISTRY_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_base_frame/basic_strength_dynamic_energetics_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_machine_frame/basic_strength_dynamic_energetics_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_frame/basic_strength_dynamic_energetics_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/basic_strength_dynamic_energetics_multiblock_structure_glass/basic_strength_dynamic_energetics_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_energy_storage/basic_strength_dynamic_energetics_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicEnergeticsMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/storage/basic_strength_dynamic_energetics_multiblock_material_storage/basic_strength_dynamic_energetics_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_ENERGETICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_base_frame/basic_strength_engineering_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_machine_frame/basic_strength_engineering_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_frame/basic_strength_engineering_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/basic_strength_engineering_multiblock_structure_glass/basic_strength_engineering_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_energy_storage/basic_strength_engineering_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthEngineeringMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_engineering_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/storage/basic_strength_engineering_multiblock_material_storage/basic_strength_engineering_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_base_frame/basic_strength_formal_science_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_machine_frame/basic_strength_formal_science_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_frame/basic_strength_formal_science_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/basic_strength_formal_science_multiblock_structure_glass/basic_strength_formal_science_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_energy_storage/basic_strength_formal_science_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthFormalScienceMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_formal_science_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/storage/basic_strength_formal_science_multiblock_material_storage/basic_strength_formal_science_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_FORMAL_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_base_frame/basic_strength_geo_science_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_machine_frame/basic_strength_geo_science_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_frame/basic_strength_geo_science_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/basic_strength_geo_science_multiblock_structure_glass/basic_strength_geo_science_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_energy_storage/basic_strength_geo_science_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthGeoScienceMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_geo_science_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/storage/basic_strength_geo_science_multiblock_material_storage/basic_strength_geo_science_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_GEO_SCIENCE_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_base_frame/basic_strength_hybrid_physics_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_machine_frame/basic_strength_hybrid_physics_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_frame/basic_strength_hybrid_physics_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/basic_strength_hybrid_physics_multiblock_structure_glass/basic_strength_hybrid_physics_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_energy_storage/basic_strength_hybrid_physics_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthHybridPhysicsMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_hybrid_physics_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/storage/basic_strength_hybrid_physics_multiblock_material_storage/basic_strength_hybrid_physics_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_HYBRID_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_base_frame/basic_strength_imitation_magic_engineering_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_machine_frame/basic_strength_imitation_magic_engineering_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_frame/basic_strength_imitation_magic_engineering_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/basic_strength_imitation_magic_engineering_multiblock_structure_glass/basic_strength_imitation_magic_engineering_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage/basic_strength_imitation_magic_engineering_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthImitationMagicEngineeringMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/storage/basic_strength_imitation_magic_engineering_multiblock_material_storage/basic_strength_imitation_magic_engineering_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_IMITATION_MAGIC_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    
    
    
    private void registerBasicPerformanceAstronomicalTelescope() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_astronomical_telescope_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_down"));
        model.texture("up", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_up"));
        model.texture("north", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_front"));
        model.texture("south", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_side"));
        model.texture("east", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_side"));
        model.texture("west", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_side"));
        model.texture("particle", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/basic_performance_astronomical_telescope_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionObjectiveLens() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_objective_lens_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_OBJECTIVE_LENS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionObjectiveLensHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_objective_lens_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/astronomy/abilityblock/basic_precision_objective_lens/basic_precision_objective_lens_holo_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_OBJECTIVE_LENS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceAstronomicalTelescopeBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_astronomical_telescope_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        model.texture("up", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        model.texture("north", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        model.texture("south", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        model.texture("east", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        model.texture("west", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceAstronomicalTelescopeBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_astronomical_telescope_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/bus/basic_performance_astronomical_telescope_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceAstronomicalTelescopePort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_astronomical_telescope_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        model.texture("up", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        model.texture("north", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        model.texture("south", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        model.texture("east", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        model.texture("west", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        model.texture("particle", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceAstronomicalTelescopePortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_astronomical_telescope_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/astronomy/basic_performance_astronomical_telescope/port/basic_performance_astronomical_telescope_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceBioReactor() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_bio_reactor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_down"));
        model.texture("up", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_up"));
        model.texture("north", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_front"));
        model.texture("south", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_side"));
        model.texture("east", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_side"));
        model.texture("west", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_side"));
        model.texture("particle", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/basic_performance_bio_reactor_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicSpeedCultivationGreenhouse() {
        BlockModelBuilder model = models().getBuilder("block/basic_speed_cultivation_greenhouse_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_block"));
        orientedBlock(DCBlocks.BASIC_SPEED_CULTIVATION_GREENHOUSE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicSpeedCultivationGreenhouseHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_speed_cultivation_greenhouse_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/biology/abilityblock/basic_speed_cultivation_greenhouse/basic_speed_cultivation_greenhouse_holo_block"));
        orientedBlock(DCBlocks.BASIC_SPEED_CULTIVATION_GREENHOUSE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceBioReactorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_bio_reactor_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        model.texture("up", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        model.texture("north", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        model.texture("south", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        model.texture("east", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        model.texture("west", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceBioReactorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_bio_reactor_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/bus/basic_performance_bio_reactor_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceBioReactorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_bio_reactor_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        model.texture("up", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        model.texture("north", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        model.texture("south", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        model.texture("east", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        model.texture("west", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        model.texture("particle", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceBioReactorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_bio_reactor_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/biology/basic_performance_bio_reactor/port/basic_performance_bio_reactor_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_BIO_REACTOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }



    private void registerBasicPerformanceChemicalReactor() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_chemical_reactor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_down"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_up"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_front"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_side"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_side"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_side"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/basic_performance_chemical_reactor_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicRateCompoundAgitationSystem() {
        BlockModelBuilder model = models().getBuilder("block/basic_rate_compound_agitation_system_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_block"));
        orientedBlock(DCBlocks.BASIC_RATE_COMPOUND_AGITATION_SYSTEM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicRateCompoundAgitationSystemHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_rate_compound_agitation_system_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_rate_compound_agitation_system/basic_rate_compound_agitation_system_holo_block"));
        orientedBlock(DCBlocks.BASIC_RATE_COMPOUND_AGITATION_SYSTEM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceChemicalReactorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_chemical_reactor_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceChemicalReactorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_chemical_reactor_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/bus/basic_performance_chemical_reactor_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceChemicalReactorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_chemical_reactor_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceChemicalReactorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_chemical_reactor_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_chemical_reactor/port/basic_performance_chemical_reactor_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CHEMICAL_REACTOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }
    
    private void registerBasicPerformanceCompoundPurifier() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_compound_purifier_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_down"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_up"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_front"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_side"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_side"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_side"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/basic_performance_compound_purifier_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicDurableHighSpeedChemicalReactor() {
        BlockModelBuilder model = models().getBuilder("block/basic_durable_high_speed_chemical_reactor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_block"));
        orientedBlock(DCBlocks.BASIC_DURABLE_HIGH_SPPED_CHEMICAL_REACTOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicDurableHighSpeedChemicalReactorHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_durable_high_speed_chemical_reactor_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_high_speed_chemical_reactor/basic_durable_high_speed_chemical_reactor_holo_block"));
        orientedBlock(DCBlocks.BASIC_DURABLE_HIGH_SPPED_CHEMICAL_REACTOR_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCompoundPurifierBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_compound_purifier_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCompoundPurifierBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_compound_purifier_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/bus/basic_performance_compound_purifier_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCompoundPurifierPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_compound_purifier_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCompoundPurifierPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_compound_purifier_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_compound_purifier/port/basic_performance_compound_purifier_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_COMPOUND_PURIFIER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }
    
    

    private void registerBasicPerformanceElectrolyser() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electrolyser_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_down"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_up"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_front"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_side"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_side"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_side"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/basic_performance_electrolyser_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicDurableExpandedElectrolyticCell() {
        BlockModelBuilder model = models().getBuilder("block/basic_durable_expanded_electrolytic_cell_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_block"));
        orientedBlock(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_BLOCK.get(),
                state -> model);
    }

    private void registerBasicDurableExpandedElectrolyticCellHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_durable_expanded_electrolytic_cell_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/chemistry/abilityblock/basic_durable_expanded_electrolytic_cell/basic_durable_expanded_electrolytic_cell_holo_block"));
        orientedBlock(DCBlocks.BASIC_DURABLE_EXPANDED_ELECTROLYTIC_CELL_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectrolyserBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electrolyser_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectrolyserBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electrolyser_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/bus/basic_performance_electrolyser_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectrolyserPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electrolyser_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectrolyserPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electrolyser_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/chemistry/basic_performance_electrolyser/port/basic_performance_electrolyser_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTROLYSER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }




    private void registerBasicPowerSteamGenerator() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_steam_generator_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_down"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_up"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_front"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_side"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_side"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_side"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/basic_power_steam_generator_front"));
        orientedBlock(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerSteamGeneratorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_steam_generator_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
        orientedBlock(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerSteamGeneratorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_steam_generator_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/bus/basic_power_steam_generator_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_STEAM_GENERATOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerSteamGeneratorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_steam_generator_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_block"));
        orientedBlock(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerSteamGeneratorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_steam_generator_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_power_steam_generator/port/basic_power_steam_generator_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_STEAM_GENERATOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCompressionCondenser() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_compression_condenser_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_down"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_up"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_front"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_side"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_side"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_side"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/basic_technology_compression_condenser_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPressureCompressionAssistSystem() {
        BlockModelBuilder model = models().getBuilder("block/basic_pressure_compression_assist_system_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_block"));
        orientedBlock(DCBlocks.BASIC_PRESSURE_COMPRESSION_ASSIST_SYSTEM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPressureCompressionAssistSystemHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_pressure_compression_assist_system_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_pressure_compression_assist_system/basic_pressure_compression_assist_system_holo_block"));
        orientedBlock(DCBlocks.BASIC_PRESSURE_COMPRESSION_ASSIST_SYSTEM_HOLO_BLOCK.get(),
                state -> model);
    }
    
    private void registerBasicTechnologyCompressionCondenserBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_compression_condenser_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCompressionCondenserBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_compression_condenser_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/bus/basic_technology_compression_condenser_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCompressionCondenserPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_compression_condenser_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCompressionCondenserPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_compression_condenser_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_compression_condenser/port/basic_technology_compression_condenser_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_COMPRESSION_CONDENSER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyElectromagneticInductor() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_electromagnetic_inductor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_down"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_up"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_front"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_side"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_side"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_side"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/basic_technology_electromagnetic_inductor_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicDurableInsulatedChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_durable_insulated_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_block"));
        orientedBlock(DCBlocks.BASIC_DURABLE_INSULATED_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicDurableInsulatedChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_durable_insulated_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/dynamic_energetics/abilityblock/basic_durable_insulated_chamber/basic_durable_insulated_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_DURABLE_INSULATED_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyElectromagneticInductorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_electromagnetic_inductor_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyElectromagneticInductorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_electromagnetic_inductor_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/bus/basic_technology_electromagnetic_inductor_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyElectromagneticInductorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_electromagnetic_inductor_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyElectromagneticInductorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_electromagnetic_inductor_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/dynamic_energetics/basic_technology_electromagnetic_inductor/port/basic_technology_electromagnetic_inductor_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_ELECTROMAGNETIC_INDUCTOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }
    
    
    

    private void registerRedstonePoweredMachineElementManufactureMachine() {
        BlockModelBuilder model = models().getBuilder("block/redstone_powered_machine_element_manufacture_machine_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_down"));
        model.texture("up", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_top"));
        model.texture("north", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        model.texture("south", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        model.texture("east", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_side"));
        model.texture("west", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_side"));
        model.texture("particle", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> model);
    }

    private void registerRedstonePoweredMachinePartManufactureMachine() {
        BlockModelBuilder model = models().getBuilder("block/redstone_powered_machine_part_manufacture_machine_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_down"));
        model.texture("up", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_top"));
        model.texture("north", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        model.texture("south", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        model.texture("east", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_side"));
        model.texture("west", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_side"));
        model.texture("particle", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> model);
    }



    private void registerBasicTechnologyMachineManufacturer() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_manufacturer_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_side"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachineProcessingChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_processing_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachineProcessingChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_processing_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }
    private void registerBasicTechnologyMachineManufacturerBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_manufacturer_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachineManufacturerBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_manufacturer_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/bus/basic_technology_machine_manufacturer_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachineManufacturerPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_manufacturer_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachineManufacturerPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_manufacturer_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_manufacturer/port/basic_technology_machine_manufacturer_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyUniversalAssembler() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_universal_assembler_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_side"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/basic_technology_universal_assembler_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicOperationAssemblingChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_operation_assembling_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        orientedBlock(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicOperationAssemblingChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_operation_assembling_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyUniversalAssemblerBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_universal_assembler_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyUniversalAssemblerBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_universal_assembler_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/bus/basic_technology_universal_assembler_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyUniversalAssemblerPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_universal_assembler_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyUniversalAssemblerPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_universal_assembler_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_universal_assembler/port/basic_technology_universal_assembler_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }
    
    private void registerBasicTechnologyMachineElementProcessor() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_element_processor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_side"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/basic_technology_machine_element_processor_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachineElementProcessorChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_element_processing_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachineElementProcessorChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_element_processing_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_element_processing_chamber/basic_efficiency_machine_element_processing_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_ELEMENT_PROCESSING_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachineElementProcessorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_element_processor_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachineElementProcessorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_element_processor_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/bus/basic_technology_machine_element_processor_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicTechnologyMachineElementProcessorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_element_processor_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachineElementProcessorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_element_processor_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_element_processor/port/basic_technology_machine_element_processor_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachinePartProcessor() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_part_processor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_side"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/basic_technology_machine_part_processor_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachinePartProcessorChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_part_processing_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachinePartProcessorChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_part_processing_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_machine_part_processing_chamber/basic_efficiency_machine_part_processing_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_PART_PROCESSING_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachinePartProcessorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_part_processor_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachinePartProcessorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_part_processor_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicTechnologyMachinePartProcessorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_part_processor_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMachinePartProcessorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_machine_part_processor_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/port/basic_technology_machine_part_processor_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMultiblockEquipmentFabricator() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_multiblock_equipment_fabricator_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_side"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/basic_technology_multiblock_equipment_fabricator_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyEquipmentProductionAuxiliarySystem() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_equipment_production_auxiliary_system_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyEquipmentProductionAuxiliarySystemHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_equipment_production_auxiliary_system_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/engineering/abilityblock/basic_efficiency_equipment_production_auxiliary_system/basic_efficiency_equipment_production_auxiliary_system_holo_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_EQUIPMENT_PRODUCTION_AUXILIARY_SYSTEM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMultiblockEquipmentFabricatorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_multiblock_equipment_fabricator_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMultiblockEquipmentFabricatorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_multiblock_equipment_fabricator_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/bus/basic_technology_multiblock_equipment_fabricator_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicTechnologyMultiblockEquipmentFabricatorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_multiblock_equipment_fabricator_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyMultiblockEquipmentFabricatorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_multiblock_equipment_fabricator_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/engineering/basic_technology_multiblock_equipment_fabricator/port/basic_technology_multiblock_equipment_fabricator_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }



    private void registerBasicPerformanceCircuitBuilder() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_circuit_builder_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_down"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_up"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_front"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_side"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_side"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_side"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/basic_performance_circuit_builder_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPurityCircuitCleanRoom() {
        BlockModelBuilder model = models().getBuilder("block/basic_purity_circuit_clean_room_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        orientedBlock(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPurityCircuitCleanRoomHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_purity_circuit_clean_room_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        orientedBlock(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCircuitBuilderBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_circuit_builder_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCircuitBuilderBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_circuit_builder_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/bus/basic_performance_circuit_builder_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCircuitBuilderPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_circuit_builder_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceCircuitBuilderPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_circuit_builder_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_circuit_builder/port/basic_performance_circuit_builder_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_CIRCUIT_BUILDER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceMachineDataInstaller() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_machine_data_installer_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_down"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_up"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_front"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_side"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_side"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_side"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/basic_performance_machine_data_installer_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicSpeedDataReader() {
        BlockModelBuilder model = models().getBuilder("block/basic_speed_data_reader_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        orientedBlock(DCBlocks.BASIC_SPEED_DATA_READER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicSpeedDataReaderHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_speed_data_reader_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        orientedBlock(DCBlocks.BASIC_SPEED_DATA_READER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceMachineDataInstallerBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_machine_data_installer_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceMachineDataInstallerBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_machine_data_installer_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/bus/basic_performance_machine_data_installer_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceMachineDataInstallerPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_machine_data_installer_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceMachineDataInstallerPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_machine_data_installer_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_machine_data_installer/port/basic_performance_machine_data_installer_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceDesignatedDataInjector() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_designated_data_injector_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_down"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_up"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_front"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_side"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_side"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_side"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/basic_performance_designated_data_injector_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicSpeedCalculationAuxiliaryWriteDevice() {
        BlockModelBuilder model = models().getBuilder("block/basic_speed_calculation_auxiliary_write_device_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_block"));
        orientedBlock(DCBlocks.BASIC_SPEED_CALCULATION_AUXILIARY_WRITE_DEVICE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicSpeedCalculationAuxiliaryWriteDeviceHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_speed_calculation_auxiliary_write_device_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/formal_science/abilityblock/basic_speed_data_reader/basic_speed_data_reader_holo_block"));
        orientedBlock(DCBlocks.BASIC_SPEED_CALCULATION_AUXILIARY_WRITE_DEVICE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceDesignatedDataInjectorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_designated_data_injector_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceDesignatedDataInjectorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_designated_data_injector_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/bus/basic_performance_designated_data_injector_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceDesignatedDataInjectorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_designated_data_injector_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceDesignatedDataInjectorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_designated_data_injector_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/formal_science/basic_performance_designated_data_injector/port/basic_performance_designated_data_injector_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }














    private void registerBasicPerformanceRockCrasher() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_rock_crasher_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_down"));
        model.texture("up", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_up"));
        model.texture("north", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_front"));
        model.texture("south", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_side"));
        model.texture("east", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_side"));
        model.texture("west", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_side"));
        model.texture("particle", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/basic_performance_rock_crasher_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicCrashingBase() {
        BlockModelBuilder model = models().getBuilder("block/basic_crashing_base_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_block"));
        orientedBlock(DCBlocks.BASIC_CRASHING_BASE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicCrashingBaseHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_crashing_base_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/geo_science/abilityblock/basic_crashing_base/basic_crashing_base_holo_block"));
        orientedBlock(DCBlocks.BASIC_CRASHING_BASE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceRockCrasherBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_rock_crasher_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        model.texture("up", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        model.texture("north", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        model.texture("south", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        model.texture("east", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        model.texture("west", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceRockCrasherBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_rock_crasher_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/bus/basic_performance_rock_crasher_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceRockCrasherPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_rock_crasher_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        model.texture("up", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        model.texture("north", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        model.texture("south", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        model.texture("east", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        model.texture("west", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        model.texture("particle", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceRockCrasherPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_rock_crasher_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/geo_science/basic_performance_rock_crasher/port/basic_performance_rock_crasher_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ROCK_CRASHER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }












    private void registerBasicPerformanceElectricArcFurnace() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_down"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_up"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_front"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_side"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_side"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_side"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicFlowCoolingSystem() {
        BlockModelBuilder model = models().getBuilder("block/basic_flow_cooling_system_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        orientedBlock(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicFlowCoolingSystemHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_flow_cooling_system_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        orientedBlock(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectricArcFurnaceBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectricArcFurnaceBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceElectricArcFurnacePort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectricArcFurnacePortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceFormingMachine() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_forming_machine_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_down"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_up"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_front"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_side"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_side"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_side"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/basic_performance_forming_machine_front"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionExtrusionAssistSystem() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_extrusion_assist_system_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionExtrusionAssistSystemHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_extrusion_assist_system_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/hybrid_physics/abilityblock/basic_precision_extrusion_assist_system/basic_precision_extrusion_assist_system_holo_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_EXTRUSION_ASSIST_SYSTEM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceFormingMachineBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_forming_machine_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceFormingMachineBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_forming_machine_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/bus/basic_performance_forming_machine_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceFormingMachinePort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_forming_machine_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceFormingMachinePortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_forming_machine_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/hybrid_physics/basic_performance_forming_machine/port/basic_performance_forming_machine_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_FORMING_MACHINE_PORT_HOLO_BLOCK.get(),
                state -> model);
    }



    private void registerBasicTechnologyImitationMagicEngraver() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_imitation_magic_engraver_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_down"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_up"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_front"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_side"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_side"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_side"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/basic_technology_imitation_magic_engraver_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicOutputMysticOpticalProjectionDevice() {
        BlockModelBuilder model = models().getBuilder("block/basic_output_mystic_optical_projection_device_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_block"));
        orientedBlock(DCBlocks.BASIC_OUTPUT_MYSTIC_OPTICAL_PROJECTION_DEVICE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicOutputMysticOpticalProjectionDeviceHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_output_mystic_optical_projection_device_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_output_mystic_optical_projection_device/basic_output_mystic_optical_projection_device_holo_block"));
        orientedBlock(DCBlocks.BASIC_OUTPUT_MYSTIC_OPTICAL_PROJECTION_DEVICE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyImitationMagicEngraverBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_imitation_magic_engraver_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyImitationMagicEngraverBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_imitation_magic_engraver_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/bus/basic_technology_imitation_magic_engraver_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicTechnologyImitationMagicEngraverPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_imitation_magic_engraver_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyImitationMagicEngraverPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_imitation_magic_engraver_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_imitation_magic_engraver/port/basic_technology_imitation_magic_engraver_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_IMITATION_MAGIC_ENGRAVER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologySuspectedMagicCondenser() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_suspected_magic_condenser_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_down"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_up"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_front"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_side"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_side"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_side"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/basic_technology_suspected_magic_condenser_front"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencySealedExtractionCase() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_sealed_extraction_case_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_SEALED_EXTRACTION_CASE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencySealedExtractionCaseHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_sealed_extraction_case_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        model.texture("particle", modLoc("block/multiblock/basic/imitation_magic_engineering/abilityblock/basic_efficiency_sealed_extraction_case/basic_efficiency_sealed_extraction_case_holo_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_SEALED_EXTRACTION_CASE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologySuspectedMagicCondenserBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_suspected_magic_condenser_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologySuspectedMagicCondenserBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_suspected_magic_condenser_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/bus/basic_technology_suspected_magic_condenser_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicTechnologySuspectedMagicCondenserPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_suspected_magic_condenser_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologySuspectedMagicCondenserPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_suspected_magic_condenser_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        model.texture("particle", modLoc("block/machine/basic/imitation_magic_engineering/basic_technology_suspected_magic_condenser/port/basic_technology_suspected_magic_condenser_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_SUSPECTED_MAGIC_CONDENSER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

//    private void registerTestBus() {
//        BlockModelBuilder model = models().getBuilder("block/test_pipe");
//        model.parent(models().getExistingFile(mcLoc("cube")));
//        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
//        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
//        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
//        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
//        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
//        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_steam_generator/bus/basic_power_steam_generator_bus_block"));
//        orientedBlock(DCBlocks.TEST_BLOCK.get(),
//                state -> model);
//    }

    private void orientedBlock(Block block, Function<BlockState, ModelFile> modelFunc) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.FACING);
                    return ConfiguredModel.builder()
                            .modelFile(modelFunc.apply(state))
                            .rotationX(dir.getAxis() == Direction.Axis.Y ? dir.getAxisDirection().getStep() * -90 : 0)
                            .rotationY(dir.getAxis() != Direction.Axis.Y ? ((dir.get2DDataValue() + 2) % 4) * 90 : 0)
                            .build();
                });
    }
}
