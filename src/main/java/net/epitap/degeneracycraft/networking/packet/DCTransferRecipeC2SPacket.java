package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_astronomical_telescope.BasicPerformanceAstronomicalTelescopeBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_fine_particle_adsorber.BasicPerformanceFineParticleAdsorberBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.astronomy.basic_performance_starlight_collector.BasicPerformanceStarlightCollectorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_bio_reactor.BasicPerformanceBioReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_cell_incubator.BasicPerformanceCellIncubatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.biology.basic_performance_crop_cultivator.BasicPerformanceCropCultivatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_chemical_reactor.BasicPerformanceChemicalReactorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_compound_purifier.BasicPerformanceCompoundPurifierBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_designated_data_injector.BasicPerformanceDesignatedDataInjectorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_machine_data_installer.BasicPerformanceMachineDataInstallerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_ore_sorter.BasicPerformanceOreSorterBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_rock_crasher.BasicPerformanceRockCrasherBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.geo_science.basic_performance_soil_purifier.BasicPerformanceSoilPurifierBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_forming_machine.BasicPerformanceFormingMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.hybrid_physics.basic_performance_material_separator.BasicPerformanceMaterialSeparatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.BasicTechnologyImitationMagicEngraverBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.BasicTechnologySuspectedMagicCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.BasicTechnologyVirtualSigilProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.jenith_void_science.basic_technology_void_world_coordinate_recording_machine.BasicTechnologyVoidWorldCoordinateRecordingMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.BasicPerformanceRealityPhaseAdjustmentMachineBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.initial.redstone_powered_machine_element_manufacture_machine.RedstonePoweredMachineElementManufactureMachineBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class DCTransferRecipeC2SPacket {
    private final ResourceLocation recipeId;
    private final BlockPos pos;
    private final boolean shift;

    public DCTransferRecipeC2SPacket(BlockPos pos, ResourceLocation recipeId, boolean shift) {
        this.pos = pos;
        this.recipeId = recipeId;
        this.shift = shift;
    }

    public DCTransferRecipeC2SPacket(FriendlyByteBuf buf) {
        this.recipeId = buf.readResourceLocation();
        this.pos = buf.readBlockPos();
        this.shift = buf.readBoolean();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeResourceLocation(recipeId);
        buf.writeBlockPos(pos);
        buf.writeBoolean(shift);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer player = ctx.get().getSender();
            if (player == null) return;

            player.level.getRecipeManager().byKey(recipeId).ifPresent(recipe -> {
                if (player.level.getBlockEntity(pos) instanceof RedstonePoweredMachineElementManufactureMachineBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }



                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceAstronomicalTelescopeBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceFineParticleAdsorberBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceStarlightCollectorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }




                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceBioReactorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceCellIncubatorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceCropCultivatorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }





                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceChemicalReactorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceCompoundPurifierBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceElectrolyserBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }





                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyCompressionCondenserBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyElectromagneticInductorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }



                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyMachineElementProcessorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyMachineManufacturerBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyMachinePartProcessorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyMultiblockEquipmentFabricatorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyUniversalAssemblerBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }


                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceCircuitBuilderBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceDesignatedDataInjectorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceMachineDataInstallerBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }



                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceOreSorterBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceRockCrasherBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceSoilPurifierBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }


                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceFormingMachineBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceMaterialSeparatorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }



                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyImitationMagicEngraverBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologySuspectedMagicCondenserBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyVirtualSigilProcessorBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }



                if (player.level.getBlockEntity(pos) instanceof BasicTechnologyVoidWorldCoordinateRecordingMachineBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }



                if (player.level.getBlockEntity(pos) instanceof BasicPerformanceRealityPhaseAdjustmentMachineBlockEntity blockEntity) {
                    blockEntity.insertRecipeInputsFromPlayer(player, recipe, shift);
                }
            });
        });
        ctx.get().setPacketHandled(true);
    }

}
