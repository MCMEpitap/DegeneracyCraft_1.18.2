package net.epitap.degeneracycraft.datagen;

import com.blakebr0.cucumber.inventory.BaseItemStackHandler;
import net.epitap.degeneracycraft.Degeneracycraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Degeneracycraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DCDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new DCRecipeProvider(generator));
        generator.addProvider(new DCBlockStateProvider(generator,existingFileHelper));
        generator.addProvider(new DCItemModelProvider(generator,existingFileHelper));
        generator.addProvider(new DCLootTableProvider(generator));
        DCBlocktagProvider blockTags = new DCBlocktagProvider(generator, event.getExistingFileHelper());
        generator.addProvider(blockTags);
        generator.addProvider(new DCItemtagProvider(generator, blockTags,event.getExistingFileHelper()));
        generator.addProvider(new DCLanguageProviderEN(generator, "en_us"));
        generator.addProvider(new DCLanguageProviderJA(generator, "ja_jp"));

    }
}
