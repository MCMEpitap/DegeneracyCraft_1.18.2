package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope.BasicPrecisionTelescopeMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_phase_bolt_manufacture_machine.BasicPhaseBoltManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_thermal_generator.BasicPowerThermalGeneratorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerMenu;
import net.epitap.degeneracycraft.blocks.machine.infinity.InfinityPoweredAllInOneCompressorMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_part_manufacture_machine.RedstonePoweredMachinePartManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.menu.machine.PulverizerMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.energystorage.basic_strength_multiblock_energy_storage.BasicStrengthMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.materialstorage.basic_strength_multiblock_material_storage.BasicStrengthMultiblockMaterialStorageMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Degeneracycraft.MOD_ID);


    public static final RegistryObject<MenuType<PulverizerMenu>> PULVERIZER_MENU =
            registerMenuType(PulverizerMenu::new, "pulverizer_menu");


    public static final RegistryObject<MenuType<RedstonePoweredMachineElementManufactureMachineMenu>> REDSTONE_POWERED_MACHINE_ELEMENT_MANUFACTURE_MACHINE_MENU =
            registerMenuType(RedstonePoweredMachineElementManufactureMachineMenu::new, "redstone_powered_machine_element_manufacture_machine_menu");

    public static final RegistryObject<MenuType<RedstonePoweredMachinePartManufactureMachineMenu>> REDSTONE_POWERED_MACHINE_PART_MANUFACTURE_MACHINE_MENU =
            registerMenuType(RedstonePoweredMachinePartManufactureMachineMenu::new, "redstone_powered_machine_part_manufacture_machine_menu");
    public static final RegistryObject<MenuType<BasicStrengthMultiblockEnergyStorageMenu>> BASIC_STRENGTH_MULTIBLOCK_ENERGY_STORAGE_BLOCK_MENU =
            registerMenuType(BasicStrengthMultiblockEnergyStorageMenu::new, "basic_strength_multiblock_energy_storage_menu");
    public static final RegistryObject<MenuType<BasicStrengthMultiblockMaterialStorageMenu>> BASIC_STRENGTH_MULTIBLOCK_MATERIAL_STORAGE_BLOCK_MENU =
            registerMenuType(BasicStrengthMultiblockMaterialStorageMenu::new, "basic_strength_multiblock_material_storage_menu");
    public static final RegistryObject<MenuType<BasicPrecisionTelescopeMenu>> BASIC_PRECISION_TELESCOPE_MENU =
            registerMenuType(BasicPrecisionTelescopeMenu::new, "basic_precision_telescope_menu");
    public static final RegistryObject<MenuType<BasicPerformanceElectrolyserMenu>> BASIC_PERFORMANCE_ELECTROLYSER_MENU =
            registerMenuType(BasicPerformanceElectrolyserMenu::new, "basic_performance_electrolyser_menu");
    public static final RegistryObject<MenuType<BasicPerformanceElectricArcFurnaceMenu>> BASIC_PERFORMANCE_ARC_ELECTRIC_FURNACE_MENU =
            registerMenuType(BasicPerformanceElectricArcFurnaceMenu::new, "basic_performance_electric_arc_furnace_menu");
    public static final RegistryObject<MenuType<BasicPowerThermalGeneratorMenu>> BASIC_POWER_THERMAL_GENERATOR_MENU =
            registerMenuType(BasicPowerThermalGeneratorMenu::new, "basic_power_thermal_generator_menu");
    public static final RegistryObject<MenuType<BasicTechnologyUniversalAssemblerMenu>> BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_MENU =
            registerMenuType(BasicTechnologyUniversalAssemblerMenu::new, "basic_technology_universal_assembler_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMachineManufacturerMenu>> BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_MENU =
            registerMenuType(BasicTechnologyMachineManufacturerMenu::new, "basic_technology_machine_manufacturer_menu");
    public static final RegistryObject<MenuType<BasicTechnologyCircuitBuilderMenu>> BASIC_TECHNOLOGY_CIRCUIT_BUILDER_MENU =
            registerMenuType(BasicTechnologyCircuitBuilderMenu::new, "basic_technology_circuit_builder_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMachineElementProcessorMenu>> BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_MACHINE_MENU =
            registerMenuType(BasicTechnologyMachineElementProcessorMenu::new, "basic_technology_machine_element_processor_menu");
    public static final RegistryObject<MenuType<BasicTechnologyMachinePartProcessorMenu>> BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_MACHINE_MENU =
            registerMenuType(BasicTechnologyMachinePartProcessorMenu::new, "basic_technology_machine_part_processor_menu");
    public static final RegistryObject<MenuType<BasicPhaseBoltManufactureMachineMenu>> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU =
            registerMenuType(BasicPhaseBoltManufactureMachineMenu::new, "basic_phase_bolt_manufacture_menu");


    public static final RegistryObject<MenuType<InfinityPoweredAllInOneCompressorMachineMenu>> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU =
            registerMenuType(InfinityPoweredAllInOneCompressorMachineMenu::new, "infinity_powered_all_in_one_compressor_machine_menu");


//    public static final RegistryObject<MenuType<TestBlockMenu>> TEST_MENU=
//            registerMenuType(TestBlockMenu::new,"test_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }


}
