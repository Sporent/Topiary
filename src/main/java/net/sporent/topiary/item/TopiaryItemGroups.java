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

                        entries.add(TopiaryBlocks.KAURI_LEAVES);
                        entries.add(TopiaryBlocks.KAURI_SAPLING);
                    }).build());

    public static void register() {
        Topiary.LOGGER.info("Registering item groups for "+Topiary.MOD_ID);
    }


}
