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
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, AlderForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, AlpineGrasslandsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, AlpineLakeBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, AlpineTundraBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, AshForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, AspenGroveBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, CedarForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, ChaparralBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, DesertScrubBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, ElmForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, FirForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, HighlandsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, HornbeamForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, LarchForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, LindenForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, MapleForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, MixedForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, OakForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, PineForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, PrairieBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, RainforestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, RedwoodForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, SaltMarshBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, ShrublandsBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, SpruceForestBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, SteppeBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, TundraBiome.KEY);
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, WetlandsBiome.KEY);

    }
}
