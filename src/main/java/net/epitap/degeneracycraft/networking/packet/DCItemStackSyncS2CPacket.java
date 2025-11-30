package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bioreactor.BasicPerformanceBioReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_power_steam_generator.BasicPowerSteamGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.material_storage.basic_strength_astronomy_multiblock_material_storage.BasicStrengthAstronomyMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.material_storage.basic_strength_biology_multiblock_material_storage.BasicStrengthBiologyMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.material_storage.basic_strength_chemistry_multiblock_material_storage.BasicStrengthChemistryMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.dynamic_energetics.material_storage.basic_strength_dynamic_energetics_multiblock_material_storage.BasicStrengthDynamicEnergeticsMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.material_storage.basic_strength_engineering_multiblock_material_storage.BasicStrengthEngineeringMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.material_storage.basic_strength_formal_science_multiblock_material_storage.BasicStrengthFormalScienceMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.material_storage.basic_strength_geo_science_multiblock_material_storage.BasicStrengthGeoScienceMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.material_storage.basic_strength_hybrid_physics_multiblock_material_storage.BasicStrengthHybridPhysicsMultiblockMaterialStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.material_storage.basic_strength_imitation_magic_engineering_multiblock_material_storage.BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.network.NetworkEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class DCItemStackSyncS2CPacket {
    private final ItemStackHandler itemStackHandler;
    private final BlockPos pos;

    public DCItemStackSyncS2CPacket(ItemStackHandler itemStackHandler, BlockPos pos) {
        this.itemStackHandler = itemStackHandler;
        this.pos = pos;
    }

    public DCItemStackSyncS2CPacket(FriendlyByteBuf buf) {
        List<ItemStack> collection = buf.readCollection(ArrayList::new, FriendlyByteBuf::readItem);
        itemStackHandler = new ItemStackHandler(collection.size());
        for (int i = 0; i < collection.size(); i++) {
            itemStackHandler.insertItem(i, collection.get(i), false);
        }

        this.pos = buf.readBlockPos();
    }

    public void toBytes(FriendlyByteBuf buf) {
        Collection<ItemStack> list = new ArrayList<>();
        for(int i = 0; i < itemStackHandler.getSlots(); i++) {
            list.add(itemStackHandler.getStackInSlot(i));
        }

        buf.writeCollection(list, FriendlyByteBuf::writeItem);
        buf.writeBlockPos(pos);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthAstronomyMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthBiologyMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthChemistryMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthDynamicEnergeticsMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthEngineeringMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthFormalScienceMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthGeoScienceMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthHybridPhysicsMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthImitationMagicEngineeringMultiblockMaterialStorageBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }


            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceBioReactorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceChemicalReactorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceCompoundPurifierBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceElectrolyserBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPowerSteamGeneratorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyCompressionCondenserBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyElectromagneticInductorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMachineManufacturerBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMachinePartProcessorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMultiblockEquipmentFabricatorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceCircuitBuilderBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceMachineDataInstallerBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceDesignatedDataInjectorBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }





            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceRockCrasherBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }




            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceFormingMachineBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyImitationMagicEngraverBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologySuspectedMagicCondenserBlockEntity blockEntity) {
                blockEntity.setHandler(this.itemStackHandler);
            }
        });
        return true;
    }
}
