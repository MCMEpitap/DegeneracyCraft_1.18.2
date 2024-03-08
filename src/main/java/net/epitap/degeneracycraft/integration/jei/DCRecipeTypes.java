package net.epitap.degeneracycraft.integration.jei;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.integration.jei.basic.BasicMachinePartProcessorRecipe;
import net.epitap.degeneracycraft.integration.jei.initial.RedstonePoweredMachineComponentManufactureMachineRecipe;
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


    public static final RegistryObject<RecipeSerializer<RedstonePoweredMachineComponentManufactureMachineRecipe>> REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_SERIALIZER =
            SERIALIZERS.register("redstone_powered_machine_component_manufacture_machine_recipe", () -> RedstonePoweredMachineComponentManufactureMachineRecipe.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<BasicMachinePartProcessorRecipe>> BASIC_MACHINE_PART_PROCESSOR_SERIALIZER =
            SERIALIZERS.register("basic_machine_part_processor_recipe", () -> BasicMachinePartProcessorRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<UniversalAssemblerPhase1Recipe>> ASSEMBLER_TIER1_SERIALIZER =
            SERIALIZERS.register("universal_assembler_phase1_recipe",()-> UniversalAssemblerPhase1Recipe.Serializer.INSTANCE);

//    public static final RegistryObject<RecipeSerializer<testRecipe>> test_recipeSERIALIZER =
//            SERIALIZERS.register("test_recipe",()-> testRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}
