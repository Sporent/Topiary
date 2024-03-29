package net.sporent.topiary.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.sporent.topiary.Topiary;

public class TopiaryBiomes {
    public static final RegistryKey<Biome> KAURI_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Topiary.MOD_ID, "kauri_forest"));
}
