package net.calibermc.naturescanvas;

import com.mojang.datafixers.util.Pair;
import net.calibermc.naturescanvas.world.biomes.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class NaturesCanvasRegion extends Region {
    public NaturesCanvasRegion(int weight) {
        super(NaturesCanvas.OVERWORLD_ID, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        // Adds biomes, with generation settings similar to the Plains biome
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, AlderForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FROZEN_PEAKS, AlpineGrasslandsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FROZEN_PEAKS, AlpineLakeBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FROZEN_PEAKS, AlpineTundraBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, AshForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_BIRCH_FOREST, AspenGroveBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_BIRCH_FOREST, CedarForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.SAVANNA, ChaparralBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.SAVANNA_PLATEAU, DesertScrubBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, ElmForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, FirForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.WINDSWEPT_HILLS, HighlandsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, HornbeamForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_PINE_TAIGA, LarchForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, LindenForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, MapleForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.FOREST, MixedForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.DARK_FOREST, OakForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_PINE_TAIGA, PineForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, PrairieBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.JUNGLE, RainforestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, RedwoodForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.MANGROVE_SWAMP, SaltMarshBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.SAVANNA, ShrublandsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, SpruceForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.SAVANNA, SteppeBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.SNOWY_PLAINS, TundraBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, VolcanicPlainsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.SWAMP, WetlandsBiome.KEY);

    }
}
