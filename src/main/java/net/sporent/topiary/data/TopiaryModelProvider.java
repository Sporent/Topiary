package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.item.TopiaryItems;

public class TopiaryModelProvider extends FabricModelProvider {
    public TopiaryModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(TopiaryBlocks.KAURI_LOG).log(TopiaryBlocks.KAURI_LOG).wood(TopiaryBlocks.KAURI_WOOD);
        blockStateModelGenerator.registerLog(TopiaryBlocks.STRIPPED_KAURI_LOG).log(TopiaryBlocks.STRIPPED_KAURI_LOG).wood(TopiaryBlocks.STRIPPED_KAURI_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(TopiaryBlocks.KAURI_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TopiaryItems.KAURI_SAPLING, Models.GENERATED);
    }
}
