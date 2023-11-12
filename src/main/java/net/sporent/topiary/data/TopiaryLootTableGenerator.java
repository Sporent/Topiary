package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.sporent.topiary.block.TopiaryBlocks;

public class TopiaryLootTableGenerator extends FabricBlockLootTableProvider {
    public TopiaryLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(TopiaryBlocks.KAURI_LOG);
        addDrop(TopiaryBlocks.KAURI_WOOD);
        addDrop(TopiaryBlocks.STRIPPED_KAURI_LOG);
        addDrop(TopiaryBlocks.STRIPPED_KAURI_WOOD);
        leavesDrops(TopiaryBlocks.KAURI_LEAVES, TopiaryBlocks.KAURI_SAPLING);
        drops(TopiaryBlocks.KAURI_SAPLING);
    }
}
