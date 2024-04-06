package net.sporent.topiary.block;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;

public class TopiaryWoodSets {
    public static final WoodType KAURI = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "kauri"), TopiaryBlockSets.KAURI);
    //public static final WoodType VERAWOOD = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "verawood"), TopiaryBlockSets.VERAWOOD);
    //public static final WoodType WILLOW = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "willow"), TopiaryBlockSets.WILLOW);
    //public static final WoodType COVE = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "cove"), TopiaryBlockSets.COVE);
    //public static final WoodType OCEANIC = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "oceanic"), TopiaryBlockSets.OCEANIC);
    //public static final WoodType GRUM = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "grum"), TopiaryBlockSets.GRUM);
    //public static final WoodType PURPLEHEART = new WoodTypeBuilder().register(new Identifier(Topiary.MOD_ID, "purpleheart"), TopiaryBlockSets.PURPLEHEART);
}

