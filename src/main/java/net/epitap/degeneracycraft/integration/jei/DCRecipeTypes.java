package net.epitap.degeneracycraft.integration.jei;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.integration.jei.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.test.BasicPowerSteamGeneratorMultiblockStructure;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCRecipeTypes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Degeneracycraft.MOD_ID);
//
//    public static final RegistryObject<RecipeSerializer<Pulverization>> PULVERIZATION_SERIALIZER =
//            SERIALIZERS.register("pulverization",()-> Pulverization.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<RedstonePoweredMachineElementManufactureMachineRecipe>> REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_SERIALIZER =
            SERIALIZERS.register("redstone_powered_machine_element_manufacture_machine_recipe", () -> RedstonePoweredMachineElementManufactureMachineRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<RedstonePoweredMachinePartManufactureMachineRecipe>> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_SERIALIZER =
            SERIALIZERS.register("redstone_powered_machine_part_manufacture_machine_recipe", () -> RedstonePoweredMachinePartManufactureMachineRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicPerformanceElectrolyserRecipe>> BASIC_PERFORMANCE_ELECTROLYSER_SERIALIZER =
            SERIALIZERS.register("basic_performance_electrolyser_recipe", () -> BasicPerformanceElectrolyserRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicPowerSteamGeneratorRecipe>> BASIC_POWER_STEAM_GENERATOR_SERIALIZER =
            SERIALIZERS.register("basic_power_steam_generator_recipe", () -> BasicPowerSteamGeneratorRecipe.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<BasicTechnologyMachineManufacturerRecipe>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_SERIALIZER =
            SERIALIZERS.register("basic_technology_machine_manufacturer_recipe", () -> BasicTechnologyMachineManufacturerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyUniversalAssemblerRecipe>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_SERIALIZER =
            SERIALIZERS.register("basic_technology_universal_assembler_recipe", () -> BasicTechnologyUniversalAssemblerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyCircuitBuilderRecipe>> BASIC_PRECISION_CIRCUIT_BUILDER_SERIALIZER =
            SERIALIZERS.register("basic_technology_circuit_builder_recipe", () -> BasicTechnologyCircuitBuilderRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyMachineElementProcessorRecipe>> BASIC_MACHINE_ELEMENT_PROCESSOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_machine_element_processor_recipe", () -> BasicTechnologyMachineElementProcessorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyMachinePartProcessorRecipe>> BASIC_MACHINE_PART_PROCESSOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_machine_part_processor_recipe", () -> BasicTechnologyMachinePartProcessorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BasicTechnologyMultiblockEquipmentFabricatorRecipe>> BASIC_MULTIBLOCK_EQUIPMENT_FABRICATOR_SERIALIZER =
            SERIALIZERS.register("basic_technology_multiblock_equipment_fabricator_recipe", () -> BasicTechnologyMultiblockEquipmentFabricatorRecipe.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<BasicPerformanceElectricArcFurnaceRecipe>> BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_SERIALIZER =
            SERIALIZERS.register("basic_performance_electric_arc_furnace_recipe", () -> BasicPerformanceElectricArcFurnaceRecipe.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<BasicPerformanceFormingMachineRecipe>> BASIC_PERFORMANCE_FORMING_MACHINE_SERIALIZER =
            SERIALIZERS.register("basic_performance_forming_machine_recipe", () -> BasicPerformanceFormingMachineRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicPowerSteamGeneratorMultiblockStructure>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_MULTIBLOCK_STRUCTURE_SERIALIZER =
            SERIALIZERS.register("basic_power_thermal_generator_multiblock_structure", () -> BasicPowerSteamGeneratorMultiblockStructure.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
