package net.sporent.topiary.block;

import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class TopiaryBlockFamilies {
    public static final BlockFamily KAURI = BlockFamilies.register(TopiaryBlocks.KAURI_PLANKS)
            .button(TopiaryBlocks.KAURI_BUTTON)
            .door(TopiaryBlocks.KAURI_DOOR)
            .fence(TopiaryBlocks.KAURI_FENCE)
            .fenceGate(TopiaryBlocks.KAURI_FENCE_GATE)
            .pressurePlate(TopiaryBlocks.KAURI_PRESSURE_PLATE)
            .sign(TopiaryBlocks.KAURI_SIGN, TopiaryBlocks.KAURI_WALL_SIGN)
            .slab(TopiaryBlocks.KAURI_SLAB)
            .stairs(TopiaryBlocks.KAURI_STAIRS)
            .trapdoor(TopiaryBlocks.KAURI_TRAPDOOR)

            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();
}
