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

        registerBasicPrecisionCircuitBuilder();
        registerBasicPurityCircuitCleanRoom();
        registerBasicPurityCircuitCleanRoomHolo();
        registerBasicPrecisionCircuitBuilderBus();
        registerBasicPrecisionCircuitBuilderBusHolo();
        registerBasicPrecisionCircuitBuilderPort();
        registerBasicPrecisionCircuitBuilderPortHolo();

        registerBasicMachineElementProcessor();
        registerBasicMachineElementProcessorPort();


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

    private void registerBasicStrengthMultiblockBaseFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_base_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_base_frame/basic_strength_multiblock_base_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockMachineFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_machine_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockMachineFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_machine_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_machine_frame/basic_strength_multiblock_machine_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockStructureFrame() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_structure_frame_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockStructureFrameHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_structure_frame_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_frame/basic_strength_multiblock_structure_frame_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockStructureGlass() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_structure_glass_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockStructureGlassHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_structure_glass_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/basic_strength_multiblock_structure_glass/basic_strength_multiblock_structure_glass_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockEnergyStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockEnergyStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_energy_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_energy_storage/basic_strength_multiblock_energy_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockMaterialStorage() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_material_storage_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        model.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        model.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        model.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        model.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        model.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get(),
                state -> model);
    }

    private void registerBasicStrengthMultiblockMaterialStorageHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_strength_multiblock_material_storage_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/storage/basic_strength_multiblock_material_storage/basic_strength_multiblock_material_storage_holo_block"));
        orientedBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_HOLO_BLOCK.get(),
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
        BlockModelBuilder model = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamber() {
        BlockModelBuilder model = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEnduranceHighTemperatureCombustionChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_endurance_high_temperature_combustion_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_endurance_high_temperature_combustion_chamber/basic_endurance_high_temperature_combustion_chamber_holo_block"));
        orientedBlock(DCBlocks.BASIC_ENDURANCE_HIGH_TEMPERATURE_COMBUSTION_CHAMBER_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/port/basic_power_composite_structure_type_thermal_generator_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_PORT_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_block"));
        orientedBlock(DCBlocks.BASIC_POWER_THERMAL_GENERATOR_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGeneratorBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_power_composite_structure_type_thermal_generator/bus/basic_power_composite_structure_type_thermal_generator_bus_holo_block"));
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
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_block"));
        orientedBlock(DCBlocks.BASIC_EFFICIENCY_MACHINE_PROCESSING_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicEfficiencyMachineProcessingChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_efficiency_machine_processing_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_efficiency_machine_processing_chamber/basic_efficiency_machine_processing_chamber_holo_block"));
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
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_block"));
        orientedBlock(DCBlocks.BASIC_OPERATION_ASSEMBLING_CHAMBER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicOperationAssemblingChamberHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_operation_assembling_chamber_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_operation_assembling_chamber/basic_operation_assembling_chamber_holo_block"));
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

    private void registerBasicPrecisionCircuitBuilder() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_circuit_builder_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/basic_precision_circuit_builder_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/basic_precision_circuit_builder_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/basic_precision_circuit_builder_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/basic_precision_circuit_builder_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/basic_precision_circuit_builder_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/basic_precision_circuit_builder_side"));
        orientedBlock(DCBlocks.BASIC_PRECISION_CIRCUIT_BUILDER_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPurityCircuitCleanRoom() {
        BlockModelBuilder model = models().getBuilder("block/basic_purity_circuit_clean_room_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_block"));
        orientedBlock(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPurityCircuitCleanRoomHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_purity_circuit_clean_room_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("up", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("north", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("south", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("east", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        model.texture("west", modLoc("block/multiblock/basic/abilityblock/basic_purity_circuit_clean_room/basic_purity_circuit_clean_room_holo_block"));
        orientedBlock(DCBlocks.BASIC_PURITY_CIRCUIT_CLEAN_ROOM_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionCircuitBuilderBus() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_circuit_builder_bus_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_CIRCUIT_BUILDER_BUS_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionCircuitBuilderBusHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_circuit_builder_bus_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/bus/basic_precision_circuit_builder_bus_holo_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_CIRCUIT_BUILDER_BUS_HOLO_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionCircuitBuilderPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_circuit_builder_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_CIRCUIT_BUILDER_PORT_BLOCK.get(),
                state -> model);
    }

    private void registerBasicPrecisionCircuitBuilderPortHolo() {
        BlockModelBuilder model = models().getBuilder("block/basic_precision_circuit_builder_port_holo_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_holo_block"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_holo_block"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_holo_block"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_holo_block"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_holo_block"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_precision_circuit_builder/port/basic_precision_circuit_builder_port_holo_block"));
        orientedBlock(DCBlocks.BASIC_PRECISION_CIRCUIT_BUILDER_PORT_HOLO_BLOCK.get(),
                state -> model);
    }


    private void registerBasicMachineElementProcessor() {
        BlockModelBuilder model = models().getBuilder("block/basic_machine_element_processor_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_machine_element_processor/basic_machine_element_processor_down"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_machine_element_processor/basic_machine_element_processor_up"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_machine_element_processor/basic_machine_element_processor_front"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_machine_element_processor/basic_machine_element_processor_side"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_machine_element_processor/basic_machine_element_processor_side"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_machine_element_processor/basic_machine_element_processor_side"));
        orientedBlock(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(),
                state -> model);
    }

    private void registerBasicMachineElementProcessorPort() {
        BlockModelBuilder model = models().getBuilder("block/basic_machine_element_processor_port_block");
        model.parent(models().getExistingFile(mcLoc("cube")));
        model.texture("down", modLoc("block/machine/basic/engineering/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        model.texture("up", modLoc("block/machine/basic/engineering/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        model.texture("north", modLoc("block/machine/basic/engineering/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        model.texture("south", modLoc("block/machine/basic/engineering/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        model.texture("east", modLoc("block/machine/basic/engineering/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        model.texture("west", modLoc("block/machine/basic/engineering/basic_machine_element_processor_port/basic_machine_element_processor_port"));
        orientedBlock(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK.get(),
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
