package com.github.x3rmination.fantasy_trees.registry;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.world.level.levelgen.placement.*;

public class PlacedFeatureRegistry {

    public static final Holder<PlacedFeature> FANTASY_SPRUCE_MEDIUM_PLACED = PlacementUtils.register("fantasy_spruce_medium_placed",
            ConfiguredFeatureRegistry.FANTASY_SPRUCE_MEDIUM, RarityFilter.onAverageOnceEvery(1),
            CountPlacement.of(1), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> FANTASY_OAK_SMALL_PLACED = PlacementUtils.register("fantasy_oak_small_placed",
            ConfiguredFeatureRegistry.FANTASY_OAK_SMALL, CountPlacement.of(BiasedToBottomInt.of(2, 5)), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> FANTASY_OAK_MEDIUM_PLACED = PlacementUtils.register("fantasy_oak_medium_placed",
            ConfiguredFeatureRegistry.FANTASY_OAK_MEDIUM, RarityFilter.onAverageOnceEvery(3),
            CountPlacement.of(1), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

}
