package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
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
                .add(TopiaryBlocks.KAURI_LOG)
                .add(TopiaryBlocks.STRIPPED_KAURI_LOG)
                .add(TopiaryBlocks.KAURI_WOOD)
                .add(TopiaryBlocks.STRIPPED_KAURI_WOOD);
    }
}
