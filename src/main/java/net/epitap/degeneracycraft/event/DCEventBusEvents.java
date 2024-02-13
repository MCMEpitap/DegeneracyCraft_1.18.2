package net.epitap.degeneracycraft.event;

import net.epitap.degeneracycraft.Degeneracycraft;
//import net.epitap.degeneracycraft.recipe.PulverizerRecipe;
import net.epitap.degeneracycraft.integration.jei.Pulverization;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = Degeneracycraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DCEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@NotNull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event){

    }
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event){
        Registry.register(Registry.RECIPE_TYPE, Pulverization.Type.ID, Pulverization.Type.INSTANCE);
    }
}
