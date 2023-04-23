package com.github.x3rmination.fantasy_trees.registry;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.placement.*;

public class PlacedFeatureRegistry {

    public static final Holder<PlacedFeature> FANTASY_SPRUCE_MEDIUM_PLACED = PlacementUtils.register("fantasy_spruce_medium_placed",
            ConfiguredFeatureRegistry.FANTASY_SPRUCE_MEDIUM, RarityFilter.onAverageOnceEvery(2),
            CountPlacement.of(1), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), RandomOffsetPlacement.horizontal(UniformInt.of(-4, 4)));

    public static final Holder<PlacedFeature> FANTASY_OAK_SMALL_PLACED = PlacementUtils.register("fantasy_oak_small_placed",
            ConfiguredFeatureRegistry.FANTASY_OAK_SMALL, RarityFilter.onAverageOnceEvery(1),
            CountPlacement.of(3), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), InSquarePlacement.spread());

    public static final Holder<PlacedFeature> FANTASY_OAK_MEDIUM_PLACED = PlacementUtils.register("fantasy_oak_medium_placed",
            ConfiguredFeatureRegistry.FANTASY_OAK_MEDIUM, RarityFilter.onAverageOnceEvery(2),
            CountPlacement.of(1), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), RandomOffsetPlacement.horizontal(UniformInt.of(-4, 4)));

}
