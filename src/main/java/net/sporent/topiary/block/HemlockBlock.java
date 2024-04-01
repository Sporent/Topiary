package net.sporent.topiary.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FernBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class HemlockBlock extends FernBlock {

    public HemlockBlock(Settings settings) {
        super(settings);
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
