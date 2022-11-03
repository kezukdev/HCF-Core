package kezuk.core.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import kezuk.core.HCF;
import kezuk.core.utils.ItemSerializer;
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
		final Player player = Bukkit.getServer().getPlayer(sender.getName());
		final ItemStack selectorItems = ItemSerializer.serialize(new ItemStack(Material.GOLD_HOE), ChatColor.GRAY + " » " + ChatColor.DARK_GREEN + "Corner Selector");
		player.getInventory().setItem(0, selectorItems);
		player.updateInventory();
		player.sendMessage(ChatColor.GREEN + "Vous avez reçu l'item de selection!");
		return false;
	}

}
