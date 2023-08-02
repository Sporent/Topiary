package net.sporent.topiary;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.sporent.topiary.data.TopiaryLootTableGenerator;
import net.sporent.topiary.data.TopiaryModelProvider;
import net.sporent.topiary.data.TopiaryRecipeGenerator;
import net.sporent.topiary.data.TopiaryWorldGenerator;
import net.sporent.topiary.world.TopiaryConfiguredFeatures;
import net.sporent.topiary.world.TopiaryPlacedFeatures;

public class TopiaryDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TopiaryLootTableGenerator::new);
		pack.addProvider(TopiaryModelProvider::new);
		pack.addProvider(TopiaryRecipeGenerator::new);
		pack.addProvider(TopiaryWorldGenerator::new);
	}



	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TopiaryConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TopiaryPlacedFeatures::bootstrap);
	}
}
