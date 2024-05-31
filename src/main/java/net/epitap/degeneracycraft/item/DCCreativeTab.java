package net.epitap.degeneracycraft.item;

import net.epitap.degeneracycraft.blocks.base.DCBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class DCCreativeTab {
    public static final CreativeModeTab DEGENERACYCRAFT_TAB = new CreativeModeTab("degeneracycraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DCItems.GRAVITATION_INGOT.get());
        }
    };
    public static final CreativeModeTab DEGENERACYCRAFT_MACHINECOMPONENT_TAB = new CreativeModeTab("degeneracycraft_machine_components") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DCItems.IRON_GEAR.get());
        }
    };
    public static final CreativeModeTab DEGENERACYCRAFT_MACHINEPART_TAB = new CreativeModeTab("degeneracycraft_machine_parts") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DCItems.BASIC_MOTOR.get());
        }
    };

    public static final CreativeModeTab DEGENERACYCRAFT_MULTIPLIED_ORE_MATERIAL_TAB = new CreativeModeTab("degeneracycraft_multiplied_ore_material") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DCItems.BASIC_PRECISION_CAM_INSCRIBED_CIRCUIT.get());
        }
    };

    public static final CreativeModeTab DEGENERACYCRAFT_MACHINE_TAB = new CreativeModeTab("degeneracycraft_machine") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DCBlocks.UNIVERSAL_ASSEMBLER_PHASE1_BLOCK.get());
        }
    };

    public static final CreativeModeTab DEGENERACYCRAFT_ORE_TAB = new CreativeModeTab("degeneracycraft_ore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DCBlocks.OVERWORLD_GRAVITATION_ORE.get());
        }
    };


    public static final CreativeModeTab K_TAB = new CreativeModeTab("k") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.BOOK);
        }
    };

}
