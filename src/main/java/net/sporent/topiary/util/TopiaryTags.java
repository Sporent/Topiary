package net.sporent.topiary.util;

import net.fabricmc.fabric.impl.tag.convention.TagRegistration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;

public class TopiaryTags {

    public static final TagKey<Block> KAURI_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("topiary", "kauri_logs"));
    public static final TagKey<Item> KAURI_LOGS_BLOCKITEM = TagKey.of(RegistryKeys.ITEM, new Identifier("topiary", "kauri_logs"));

    public static class Blocks {



    }

    public static class Items {

    }
}
