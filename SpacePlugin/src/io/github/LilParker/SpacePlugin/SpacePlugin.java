package io.github.LilParker.SpacePlugin;

import io.github.LilParker.SpacePlugin.Commands.*;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpacePlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getCommand("test").setExecutor(new CommandTest());
		getCommand("tpd").setExecutor(new CommandDimTele());
		getCommand("unload").setExecutor(new CommandUnloadWorld());
	}
}
