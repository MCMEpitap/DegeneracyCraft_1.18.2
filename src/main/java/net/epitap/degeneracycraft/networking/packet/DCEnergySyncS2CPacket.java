package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope.BasicPerformanceAstronomicalTelescopeBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_precision_telescope.BasicPerformanceAstronomicalTelescopeMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_power_steam_generator.BasicPowerSteamGeneratorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.energy_storage.basic_strength_astronomy_multiblock_energy_storage.BasicStrengthAstronomyMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.astronomy.energy_storage.basic_strength_astronomy_multiblock_energy_storage.BasicStrengthAstronomyMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.energy_storage.basic_strength_biology_multiblock_energy_storage.BasicStrengthBiologyMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.biology.energy_storage.basic_strength_biology_multiblock_energy_storage.BasicStrengthBiologyMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.energy_storage.basic_strength_chemistry_multiblock_energy_storage.BasicStrengthChemistryMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.chemistry.energy_storage.basic_strength_chemistry_multiblock_energy_storage.BasicStrengthChemistryMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energy_storage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.engineering.energy_storage.basic_strength_engineering_multiblock_energy_storage.BasicStrengthEngineeringMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.energy_storage.basic_strength_formal_science_multiblock_energy_storage.BasicStrengthFormalScienceMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.formal_science.energy_storage.basic_strength_formal_science_multiblock_energy_storage.BasicStrengthFormalScienceMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.energy_storage.basic_strength_geo_science_multiblock_energy_storage.BasicStrengthGeoScienceMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.geo_science.energy_storage.basic_strength_geo_science_multiblock_energy_storage.BasicStrengthGeoScienceMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.energy_storage.basic_strength_hybrid_physics_multiblock_energy_storage.BasicStrengthHybridPhysicsMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.hybrid_physics.energy_storage.basic_strength_hybrid_physics_multiblock_energy_storage.BasicStrengthHybridPhysicsMultiblockEnergyStorageMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.energy_storage.basic_strength_imitation_magic_engineering_multiblock_energy_storage.BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.imitation_magic_engineering.energy_storage.basic_strength_imitation_magic_engineering_multiblock_energy_storage.BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class DCEnergySyncS2CPacket {
    private final float energy;
    private final BlockPos pos;

    public DCEnergySyncS2CPacket(float energy, BlockPos pos) {
        this.energy = energy;
        this.pos = pos;
    }

    public DCEnergySyncS2CPacket(FriendlyByteBuf buf) {
        this.energy = buf.readFloat();
        this.pos = buf.readBlockPos();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeFloat(energy);
        buf.writeBlockPos(pos);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {

            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthAstronomyMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthAstronomyMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthBiologyMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthBiologyMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthChemistryMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthChemistryMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthEngineeringMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthEngineeringMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthFormalScienceMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthFormalScienceMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthGeoScienceMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthGeoScienceMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthHybridPhysicsMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthHybridPhysicsMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthImitationMagicEngineeringMultiblockEnergyStorageMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }

            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceAstronomicalTelescopeMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }


            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceChemicalReactorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceChemicalReactorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceCompoundPurifierBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceCompoundPurifierMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceElectrolyserBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceElectrolyserMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }



            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPowerSteamGeneratorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPowerSteamGeneratorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMachineManufacturerBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicTechnologyMachineManufacturerMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicTechnologyUniversalAssemblerMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyCircuitBuilderBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicTechnologyCircuitBuilderMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicTechnologyMachineElementProcessorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMachinePartProcessorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicTechnologyMachinePartProcessorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicTechnologyMultiblockEquipmentFabricatorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicTechnologyMultiblockEquipmentFabricatorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }






            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceMachineDataInstallerBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceMachineDataInstallerMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceDesignatedDataInjectorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceDesignatedDataInjectorMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }




            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceRockCrasherBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceRockCrasherMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }




            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceElectricArcFurnaceMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceFormingMachineBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceFormingMachineMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
        });
        return true;
    }
}
