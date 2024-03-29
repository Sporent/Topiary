package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.BlockTags;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.util.TopiaryTags;

import java.util.concurrent.CompletableFuture;

public class TopiaryBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TopiaryBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TopiaryTags.Blocks.KAURI_LOGS)
                .add(TopiaryBlocks.KAURI_LOG)
                .add(TopiaryBlocks.STRIPPED_KAURI_LOG)
                .add(TopiaryBlocks.KAURI_WOOD)
                .add(TopiaryBlocks.STRIPPED_KAURI_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(TopiaryTags.Blocks.KAURI_LOGS);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(TopiaryBlocks.KAURI_SAPLING);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(TopiaryBlocks.KAURI_PLANKS);
        
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(TopiaryBlocks.KAURI_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(TopiaryBlocks.KAURI_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(TopiaryBlocks.KAURI_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(TopiaryBlocks.KAURI_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(TopiaryBlocks.KAURI_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(TopiaryBlocks.KAURI_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(TopiaryBlocks.KAURI_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(TopiaryBlocks.KAURI_TRAPDOOR);
    }
}
