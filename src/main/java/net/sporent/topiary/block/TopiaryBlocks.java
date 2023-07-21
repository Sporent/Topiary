package net.sporent.topiary.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;

public class TopiaryBlocks {

    //instantiating all blocks for topiary
    public static final Block KAURI_LOG = (registerBlock("kauri_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.OFF_WHITE).strength(4.0f).requiresTool())));
    public static final Block KAURI_WOOD = (registerBlock("kauri_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).mapColor(MapColor.OFF_WHITE).strength(4.0f).requiresTool())));
    public static final Block STRIPPED_KAURI_LOG = (registerBlock("stripped_kauri_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.OFF_WHITE).strength(4.0f).requiresTool())));
    public static final Block STRIPPED_KAURI_WOOD = (registerBlock("stripped_kauri_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.OFF_WHITE).strength(4.0f).requiresTool())));
    public static final Block KAURI_PLANKS = (registerBlock("kauri_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE).strength(4.0f).requiresTool())));

    public static final Block KAURI_LEAVES = (registerBlock("kauri_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES))));

    public static final Block KAURI_SAPLING = (registerBlockWithoutBlockItem("kauri_sapling",
            new SaplingBlock(null, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING))));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Topiary.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
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