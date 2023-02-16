package com.github.x3rmination.fantasy_trees.common.features.features;

import com.github.x3rmination.fantasy_trees.common.features.configuration.FSpruceMediumConfiguration;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureManager;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class FSpruceMediumFeature extends Feature<FSpruceMediumConfiguration> {

    public FSpruceMediumFeature(Codec<FSpruceMediumConfiguration> pCodec) {
        super(pCodec);
    }

    public static boolean isFeatureChunk(FeaturePlaceContext<FSpruceMediumConfiguration> context) {
        BlockPos pos = context.origin();
        WorldGenLevel worldgenlevel = context.level();
        int landHeight = context.chunkGenerator().getFirstOccupiedHeight(pos.getX(), pos.getZ(), Heightmap.Types.WORLD_SURFACE_WG, worldgenlevel);
        NoiseColumn column = context.chunkGenerator().getBaseColumn(pos.getX(), pos.getZ(), worldgenlevel);
        BlockState topBlock = column.getBlock(landHeight);
        return topBlock.getFluidState().isEmpty();
    }
    @Override
    public boolean place(FeaturePlaceContext<FSpruceMediumConfiguration> pContext) {
        WorldGenLevel worldgenlevel = pContext.level();
        FSpruceMediumConfiguration treeConfiguration = pContext.config();
        StructureManager structuremanager = worldgenlevel.getLevel().getServer().getStructureManager();
        int i = pContext.random().nextInt(treeConfiguration.trees.size());
        StructureTemplate structuretemplate = structuremanager.getOrCreate(treeConfiguration.trees.get(i));
        int x = pContext.origin().getX() - (structuretemplate.getSize().getX() / 2);
        int z = pContext.origin().getZ() - (structuretemplate.getSize().getZ() / 2);
        int y = pContext.origin().getY();
        if(!isFeatureChunk(pContext)) {
            return false;
        }
        BlockPos placePos = new BlockPos(x, y, z);
        structuretemplate.placeInWorld(worldgenlevel, placePos, placePos, new StructurePlaceSettings(), pContext.random(), 4);
        //for testing
        worldgenlevel.setBlock(pContext.origin(), Blocks.REDSTONE_BLOCK.defaultBlockState(), 4);
        return true;
    }
}
