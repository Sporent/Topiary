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

        public static final TagKey<Block> KAURI_LOGS = createTag("kauri_logs");

        //public static final TagKey<Block> VERAWOOD_LOGS = createTag("verawood_logs");

        //public static final TagKey<Block> WILLOW_LOGS = createTag("willow_logs");

        //public static final TagKey<Block> COVE_LOGS = createTag("cove_logs");

        //public static final TagKey<Block> OCEANIC_LOGS = createTag("oceanic_logs");

        //public static final TagKey<Block> GRUM_LOGS = createTag("grum_logs");

        //public static final TagKey<Block> PURPLEHEART_LOGS = createTag("purpleheart_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Topiary.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> KAURI_LOGS_BLOCKITEM = createTag("kauri_logs");

        //public static final TagKey<Item> VERAWOOD_LOGS_BLOCKITEM = createTag("verawood_logs");

        //public static final TagKey<Item> WILLOW_LOGS_BLOCKITEM = createTag("willow_logs");

        //public static final TagKey<Item> COVE_LOGS_BLOCKITEM = createTag("cove_logs");

        //public static final TagKey<Item> OCEANIC_LOGS_BLOCKITEM = createTag("oceanic_logs");

        //public static final TagKey<Item> GRUM_LOGS_BLOCKITEM = createTag("grum_logs");

        //public static final TagKey<Item> PURPLEHEART_LOGS_BLOCKITEM = createTag("purpleheart_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Topiary.MOD_ID, name));
        }
    }
}
