package net.sporent.topiary.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.util.TopiaryTags;

public class TopiaryConfiguredFeatures{

    public static final RegistryKey<ConfiguredFeature<?, ?>> KAURI_KEY = registerKey("kauri");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEMPERATE_RAINFOREST_FLOWERS = registerKey("temperate_rainforest_flowers");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, KAURI_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TopiaryBlocks.KAURI_LOG),
                new GiantTrunkPlacer(5, 5, 5),
                BlockStateProvider.of(TopiaryBlocks.KAURI_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), ConstantIntProvider.create(5)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        //register(context, TEMPERATE_RAINFOREST_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(1, 1, 1, ));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Topiary.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
