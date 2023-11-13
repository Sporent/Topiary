package net.sporent.topiary.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class TallHemlockBlock extends TallPlantBlock implements Fertilizable {
    public static final IntProperty STAGE = IntProperty.of("stage", 0, 1);

    public TallHemlockBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(STAGE, 0).with(HALF, DoubleBlockHalf.LOWER));
    }

    public int getStage(BlockState state) {
        return state.get(STAGE);
    }

    public DoubleBlockHalf getHalf(BlockState state) {
        return state.get(HALF);
    }

    public IntProperty getStageProperty() {
        return STAGE;
    }

    public EnumProperty<DoubleBlockHalf> getHalfProperty() {
        return HALF;
    }

    public BlockState withStates(int stage, DoubleBlockHalf half) {
        return this.getDefaultState().with(this.getStageProperty(), stage).with(this.getHalfProperty(), half);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STAGE, HALF);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return this.getStage(state)<1;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {

        int stage = this.getStage(state) + 1;
        DoubleBlockHalf doubleBlockHalf = state.get(HALF);

        if (this.getStage(state) + 1 > 1) {
            stage = 3;
        }

        world.setBlockState(pos, this.withStates(stage, doubleBlockHalf));

        if (doubleBlockHalf.equals(DoubleBlockHalf.UPPER)) {
            world.setBlockState(pos.down(), this.withStates(stage, DoubleBlockHalf.LOWER));
        } else if (doubleBlockHalf.equals(DoubleBlockHalf.LOWER)) {
            world.setBlockState(pos.up(), this.withStates(stage, DoubleBlockHalf.UPPER));
        }
    }
}
