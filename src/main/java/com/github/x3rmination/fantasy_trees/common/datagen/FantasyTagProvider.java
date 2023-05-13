package com.github.x3rmination.fantasy_trees.common.datagen;

import com.github.x3rmination.fantasy_trees.FantasyTrees;
import com.github.x3rmination.fantasy_trees.registry.BlockRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class FantasyTagProvider extends BlockTagsProvider {

    public FantasyTagProvider(DataGenerator dataGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, FantasyTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for(Block block : BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).toList()) {
            tag(BlockTags.MINEABLE_WITH_AXE).add(block);
        }
    }

    @Override
    public String getName() {
        return "Fantasy Trees Block Tags";
    }
}