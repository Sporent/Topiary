package net.sporent.topiary.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class HemlockBlock extends FernBlock {

    public HemlockBlock() {
        super(FabricBlockSettings.copyOf(Blocks.FERN));
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (state.isOf(TopiaryBlocks.HEMLOCK)) {
            Block tallHemlockBlock = TopiaryBlocks.TALL_HEMLOCK;
            if (state.isOf(TopiaryBlocks.HEMLOCK) && tallHemlockBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
                TallPlantBlock.placeAt(world, tallHemlockBlock.getDefaultState(), pos, 2);
            }
        }
    }
}
