package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.transport.bus_port.parametor.PortTransportModelValue;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.BlockModelRotation;
import net.minecraft.client.resources.model.UnbakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;

public class PortModelRegistry {
    public enum DCPortModel {
        BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_BUS_BLOCK_EXTRACT("block/basic_performance_astronomical_telescope_bus_block_extract"),
        BASIC_PERFORMANCE_ASTRONOMICAL_TELESCOPE_PORT_BLOCK_EXTRACT("block/basic_performance_astronomical_telescope_port_block_extract"),



        BASIC_PERFORMANCE_ELECTROLYSER_BUS_BLOCK_EXTRACT("block/basic_performance_electrolyser_bus_block_extract"),
        BASIC_PERFORMANCE_ELECTROLYSER_PORT_BLOCK_EXTRACT("block/basic_performance_electrolyser_port_block_extract"),

        BASIC_POWER_STEAM_GENERATOR_BUS_BLOCK_EXTRACT("block/basic_power_steam_generator_bus_block_extract"),
        BASIC_POWER_STEAM_GENERATOR_PORT_BLOCK_EXTRACT("block/basic_power_steam_generator_port_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK_EXTRACT("block/basic_technology_machine_manufacturer_bus_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_EXTRACT("block/basic_technology_machine_manufacturer_port_block_extract"),
        BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_EXTRACT("block/basic_technology_universal_assembler_bus_block_extract"),
        BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK_EXTRACT("block/basic_technology_universal_assembler_port_block_extract"),
        BASIC_PRECISION_CIRCUIT_BUILDER_BUS_BLOCK_EXTRACT("block/basic_technology_circuit_builder_bus_block_extract"),
        BASIC_PRECISION_CIRCUIT_BUILDER_PORT_BLOCK_EXTRACT("block/basic_technology_circuit_builder_port_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK_EXTRACT("block/basic_technology_machine_element_processor_bus_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_EXTRACT("block/basic_technology_machine_element_processor_port_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_BUS_BLOCK_EXTRACT("block/basic_technology_machine_part_processor_bus_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_PART_PROCESSOR_PORT_BLOCK_EXTRACT("block/basic_technology_machine_part_processor_port_block_extract"),
        BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_BUS_BLOCK_EXTRACT("block/basic_technology_multiblock_equipment_fabricator_bus_block_extract"),
        BASIC_TECHNOLOGY_MULTIBLOCK_EQUIPMENT_FABRICATOR_PORT_BLOCK_EXTRACT("block/basic_technology_multiblock_equipment_fabricator_port_block_extract"),


        BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_BUS_BLOCK_EXTRACT("block/basic_performance_machine_data_installer_bus_block_extract"),
        BASIC_PERFORMANCE_MACHINE_DATA_INSTALLER_PORT_BLOCK_EXTRACT("block/basic_performance_machine_data_installer_port_block_extract"),
        BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_BUS_BLOCK_EXTRACT("block/basic_performance_designated_data_injector_bus_block_extract"),
        BASIC_PERFORMANCE_DESIGNATED_DATA_INJECTOR_PORT_BLOCK_EXTRACT("block/basic_performance_designated_data_injector_port_block_extract"),

        BASIC_PERFORMANCE_ROCK_CRASHER_BUS_BLOCK_EXTRACT("block/basic_performance_rock_crasher_bus_block_extract"),
        BASIC_PERFORMANCE_ROCK_CRASHER_PORT_BLOCK_EXTRACT("block/basic_performance_rock_crasher_port_block_extract"),


        BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_BUS_BLOCK_EXTRACT("block/basic_performance_electric_arc_furnace_bus_block_extract"),
        BASIC_PERFORMANCE_ELECTRIC_ARC_FURNACE_PORT_BLOCK_EXTRACT("block/basic_performance_electric_arc_furnace_port_block_extract"),
        BASIC_PERFORMANCE_FORMING_MACHINE_BUS_BLOCK_EXTRACT("block/basic_performance_forming_machine_bus_block_extract"),
        BASIC_PERFORMANCE_FORMING_MACHINE_PORT_BLOCK_EXTRACT("block/basic_performance_forming_machine_port_block_extract"),
        TEST_EXTRACT("block/test_extract");

        private final ResourceLocation resource;
        private final PortTransportModelValue<BakedModel> cachedModel;

        DCPortModel(String name) {
            resource = new ResourceLocation(Degeneracycraft.MOD_ID, name);
            cachedModel = new PortTransportModelValue<>(() -> {
                UnbakedModel modelOrMissing = ForgeModelBakery.instance().getModelOrMissing(resource);
                return modelOrMissing.bake(ForgeModelBakery.instance(), ForgeModelBakery.instance().getSpriteMap()::getSprite, BlockModelRotation.X0_Y0, resource);
            });
        }

        public ResourceLocation getResourceLocation() {
            return resource;
        }

        public PortTransportModelValue<BakedModel> getCachedModel() {
            return cachedModel;
        }
    }

    public static void onModelRegister(ModelRegistryEvent registryEvent) {
        for (DCPortModel model : DCPortModel.values()) {
            ForgeModelBakery.addSpecialModel(model.getResourceLocation());
        }
    }

    public static void onModelBake(ModelBakeEvent registryEvent) {
        for (DCPortModel model : DCPortModel.values()) {
            model.getCachedModel().invalidate();
        }
    }
}
