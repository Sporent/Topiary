package net.sporent.topiary.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.entity.TopiaryBoats;

public class TopiaryItems{

   public static final Item KAURI_SAPLING = registerItem("kauri_sapling",
            new BlockItem(TopiaryBlocks.KAURI_SAPLING, new FabricItemSettings()));

    public static final Item KAURI_SIGN = registerItem("kauri_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TopiaryBlocks.KAURI_SIGN, TopiaryBlocks.KAURI_WALL_SIGN));
    public static final Item KAURI_HANGING_SIGN = registerItem("kauri_hanging_sign",
            new HangingSignItem(TopiaryBlocks.KAURI_HANGING_SIGN, TopiaryBlocks.KAURI_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item KAURI_BOAT = TerraformBoatItemHelper.registerBoatItem(TopiaryBoats.KAURI_BOAT_ID, TopiaryBoats.KAURI_BOAT_KEY, false);
    public static final Item KAURI_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TopiaryBoats.KAURI_CHEST_BOAT_ID, TopiaryBoats.KAURI_BOAT_KEY, true);

    public static final Item BEANS = registerItem("beans",
            new Item(new FabricItemSettings().food(TopiaryFoodComponents.BEANS).maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Topiary.MOD_ID, name), item);
    }

    public static void register() { Topiary.LOGGER.info("Registering items for "+Topiary.MOD_ID); }
}
