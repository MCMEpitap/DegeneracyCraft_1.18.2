package net.epitap.degeneracycraft.blocks.base;

import net.epitap.degeneracycraft.Degeneracycraft;
import net.epitap.degeneracycraft.blocks.unique.basic.simple_telescope.simple_telescope_main.SimpleTelescopeCoreBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCUniqueBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Degeneracycraft.MOD_ID);


    public static final RegistryObject<BlockEntityType<SimpleTelescopeCoreBlockEntity>> SIMPLE_TELESCOPE_CORE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("simple_telescope_core_block_entity", () ->
                    BlockEntityType.Builder.of(SimpleTelescopeCoreBlockEntity::new, DCUniqueBlocks.SIMPLE_TELESCOPE_CORE_BLOCK.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
