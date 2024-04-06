package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.util.TopiaryTags;

import java.util.function.Consumer;

public class TopiaryRecipeGenerator extends FabricRecipeProvider {
    public TopiaryRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    //generate all recipe json files for topiary
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerPlanksRecipe(exporter, TopiaryBlocks.KAURI_PLANKS, TopiaryTags.Items.KAURI_LOGS_BLOCKITEM, 4);
        offerBarkBlockRecipe(exporter, TopiaryBlocks.KAURI_WOOD, TopiaryBlocks.KAURI_LOG);
        offerBarkBlockRecipe(exporter, TopiaryBlocks.STRIPPED_KAURI_WOOD, TopiaryBlocks.STRIPPED_KAURI_LOG);

        createFenceRecipe(TopiaryBlocks.KAURI_FENCE, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        createFenceGateRecipe(TopiaryBlocks.KAURI_FENCE_GATE, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, TopiaryBlocks.KAURI_SLAB, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        createStairsRecipe(TopiaryBlocks.KAURI_STAIRS, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        offerSingleOutputShapelessRecipe(exporter, TopiaryBlocks.KAURI_BUTTON, TopiaryBlocks.KAURI_PLANKS, "kauri");

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, TopiaryBlocks.KAURI_PRESSURE_PLATE, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter); //button recipe

        createDoorRecipe(TopiaryBlocks.KAURI_DOOR, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        createTrapdoorRecipe(TopiaryBlocks.KAURI_TRAPDOOR, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        createSignRecipe(TopiaryBlocks.KAURI_SIGN, Ingredient.ofItems(TopiaryBlocks.KAURI_PLANKS))
                .criterion("has_kauri_planks", conditionsFromItem(TopiaryBlocks.KAURI_PLANKS))
                .offerTo(exporter);

        offerHangingSignRecipe(exporter, TopiaryBlocks.KAURI_HANGING_SIGN, TopiaryBlocks.STRIPPED_KAURI_LOG);

    }
}
