package io.github.LilParker.SpacePlugin;

import io.github.LilParker.SpacePlugin.Commands.*;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpacePlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getCommand("genempty").setExecutor(new CommandGenEmpty());
		getCommand("tpd").setExecutor(new CommandDimTele());
		getCommand("unload").setExecutor(new CommandUnloadWorld());
		getCommand("bbf").setExecutor(new CommandPlaceBlock());
		getCommand("load").setExecutor(new CommandLoadWorld());
	}
}
