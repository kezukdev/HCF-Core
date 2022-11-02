package kezuk.core;

import org.bukkit.plugin.java.JavaPlugin;

import kezuk.core.registering.Collection;

public class HCF extends JavaPlugin {
	
	private static HCF instance;
	private Collection collection;
	
	public void onEnable() {
		instance = this;
		this.collection = new Collection();
	}
	
	public Collection getCollection() {
		return collection;
	}
	
	public static HCF getInstance() {
		return instance;
	}
}
