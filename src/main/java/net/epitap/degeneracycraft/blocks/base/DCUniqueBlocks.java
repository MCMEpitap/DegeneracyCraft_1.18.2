package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.SimpleTelescopeLeftPillarBlock;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.SimpleTelescopeRightPillarBlock;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.simple_telescope_core.SimpleTelescopeCoreBlock;
import net.epitap.degeneracycraft.item.DCCreativeTab;
import net.epitap.degeneracycraft.item.DCItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class DCUniqueBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Degeneracycraft.MOD_ID);

    public static final RegistryObject<Block> SIMPLE_TELESCOPE_CORE_BLOCK = registerUniqueBlock("simple_telescope_core_block",
            () -> new SimpleTelescopeCoreBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

    public static final RegistryObject<Block> SIMPLE_TELESCOPE_RIGHT_PILLAR = registerUniqueBlock("simple_telescope_right_pillar",
            () -> new SimpleTelescopeRightPillarBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);
    public static final RegistryObject<Block> SIMPLE_TELESCOPE_LEFT_PILLAR = registerUniqueBlock("simple_telescope_left_pillar",
            () -> new SimpleTelescopeLeftPillarBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).noOcclusion()), DCCreativeTab.DEGENERACYCRAFT_MACHINE_TAB);

    private static <T extends Block> RegistryObject<T> registerUniqueBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltip) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerUniqueBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerUniqueBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltip) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level level, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltip));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerUniqueBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerUniqueBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerUniqueBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerHoloUniqueBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerHoloUniqueBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerHoloUniqueBlockItem(String name, RegistryObject<T> block) {
        return DCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(0)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
