package net.calibermc.naturescanvas;

import net.calibermc.naturescanvas.world.ModBiomes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class NaturesCanvas implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "naturescanvas";

    // Identifier for the TerraBlender region (naturescanvas:overworld)
    public static final Identifier OVERWORLD_ID = new Identifier(MOD_ID, "overworld");

    @Override
    public void onInitialize() {
        // Registers biomes to Minecraft registry
        ModBiomes.register();
    }

    @Override
    public void onTerraBlenderInitialized() {
        // Registers our TerraBlender region to TerraBlender
        Regions.register(new NaturesCanvasRegion(3));
    }
}