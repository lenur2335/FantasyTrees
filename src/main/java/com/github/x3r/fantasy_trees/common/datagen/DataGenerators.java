package com.github.x3r.fantasy_trees.common.datagen;

import com.github.x3r.fantasy_trees.FantasyTrees;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = FantasyTrees.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        dataGenerator.addProvider(new FantasyBlockStateProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new FantasyItemModelProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new FantasyLanguageProvider(dataGenerator));
        dataGenerator.addProvider(new FantasyRecipeProvider(dataGenerator));
        dataGenerator.addProvider(new FantasyLootTableProvider(dataGenerator));
        dataGenerator.addProvider(new FantasyTagProvider(dataGenerator, existingFileHelper));
    }
}
