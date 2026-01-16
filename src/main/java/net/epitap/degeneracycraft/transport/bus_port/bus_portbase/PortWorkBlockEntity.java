package net.epitap.degeneracycraft.transport.bus_port.bus_portbase;

import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.bus.BasicPerformanceAstronomicalTelescopeBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.bus.BasicPerformanceAstronomicalTelescopeBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_astronomical_telescope.port.BasicPerformanceAstronomicalTelescopePortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.bus.BasicPerformanceFineParticleAdsorberBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.bus.BasicPerformanceFineParticleAdsorberBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_fine_particle_adsorber.port.BasicPerformanceFineParticleAdsorberPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.bus.BasicPerformanceStarlightCollectorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.bus.BasicPerformanceStarlightCollectorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.astronomy.basic_performance_starlight_collector.port.BasicPerformanceStarlightCollectorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.bus.BasicPerformanceBioReactorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.bus.BasicPerformanceBioReactorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_bio_reactor.port.BasicPerformanceBioReactorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_cell_incubator.bus.BasicPerformanceCellIncubatorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_cell_incubator.bus.BasicPerformanceCellIncubatorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_cell_incubator.port.BasicPerformanceCellIncubatorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.bus.BasicPerformanceCropCultivatorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.bus.BasicPerformanceCropCultivatorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.biology.basic_performance_crop_cultivator.port.BasicPerformanceCropCultivatorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.bus.BasicPerformanceChemicalReactorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.bus.BasicPerformanceChemicalReactorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_chemical_reactor.port.BasicPerformanceChemicalReactorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.bus.BasicPerformanceCompoundPurifierBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.bus.BasicPerformanceCompoundPurifierBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_compound_purifier.port.BasicPerformanceCompoundPurifierPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.bus.BasicPerformanceElectrolyserBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.bus.BasicPerformanceElectrolyserBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.chemistry.basic_performance_electrolyser.port.BasicPerformanceElectrolyserPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_power_steam_generator.bus.BasicPowerSteamGeneratorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_power_steam_generator.bus.BasicPowerSteamGeneratorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_power_steam_generator.port.BasicPowerSteamGeneratorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.bus.BasicTechnologyCompressionCondenserBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.bus.BasicTechnologyCompressionCondenserBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_compression_condenser.port.BasicTechnologyCompressionCondenserPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.bus.BasicTechnologyElectromagneticInductorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.bus.BasicTechnologyElectromagneticInductorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.dynamic_energetics.basic_technology_electromagnetic_inductor.port.BasicTechnologyElectromagneticInductorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.bus.BasicTechnologyMachineElementProcessorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.bus.BasicTechnologyMachineElementProcessorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_element_processor.port.BasicTechnologyMachineElementProcessorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.bus.BasicTechnologyMachineManufacturerBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_manufacturer.port.BasicTechnologyMachineManufacturerPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.bus.BasicTechnologyMachinePartProcessorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.bus.BasicTechnologyMachinePartProcessorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_machine_part_processor.port.BasicTechnologyMachinePartProcessorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.bus.BasicTechnologyMultiblockEquipmentFabricatorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.bus.BasicTechnologyMultiblockEquipmentFabricatorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.engineering.basic_technology_multiblock_equipment_fabricator.port.BasicTechnologyMultiblockEquipmentFabricatorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.bus.BasicPerformanceCircuitBuilderBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.bus.BasicPerformanceCircuitBuilderBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_circuit_builder.port.BasicPerformanceCircuitBuilderPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.bus.BasicPerformanceDesignatedDataInjectorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.bus.BasicPerformanceDesignatedDataInjectorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_designated_data_injector.port.BasicPerformanceDesignatedDataInjectorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.bus.BasicPerformanceMachineDataInstallerBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.bus.BasicPerformanceMachineDataInstallerBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.formal_science.basic_performance_machine_data_installer.port.BasicPerformanceMachineDataInstallerPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.bus.BasicPerformanceOreSorterBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.bus.BasicPerformanceOreSorterBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_ore_sorter.port.BasicPerformanceOreSorterPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.bus.BasicPerformanceRockCrasherBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.bus.BasicPerformanceRockCrasherBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_rock_crasher.port.BasicPerformanceRockCrasherPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.bus.BasicPerformanceSoilPurifierBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.bus.BasicPerformanceSoilPurifierBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.geo_science.basic_performance_soil_purifier_block.port.BasicPerformanceSoilPurifierPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.bus.BasicPerformanceElectricArcFurnaceBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.bus.BasicPerformanceElectricArcFurnaceBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_electric_arc_furnace.port.BasicPerformanceElectricArcFurnacePortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.bus.BasicPerformanceFormingMachineBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.bus.BasicPerformanceFormingMachineBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_forming_machine.port.BasicPerformanceFormingMachinePortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.bus.BasicPerformanceMaterialSeparatorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.bus.BasicPerformanceMaterialSeparatorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.hybrid_physics.basic_performance_material_separator.port.BasicPerformanceMaterialSeparatorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.bus.BasicTechnologyImitationMagicEngraverBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.bus.BasicTechnologyImitationMagicEngraverBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_imitation_magic_engraver.port.BasicTechnologyImitationMagicEngraverPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.bus.BasicTechnologySuspectedMagicCondenserBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.bus.BasicTechnologySuspectedMagicCondenserBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_suspected_magic_condenser.port.BasicTechnologySuspectedMagicCondenserPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.bus.BasicTechnologyVirtualSigilProcessorBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.bus.BasicTechnologyVirtualSigilProcessorBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.imitation_magic_engineering.basic_technology_virtual_sigil_processor.port.BasicTechnologyVirtualSigilProcessorPortType;
import net.epitap.degeneracycraft.transport.bus_port.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.bus.BasicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorage;
import net.epitap.degeneracycraft.transport.bus_port.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.bus.BasicPerformanceRealityPhaseAdjustmentMachineBusType;
import net.epitap.degeneracycraft.transport.bus_port.basic.kaleidoscopic_reality_science.basic_performance_reality_phase_adjustment_machine.port.BasicPerformanceRealityPhaseAdjustmentMachinePortType;
import net.epitap.degeneracycraft.transport.bus_port.parametor.PortItemHandler;
import net.epitap.degeneracycraft.transport.bus_port.parametor.PortSetLazyOptional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PortWorkBlockEntity extends PortBlockEntityBase {

    protected PortTypeBase<?>[] portType;
    protected final int[][] index;
    protected PortSetLazyOptional<PortItemHandler> itemStored;

    protected PortSetLazyOptional<BasicPerformanceAstronomicalTelescopeBusEnergyStorage> basicPerformanceAstronomicalTelescopeBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceFineParticleAdsorberBusEnergyStorage> basicPerformanceFineParticleAdsorberBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceStarlightCollectorBusEnergyStorage> basicPerformanceStarlightCollectorBusEnergyStorageStored;

    protected PortSetLazyOptional<BasicPerformanceBioReactorBusEnergyStorage> basicPerformanceBioReactorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceCellIncubatorBusEnergyStorage> basicPerformanceCellIncubatorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceCropCultivatorBusEnergyStorage> basicPerformanceCropCultivatorBusEnergyStorageStored;


    protected PortSetLazyOptional<BasicPerformanceChemicalReactorBusEnergyStorage> basicPerformanceChemicalReactorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceCompoundPurifierBusEnergyStorage> basicPerformanceCompoundPurifierBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceElectrolyserBusEnergyStorage> basicPerformanceElectrolyserBusEnergyStorageStored;


    protected PortSetLazyOptional<BasicPowerSteamGeneratorBusEnergyStorage> basicPowerSteamGeneratorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologyCompressionCondenserBusEnergyStorage> basicTechnologyCompressionCondenserBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologyElectromagneticInductorBusEnergyStorage> basicTechnologyElectromagneticInductorBusEnergyStorageStored;



    protected PortSetLazyOptional<BasicTechnologyMachineManufacturerBusEnergyStorage> basicTechnologyMachineManufacturerBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologyMachineElementProcessorBusEnergyStorage> basicTechnologyMachineElementProcessorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologyMachinePartProcessorBusEnergyStorage> basicTechnologyMachinePartProcessorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologyMultiblockEquipmentFabricatorBusEnergyStorage> basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored;



    protected PortSetLazyOptional<BasicPerformanceCircuitBuilderBusEnergyStorage> basicPerformanceCircuitBuilderBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceDesignatedDataInjectorBusEnergyStorage> basicPerformanceDesignatedDataInjectorBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceMachineDataInstallerBusEnergyStorage> basicPerformanceMachineDataInstallerBusEnergyStorageStored;



    protected PortSetLazyOptional<BasicPerformanceOreSorterBusEnergyStorage> basicPerformanceOreSorterBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceRockCrasherBusEnergyStorage> basicPerformanceRockCrasherBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceSoilPurifierBusEnergyStorage> basicPerformanceSoilPurifierBusEnergyStorageStored;


    protected PortSetLazyOptional<BasicPerformanceElectricArcFurnaceBusEnergyStorage> basicPerformanceElectricArcFurnaceBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceFormingMachineBusEnergyStorage> basicPerformanceFormingMachineBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicPerformanceMaterialSeparatorBusEnergyStorage> basicPerformanceMaterialSeparatorBusEnergyStorageStored;



    protected PortSetLazyOptional<BasicTechnologyImitationMagicEngraverBusEnergyStorage> basicTechnologyImitationMagicEngraverBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologySuspectedMagicCondenserBusEnergyStorage> basicTechnologySuspectedMagicCondenserBusEnergyStorageStored;
    protected PortSetLazyOptional<BasicTechnologyVirtualSigilProcessorBusEnergyStorage> basicTechnologyVirtualSigilProcessorBusEnergyStorageStored;




    protected PortSetLazyOptional<BasicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorage> basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored;

    private int recursionDepth;


    public PortWorkBlockEntity(BlockEntityType<?> blockEntityType, PortTypeBase<?>[] portType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
        this.portType = portType;
        index = new int[Direction.values().length][portType.length];
        itemStored = new PortSetLazyOptional<>();


        basicPerformanceAstronomicalTelescopeBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceFineParticleAdsorberBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceStarlightCollectorBusEnergyStorageStored = new PortSetLazyOptional<>();



        basicPerformanceBioReactorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceCellIncubatorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceCropCultivatorBusEnergyStorageStored = new PortSetLazyOptional<>();



        basicPerformanceChemicalReactorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceCompoundPurifierBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceElectrolyserBusEnergyStorageStored = new PortSetLazyOptional<>();



        basicPowerSteamGeneratorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologyCompressionCondenserBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologyElectromagneticInductorBusEnergyStorageStored = new PortSetLazyOptional<>();



        basicTechnologyMachineManufacturerBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologyMachineElementProcessorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologyMachinePartProcessorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored = new PortSetLazyOptional<>();



        basicPerformanceCircuitBuilderBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceDesignatedDataInjectorBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceMachineDataInstallerBusEnergyStorageStored = new PortSetLazyOptional<>();

        basicPerformanceOreSorterBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceRockCrasherBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceSoilPurifierBusEnergyStorageStored = new PortSetLazyOptional<>();



        basicPerformanceElectricArcFurnaceBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceFormingMachineBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicPerformanceMaterialSeparatorBusEnergyStorageStored = new PortSetLazyOptional<>();


        basicTechnologyImitationMagicEngraverBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologySuspectedMagicCondenserBusEnergyStorageStored = new PortSetLazyOptional<>();
        basicTechnologyVirtualSigilProcessorBusEnergyStorageStored = new PortSetLazyOptional<>();






        basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored = new PortSetLazyOptional<>();

    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (remove) {
            return super.getCapability(cap, side);
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceAstronomicalTelescopeBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceAstronomicalTelescopeBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceAstronomicalTelescopePortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceFineParticleAdsorberBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceFineParticleAdsorberBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceFineParticleAdsorberPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceStarlightCollectorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceStarlightCollectorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceStarlightCollectorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }



        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceBioReactorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceBioReactorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceBioReactorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceCellIncubatorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceCellIncubatorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceCellIncubatorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceCropCultivatorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceCropCultivatorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceCropCultivatorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }



        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceChemicalReactorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceChemicalReactorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceChemicalReactorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceCompoundPurifierBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceCompoundPurifierBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceCompoundPurifierPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceElectrolyserBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceElectrolyserBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceElectrolyserPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }


        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPowerSteamGeneratorBusType.INSTANCE)) {
            if (side != null) {
                return basicPowerSteamGeneratorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPowerSteamGeneratorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyCompressionCondenserBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyCompressionCondenserBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyCompressionCondenserPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyElectromagneticInductorBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyElectromagneticInductorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyElectromagneticInductorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }







        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyMachineManufacturerBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyMachineElementProcessorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachineElementProcessorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyMachinePartProcessorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMachinePartProcessorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyMultiblockEquipmentFabricatorBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyMultiblockEquipmentFabricatorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }




        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceCircuitBuilderBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceCircuitBuilderBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceCircuitBuilderPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceDesignatedDataInjectorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceDesignatedDataInjectorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceDesignatedDataInjectorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceMachineDataInstallerBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceMachineDataInstallerBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceMachineDataInstallerPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }


        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceOreSorterBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceOreSorterBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceOreSorterPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceRockCrasherBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceRockCrasherBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceRockCrasherPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceSoilPurifierBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceSoilPurifierBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceSoilPurifierPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }



        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceElectricArcFurnaceBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceElectricArcFurnaceBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceElectricArcFurnacePortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceFormingMachineBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceFormingMachineBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceFormingMachinePortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceMaterialSeparatorBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceMaterialSeparatorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceMaterialSeparatorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }



        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyImitationMagicEngraverBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyImitationMagicEngraverBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyImitationMagicEngraverPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologySuspectedMagicCondenserBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologySuspectedMagicCondenserBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologySuspectedMagicCondenserPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        if (cap == CapabilityEnergy.ENERGY && hasType(BasicTechnologyVirtualSigilProcessorBusType.INSTANCE)) {
            if (side != null) {
                return basicTechnologyVirtualSigilProcessorBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicTechnologyVirtualSigilProcessorPortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }





        if (cap == CapabilityEnergy.ENERGY && hasType(BasicPerformanceRealityPhaseAdjustmentMachineBusType.INSTANCE)) {
            if (side != null) {
                return basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored.get(side).cast();
            }
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && hasType(BasicPerformanceRealityPhaseAdjustmentMachinePortType.INSTANCE)) {
            if (side != null) {
                return itemStored.get(side).cast();
            }
        }
        return super.getCapability(cap, side);
    }

    public boolean hasType(PortTypeBase<?> type) {
        for (PortTypeBase<?> t : portType) {
            if (t == type) {
                return true;
            }
        }
        return false;
    }

    public int get3dData(Direction direction, PortTypeBase<?> portType) {
        return index[direction.get3DDataValue()][getIndex(portType)];
    }

    public void set3dData(Direction direction, PortTypeBase<?> portType, int value) {
        index[direction.get3DDataValue()][getIndex(portType)] = value;
    }

    public PortTypeBase<?>[] getPortTypes() {
        return portType;
    }

    public int getIndex(PortTypeBase<?> portType) {
        for (int i = 0; i < getPortTypes().length; i++) {
            PortTypeBase<?> type = getPortTypes()[i];
            if (type == portType) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void tick() {
        super.tick();

        if (level.isClientSide) {
            return;
        }

        for (PortTypeBase<?> type : getPortTypes()) {
            type.tick(this);
        }


        if (hasType(BasicPerformanceAstronomicalTelescopeBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceAstronomicalTelescopeBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceAstronomicalTelescopeBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceFineParticleAdsorberBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceFineParticleAdsorberBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceFineParticleAdsorberBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceStarlightCollectorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceStarlightCollectorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceStarlightCollectorBusEnergyStorage::tick);
                }
            }
        }



        if (hasType(BasicPerformanceBioReactorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceBioReactorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceBioReactorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceCellIncubatorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceCellIncubatorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceCellIncubatorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceCropCultivatorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceCropCultivatorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceCropCultivatorBusEnergyStorage::tick);
                }
            }
        }



        if (hasType(BasicPerformanceChemicalReactorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceChemicalReactorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceChemicalReactorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceCompoundPurifierBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceCompoundPurifierBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceCompoundPurifierBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceElectrolyserBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceElectrolyserBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceElectrolyserBusEnergyStorage::tick);
                }
            }
        }



        if (hasType(BasicPowerSteamGeneratorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPowerSteamGeneratorBusEnergyStorageStored.get(side).ifPresent(BasicPowerSteamGeneratorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyCompressionCondenserBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyCompressionCondenserBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyCompressionCondenserBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyElectromagneticInductorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyElectromagneticInductorBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyElectromagneticInductorBusEnergyStorage::tick);
                }
            }
        }



        if (hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyMachineManufacturerBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyMachineManufacturerBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyMachineElementProcessorBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyMachineElementProcessorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyMachinePartProcessorBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyMachinePartProcessorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyMultiblockEquipmentFabricatorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyMultiblockEquipmentFabricatorBusEnergyStorage::tick);
                }
            }
        }


        if (hasType(BasicPerformanceCircuitBuilderBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceCircuitBuilderBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceCircuitBuilderBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceDesignatedDataInjectorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceDesignatedDataInjectorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceDesignatedDataInjectorBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceMachineDataInstallerBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceMachineDataInstallerBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceMachineDataInstallerBusEnergyStorage::tick);
                }
            }
        }


        if (hasType(BasicPerformanceOreSorterBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceOreSorterBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceOreSorterBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceRockCrasherBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceRockCrasherBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceRockCrasherBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceSoilPurifierBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceSoilPurifierBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceSoilPurifierBusEnergyStorage::tick);
                }
            }
        }



        if (hasType(BasicPerformanceElectricArcFurnaceBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceElectricArcFurnaceBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceElectricArcFurnaceBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceFormingMachineBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceFormingMachineBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceFormingMachineBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicPerformanceMaterialSeparatorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceMaterialSeparatorBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceMaterialSeparatorBusEnergyStorage::tick);
                }
            }
        }


        if (hasType(BasicTechnologyImitationMagicEngraverBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyImitationMagicEngraverBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyImitationMagicEngraverBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologySuspectedMagicCondenserBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologySuspectedMagicCondenserBusEnergyStorageStored.get(side).ifPresent(BasicTechnologySuspectedMagicCondenserBusEnergyStorage::tick);
                }
            }
        }
        if (hasType(BasicTechnologyVirtualSigilProcessorBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicTechnologyVirtualSigilProcessorBusEnergyStorageStored.get(side).ifPresent(BasicTechnologyVirtualSigilProcessorBusEnergyStorage::tick);
                }
            }
        }







        if (hasType(BasicPerformanceRealityPhaseAdjustmentMachineBusType.INSTANCE)) {
            for (Direction side : Direction.values()) {
                if (portExtracting(side)) {
                    basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored.get(side).ifPresent(BasicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorage::tick);
                }
            }
        }


    }

    @Override
    public void setPortExtracting(Direction side, boolean extracting) {
        super.setPortExtracting(side, extracting);

        if (hasType(BasicPerformanceAstronomicalTelescopeBusType.INSTANCE)) {
            basicPerformanceAstronomicalTelescopeBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceAstronomicalTelescopeBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceAstronomicalTelescopePortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceFineParticleAdsorberBusType.INSTANCE)) {
            basicPerformanceFineParticleAdsorberBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceFineParticleAdsorberBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceFineParticleAdsorberPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceStarlightCollectorBusType.INSTANCE)) {
            basicPerformanceStarlightCollectorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceStarlightCollectorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceStarlightCollectorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPerformanceBioReactorBusType.INSTANCE)) {
            basicPerformanceBioReactorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceBioReactorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceBioReactorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceCellIncubatorBusType.INSTANCE)) {
            basicPerformanceCellIncubatorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceCellIncubatorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceCellIncubatorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceCropCultivatorBusType.INSTANCE)) {
            basicPerformanceCropCultivatorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceCropCultivatorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceCropCultivatorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPerformanceChemicalReactorBusType.INSTANCE)) {
            basicPerformanceChemicalReactorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceChemicalReactorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceChemicalReactorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceCompoundPurifierBusType.INSTANCE)) {
            basicPerformanceCompoundPurifierBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceCompoundPurifierBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceCompoundPurifierPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceElectrolyserBusType.INSTANCE)) {
            basicPerformanceElectrolyserBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceElectrolyserBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceElectrolyserPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPowerSteamGeneratorBusType.INSTANCE)) {
            basicPowerSteamGeneratorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPowerSteamGeneratorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPowerSteamGeneratorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyCompressionCondenserBusType.INSTANCE)) {
            basicTechnologyCompressionCondenserBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyCompressionCondenserBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyCompressionCondenserPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyElectromagneticInductorBusType.INSTANCE)) {
            basicTechnologyElectromagneticInductorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyElectromagneticInductorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyElectromagneticInductorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }




        if (hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            basicTechnologyMachineManufacturerBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyMachineManufacturerBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            basicTechnologyMachineElementProcessorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyMachineElementProcessorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachineElementProcessorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            basicTechnologyMachinePartProcessorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyMachinePartProcessorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMachinePartProcessorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMultiblockEquipmentFabricatorBusType.INSTANCE)) {
            basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyMultiblockEquipmentFabricatorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyMultiblockEquipmentFabricatorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }


        if (hasType(BasicPerformanceCircuitBuilderBusType.INSTANCE)) {
            basicPerformanceCircuitBuilderBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceCircuitBuilderBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceCircuitBuilderPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceDesignatedDataInjectorBusType.INSTANCE)) {
            basicPerformanceDesignatedDataInjectorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceDesignatedDataInjectorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceDesignatedDataInjectorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceMachineDataInstallerBusType.INSTANCE)) {
            basicPerformanceMachineDataInstallerBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceMachineDataInstallerBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceMachineDataInstallerPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPerformanceOreSorterBusType.INSTANCE)) {
            basicPerformanceOreSorterBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceOreSorterBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceOreSorterPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceRockCrasherBusType.INSTANCE)) {
            basicPerformanceRockCrasherBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceRockCrasherBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceRockCrasherPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceSoilPurifierBusType.INSTANCE)) {
            basicPerformanceSoilPurifierBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceSoilPurifierBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceSoilPurifierPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPerformanceElectricArcFurnaceBusType.INSTANCE)) {
            basicPerformanceElectricArcFurnaceBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceElectricArcFurnaceBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceElectricArcFurnacePortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceFormingMachineBusType.INSTANCE)) {
            basicPerformanceFormingMachineBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceFormingMachineBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceFormingMachinePortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceMaterialSeparatorBusType.INSTANCE)) {
            basicPerformanceMaterialSeparatorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceMaterialSeparatorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceMaterialSeparatorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicTechnologyImitationMagicEngraverBusType.INSTANCE)) {
            basicTechnologyImitationMagicEngraverBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyImitationMagicEngraverBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyImitationMagicEngraverPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologySuspectedMagicCondenserBusType.INSTANCE)) {
            basicTechnologySuspectedMagicCondenserBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologySuspectedMagicCondenserBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologySuspectedMagicCondenserPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyVirtualSigilProcessorBusType.INSTANCE)) {
            basicTechnologyVirtualSigilProcessorBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicTechnologyVirtualSigilProcessorBusEnergyStorage(this, storage));
        }
        if (hasType(BasicTechnologyVirtualSigilProcessorPortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }






        if (hasType(BasicPerformanceRealityPhaseAdjustmentMachineBusType.INSTANCE)) {
            basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored.revalidate(side, storage -> extracting, (storage) -> new BasicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorage(this, storage));
        }
        if (hasType(BasicPerformanceRealityPhaseAdjustmentMachinePortType.INSTANCE)) {
            itemStored.revalidate(side, storage -> extracting, (storage) -> PortItemHandler.INSTANCE);
        }


    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (hasType(BasicPerformanceAstronomicalTelescopeBusType.INSTANCE)) {
            basicPerformanceAstronomicalTelescopeBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceAstronomicalTelescopeBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceAstronomicalTelescopePortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceFineParticleAdsorberBusType.INSTANCE)) {
            basicPerformanceFineParticleAdsorberBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceFineParticleAdsorberBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceFineParticleAdsorberPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceStarlightCollectorBusType.INSTANCE)) {
            basicPerformanceStarlightCollectorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceStarlightCollectorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceStarlightCollectorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPerformanceBioReactorBusType.INSTANCE)) {
            basicPerformanceBioReactorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceBioReactorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceBioReactorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceCellIncubatorBusType.INSTANCE)) {
            basicPerformanceCellIncubatorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceCellIncubatorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceCellIncubatorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceCropCultivatorBusType.INSTANCE)) {
            basicPerformanceCropCultivatorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceCropCultivatorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceCropCultivatorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }




        if (hasType(BasicPerformanceChemicalReactorBusType.INSTANCE)) {
            basicPerformanceChemicalReactorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceChemicalReactorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceChemicalReactorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceCompoundPurifierBusType.INSTANCE)) {
            basicPerformanceCompoundPurifierBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceCompoundPurifierBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceCompoundPurifierPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceElectrolyserBusType.INSTANCE)) {
            basicPerformanceElectrolyserBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceElectrolyserBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceElectrolyserPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPowerSteamGeneratorBusType.INSTANCE)) {
            basicPowerSteamGeneratorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPowerSteamGeneratorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPowerSteamGeneratorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyCompressionCondenserBusType.INSTANCE)) {
            basicTechnologyCompressionCondenserBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyCompressionCondenserBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyCompressionCondenserPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyElectromagneticInductorBusType.INSTANCE)) {
            basicTechnologyElectromagneticInductorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyElectromagneticInductorBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyElectromagneticInductorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }






        if (hasType(BasicTechnologyMachineManufacturerBusType.INSTANCE)) {
            basicTechnologyMachineManufacturerBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyMachineManufacturerBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachineManufacturerPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachineElementProcessorBusType.INSTANCE)) {
            basicTechnologyMachineElementProcessorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyMachineElementProcessorBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachineElementProcessorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMachinePartProcessorBusType.INSTANCE)) {
            basicTechnologyMachinePartProcessorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyMachinePartProcessorBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMachinePartProcessorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyMultiblockEquipmentFabricatorBusType.INSTANCE)) {
            basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyMultiblockEquipmentFabricatorBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyMultiblockEquipmentFabricatorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }


        if (hasType(BasicPerformanceCircuitBuilderBusType.INSTANCE)) {
            basicPerformanceCircuitBuilderBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceCircuitBuilderBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceCircuitBuilderPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceDesignatedDataInjectorBusType.INSTANCE)) {
            basicPerformanceDesignatedDataInjectorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceDesignatedDataInjectorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceDesignatedDataInjectorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceMachineDataInstallerBusType.INSTANCE)) {
            basicPerformanceMachineDataInstallerBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceMachineDataInstallerBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceMachineDataInstallerPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }


        if (hasType(BasicPerformanceOreSorterBusType.INSTANCE)) {
            basicPerformanceOreSorterBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceOreSorterBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceOreSorterPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceRockCrasherBusType.INSTANCE)) {
            basicPerformanceRockCrasherBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceRockCrasherBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceRockCrasherPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceSoilPurifierBusType.INSTANCE)) {
            basicPerformanceSoilPurifierBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceSoilPurifierBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceSoilPurifierPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }



        if (hasType(BasicPerformanceElectricArcFurnaceBusType.INSTANCE)) {
            basicPerformanceElectricArcFurnaceBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceElectricArcFurnaceBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceElectricArcFurnacePortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceFormingMachineBusType.INSTANCE)) {
            basicPerformanceFormingMachineBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceFormingMachineBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceFormingMachinePortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicPerformanceMaterialSeparatorBusType.INSTANCE)) {
            basicPerformanceMaterialSeparatorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceMaterialSeparatorBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceMaterialSeparatorPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }




        if (hasType(BasicTechnologyImitationMagicEngraverBusType.INSTANCE)) {
            basicTechnologyImitationMagicEngraverBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyImitationMagicEngraverBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologyImitationMagicEngraverPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologySuspectedMagicCondenserBusType.INSTANCE)) {
            basicTechnologySuspectedMagicCondenserBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologySuspectedMagicCondenserBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologySuspectedMagicCondenserPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
        if (hasType(BasicTechnologyVirtualSigilProcessorBusType.INSTANCE)) {
            basicTechnologyVirtualSigilProcessorBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicTechnologyVirtualSigilProcessorBusEnergyStorage(this, side));
        }
        if (hasType(BasicTechnologySuspectedMagicCondenserPortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }






        if (hasType(BasicPerformanceRealityPhaseAdjustmentMachineBusType.INSTANCE)) {
            basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored.revalidate(this::portExtracting, (side) -> new BasicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorage(this, side));
        }
        if (hasType(BasicPerformanceRealityPhaseAdjustmentMachinePortType.INSTANCE)) {
            itemStored.revalidate(this::portExtracting, (side) -> PortItemHandler.INSTANCE);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag compound) {
        super.saveAdditional(compound);
    }

    public List<Connection> getSortedConnections(Direction side, PortTypeBase portType) {
        return getConnection().stream().sorted(Comparator.comparingInt(Connection::distance)).collect(Collectors.toList());
    }

    @Override
    public void setRemoved() {
        itemStored.invalidate();

        basicPerformanceAstronomicalTelescopeBusEnergyStorageStored.invalidate();
        basicPerformanceFineParticleAdsorberBusEnergyStorageStored.invalidate();
        basicPerformanceStarlightCollectorBusEnergyStorageStored.invalidate();



        basicPerformanceBioReactorBusEnergyStorageStored.invalidate();
        basicPerformanceCellIncubatorBusEnergyStorageStored.invalidate();
        basicPerformanceCropCultivatorBusEnergyStorageStored.invalidate();



        basicPerformanceChemicalReactorBusEnergyStorageStored.invalidate();
        basicPerformanceCompoundPurifierBusEnergyStorageStored.invalidate();
        basicPerformanceElectrolyserBusEnergyStorageStored.invalidate();



        basicPowerSteamGeneratorBusEnergyStorageStored.invalidate();
        basicTechnologyCompressionCondenserBusEnergyStorageStored.invalidate();
        basicTechnologyElectromagneticInductorBusEnergyStorageStored.invalidate();



        basicTechnologyMachineManufacturerBusEnergyStorageStored.invalidate();
        basicTechnologyMachineElementProcessorBusEnergyStorageStored.invalidate();
        basicTechnologyMachinePartProcessorBusEnergyStorageStored.invalidate();
        basicTechnologyMultiblockEquipmentFabricatorBusEnergyStorageStored.invalidate();


        basicPerformanceCircuitBuilderBusEnergyStorageStored.invalidate();
        basicPerformanceDesignatedDataInjectorBusEnergyStorageStored.invalidate();
        basicPerformanceMachineDataInstallerBusEnergyStorageStored.invalidate();


        basicPerformanceOreSorterBusEnergyStorageStored.invalidate();
        basicPerformanceRockCrasherBusEnergyStorageStored.invalidate();
        basicPerformanceSoilPurifierBusEnergyStorageStored.invalidate();


        basicPerformanceElectricArcFurnaceBusEnergyStorageStored.invalidate();
        basicPerformanceFormingMachineBusEnergyStorageStored.invalidate();
        basicPerformanceMaterialSeparatorBusEnergyStorageStored.invalidate();


        basicTechnologyImitationMagicEngraverBusEnergyStorageStored.invalidate();
        basicTechnologySuspectedMagicCondenserBusEnergyStorageStored.invalidate();
        basicTechnologyVirtualSigilProcessorBusEnergyStorageStored.invalidate();





        basicPerformanceRealityPhaseAdjustmentMachineBusEnergyStorageStored.invalidate();
        super.setRemoved();
    }

    @Override
    public boolean canPortInsertMode(BlockEntity blockentity, Direction direction) {
        for (PortTypeBase<?> type : portType) {
            if (type.canImport(blockentity, direction)) {
                return true;
            }
        }
        return false;
    }

    public boolean pushRecursion() {
        if (recursionDepth >= 1) {
            return true;
        }
        recursionDepth++;
        return false;
    }

    public void popRecursion() {
        recursionDepth--;
    }
}
