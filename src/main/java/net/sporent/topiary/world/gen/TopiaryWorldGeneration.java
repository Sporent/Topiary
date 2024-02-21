package net.sporent.topiary.world.gen;

import net.sporent.topiary.world.TopiaryConfiguredFeatures;

public class TopiaryWorldGeneration {
    public static void generateWorldGen() {
        TopiaryTreeGeneration.generateTrees();
        TopiaryFlowerGeneration.generateFlowers();
    }
}
