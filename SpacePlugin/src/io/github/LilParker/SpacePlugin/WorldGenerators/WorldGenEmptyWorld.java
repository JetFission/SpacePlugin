package io.github.LilParker.SpacePlugin.WorldGenerators;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class WorldGenEmptyWorld extends ChunkGenerator{
	
	Random rand = new Random();
	
	@Override
	public byte[][] generateBlockSections(World world, Random random, int x, int z, BiomeGrid biomes){
		byte[][] result = new byte[world.getMaxHeight() / 16][];
		for(x = 0; x < 16; x++){
			for(z = 0; z < 16; z++){
				if(rand.nextBoolean() == true){
					setBlock(result, x, 64, z, (byte)Material.OBSIDIAN.getId());
				}else{
					setBlock(result, x, 63, z, (byte)Material.OBSIDIAN.getId());
					setBlock(result, x, 64, z, (byte)Material.OBSIDIAN.getId());
				}
			}
		}
		return result;
	}
	
	public void setBlock(byte[][] result, int x, int y, int z, byte blkid) {
    if (result[y >> 4] == null){
    	result[y >> 4] = new byte[4096];
    	}
    result[y >> 4][((y & 0xF) << 8) | (z << 4) | x] = blkid;
    }
}
