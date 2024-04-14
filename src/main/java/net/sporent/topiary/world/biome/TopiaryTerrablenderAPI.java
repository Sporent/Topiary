package net.sporent.topiary.world.biome;

import net.minecraft.util.Identifier;
import net.sporent.topiary.Topiary;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class TopiaryTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new TopiaryOverworldRegion(new Identifier(Topiary.MOD_ID, "overworld"), 5));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Topiary.MOD_ID, TopiarySurfaceRules.makeRules());
    }
}
