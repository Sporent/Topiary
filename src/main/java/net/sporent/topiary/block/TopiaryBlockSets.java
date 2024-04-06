package net.sporent.topiary.block;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;

public class TopiaryBlockSets {
    public static final BlockSetType KAURI = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "kauri"));
    //public static final BlockSetType VERAWOOD = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "verawood"));
    //public static final BlockSetType WILLOW = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "willow"));
    //public static final BlockSetType COVE = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "cove"));
    //public static final BlockSetType OCEANIC = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "oceanic"));
    //public static final BlockSetType GRUM = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "grum"));
    //public static final BlockSetType PURPLEHEART = new BlockSetTypeBuilder().register(new Identifier(Topiary.MOD_ID, "purpleheart"));
}
