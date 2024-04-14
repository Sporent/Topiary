package net.sporent.topiary;

import net.fabricmc.api.ModInitializer;

import net.sporent.topiary.block.TopiaryBlockSets;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.block.TopiaryFlammableBlockRegistry;
import net.sporent.topiary.block.TopiaryStrippableBlockRegistry;
import net.sporent.topiary.entity.TopiaryBoats;
import net.sporent.topiary.item.TopiaryItemGroups;
import net.sporent.topiary.item.TopiaryItems;
import net.sporent.topiary.world.gen.TopiaryWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Topiary implements ModInitializer {
	public static final String MOD_ID = "topiary";
	public static final Logger LOGGER = LoggerFactory.getLogger("topiary");

	@Override
	public void onInitialize() {
		TopiaryItems.register();
		TopiaryItemGroups.register();
		TopiaryBlocks.register();
		TopiaryFlammableBlockRegistry.registerFlammableBlocks();
		TopiaryStrippableBlockRegistry.registerStrippableBlocks();
		TopiaryWorldGeneration.generateWorldGen();
		TopiaryBoats.registerBoats();
	}
}