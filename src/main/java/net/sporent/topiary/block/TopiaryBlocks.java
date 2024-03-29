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
import net.sporent.topiary.world.tree.KauriSaplingGenerator;

public class TopiaryBlocks {

    //instantiating all blocks for topiary

    //kauri block set
    public static final Block KAURI_LOG = (registerBlock("kauri_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.OFF_WHITE))));
    public static final Block KAURI_WOOD = (registerBlock("kauri_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).mapColor(MapColor.OFF_WHITE))));
    public static final Block STRIPPED_KAURI_LOG = (registerBlock("stripped_kauri_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.OFF_WHITE))));
    public static final Block STRIPPED_KAURI_WOOD = (registerBlock("stripped_kauri_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.OFF_WHITE))));

    public static final Block KAURI_PLANKS = (registerBlock("kauri_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.OFF_WHITE))));

    public static final Block KAURI_FENCE = (registerBlock("kauri_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).mapColor(MapColor.OFF_WHITE))));
    public static final Block KAURI_FENCE_GATE = (registerBlock("kauri_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).mapColor(MapColor.OFF_WHITE), TopiaryWoodSets.KAURI)));

    public static final Block KAURI_SLAB = (registerBlock("kauri_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.OFF_WHITE))));
    public static final Block KAURI_STAIRS = (registerBlock("kauri_stairs",
            new StairsBlock(TopiaryBlocks.KAURI_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.OFF_WHITE))));

    public static final Block KAURI_BUTTON = (registerBlock("kauri_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).mapColor(MapColor.OFF_WHITE), TopiaryBlockSets.KAURI, 30, true)));
    public static final Block KAURI_PRESSURE_PLATE = (registerBlock("kauri_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.OFF_WHITE),
                    TopiaryBlockSets.KAURI)));

    public static final Block KAURI_DOOR = (registerBlock("kauri_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.OFF_WHITE), TopiaryBlockSets.KAURI)));
    public static final Block KAURI_TRAPDOOR = (registerBlock("kauri_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.OFF_WHITE), TopiaryBlockSets.KAURI)));

    public static final Block KAURI_SIGN = (registerBlock("kauri_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).mapColor(MapColor.OFF_WHITE), TopiaryWoodSets.KAURI)));
    public static final Block KAURI_WALL_SIGN = (registerBlock("kauri_wall_sign",
            new WallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).mapColor(MapColor.OFF_WHITE), TopiaryWoodSets.KAURI)));
    public static final Block KAURI_HANGING_SIGN = (registerBlock("kauri_hanging_sign",
            new HangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.OFF_WHITE), TopiaryWoodSets.KAURI)));
    public static final Block KAURI_WALL_HANGING_SIGN = (registerBlock("kauri_wall_hanging_sign",
            new WallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).mapColor(MapColor.OFF_WHITE), TopiaryWoodSets.KAURI)));

    public static final Block KAURI_LEAVES = (registerBlock("kauri_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES))));

    public static final Block KAURI_SAPLING = (registerBlockWithoutBlockItem("kauri_sapling",
            new SaplingBlock(new KauriSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING))));
    public static final Block POTTED_KAURI_SAPLING = (registerBlockWithoutBlockItem("potted_kauri_sapling",
            new FlowerPotBlock(TopiaryBlocks.KAURI_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING))));





    public static final Block HEMLOCK = (registerBlock("hemlock",
            new HemlockBlock()));
    public static final Block TALL_HEMLOCK = (registerBlock("tall_hemlock",
            new TallHemlockBlock(FabricBlockSettings.copyOf(Blocks.LARGE_FERN))));


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