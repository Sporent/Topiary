package net.sporent.topiary.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.sporent.topiary.Topiary;

public class TopiaryBiomes {
    public static final RegistryKey<Biome> TEMPERATE_RAINFOREST = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Topiary.MOD_ID, "temperate_rainforest"));
}
