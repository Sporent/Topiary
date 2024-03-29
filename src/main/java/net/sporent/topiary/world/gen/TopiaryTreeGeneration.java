package net.sporent.topiary.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.sporent.topiary.world.TopiaryPlacedFeatures;
import net.sporent.topiary.world.biome.TopiaryBiomes;

public class TopiaryTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(TopiaryBiomes.KAURI_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TopiaryPlacedFeatures.KAURI_PLACED_KEY);
    }
}
