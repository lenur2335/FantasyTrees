package com.github.x3rmination.fantasy_trees.common.features.configuration;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

import java.util.Map;
import java.util.Random;

public class TreeConfiguration implements FeatureConfiguration {

    public static final Codec<TreeConfiguration> CODEC = RecordCodecBuilder.create((codec) -> {
        return codec.group(
            Codec.unboundedMap(ResourceLocation.CODEC, Codec.pair(Codec.INT.fieldOf("weight").codec(), Codec.INT.fieldOf("offset").codec())).fieldOf("trees").forGetter(treeConfiguration -> {
                return treeConfiguration.trees;
            })
        ).apply(codec, TreeConfiguration::new);
    });
    public final Map<ResourceLocation, Pair<Integer, Integer>> trees;
    public TreeConfiguration(Map<ResourceLocation, Pair<Integer, Integer>> trees) {
        this.trees = trees;
    }

    public ResourceLocation getRandomTree(Random random) {
        final int[] totalWeight = {0};
        this.trees.values().forEach(integerIntegerPair -> totalWeight[0] += integerIntegerPair.getFirst());
        int targetWeight = Math.round(random.nextFloat() * totalWeight[0]);
        int accWeight = 0;
        for(ResourceLocation resourceLocation : this.trees.keySet()) {
            accWeight += this.trees.get(resourceLocation).getFirst();
            if(accWeight >= targetWeight) {
                return resourceLocation;
            }
        }
        return null;
    }
}
