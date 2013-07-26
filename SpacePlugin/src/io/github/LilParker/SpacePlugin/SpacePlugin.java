package io.github.LilParker.SpacePlugin;

import io.github.LilParker.SpacePlugin.Commands.*;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpacePlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getCommand("test").setExecutor(new commandTest());
		getCommand("tpd").setExecutor(new commandDimTele());
		getCommand("unload").setExecutor(new commandUnloadWorld());
	}
}
