package kezuk.core;

import org.bukkit.plugin.java.JavaPlugin;

import kezuk.core.registering.Collection;
import kezuk.core.registering.Objects;

public class HCF extends JavaPlugin {
	
	private static HCF instance;
	private Collection collection;
	private Objects objects;
	
	public void onEnable() {
		instance = this;
		this.collection = new Collection();
		this.objects = new Objects();
	}
	
	public Collection getCollection() {
		return collection;
	}
	
	public Objects getObjects() {
		return objects;
	}
	
	public static HCF getInstance() {
		return instance;
	}
}
