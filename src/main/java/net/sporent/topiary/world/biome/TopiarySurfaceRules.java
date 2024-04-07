package net.sporent.topiary.world.biome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.sporent.topiary.world.TopiaryNoiseParameters;

public class TopiarySurfaceRules {
    public static final MaterialRules.MaterialRule PODZOL = makeStateRule(Blocks.PODZOL);

    protected static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition podzolNoise = MaterialRules.noiseThreshold(TopiaryNoiseParameters.KAURI_FOREST_SURFACE, -0.43, 0);
        MaterialRules.MaterialCondition aboveWater = MaterialRules.water(-1, 0);
        MaterialRules.MaterialCondition surfaceBlock = MaterialRules.stoneDepth(0, false, VerticalSurfaceType.FLOOR);

        MaterialRules.MaterialRule kauriRule = MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(TopiaryBiomes.KAURI_FOREST),
                MaterialRules.condition(
                        MaterialRules.surface(), MaterialRules.condition(
                                surfaceBlock, MaterialRules.condition(
                                        aboveWater, MaterialRules.condition(podzolNoise, PODZOL))))));

        return MaterialRules.sequence(kauriRule);
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block){
        return MaterialRules.block(block.getDefaultState());

    }

}
