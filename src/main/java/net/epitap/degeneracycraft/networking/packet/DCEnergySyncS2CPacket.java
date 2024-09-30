package net.epitap.degeneracycraft.networking.packet;

import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.chemistry.basic_performance_electrolyser.BasicPerformanceElectrolyserMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.dynamic_physics.basic_performance_electric_arc_furnace.BasicPerformanceElectricArcFurnaceMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_thermal_generator.BasicPowerThermalGeneratorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_power_thermal_generator.BasicPowerThermalGeneratorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_circuit_builder.BasicTechnologyCircuitBuilderMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_element_processor.BasicTechnologyMachineElementProcessorMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_machine_manufacturer.BasicTechnologyMachineManufacturerMenu;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerBlockEntity;
import net.epitap.degeneracycraft.blocks.machine.basic.ennginnering.basic_technology_universal_assembler.BasicTechnologyUniversalAssemblerMenu;
import net.epitap.degeneracycraft.blocks.storage.basic.energystorage.basic_strength_multiblock_energy_storage.BasicStrengthMultiblockEnergyStorageBlockEntity;
import net.epitap.degeneracycraft.blocks.storage.basic.energystorage.basic_strength_multiblock_energy_storage.BasicStrengthMultiblockEnergyStorageMenu;
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

            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicStrengthMultiblockEnergyStorageBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicStrengthMultiblockEnergyStorageMenu menu &&
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
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPerformanceElectricArcFurnaceBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPerformanceElectricArcFurnaceMenu menu &&
                        menu.getBlockEntity().getBlockPos().equals(pos)) {
                    blockEntity.setEnergyLevel(energy);
                }
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicPowerThermalGeneratorBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
                if (Minecraft.getInstance().player.containerMenu instanceof BasicPowerThermalGeneratorMenu menu &&
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
        });
        return true;
    }
}
