package net.epitap.degeneracycraft.transport.port_bus.render;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.transport.parametor.TransportModelValue;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.BlockModelRotation;
import net.minecraft.client.resources.model.UnbakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;

public class PortModelRegistry {
    public enum DCPortModel {
        BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_PORT_BLOCK_EXTRACT("block/basic_power_composite_structure_type_thermal_generator_port_block_extract"),
        BASIC_POWER_COMPOSITE_STRUCTURE_TYPE_THERMAL_GENERATOR_BUS_BLOCK_EXTRACT("block/basic_power_composite_structure_type_thermal_generator_bus_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_BUS_BLOCK_EXTRACT("block/basic_technology_machine_manufacturer_bus_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_MANUFACTURER_PORT_BLOCK_EXTRACT("block/basic_technology_machine_manufacturer_port_block_extract"),
        BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_BUS_BLOCK_EXTRACT("block/basic_technology_universal_assembler_bus_block_extract"),
        BASIC_TECHNOLOGY_UNIVERSAL_ASSEMBLER_PORT_BLOCK_EXTRACT("block/basic_technology_universal_assembler_port_block_extract"),
        BASIC_PRECISION_CIRCUIT_BUILDER_BUS_BLOCK_EXTRACT("block/basic_precision_circuit_builder_bus_block_extract"),
        BASIC_PRECISION_CIRCUIT_BUILDER_PORT_BLOCK_EXTRACT("block/basic_precision_circuit_builder_port_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_BUS_BLOCK_EXTRACT("block/basic_technology_machine_element_processor_bus_block_extract"),
        BASIC_TECHNOLOGY_MACHINE_ELEMENT_PROCESSOR_PORT_BLOCK_EXTRACT("block/basic_technology_machine_element_processor_port_block_extract");

        private final ResourceLocation resource;
        private final TransportModelValue<BakedModel> cachedModel;

        DCPortModel(String name) {
            resource = new ResourceLocation(Degeneracycraft.MOD_ID, name);
            cachedModel = new TransportModelValue<>(() -> {
                UnbakedModel modelOrMissing = ForgeModelBakery.instance().getModelOrMissing(resource);
                return modelOrMissing.bake(ForgeModelBakery.instance(), ForgeModelBakery.instance().getSpriteMap()::getSprite, BlockModelRotation.X0_Y0, resource);
            });
        }

        public ResourceLocation getResourceLocation() {
            return resource;
        }

        public TransportModelValue<BakedModel> getCachedModel() {
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
