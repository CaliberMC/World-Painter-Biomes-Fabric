package net.calibermc.naturescanvas.world;

import net.calibermc.naturescanvas.world.biomes.*;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ModBiomes {

    public static void register() {
        // Registers biomes to Minecraft registry
        Registry.register(BuiltinRegistries.BIOME, AlderForestBiome.KEY.getValue(), AlderForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, AlpineGrasslandsBiome.KEY.getValue(), AlpineGrasslandsBiome.create());
        Registry.register(BuiltinRegistries.BIOME, AlpineLakeBiome.KEY.getValue(), AlpineLakeBiome.create());
        Registry.register(BuiltinRegistries.BIOME, AlpineTundraBiome.KEY.getValue(), AlpineTundraBiome.create());
        Registry.register(BuiltinRegistries.BIOME, AshForestBiome.KEY.getValue(), AshForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, AspenGroveBiome.KEY.getValue(), AspenGroveBiome.create());
        Registry.register(BuiltinRegistries.BIOME, BeechForestBiome.KEY.getValue(), BeechForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, CedarForestBiome.KEY.getValue(), CedarForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, ChaparralBiome.KEY.getValue(), ChaparralBiome.create());
        Registry.register(BuiltinRegistries.BIOME, DesertScrubBiome.KEY.getValue(), DesertScrubBiome.create());
        Registry.register(BuiltinRegistries.BIOME, ElmForestBiome.KEY.getValue(), ElmForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, FirForestBiome.KEY.getValue(), FirForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, HighlandsBiome.KEY.getValue(), HighlandsBiome.create());
        Registry.register(BuiltinRegistries.BIOME, HornbeamForestBiome.KEY.getValue(), HornbeamForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, LarchForestBiome.KEY.getValue(), LarchForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, LindenForestBiome.KEY.getValue(), LindenForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, MapleForestBiome.KEY.getValue(), MapleForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, MixedForestBiome.KEY.getValue(), MixedForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, OakForestBiome.KEY.getValue(), OakForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, PineForestBiome.KEY.getValue(), PineForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, PrairieBiome.KEY.getValue(), PrairieBiome.create());
        Registry.register(BuiltinRegistries.BIOME, RainforestBiome.KEY.getValue(), RainforestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, RedwoodForestBiome.KEY.getValue(), RedwoodForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, SaltMarshBiome.KEY.getValue(), SaltMarshBiome.create());
        Registry.register(BuiltinRegistries.BIOME, ShrublandsBiome.KEY.getValue(), ShrublandsBiome.create());
        Registry.register(BuiltinRegistries.BIOME, SpruceForestBiome.KEY.getValue(), SpruceForestBiome.create());
        Registry.register(BuiltinRegistries.BIOME, SteppeBiome.KEY.getValue(), SteppeBiome.create());
        Registry.register(BuiltinRegistries.BIOME, TundraBiome.KEY.getValue(), TundraBiome.create());
        Registry.register(BuiltinRegistries.BIOME, WetlandsBiome.KEY.getValue(), WetlandsBiome.create());
    }

    public static void addPlainsFeatures(SpawnSettings.Builder spawnSettings, GenerationSettings.Builder generationSettings) {
        // All of the generation features copied from the Plains biome
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addAmethystGeodes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addPlainsTallGrass(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addPlainsFeatures(generationSettings);
        DefaultBiomeFeatures.addDefaultMushrooms(generationSettings);
        DefaultBiomeFeatures.addDefaultVegetation(generationSettings);
        DefaultBiomeFeatures.addPlainsMobs(spawnSettings);
    }
}
