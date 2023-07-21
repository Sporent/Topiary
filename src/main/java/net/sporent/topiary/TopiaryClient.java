package net.sporent.topiary;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.sporent.topiary.block.TopiaryBlocks;

public class TopiaryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.KAURI_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.KAURI_SAPLING, RenderLayer.getCutout());
    }
}
