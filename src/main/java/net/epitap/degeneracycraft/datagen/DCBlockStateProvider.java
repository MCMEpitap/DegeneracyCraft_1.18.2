package net.epitap.degeneracycraft.datagen;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.block.DCBlocks;
import net.epitap.degeneracycraft.blocks.block.DCHoloBlocks;
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

        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_BLOCK.get());
        simpleBlock(DCBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_BLOCK.get());

        simpleBlock(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_FRAME_BLOCK.get());
        simpleBlock(DCBlocks.LOW_STRENGTH_MULTIBOOT_STRUCTURE_GLASS_BLOCK.get());

//        simpleBlock(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_BASE_FRAME_HOLO_BLOCK.get());
        simpleBlock(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_MACHINE_FRAME_HOLO_BLOCK.get());
        simpleBlock(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_FRAME_HOLO_BLOCK.get());
        simpleBlock(DCHoloBlocks.BASIC_STRENGTH_MULTIBLOCK_STRUCTURE_GLASS_HOLO_BLOCK.get());


        redisterRedstonePoweredMachineComponentManufactureMachine();
        redisterBasicPowerCompositeStructureTypeThermalGenerator();
    }


    private void redisterRedstonePoweredMachineComponentManufactureMachine() {
        BlockModelBuilder modelRedstonePoweredMachineComponentManufactureMachine = models().getBuilder("block/redstone_powered_machine_component_manufacture_machine_block");
        modelRedstonePoweredMachineComponentManufactureMachine.parent(models().getExistingFile(mcLoc("cube")));
        modelRedstonePoweredMachineComponentManufactureMachine.texture("down", modLoc("block/redstone_powered_machine_component_manufacture_machine_down"));
        modelRedstonePoweredMachineComponentManufactureMachine.texture("up", modLoc("block/redstone_powered_machine_component_manufacture_machine_top"));
        modelRedstonePoweredMachineComponentManufactureMachine.texture("north", modLoc("block/redstone_powered_machine_component_manufacture_machine_block"));
        modelRedstonePoweredMachineComponentManufactureMachine.texture("south", modLoc("block/redstone_powered_machine_component_manufacture_machine_block"));
        modelRedstonePoweredMachineComponentManufactureMachine.texture("east", modLoc("block/redstone_powered_machine_component_manufacture_machine_side"));
        modelRedstonePoweredMachineComponentManufactureMachine.texture("west", modLoc("block/redstone_powered_machine_component_manufacture_machine_side"));
        orientedBlock(DCBlocks.REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_BLOCK.get(),
                state -> modelRedstonePoweredMachineComponentManufactureMachine);
    }

    private void redisterBasicPowerCompositeStructureTypeThermalGenerator() {
        BlockModelBuilder modelBasicPowerCompositeStructureTypeThermalGenerator = models().getBuilder("block/basic_power_composite_structure_type_thermal_generator_block");
        modelBasicPowerCompositeStructureTypeThermalGenerator.parent(models().getExistingFile(mcLoc("cube")));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("down", modLoc("block/basic_strength_multiblock_structure_frame_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("up", modLoc("block/basic_strength_multiblock_machine_flame_energyblock"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("north", modLoc("block/basic_power_composite_structure_type_thermal_generator_block"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("south", modLoc("block/basic_strength_multiblock_machine_flame_energyblock"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("east", modLoc("block/basic_strength_multiblock_machine_flame_importblock"));
        modelBasicPowerCompositeStructureTypeThermalGenerator.texture("west", modLoc("block/basic_strength_multiblock_machine_flame_exportblock"));
        orientedBlock(DCBlocks.BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BLOCK.get(),
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
