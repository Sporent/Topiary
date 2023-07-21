package net.sporent.topiary.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.TopiaryBlocks;

public class TopiaryItems{

    public static Item KAURI_SAPLING = registerItem("kauri_sapling",
            new BlockItem(TopiaryBlocks.KAURI_SAPLING, new FabricItemSettings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Topiary.MOD_ID, name), item);
    }

    public static void register() { Topiary.LOGGER.info("Registering items for "+Topiary.MOD_ID); }
}
