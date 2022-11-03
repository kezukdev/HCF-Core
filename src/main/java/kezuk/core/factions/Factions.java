package kezuk.core.factions;

import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;

import com.google.common.collect.Lists;

import kezuk.core.HCF;
import kezuk.core.registering.Collection;

public class Factions {
	
	private Collection collection = HCF.getInstance().getCollection();
	
	private UUID factionsUUID;
	private String name;
	private UUID leader;
	private List<UUID> coLeader = Lists.newArrayList();
	private List<UUID> captain = Lists.newArrayList();
	private List<UUID> members = Lists.newArrayList();
	private List<Location> claim = Lists.newArrayList();

	public Factions(final UUID uuid, final String name) {
		if (collection.getBlacklistedWord().contains(name)) {
			Bukkit.getPlayer(uuid).sendMessage(ChatColor.GRAY + " » " + ChatColor.GREEN + "Le nom de votre faction n'est pas appropriée!");
			return;
		}
		for (Factions faction : collection.getFactions().values()) {
			if (name == faction.getName()) {
				Bukkit.getPlayer(uuid).sendMessage(ChatColor.GRAY + " » " + ChatColor.GREEN + "Le nom indiqué n'est plus disponible!");
				return;
			}
		}
		this.factionsUUID = UUID.randomUUID();
		this.name = name;
		this.leader = uuid;
		Bukkit.getPlayer(uuid).sendMessage(ChatColor.GRAY + " » " + ChatColor.GREEN + "Vous avez bien créer votre faction!");
		Bukkit.broadcastMessage(ChatColor.GRAY + " [" + ChatColor.DARK_GREEN + "!" + ChatColor.GRAY + "] " + ChatColor.WHITE + Bukkit.getPlayer(uuid).getName() + " a créer la faction " + ChatColor.WHITE + name);
	}
	
	public Factions() {
		
	}
	
	public String getName() {
		return name;
	}
}
