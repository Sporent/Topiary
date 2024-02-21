package net.sporent.topiary.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.sporent.topiary.world.TopiaryConfiguredFeatures;
import net.sporent.topiary.world.TopiaryPlacedFeatures;
import net.sporent.topiary.world.biome.TopiaryBiomes;

public class TopiaryFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(TopiaryBiomes.TEMPERATE_RAINFOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TopiaryPlacedFeatures.TEMPERATE_RAINFOREST_FLOWERS_PLACED_KEY);
    }
}
