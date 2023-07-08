package net.sporent.topiary.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;

public class TopiaryBlocks {

    //instantiating all blocks for topiary
    public static final PillarBlock KAURI_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.OFF_WHITE));



}