package net.sporent.topiary.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;
import net.sporent.topiary.Topiary;

import java.util.concurrent.CompletableFuture;

public class TopiaryWorldGenerator extends FabricDynamicRegistryProvider {

    public TopiaryWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        //future world gen
    }

    @Override
    public String getName() {
        return Topiary.MOD_ID;
    }
}