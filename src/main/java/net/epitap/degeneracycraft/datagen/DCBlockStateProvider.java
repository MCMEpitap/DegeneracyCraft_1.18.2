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
        simpleBlock(DCBlocks.OVERWORLD_GRAVITATION_ORE.get());

        simpleBlock(DCBlocks.OVERWORLD_CASSITERITE_ORE.get());
        simpleBlock(DCBlocks.DEEPSLATE_CASSITERITE_ORE.get());
        simpleBlock(DCBlocks.NETHER_CASSITERITE_ORE.get());
        simpleBlock(DCBlocks.END_CASSITERITE_ORE.get());

        simpleBlock(DCBlocks.REINFORCED_PLANKS.get());

        simpleBlock(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.get());
        simpleBlock(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get());

//        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get());

        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK.get());



        registerBasicStrengthMultiblockBaseFrame();
        registerBasicStrengthMultiblockMachineFrame();
        registerBasicStrengthMultiblockStructureFrame();
        registerBasicStrengthMultiblockStructureGlass();

        registerRedstonePoweredMachineElementManufactureMachine();
        registerRedstonePoweredMachinePartManufactureMachine();
        registerBasicPowerCompositeStructureTypeThermalGenerator();
        registerBasicMachineElementProcessor();
        registerBasicMachineElementProcessorPort();
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

    private void registerRedstonePoweredMachineElementManufactureMachine() {
        BlockModelBuilder modelRedstonePoweredMachineElementManufactureMachine = models().getBuilder("block/redstone_powered_machine_element_manufacture_machine_block");
        modelRedstonePoweredMachineElementManufactureMachine.parent(models().getExistingFile(mcLoc("cube")));
        modelRedstonePoweredMachineElementManufactureMachine.texture("down", modLoc("block/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_down"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("up", modLoc("block/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_top"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("north", modLoc("block/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("south", modLoc("block/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_block"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("east", modLoc("block/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_side"));
        modelRedstonePoweredMachineElementManufactureMachine.texture("west", modLoc("block/initial/redstone_powered_machine_element_manufacture_machine/redstone_powered_machine_element_manufacture_machine_side"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> modelRedstonePoweredMachineElementManufactureMachine);
    }

    private void registerRedstonePoweredMachinePartManufactureMachine() {
        BlockModelBuilder modelRedstonePoweredMachinePartManufactureMachine = models().getBuilder("block/redstone_powered_machine_part_manufacture_machine_block");
        modelRedstonePoweredMachinePartManufactureMachine.parent(models().getExistingFile(mcLoc("cube")));
        modelRedstonePoweredMachinePartManufactureMachine.texture("down", modLoc("block/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_down"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("up", modLoc("block/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_top"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("north", modLoc("block/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("south", modLoc("block/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_block"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("east", modLoc("block/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_side"));
        modelRedstonePoweredMachinePartManufactureMachine.texture("west", modLoc("block/initial/redstone_powered_machine_part_manufacture_machine/redstone_powered_machine_part_manufacture_machine_side"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> modelRedstonePoweredMachinePartManufactureMachine);
    }

    private void registerBasicPowerCompositeStructureTypeThermalGenerator() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/basic/basic_power_composite_structure_type_thermal_generator/basic_machine_block_side_down"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side_en"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_front"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side_en"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side_im"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/basic/basic_power_composite_structure_type_thermal_generator/basic_power_composite_structure_type_thermal_generator_side_ex"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicMachineElementProcessor() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_machine_element_processor_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/basic/basic_machine_element_processor/basic_machine_block_side_down"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/basic/basic_machine_element_processor/basic_machine_element_processor_block_side_energy"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/basic/basic_machine_element_processor/basic_machine_element_processor_block_front"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/basic/basic_machine_element_processor/basic_machine_element_processor_block_side_energy"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/basic/basic_machine_element_processor/basic_machine_element_processor_block_side_import"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/basic/basic_machine_element_processor/basic_machine_element_processor_block_side_export"));
        orientedBlock(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
    }

    private void registerBasicMachineElementProcessorPort() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_machine_element_processor_port_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/basic/basic_machine_element_processor_port_block/basic_machine_element_processor_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/basic/basic_machine_element_processor_port_block/basic_machine_element_processor_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/basic/basic_machine_element_processor_port_block/basic_machine_element_processor_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/basic/basic_machine_element_processor_port_block/basic_machine_element_processor_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/basic/basic_machine_element_processor_port_block/basic_machine_element_processor_port_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/basic/basic_machine_element_processor_port_block/basic_machine_element_processor_port_block"));
        orientedBlock(DCBlocks.BASIC_MACHINE_ELEMENT_PROCESSOR_BLOCK.get(),
                state -> modelBasicPowerCompositeStructureTypeThermalGenerator);
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
