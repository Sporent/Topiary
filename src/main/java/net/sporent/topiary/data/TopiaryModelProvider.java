package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.Item;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.HemlockBlock;
import net.sporent.topiary.block.TallHemlockBlock;
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

        blockStateModelGenerator.registerSimpleCubeAll(TopiaryBlocks.KAURI_PLANKS);
        blockStateModelGenerator.registerSingleton(TopiaryBlocks.KAURI_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(TopiaryBlocks.KAURI_SAPLING, TopiaryBlocks.POTTED_KAURI_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(TopiaryBlocks.KAURI_SAPLING);

        blockStateModelGenerator.registerTintableCrossBlockState(TopiaryBlocks.HEMLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(TopiaryBlocks.HEMLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
