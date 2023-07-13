package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.util.TopiaryTags;

import java.util.List;
import java.util.function.Consumer;

public class TopiaryRecipeGenerator extends FabricRecipeProvider {
    public TopiaryRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerPlanksRecipe(exporter, TopiaryBlocks.KAURI_PLANKS, TopiaryTags.KAURI_LOGS_BLOCKITEM, 4);
        offerBarkBlockRecipe(exporter, TopiaryBlocks.KAURI_WOOD, TopiaryBlocks.KAURI_LOG);
        offerSmelting(exporter, List.of(TopiaryBlocks.KAURI_LOG, TopiaryBlocks.STRIPPED_KAURI_LOG, TopiaryBlocks.KAURI_WOOD, TopiaryBlocks.STRIPPED_KAURI_WOOD),
                RecipeCategory.MISC, Items.CHARCOAL, 0.15f, 200, "kauri");
    }
}
