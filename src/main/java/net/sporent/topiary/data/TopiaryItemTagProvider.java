package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.sporent.topiary.item.TopiaryItems;
import net.sporent.topiary.util.TopiaryTags;

import java.util.concurrent.CompletableFuture;

public class TopiaryItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TopiaryItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
    }
}
