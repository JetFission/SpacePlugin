package io.github.LilParker.SpacePlugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.*;

public class commandTest extends SpacePluginCommand implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(checkSafeCommand(sender, cmd, label, args, 1, 1, "test")){
			executeCommand (sender, args);
			return true;
		}
		return false;
	}
	
	public void executeCommand (CommandSender sender, String[] args){
		Bukkit.createWorld(WorldCreator.name(args[0]));
	}
}
