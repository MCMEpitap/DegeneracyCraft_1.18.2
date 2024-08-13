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

        registerBasicStrengthMultiblockBaseFrame();
        registerBasicStrengthMultiblockMachineFrame();
        registerBasicStrengthMultiblockMachineFrameHolo();
        registerBasicStrengthMultiblockStructureFrame();
        registerBasicStrengthMultiblockStructureFrameHolo();
        registerBasicStrengthMultiblockStructureGlass();
        registerBasicStrengthMultiblockStructureGlassHolo();
        registerBasicStrengthMultiblockEnergyStorage();
        registerBasicStrengthMultiblockEnergyStorageHolo();
        registerBasicStrengthMultiblockMaterialStorage();
        registerBasicStrengthMultiblockMaterialStorageHolo();

        registerRedstonePoweredMachineElementManufactureMachine();
        registerRedstonePoweredMachinePartManufactureMachine();

        registerBasicPowerCompositeStructureTypeThermalGenerator();
        registerBasicEnduranceHighTemperatureCombustionChamber();
        registerBasicEnduranceHighTemperatureCombustionChamberHolo();
        registerBasicPowerCompositeStructureTypeThermalGeneratorPort();
        registerBasicPowerCompositeStructureTypeThermalGeneratorPortHolo();
        registerBasicPowerCompositeStructureTypeThermalGeneratorBus();
        registerBasicPowerCompositeStructureTypeThermalGeneratorBusHolo();

        registerBasicTechnologyUniversalAssembler();
        registerBasicMachineElementProcessor();
        registerBasicMachineElementProcessorPort();


    }

    private void registerReinforcedPlanks() {
        BlockModelBuilder modelReinforcedPlanks = models().getBuilder("block/reinforced_planks");
        modelReinforcedPlanks.parent(models().getExistingFile(mcLoc("cube")));
        modelReinforcedPlanks.texture("down", modLoc("block/material/basic/common/reinforced_planks"));
        modelReinforcedPlanks.texture("up", modLoc("block/material/basic/common/reinforced_planks"));
        modelReinforcedPlanks.texture("north", modLoc("block/material/basic/common/reinforced_planks"));
        modelReinforcedPlanks.texture("south", modLoc("block/material/basic/common/reinforced_planks"));
        modelReinforcedPlanks.texture("east", modLoc("block/material/basic/common/reinforced_planks"));
        modelReinforcedPlanks.texture("west", modLoc("block/material/basic/common/reinforced_planks"));
        orientedBlock(DCBlocks.REINFORCED_PLANKS.get(),
                state -> modelReinforcedPlanks);
    }


    private void registerOverworldGravitationOre() {
        BlockModelBuilder modelOverworldGravitationOre = models().getBuilder("block/overworld_gravitation_ore_block");
        modelOverworldGravitationOre.parent(models().getExistingFile(mcLoc("cube")));
        modelOverworldGravitationOre.texture("down", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        modelOverworldGravitationOre.texture("up", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        modelOverworldGravitationOre.texture("north", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        modelOverworldGravitationOre.texture("south", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        modelOverworldGravitationOre.texture("east", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        modelOverworldGravitationOre.texture("west", modLoc("block/ore/gravitation_ore/overworld_gravitation_ore"));
        orientedBlock(DCBlocks.OVERWORLD_GRAVITATION_ORE.get(),
                state -> modelOverworldGravitationOre);
    }

    private void registerOverworldCassiteriteOre() {
        BlockModelBuilder modelOverworldCassiteriteOre = models().getBuilder("block/overworld_cassiterite_ore_block");
        modelOverworldCassiteriteOre.parent(models().getExistingFile(mcLoc("cube")));
        modelOverworldCassiteriteOre.texture("down", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        modelOverworldCassiteriteOre.texture("up", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        modelOverworldCassiteriteOre.texture("north", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        modelOverworldCassiteriteOre.texture("south", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        modelOverworldCassiteriteOre.texture("east", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        modelOverworldCassiteriteOre.texture("west", modLoc("block/ore/cassiterite/overworld_cassiterite_ore"));
        orientedBlock(DCBlocks.OVERWORLD_CASSITERITE_ORE.get(),
                state -> modelOverworldCassiteriteOre);
    }

    private void registerDeepslateCassiteriteOre() {
        BlockModelBuilder modelDeepslateCassiteriteOre = models().getBuilder("block/deepslate_cassiterite_ore_block");
        modelDeepslateCassiteriteOre.parent(models().getExistingFile(mcLoc("cube")));
        modelDeepslateCassiteriteOre.texture("down", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        modelDeepslateCassiteriteOre.texture("up", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        modelDeepslateCassiteriteOre.texture("north", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        modelDeepslateCassiteriteOre.texture("south", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        modelDeepslateCassiteriteOre.texture("east", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        modelDeepslateCassiteriteOre.texture("west", modLoc("block/ore/cassiterite/deepslate_cassiterite_ore"));
        orientedBlock(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get(),
                state -> modelDeepslateCassiteriteOre);
    }

    private void registerNetherCassiteriteOre() {
        BlockModelBuilder modelNetherCassiteriteOre = models().getBuilder("block/nether_cassiterite_ore_block");
        modelNetherCassiteriteOre.parent(models().getExistingFile(mcLoc("cube")));
        modelNetherCassiteriteOre.texture("down", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        modelNetherCassiteriteOre.texture("up", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        modelNetherCassiteriteOre.texture("north", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        modelNetherCassiteriteOre.texture("south", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        modelNetherCassiteriteOre.texture("east", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        modelNetherCassiteriteOre.texture("west", modLoc("block/ore/cassiterite/nether_cassiterite_ore"));
        orientedBlock(DCBlocks.NETHER_CASSITERITE_ORE.get(),
                state -> modelNetherCassiteriteOre);
    }

    private void registerEndCassiteriteOre() {
        BlockModelBuilder modelEndCassiteriteOre = models().getBuilder("block/end_cassiterite_ore_block");
        modelEndCassiteriteOre.parent(models().getExistingFile(mcLoc("cube")));
        modelEndCassiteriteOre.texture("down", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        modelEndCassiteriteOre.texture("up", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        modelEndCassiteriteOre.texture("north", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        modelEndCassiteriteOre.texture("south", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        modelEndCassiteriteOre.texture("east", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        modelEndCassiteriteOre.texture("west", modLoc("block/ore/cassiterite/end_cassiterite_ore"));
        orientedBlock(DCBlocks.END_CASSITERITE_ORE.get(),
                state -> modelEndCassiteriteOre);
    }

    private void registerBasicStrengthMultiblockBaseFrame() {
        BlockModelBuilder modelBasicStrengthMultiblockBaseFrame = models().getBuilder("block/basic_strength_multiblock_base_frame_block");
        modelBasicStrengthMultiblockBaseFrame.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicStrengthMultiblockBaseFrame.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        modelBasicStrengthMultiblockBaseFrame.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        modelBasicStrengthMultiblockBaseFrame.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        modelBasicStrengthMultiblockBaseFrame.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        modelBasicStrengthMultiblockBaseFrame.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        modelBasicStrengthMultiblockBaseFrame.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> modelBasicStrengthMultiblockBaseFrame);
    }

    private void registerBasicStrengthMultiblockMachineFrame() {
        BlockModelBuilder modelBasicStrengthMultiblockMachineFrame = models().getBuilder("block/basic_strength_multiblock_machine_frame_block");
        modelBasicStrengthMultiblockMachineFrame.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicStrengthMultiblockMachineFrame.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> modelBasicStrengthMultiblockMachineFrame);
    }

    private void registerBasicStrengthMultiblockMachineFrameHolo() {
        BlockModelBuilder modelBasicStrengthMultiblockMachineFrame = models().getBuilder("block/basic_strength_multiblock_machine_frame_holo_block");
        modelBasicStrengthMultiblockMachineFrame.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicStrengthMultiblockMachineFrame.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        modelBasicStrengthMultiblockMachineFrame.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> modelBasicStrengthMultiblockMachineFrame);
    }

    private void registerBasicStrengthMultiblockStructureFrame() {
        BlockModelBuilder registerBasicStrengthMultiblockStructureFrame = models().getBuilder("block/basic_strength_multiblock_structure_frame_block");
        registerBasicStrengthMultiblockStructureFrame.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockStructureFrame.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> registerBasicStrengthMultiblockStructureFrame);
    }

    private void registerBasicStrengthMultiblockStructureFrameHolo() {
        BlockModelBuilder registerBasicStrengthMultiblockStructureFrame = models().getBuilder("block/basic_strength_multiblock_structure_frame_holo_block");
        registerBasicStrengthMultiblockStructureFrame.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockStructureFrame.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        registerBasicStrengthMultiblockStructureFrame.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> registerBasicStrengthMultiblockStructureFrame);
    }

    private void registerBasicStrengthMultiblockStructureGlass() {
        BlockModelBuilder registerBasicStrengthMultiblockStructureGlass = models().getBuilder("block/basic_strength_multiblock_structure_glass_block");
        registerBasicStrengthMultiblockStructureGlass.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockStructureGlass.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> registerBasicStrengthMultiblockStructureGlass);
    }

    private void registerBasicStrengthMultiblockStructureGlassHolo() {
        BlockModelBuilder registerBasicStrengthMultiblockStructureGlass = models().getBuilder("block/basic_strength_multiblock_structure_glass_holo_block");
        registerBasicStrengthMultiblockStructureGlass.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockStructureGlass.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        registerBasicStrengthMultiblockStructureGlass.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> registerBasicStrengthMultiblockStructureGlass);
    }

    private void registerBasicStrengthMultiblockEnergyStorage() {
        BlockModelBuilder registerBasicStrengthMultiblockEnergyStorage = models().getBuilder("block/basic_strength_multiblock_energy_storage_block");
        registerBasicStrengthMultiblockEnergyStorage.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockEnergyStorage.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> registerBasicStrengthMultiblockEnergyStorage);
    }

    private void registerBasicStrengthMultiblockEnergyStorageHolo() {
        BlockModelBuilder registerBasicStrengthMultiblockEnergyStorage = models().getBuilder("block/basic_strength_multiblock_energy_storage_block");
        registerBasicStrengthMultiblockEnergyStorage.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockEnergyStorage.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        registerBasicStrengthMultiblockEnergyStorage.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> registerBasicStrengthMultiblockEnergyStorage);
    }

    private void registerBasicStrengthMultiblockMaterialStorage() {
        BlockModelBuilder registerBasicStrengthMultiblockMaterialStorage = models().getBuilder("block/basic_strength_multiblock_material_storage_block");
        registerBasicStrengthMultiblockMaterialStorage.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockMaterialStorage.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> registerBasicStrengthMultiblockMaterialStorage);
    }

    private void registerBasicStrengthMultiblockMaterialStorageHolo() {
        BlockModelBuilder registerBasicStrengthMultiblockMaterialStorage = models().getBuilder("block/basic_strength_multiblock_material_storage_holo_block");
        registerBasicStrengthMultiblockMaterialStorage.parent(models().getExistingFile(mcLoc("cube")));
        registerBasicStrengthMultiblockMaterialStorage.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        registerBasicStrengthMultiblockMaterialStorage.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
                state -> registerBasicStrengthMultiblockMaterialStorage);
    }

    private void registerRedstonePoweredMachineElementManufactureMachine() {
        BlockModelBuilder modelRedstonePoweredMachineElementManufactureMachine = models().getBuilder("block/redstone_powered_machine_element_manufacture_machine_block");
        modelRedstonePoweredMachineElementManufactureMachine.parent(models().getExistingFile(mcLoc("cube")));
        modelRedstonePoweredMachineElementManufactureMachine.texture("down", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_down"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("up", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_top"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("north", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("south", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("east", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_side"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("west", modLoc("block/machine/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_side"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> modelRedstonePoweredMachineElementManufactureMachine);
    }

    private void registerRedstonePoweredMachinePartManufactureMachine() {
        BlockModelBuilder modelRedstonePoweredMachinePartManufactureMachine = models().getBuilder("block/redstone_powered_machine_part_manufacture_machine_block");
        modelRedstonePoweredMachinePartManufactureMachine.parent(models().getExistingFile(mcLoc("cube")));
        modelRedstonePoweredMachinePartManufactureMachine.texture("down", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_down"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("up", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_top"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("north", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("south", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("east", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_side"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("west", modLoc("block/machine/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_side"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> modelRedstonePoweredMachinePartManufactureMachine);
    }
    private void registerBasicPowerCompositeStructureTypeThermalGenerator() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_down"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_up"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_front"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamber() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamberHolo() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_holo_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorPort() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_port_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorPortHolo() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_port_holo_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_HOLO_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorBus() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_bus_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorBusHolo() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_bus_holo_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/machine/basic/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_HOLO_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicTechnologyMachineManufacturer() {
        BlockModelBuilder modelBasicTechnologyMachineManufacturer = models().getBuilder("block/basic_technology_machine_manufacturer_block");
        modelBasicTechnologyMachineManufacturer.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicTechnologyMachineManufacturer.texture("down", modLoc("block/machine/basic/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_down"));
        modelBasicTechnologyMachineManufacturer.texture("up", modLoc("block/machine/basic/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_up"));
        modelBasicTechnologyMachineManufacturer.texture("north", modLoc("block/machine/basic/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_front"));
        modelBasicTechnologyMachineManufacturer.texture("south", modLoc("block/machine/basic/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_side"));
        modelBasicTechnologyMachineManufacturer.texture("east", modLoc("block/machine/basic/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_side"));
        modelBasicTechnologyMachineManufacturer.texture("west", modLoc("block/machine/basic/basic_technology_machine_manufacturer/basic_technology_machine_manufacturer_side"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BLOCK.get(),
                state -> modelBasicTechnologyMachineManufacturer);
    }

    private void registerBasicTechnologyUniversalAssembler() {
        BlockModelBuilder modelBasicMachineElementProcessor = models().getBuilder("block/basic_technology_universal_assembler_block");
        modelBasicMachineElementProcessor.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicMachineElementProcessor.texture("down", modLoc("block/machine/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_up"));
        modelBasicMachineElementProcessor.texture("up", modLoc("block/machine/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_down"));
        modelBasicMachineElementProcessor.texture("north", modLoc("block/machine/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_front"));
        modelBasicMachineElementProcessor.texture("south", modLoc("block/machine/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_side"));
        modelBasicMachineElementProcessor.texture("east", modLoc("block/machine/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_side"));
        modelBasicMachineElementProcessor.texture("west", modLoc("block/machine/basic/basic_technology_universal_assembler/basic_technology_universal_assembler_side"));
        orientedBlock(DCBlocks.BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BLOCK.get(),
                state -> modelBasicMachineElementProcessor);
    }

    private void registerBasicMachineElementProcessor() {
        BlockModelBuilder modelBasicMachineElementProcessor = models().getBuilder("block/basic_machine_element_processor_block");
        modelBasicMachineElementProcessor.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicMachineElementProcessor.texture("down", modLoc("block/machine/basic/basic_machine_element_processor/basic_machine_block_side_down"));
        modelBasicMachineElementProcessor.texture("up", modLoc("block/machine/basic/basic_machine_element_processor/basic_machine_element_processor_side_energy"));
        modelBasicMachineElementProcessor.texture("north", modLoc("block/machine/basic/basic_machine_element_processor/basic_machine_element_processor_front"));
        modelBasicMachineElementProcessor.texture("south", modLoc("block/machine/basic/basic_machine_element_processor/basic_machine_element_processor_side_energy"));
        modelBasicMachineElementProcessor.texture("east", modLoc("block/machine/basic/basic_machine_element_processor/basic_machine_element_processor_side_import"));
        modelBasicMachineElementProcessor.texture("west", modLoc("block/machine/basic/basic_machine_element_processor/basic_machine_element_processor_side_export"));
        orientedBlock(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(),
                state -> modelBasicMachineElementProcessor);
    }

    private void registerBasicMachineElementProcessorPort() {
        BlockModelBuilder modelBasicMachineElementProcessorPort = models().getBuilder("block/basic_machine_element_processor_port_block");
        modelBasicMachineElementProcessorPort.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicMachineElementProcessorPort.texture("down", modLoc("block/machine/basic/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        modelBasicMachineElementProcessorPort.texture("up", modLoc("block/machine/basic/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        modelBasicMachineElementProcessorPort.texture("north", modLoc("block/machine/basic/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        modelBasicMachineElementProcessorPort.texture("south", modLoc("block/machine/basic/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        modelBasicMachineElementProcessorPort.texture("east", modLoc("block/machine/basic/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        modelBasicMachineElementProcessorPort.texture("west", modLoc("block/machine/basic/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        orientedBlock(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get(),
                state -> modelBasicMachineElementProcessorPort);
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
