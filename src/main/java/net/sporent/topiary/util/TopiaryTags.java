package net.sporent.topiary.util;

import net.fabricmc.fabric.impl.tag.convention.TagRegistration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;

public class TopiaryTags {

    public static class Blocks {

        private static TagKey<Block> KAURI_LOGS = createTag("kauri_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Topiary.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> KAURI_LOGS_BLOCKITEM = createTag("kauri_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Topiary.MOD_ID, name));
        }
    }
}
