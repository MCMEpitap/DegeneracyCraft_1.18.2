package net.epitap.degeneracycraft.integration.jei;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachineElementProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.basic.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineRecipe;
import net.epitap.degeneracycraft.integration.jei.test.BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure;
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


    public static final RegistryObject<RecipeSerializer<BasicMachineElementProcessorRecipe>> BASIC_MACHINE_ELEMENT_PROCESSOR_SERIALIZER =
            SERIALIZERS.register("basic_machine_element_processor_recipe", () -> BasicMachineElementProcessorRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicTechnologyUniversalAssemblerRecipe>> ASSEMBLER_TIER1_SERIALIZER =
            SERIALIZERS.register("basic_technology_universal_assembler_recipe", () -> BasicTechnologyUniversalAssemblerRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_MULTIBLOCK_STRUCTURE_SERIALIZER =
            SERIALIZERS.register("basic_power_composite_structure_type_thermal_generator_multiblock_structure", () -> BasicPowerCompositeStructureTypeThermalGeneratorMultiblockStructure.Serializer.INSTANCE);


//    public static final RegistryObject<RecipeSerializer<testRecipe>> test_recipeSERIALIZER =
//            SERIALIZERS.register("test_recipe",()-> testRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
