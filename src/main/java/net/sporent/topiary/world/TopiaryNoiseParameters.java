package net.sporent.topiary.world;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.sporent.topiary.Topiary;

public class TopiaryNoiseParameters {
    public static final RegistryKey<DoublePerlinNoiseSampler.NoiseParameters> KAURI_FOREST_SURFACE = RegistryKey.of(RegistryKeys.NOISE_PARAMETERS,
            new Identifier(Topiary.MOD_ID, "kauri_forest_surface"));

}
