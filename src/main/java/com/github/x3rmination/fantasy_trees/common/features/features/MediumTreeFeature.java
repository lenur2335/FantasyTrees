package com.github.x3rmination.fantasy_trees.common.features.features;

import com.github.x3rmination.fantasy_trees.common.features.configuration.TreeConfiguration;
import com.github.x3rmination.fantasy_trees.common.util.StructureUtils;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureManager;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class MediumTreeFeature extends Feature<TreeConfiguration> {

    public MediumTreeFeature(Codec<TreeConfiguration> pCodec) {
        super(pCodec);
    }

    public boolean isFeatureChunk(FeaturePlaceContext<TreeConfiguration> context, BlockPos pos) {
        BlockState topBlock = context.level().getBlockState(pos);
        return topBlock.is(BlockTags.DIRT) && StructureUtils.isChunkDry(context, pos) && StructureUtils.isChunkAreaFlat(context, 0, 8);
    }
    @Override
    public boolean place(FeaturePlaceContext<TreeConfiguration> context) {
        WorldGenLevel worldgenlevel = context.level();
        TreeConfiguration treeConfiguration = context.config();
        StructureManager structuremanager = worldgenlevel.getLevel().getServer().getStructureManager();
        int i = context.random().nextInt(treeConfiguration.trees.size());
        StructureTemplate structuretemplate = structuremanager.getOrCreate(treeConfiguration.trees.get(i));
        int x = context.origin().getX() + 3 - context.random().nextInt(6);
        int z = context.origin().getZ() + 3 - context.random().nextInt(6);
        int y = context.chunkGenerator().getFirstOccupiedHeight(x + (structuretemplate.getSize().getX()/2), z + (structuretemplate.getSize().getZ()/2), Heightmap.Types.WORLD_SURFACE_WG, context.level());
        BlockPos placePos = new BlockPos(x, y, z);
        if(!isFeatureChunk(context, placePos)) {
            return false;
        }
        placePos.offset(0, getYOffset(i), 0);
        StructurePlaceSettings settings = new StructurePlaceSettings().setRandom(context.random()).setRotationPivot(new BlockPos(structuretemplate.getSize().getX()/2, 0, structuretemplate.getSize().getZ()/2)).setRotation(Rotation.getRandom(context.random()));
        structuretemplate.placeInWorld(worldgenlevel, placePos, placePos, settings, context.random(), 4);
        return true;
    }
    public int getYOffset(int tree) {
        return switch (tree) {
            default -> 0;
        };
    }
}
