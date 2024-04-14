package net.sporent.topiary.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;
import net.sporent.topiary.block.TopiaryBlocks;
import net.sporent.topiary.item.TopiaryItems;

public class TopiaryBoats {
    public static final Identifier KAURI_BOAT_ID = new Identifier(Topiary.MOD_ID, "kauri_boat");
    public static final Identifier KAURI_CHEST_BOAT_ID = new Identifier(Topiary.MOD_ID, "kauri_chest_boat");

    public static final RegistryKey<TerraformBoatType> KAURI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(KAURI_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType kauriBoat = new TerraformBoatType.Builder()
                .item(TopiaryItems.KAURI_BOAT)
                .chestItem(TopiaryItems.KAURI_CHEST_BOAT)
                .planks(TopiaryBlocks.KAURI_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, KAURI_BOAT_KEY, kauriBoat);
    }
}
