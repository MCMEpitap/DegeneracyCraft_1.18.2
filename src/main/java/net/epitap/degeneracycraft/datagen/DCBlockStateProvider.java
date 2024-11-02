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

        registerBasicStrengthDynamicPhysicsMultiblockBaseFrame();
        registerBasicStrengthDynamicPhysicsMultiblockBaseFrameHolo();
        registerBasicStrengthDynamicPhysicsMultiblockMachineFrame();
        registerBasicStrengthDynamicPhysicsMultiblockMachineFrameHolo();
        registerBasicStrengthDynamicPhysicsMultiblockStructureFrame();
        registerBasicStrengthDynamicPhysicsMultiblockStructureFrameHolo();
        registerBasicStrengthDynamicPhysicsMultiblockStructureGlass();
        registerBasicStrengthDynamicPhysicsMultiblockStructureGlassHolo();
        registerBasicStrengthDynamicPhysicsMultiblockEnergyStorage();
        registerBasicStrengthDynamicPhysicsMultiblockEnergyStorageHolo();
        registerBasicStrengthDynamicPhysicsMultiblockMaterialStorage();
        registerBasicStrengthDynamicPhysicsMultiblockMaterialStorageHolo();

        registerBasicPerformanceElectricArcFurnace();
        registerBasicFlowCoolingSystem();
        registerBasicFlowCoolingSystemHolo();
        registerBasicPerformanceElectricArcFurnaceBus();
        registerBasicPerformanceElectricArcFurnaceBusHolo();
        registerBasicPerformanceElectricArcFurnacePort();
        registerBasicPerformanceElectricArcFurnacePortHolo();

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

        registerRedstonePoweredMachineElementManufactureMachine();
        registerRedstonePoweredMachinePartManufactureMachine();

        registerBasicPowerCompositeStructureTypeThermalGenerator();
        registerBasicEnduranceHighTemperatureCombustionChamber();
        registerBasicEnduranceHighTemperatureCombustionChamberHolo();
        registerBasicPowerCompositeStructureTypeThermalGeneratorBus();
        registerBasicPowerCompositeStructureTypeThermalGeneratorBusHolo();
        registerBasicPowerCompositeStructureTypeThermalGeneratorPort();
        registerBasicPowerCompositeStructureTypeThermalGeneratorPortHolo();


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

        registerBasicTechnologyCircuitBuilder();
        registerBasicPurityCircuitCleanRoom();
        registerBasicPurityCircuitCleanRoomHolo();
        registerBasicTechnologyCircuitBuilderBus();
        registerBasicTechnologyCircuitBuilderBusHolo();
        registerBasicTechnologyCircuitBuilderPort();
        registerBasicTechnologyCircuitBuilderPortHolo();

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
        orientedBlock(DCBlocks.SILICON_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockBaseFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_base_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_base_frame/basic_strength_dynamic_physics_multiblock_base_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_machine_frame/basic_strength_dynamic_physics_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_frame/basic_strength_dynamic_physics_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/basic_strength_dynamic_physics_multiblock_structure_glass/basic_strength_dynamic_physics_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_energy_storage/basic_strength_dynamic_physics_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthDynamicPhysicsMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_dynamic_physics_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/storage/basic_strength_dynamic_physics_multiblock_material_storage/basic_strength_dynamic_physics_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_DYNAMIC_PHYSICS_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceElectricArcFurnace() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_down"));
        model.texture("up", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_up"));
        model.texture("north", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_front"));
        model.texture("south", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_side"));
        model.texture("east", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_side"));
        model.texture("west", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/basic_performance_electric_arc_furnace_side"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicFlowCoolingSystem() {
        BlockModelBuilder model = models().getBuilder("block/basic_flow_cooling_system_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_block"));
        orientedBlock(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicFlowCoolingSystemHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_flow_cooling_system_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/dynamic_physics/abilityblock/basic_flow_cooling_system/basic_flow_cooling_system_holo_block"));
        orientedBlock(DCBlocks.BASIC_FLOW_COOLING_SYSTEM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectricArcFurnaceBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectricArcFurnaceBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/bus/basic_performance_electric_arc_furnace_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicPerformanceElectricArcFurnacePort() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPerformanceElectricArcFurnacePortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_performance_electric_arc_furnace_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/dynamic_physics/basic_performance_electric_arc_furnace/port/basic_performance_electric_arc_furnace_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_HOLO_BLOCK.get(),
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
        orientedBlock(DCBlocks.BASIC_STRENGTH_ENGINEERING_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
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
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> model);
    }
    private void registerBasicPowerCompositeStructureTypeThermalGenerator() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_thermal_generator_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/basic_power_thermal_generator_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/basic_power_thermal_generator_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/basic_power_thermal_generator_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/basic_power_thermal_generator_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/basic_power_thermal_generator_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/basic_power_thermal_generator_side"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_thermal_generator_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_thermal_generator_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/port/basic_power_thermal_generator_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_thermal_generator_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_thermal_generator_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_thermal_generator/bus/basic_power_thermal_generator_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BUS_HOLO_BLOCK.get(),
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
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCircuitBuilder() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_circuit_builder_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/basic_technology_circuit_builder_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/basic_technology_circuit_builder_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/basic_technology_circuit_builder_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/basic_technology_circuit_builder_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/basic_technology_circuit_builder_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/basic_technology_circuit_builder_side"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPurityCircuitCleanRoom() {
        BlockModelBuilder model = models().getBuilder("block/basic_purity_circuit_clean_room_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        orientedBlock(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPurityCircuitCleanRoomHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_purity_circuit_clean_room_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/engineering/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        orientedBlock(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCircuitBuilderBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_circuit_builder_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCircuitBuilderBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_circuit_builder_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/bus/basic_technology_circuit_builder_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCircuitBuilderPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_circuit_builder_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicTechnologyCircuitBuilderPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_technology_circuit_builder_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_circuit_builder/port/basic_technology_circuit_builder_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_CIRCUIT_BUILDER_PORT_HOLO_BLOCK.get(),
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
        model.texture("west", modLoc("block/machine/basic/engineering/basic_technology_machine_part_processor/bus/basic_technology_machine_part_processor_bus_holo_block"));
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
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }


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
