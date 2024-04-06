package net.sporent.topiary.world.biome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.sporent.topiary.block.TopiaryBlocks;

public class TopiarySurfaceRules {
    public static final MaterialRules.MaterialRule PODZOL = makeStateRule(Blocks.PODZOL);
    public static final MaterialRules.MaterialRule KAURI = makeStateRule(TopiaryBlocks.KAURI_PLANKS);

    protected static MaterialRules.MaterialRule makeRules() {
        //MaterialRules.MaterialCondition podzolNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.012, 1.7976931348623157e+308);
        //MaterialRules.MaterialCondition aboveWater = MaterialRules.water(-1, 0);
        //MaterialRules.MaterialCondition belowWater = MaterialRules.waterWithStoneDepth(-6, -1);

        //MaterialRules.MaterialRule kauriRule = MaterialRules.condition(MaterialRules.biome(TopiaryBiomes.KAURI_FOREST),
        //        MaterialRules.condition(belowWater, MaterialRules.sequence(
        //                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, PODZOL),
        //                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, PODZOL),
        //                MaterialRules.condition(MaterialRules.stoneDepth(8, true, VerticalSurfaceType.FLOOR), MaterialRules.terracottaBands())
        //        )));

        //MaterialRules.MaterialRule kauriRule = MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(TopiaryBiomes.KAURI_FOREST),
        //        MaterialRules.condition(podzolNoise, PODZOL)));

        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, KAURI), KAURI);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(TopiaryBiomes.KAURI_FOREST),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, KAURI)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, KAURI)));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block){
        return MaterialRules.block(block.getDefaultState());
    }
}
