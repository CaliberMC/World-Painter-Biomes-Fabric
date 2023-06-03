package net.calibermc.naturescanvas.world.biomes;

import net.calibermc.naturescanvas.NaturesCanvas;
import net.calibermc.naturescanvas.world.ModBiomeEffects;
import net.calibermc.naturescanvas.world.ModBiomes;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;

public class DesertScrubBiome {
    public static final RegistryKey<Biome> KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(NaturesCanvas.MOD_ID, "desert_scrub"));

    public static Biome create() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        ModBiomes.addPlainsFeatures(spawnSettings, generationSettings);

        // Here you alter all of the biome's settings.
        // All of the colors are in hexadecimal ARGB format,
        // and alpha is ignored so you can leave it at 00.
        // For example, setting the color to 0x00FF0000 is the same as rgb(255, 0, 0).
        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(ModBiomeEffects.WARM_TEMPERATURE + .5f) //Default is 1.2f
                .downfall(ModBiomeEffects.WARM_DOWNFALL - .1f) //Default is 0.2f
                .effects(new BiomeEffects.Builder()
                        .waterColor(ModBiomeEffects.WARM_WATER_COLOR)
                        .skyColor(ModBiomeEffects.WARM_SKY_COLOR)
                        .grassColor(ModBiomeEffects.DESERT_SCRUB_GRASS_COLOR)
                        .fogColor(ModBiomeEffects.WARM_FOG_COLOR)
                        .waterFogColor(ModBiomeEffects.WARM_WATER_FOG_COLOR)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(null)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }
}
