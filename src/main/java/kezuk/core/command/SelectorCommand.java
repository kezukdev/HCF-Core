package kezuk.core.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import kezuk.core.HCF;
import kezuk.core.utils.Message;

public class SelectorCommand implements CommandExecutor {
	
	private Message message = HCF.getInstance().getObjects().getMessage();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) return false;
		if (!sender.hasPermission("hcf.selector")) {
			sender.sendMessage(message.NO_PERM);
			return false;
		}
		return false;
	}

}
