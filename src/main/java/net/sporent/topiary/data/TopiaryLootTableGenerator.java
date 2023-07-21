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
        drops(TopiaryBlocks.KAURI_LOG);
        drops(TopiaryBlocks.KAURI_WOOD);
        drops(TopiaryBlocks.STRIPPED_KAURI_LOG);
        drops(TopiaryBlocks.STRIPPED_KAURI_WOOD);
        leavesDrops(TopiaryBlocks.KAURI_LEAVES, TopiaryBlocks.KAURI_LEAVES);
        drops(TopiaryBlocks.KAURI_SAPLING);
    }
}
