package net.sporent.topiary.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.TopiaryBlocks;

public class TopiaryItemGroups {

    //creating a Topiary tab in the creative inventory and adding all the blocks and items to it
    public static final ItemGroup TOPIARY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Topiary.MOD_ID, "kauri_sapling"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.topiary"))
                    .icon(() -> new ItemStack(TopiaryBlocks.KAURI_LOG))
                    .entries((displayContext, entries) -> {
                        entries.add(TopiaryBlocks.KAURI_LOG);
                        entries.add(TopiaryBlocks.KAURI_WOOD);
                        entries.add(TopiaryBlocks.STRIPPED_KAURI_LOG);
                        entries.add(TopiaryBlocks.STRIPPED_KAURI_WOOD);

                        entries.add(TopiaryBlocks.KAURI_PLANKS);

                        entries.add(TopiaryBlocks.KAURI_FENCE);
                        entries.add(TopiaryBlocks.KAURI_FENCE_GATE);

                        entries.add(TopiaryBlocks.KAURI_SLAB);
                        entries.add(TopiaryBlocks.KAURI_STAIRS);

                        entries.add(TopiaryBlocks.KAURI_BUTTON);
                        entries.add(TopiaryBlocks.KAURI_PRESSURE_PLATE);

                        entries.add(TopiaryBlocks.KAURI_DOOR);
                        entries.add(TopiaryBlocks.KAURI_TRAPDOOR);

                        entries.add(TopiaryItems.KAURI_SIGN);
                        entries.add(TopiaryItems.KAURI_HANGING_SIGN);

                        entries.add(TopiaryItems.KAURI_BOAT);
                        entries.add(TopiaryItems.KAURI_CHEST_BOAT);

                        entries.add(TopiaryBlocks.KAURI_LEAVES);

                        entries.add(TopiaryBlocks.KAURI_SAPLING);

                        //April fools item
                        //entries.add(TopiaryItems.BEANS);


                        entries.add(TopiaryBlocks.HEMLOCK);
                        entries.add(TopiaryBlocks.TALL_HEMLOCK);
                    }).build());

    public static void register() {
        Topiary.LOGGER.info("Registering item groups for "+Topiary.MOD_ID);
    }
}
