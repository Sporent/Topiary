package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;
import net.sporent.topiary.block.TopiaryBlockFamilies;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.item.TopiaryItems;

public class TopiaryModelProvider extends FabricModelProvider {
    public TopiaryModelProvider(FabricDataOutput output) {
        super(output);
    }

    //generate all recipe blockstate and model json files for topiary blocks
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(TopiaryBlocks.KAURI_LOG).log(TopiaryBlocks.KAURI_LOG).wood(TopiaryBlocks.KAURI_WOOD);
        blockStateModelGenerator.registerLog(TopiaryBlocks.STRIPPED_KAURI_LOG).log(TopiaryBlocks.STRIPPED_KAURI_LOG).wood(TopiaryBlocks.STRIPPED_KAURI_WOOD);

        BlockStateModelGenerator.BlockTexturePool kauriPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TopiaryBlocks.KAURI_PLANKS);

        kauriPool.family(TopiaryBlockFamilies.KAURI);

        blockStateModelGenerator.registerHangingSign(TopiaryBlocks.STRIPPED_KAURI_LOG, TopiaryBlocks.KAURI_HANGING_SIGN, TopiaryBlocks.KAURI_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerSingleton(TopiaryBlocks.KAURI_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(TopiaryBlocks.KAURI_SAPLING, TopiaryBlocks.POTTED_KAURI_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCrossBlockState(TopiaryBlocks.HEMLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(TopiaryBlocks.HEMLOCK);
    }

    //generate all model json files for topiary items
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
