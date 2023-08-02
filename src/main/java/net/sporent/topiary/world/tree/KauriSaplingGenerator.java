package net.sporent.topiary.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.sporent.topiary.world.TopiaryConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class KauriSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return TopiaryConfiguredFeatures.KAURI_KEY;
    }
}
