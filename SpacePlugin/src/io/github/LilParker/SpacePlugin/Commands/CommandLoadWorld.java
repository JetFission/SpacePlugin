package io.github.LilParker.SpacePlugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.*;

public class CommandLoadWorld extends SpacePluginCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(checkSafeCommand(sender, cmd, label, args, 1, 1, "load")){
			if(Bukkit.getWorld(args[0]) != null){
				executeCommand (sender, args);
			}else{
				sender.sendMessage("No world by that name");
				return true;
			}
		}
		return false;
	}
	
	public void executeCommand (CommandSender sender, String[] args) {
		WorldCreator wc = new WorldCreator(args[0]);
		Bukkit.createWorld(wc);
		sender.sendMessage("Loaded " + args[0]);
	}
}
