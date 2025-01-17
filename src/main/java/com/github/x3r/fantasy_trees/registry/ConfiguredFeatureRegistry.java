package com.github.x3r.fantasy_trees.registry;

import com.github.x3r.fantasy_trees.FantasyTrees;
import com.github.x3r.fantasy_trees.common.features.TreeConfiguration;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

import java.util.Map;

public class ConfiguredFeatureRegistry {

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_ACACIA_SMALL_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_acacia_small_1"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_acacia_small_2"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_acacia_small_3"), new Pair<>(5, 0))
    );

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_BIRCH_SMALL_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_1"), new Pair<>(15, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_2"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_3"), new Pair<>(15, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_4"), new Pair<>(5, -3)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_5"), new Pair<>(15, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_6"), new Pair<>(2, -3)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_7"), new Pair<>(15, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_8"), new Pair<>(15, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_9"), new Pair<>(15, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_small_10"), new Pair<>(15, 0))

    );

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_BIRCH_MEDIUM_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_medium_1"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_medium_2"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_medium_3"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_birch_medium_4"), new Pair<>(5, -4))
    );

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_OAK_SMALL_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_1"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_2"), new Pair<>(1, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_3"), new Pair<>(5, -3)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_4"), new Pair<>(1, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_5"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_6"), new Pair<>(5,-2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_small_7"), new Pair<>(5, -3))
    );

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_JUNGLE_SMALL_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_jungle_small_1"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_jungle_small_2"), new Pair<>(5, -2))
    );

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_JUNGLE_MEDIUM_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_jungle_medium_1"), new Pair<>(4, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_jungle_medium_2"), new Pair<>(4, 0))
    );

    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_OAK_MEDIUM_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_medium_1"), new Pair<>(4, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_medium_2"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_medium_3"), new Pair<>(15, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_medium_4"), new Pair<>(15, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_oak_medium_5"), new Pair<>(15, -2))
    );
    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_SPRUCE_SMALL_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_small_1"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_small_2"), new Pair<>(5, -3)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_small_3"), new Pair<>(5, 0))
    );
    public static final Map<ResourceLocation, Pair<Integer, Integer>> FANTASY_SPRUCE_MEDIUM_LIST = Map.ofEntries(
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_1"), new Pair<>(5, -2)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_2"), new Pair<>(5, -3)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_3"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_4"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_5"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_6"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_7"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_8"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_9"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_10"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_11"), new Pair<>(5, 0)),
            Map.entry(new ResourceLocation(FantasyTrees.MOD_ID, "fantasy_spruce_medium_12"), new Pair<>(5, 0))
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_ACACIA_SMALL = FeatureUtils.register(
            "fantasy_acacia_small",
            FeatureRegistry.FANTASY_ACACIA_SMALL.get(),
            new TreeConfiguration(FANTASY_ACACIA_SMALL_LIST));
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_BIRCH_SMALL = FeatureUtils.register(
            "fantasy_birch_small",
            FeatureRegistry.FANTASY_BIRCH_SMALL.get(),
            new TreeConfiguration(FANTASY_BIRCH_SMALL_LIST));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_BIRCH_MEDIUM = FeatureUtils.register(
            "fantasy_birch_medium",
            FeatureRegistry.FANTASY_BIRCH_MEDIUM.get(),
            new TreeConfiguration(FANTASY_BIRCH_MEDIUM_LIST));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_OAK_SMALL = FeatureUtils.register(
            "fantasy_oak_small",
            FeatureRegistry.FANTASY_OAK_SMALL.get(),
            new TreeConfiguration(FANTASY_OAK_SMALL_LIST));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_OAK_MEDIUM = FeatureUtils.register(
            "fantasy_oak_medium",
            FeatureRegistry.FANTASY_OAK_MEDIUM.get(),
            new TreeConfiguration(FANTASY_OAK_MEDIUM_LIST));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_JUNGLE_SMALL = FeatureUtils.register(
            "fantasy_jungle_small",
            FeatureRegistry.FANTASY_JUNGLE_SMALL.get(),
            new TreeConfiguration(FANTASY_JUNGLE_SMALL_LIST));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_JUNGLE_MEDIUM = FeatureUtils.register(
            "fantasy_jungle_medium",
            FeatureRegistry.FANTASY_JUNGLE_MEDIUM.get(),
            new TreeConfiguration(FANTASY_JUNGLE_MEDIUM_LIST));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_SPRUCE_SMALL = FeatureUtils.register(
            "fantasy_spruce_small",
            FeatureRegistry.FANTASY_SPRUCE_SMALL.get(),
            new TreeConfiguration(FANTASY_SPRUCE_SMALL_LIST));
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANTASY_SPRUCE_MEDIUM = FeatureUtils.register(
            "fantasy_spruce_medium",
            FeatureRegistry.FANTASY_SPRUCE_MEDIUM.get(),
            new TreeConfiguration(FANTASY_SPRUCE_MEDIUM_LIST));

    //------

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FANTASY_FOREST_GRASS = FeatureUtils.register(
            "fantasy_forest_grass",
            FeatureRegistry.FANTASY_FOREST_GRASS.get(),
            FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.TALL_GRASS.defaultBlockState(), 1).add(Blocks.FERN.defaultBlockState(), 1).build()))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FANTASY_VANILLA_FLOWERS = FeatureUtils.register(
            "fantasy_vanilla_flowers",
            FeatureRegistry.FANTASY_VANILLA_FLOWERS.get(),
            FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, flowerBlockConfiguration()));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FANTASY_FLOWERS = FeatureUtils.register(
            "fantasy_flowers",
            FeatureRegistry.FANTASY_FLOWERS.get(),
            FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockRegistry.FANTASY_FLOWER.get()))));

    private static SimpleBlockConfiguration flowerBlockConfiguration() {
        SimpleWeightedRandomList.Builder<BlockState> list = SimpleWeightedRandomList.builder();
        list.add(Blocks.DANDELION.defaultBlockState(), 1);
        list.add(Blocks.POPPY.defaultBlockState(), 1);
        list.add(Blocks.BLUE_ORCHID.defaultBlockState(), 1);
        list.add(Blocks.ALLIUM.defaultBlockState(), 1);
        list.add(Blocks.AZURE_BLUET.defaultBlockState(), 1);
        list.add(Blocks.RED_TULIP.defaultBlockState(), 1);
        list.add(Blocks.ORANGE_TULIP.defaultBlockState(), 1);
        list.add(Blocks.WHITE_TULIP.defaultBlockState(), 1);
        list.add(Blocks.PINK_TULIP.defaultBlockState(), 1);
        list.add(Blocks.OXEYE_DAISY.defaultBlockState(), 1);
        list.add(Blocks.BROWN_MUSHROOM.defaultBlockState(), 1);
        list.add(Blocks.RED_MUSHROOM.defaultBlockState(), 1);
        list.add(Blocks.SUNFLOWER.defaultBlockState(), 1);
        list.add(Blocks.LILAC.defaultBlockState(), 1);
        list.add(Blocks.ROSE_BUSH.defaultBlockState(), 1);
        list.add(Blocks.PEONY.defaultBlockState(), 1);
        list.add(Blocks.CORNFLOWER.defaultBlockState(), 1);
        list.add(Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), 1);
        list.build();
        return new SimpleBlockConfiguration(new WeightedStateProvider(list));
    }
}
