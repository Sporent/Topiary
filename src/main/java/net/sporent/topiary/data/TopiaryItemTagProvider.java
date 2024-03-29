package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.item.TopiaryItems;
import net.sporent.topiary.util.TopiaryTags;

import java.util.concurrent.CompletableFuture;

public class TopiaryItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TopiaryItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TopiaryTags.Items.KAURI_LOGS_BLOCKITEM)
                .add(TopiaryBlocks.KAURI_LOG.asItem())
                .add(TopiaryBlocks.STRIPPED_KAURI_LOG.asItem())
                .add(TopiaryBlocks.KAURI_WOOD.asItem())
                .add(TopiaryBlocks.STRIPPED_KAURI_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(TopiaryBlocks.KAURI_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(TopiaryTags.Items.KAURI_LOGS_BLOCKITEM);

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(TopiaryBlocks.KAURI_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(TopiaryBlocks.KAURI_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(TopiaryBlocks.KAURI_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(TopiaryBlocks.KAURI_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(TopiaryBlocks.KAURI_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(TopiaryBlocks.KAURI_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(TopiaryBlocks.KAURI_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(TopiaryBlocks.KAURI_TRAPDOOR.asItem());

    }
}
