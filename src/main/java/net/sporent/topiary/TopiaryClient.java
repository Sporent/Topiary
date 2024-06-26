package net.sporent.topiary;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.entity.TopiaryBoats;

public class TopiaryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.KAURI_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.KAURI_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.POTTED_KAURI_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.HEMLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TopiaryBlocks.TALL_HEMLOCK, RenderLayer.getCutout());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> pos != null && world != null
                ? BiomeColors.getFoliageColor(world, pos)
                : -1, TopiaryBlocks.KAURI_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x398029, TopiaryBlocks.KAURI_LEAVES);

        TerraformBoatClientHelper.registerModelLayers(TopiaryBoats.KAURI_BOAT_ID, false);
    }
}
