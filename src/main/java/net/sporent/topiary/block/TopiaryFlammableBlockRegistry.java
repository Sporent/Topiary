package net.sporent.topiary.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sporent.topiary.util.TopiaryTags;

public class TopiaryFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(TopiaryTags.Blocks.KAURI_LOGS, 5, 5);
        registry.add(TopiaryBlocks.KAURI_PLANKS, 5, 20);
        registry.add(TopiaryBlocks.KAURI_LEAVES, 30, 60);

        registry.add(TopiaryBlocks.HEMLOCK, 60, 100);
        registry.add(TopiaryBlocks.TALL_HEMLOCK, 60, 100);
    }
}
