package io.github.LilParker.SpacePlugin.WorldGenerators;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class WorldGenEmptyWorld extends ChunkGenerator{
	
	@Override
	public byte[][] generateBlockSections(World world, Random random, int x, int z, BiomeGrid biomes){
		byte[][] result = new byte[world.getMaxHeight() / 16][];
		return result;
	}
}
