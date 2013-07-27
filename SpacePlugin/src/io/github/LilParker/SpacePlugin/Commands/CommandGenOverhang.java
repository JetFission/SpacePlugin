package io.github.LilParker.SpacePlugin.Commands;

import io.github.LilParker.SpacePlugin.WorldGenerators.*;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandGenOverhang extends SpacePluginCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(checkSafeCommand(sender, cmd, label, args, 1, 1, "genoverhang")){
			executeCommand(sender, args);
			return true;
		}
		return false;
	}
	
	private void executeCommand (CommandSender sender, String[] args){
		Bukkit.createWorld(WorldCreator.name(args[0]).generator(new WorldGenOverhangTest()));
		sender.sendMessage("Generated world " + args[0] + ". Used overhang terrain test.");
	}
}
