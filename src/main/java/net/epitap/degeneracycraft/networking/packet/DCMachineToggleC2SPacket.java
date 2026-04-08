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
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_power_steam_generator.BasicPowerSteamGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_compression_condenser.BasicTechnologyCompressionCondenserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.BasicTechnologyElectromagneticInductorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_machine_part_processor.BasicTechnologyMachinePartProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.engineering.basic_technology_multiblock_equipment_fabricator.BasicTechnologyMultiblockEquipmentFabricatorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.formal_science.basic_performance_circuit_builder.BasicPerformanceCircuitBuilderBlockEntity;
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
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class DCMachineToggleC2SPacket {
    private final BlockPos pos;
    private final int type;

    public static final int TOGGLE_HOLOGRAM = 0;
    public static final int TOGGLE_HALT = 1;
    public static final int TOGGLE_LOCK = 2;

    public DCMachineToggleC2SPacket(FriendlyByteBuf buf) {
        this.pos = buf.readBlockPos();
        this.type = buf.readInt();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBlockPos(pos);
        buf.writeInt(type);
    }

    public DCMachineToggleC2SPacket(BlockPos pos, int type) {
        this.pos = pos;
        this.type = type;
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context ctx = supplier.get();
        ctx.enqueueWork(() -> {
            ServerPlayer player = ctx.getSender();
            if (player == null) return;

            BlockEntity blockEntity = player.level.getBlockEntity(pos);
            if (blockEntity instanceof BasicPerformanceAstronomicalTelescopeBlockEntity machine) {
                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceFineParticleAdsorberBlockEntity machine) {
                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceStarlightCollectorBlockEntity machine) {
                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceBioReactorBlockEntity machine) {
                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceCellIncubatorBlockEntity machine) {
                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceCropCultivatorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }


            if (blockEntity instanceof BasicPerformanceChemicalReactorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceCompoundPurifierBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceElectrolyserBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPowerSteamGeneratorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicTechnologyCompressionCondenserBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicTechnologyElectromagneticInductorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicTechnologyMachineElementProcessorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicTechnologyMachineManufacturerBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicTechnologyMachinePartProcessorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicTechnologyMultiblockEquipmentFabricatorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceCircuitBuilderBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceDesignatedDataInjectorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceMachineDataInstallerBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceOreSorterBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicPerformanceRockCrasherBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicPerformanceSoilPurifierBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceElectricArcFurnaceBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicPerformanceFormingMachineBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicPerformanceMaterialSeparatorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicTechnologyImitationMagicEngraverBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicTechnologySuspectedMagicCondenserBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }
            if (blockEntity instanceof BasicTechnologyVirtualSigilProcessorBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                if (type == TOGGLE_LOCK) {
                    machine.toggleInputLock();
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicTechnologyVoidWorldCoordinateRecordingMachineBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                machine.setChanged();
            }

            if (blockEntity instanceof BasicPerformanceRealityPhaseAdjustmentMachineBlockEntity machine) {

                if (type == TOGGLE_HOLOGRAM) {
                    machine.hologramLevel++;
                    if (machine.hologramLevel > 1) {
                        machine.hologramLevel = -1;
                    }
                }

                if (type == TOGGLE_HALT) {
                    machine.forceHalt = !machine.forceHalt;
                }
                machine.setChanged();
            }
        });
        return true;
    }
}
