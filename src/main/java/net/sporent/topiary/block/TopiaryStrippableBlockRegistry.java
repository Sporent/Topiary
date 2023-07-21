package net.sporent.topiary.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.sporent.topiary.util.TopiaryTags;

public class TopiaryStrippableBlockRegistry {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(TopiaryBlocks.KAURI_LOG, TopiaryBlocks.STRIPPED_KAURI_LOG);
        StrippableBlockRegistry.register(TopiaryBlocks.KAURI_WOOD, TopiaryBlocks.STRIPPED_KAURI_WOOD);
    }
}
