package net.sporent.topiary;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.block.TopiaryFlammableBlockRegistry;
import net.sporent.topiary.block.TopiaryStrippableBlockRegistry;
import net.sporent.topiary.item.TopiaryItemGroups;
import net.sporent.topiary.item.TopiaryItems;
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
	}
}