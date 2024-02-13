package net.epitap.degeneracycraft.blocks.menu;

import net.epitap.degeneracycraft.Degeneracycraft;
//import net.epitap.degeneracycraft.EC.AAAMenu;
import net.epitap.degeneracycraft.blocks.menu.machine.*;
import net.epitap.degeneracycraft.blocks.menu.machine.BoltManufactureMachineMenu.BasicPhaseBoltManufactureMachineMenu;
import net.epitap.degeneracycraft.blocks.menu.machine.basic.BasicPowerCompositeStructureTypeThermalGeneratorMenu;
import net.epitap.degeneracycraft.blocks.menu.machine.infinity.InfinityPoweredAllInOneCompressorMachineMenu;
import net.epitap.degeneracycraft.blocks.menu.machine.initial.RedstonePoweredMachineComponentManufactureMachineMenu;
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
            registerMenuType(PulverizerMenu::new,"pulverizer_menu");

    public static final RegistryObject<MenuType<UniversalAssemblerPhase1Menu>> UNIVERSAL_ASSEMBLER_Phase1_MENU =
            registerMenuType(UniversalAssemblerPhase1Menu::new,"universal_assembler_phase1_menu");
//    public static final RegistryObject<MenuType<UniversalAssemblerPhase2Menu>> UNIVERSAL_ASSEMBLER_Phase2_MENU =
//            registerMenuType(UniversalAssemblerPhase2Menu::new,"universal_assembler_phase2_menu");


    public static final RegistryObject<MenuType<RedstonePoweredMachineComponentManufactureMachineMenu>> REDSTONE_POWERED_MACHINE_COMPONENT_MANUFACTURE_MACHINE_MENU =
            registerMenuType(RedstonePoweredMachineComponentManufactureMachineMenu::new,"redstone_powered_machine_component_manufacture_machine_menu");


    public static final RegistryObject<MenuType<BasicPowerCompositeStructureTypeThermalGeneratorMenu>> BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_MENU =
            registerMenuType(BasicPowerCompositeStructureTypeThermalGeneratorMenu::new,"basic_power_composite_structure_type_thermal_generator_menu");

    public static final RegistryObject<MenuType<BasicPhaseBoltManufactureMachineMenu>> BASIC_PHASE_BOLT_MANUFACTURE_MACHINE_MENU=
            registerMenuType(BasicPhaseBoltManufactureMachineMenu::new,"basic_phase_bolt_manufacture_menu");








    public static final RegistryObject<MenuType<InfinityPoweredAllInOneCompressorMachineMenu>> INFINITY_POWERED_ALL_IN_ONE_COMPRESSOR_MACHINE_BLOCK_MENU=
            registerMenuType(InfinityPoweredAllInOneCompressorMachineMenu::new,"infinity_powered_all_in_one_compressor_machine_menu");


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                 String name){
        return MENUS.register(name,()-> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }


}
