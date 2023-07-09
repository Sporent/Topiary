package net.sporent.topiary.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;

public class TopiaryBlocks {

    //instantiating all blocks for topiary
    public static final PillarBlock KAURI_LOG = (registerPillarBlock("kauri_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.OFF_WHITE))));
    public static final Block KAURI_PLANKS = (registerBlock("kauri_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE))));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Topiary.MOD_ID, name), block);
    }

    private static PillarBlock registerPillarBlock(String name, PillarBlock block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Topiary.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Topiary.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void register() { Topiary.LOGGER.info("Registering blocks for "+Topiary.MOD_ID); }
}