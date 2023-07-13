package net.sporent.topiary;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sporent.topiary.data.TopiaryLootTableGenerator;
import net.sporent.topiary.data.TopiaryModelProvider;
import net.sporent.topiary.data.TopiaryRecipeGenerator;

public class TopiaryDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TopiaryLootTableGenerator::new);
		pack.addProvider(TopiaryModelProvider::new);
		pack.addProvider(TopiaryRecipeGenerator::new);
	}
}
