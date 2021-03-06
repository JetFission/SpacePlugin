package io.github.LilParker.SpacePlugin.Commands;

import io.github.LilParker.SpacePlugin.WorldGenerators.*;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandGenHillTest extends SpacePluginCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(checkSafeCommand(sender, cmd, label, args, 1, 1, "genhill")){
			if(Bukkit.getWorld(args[0]) == null){
				executeCommand(sender, args);
				return true;
			}else{
				sender.sendMessage("World already exists");
				return true;
			}
		}
		return false;
	}
	
	private void executeCommand(CommandSender sender, String[] args){
		Bukkit.createWorld(WorldCreator.name(args[0]).generator(new WorldGenHillTest()));
		sender.sendMessage("Generate map " + args[0] + ". Used hill terrain test.");
	}
}
