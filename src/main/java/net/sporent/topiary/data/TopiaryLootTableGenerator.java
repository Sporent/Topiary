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
        addDrop(TopiaryBlocks.KAURI_PLANKS);
        addDrop(TopiaryBlocks.KAURI_FENCE);
        addDrop(TopiaryBlocks.KAURI_FENCE_GATE);
        addDrop(TopiaryBlocks.KAURI_SLAB, slabDrops(TopiaryBlocks.KAURI_SLAB));
        addDrop(TopiaryBlocks.KAURI_STAIRS);
        addDrop(TopiaryBlocks.KAURI_BUTTON);
        addDrop(TopiaryBlocks.KAURI_PRESSURE_PLATE);
        addDrop(TopiaryBlocks.KAURI_SIGN);
        addDrop(TopiaryBlocks.KAURI_HANGING_SIGN);
        addDrop(TopiaryBlocks.KAURI_DOOR, doorDrops(TopiaryBlocks.KAURI_DOOR));
        addDrop(TopiaryBlocks.KAURI_TRAPDOOR);

        addDrop(TopiaryBlocks.HEMLOCK, dropsWithShears(TopiaryBlocks.HEMLOCK));
        addDrop(TopiaryBlocks.TALL_HEMLOCK, dropsWithShears(TopiaryBlocks.TALL_HEMLOCK));

        drops(TopiaryBlocks.KAURI_SAPLING);
        addPottedPlantDrops(TopiaryBlocks.POTTED_KAURI_SAPLING);
        leavesDrops(TopiaryBlocks.KAURI_LEAVES, TopiaryBlocks.KAURI_SAPLING);
    }
}
