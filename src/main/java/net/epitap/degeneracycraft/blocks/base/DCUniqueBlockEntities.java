package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.simple_telescope_main.SimpleTelescopeMainBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCUniqueBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Degeneracycraft.MOD_ID);


    public static final RegistryObject<BlockEntityType<SimpleTelescopeMainBlockEntity>> SIMPLE_TELESCOPE_MAIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("simple_telescope_main_block_entity", () ->
                    BlockEntityType.Builder.of(SimpleTelescopeMainBlockEntity::new, DCUniqueBlocks.SIMPLE_TELESCOPE_MAIN_BLOCK.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
