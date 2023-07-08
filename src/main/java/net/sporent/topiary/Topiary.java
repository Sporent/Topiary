package net.sporent.topiary;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sporent.topiary.registry.TopiaryBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Topiary implements ModInitializer {
	public static final String ID = "topiary";
	public static final Logger LOGGER = LoggerFactory.getLogger("topiary");

	@Override
	public void onInitialize() {

	}
}