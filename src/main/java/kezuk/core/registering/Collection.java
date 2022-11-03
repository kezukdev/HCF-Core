package kezuk.core.registering;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import com.google.common.collect.Lists;

import kezuk.core.factions.Factions;
import kezuk.core.player.Profile;
import kezuk.core.region.Regions;
import kezuk.core.region.subregions.EndRegions;
import kezuk.core.region.subregions.SpawnRegions;
import kezuk.core.region.subregions.WarzoneRegions;
import kezuk.core.registering.word.BlacklistedWord;
import net.minecraft.util.com.google.common.collect.Maps;

public class Collection {
	
	private List<Regions> regions;
	private HashMap<UUID, Profile> profile;
	private HashMap<UUID, Factions> factions;
	private List<String> blacklistedWord;
	
	public Collection() {
		this.regions = Arrays.asList(new SpawnRegions(), new WarzoneRegions(), new EndRegions());
		this.profile = Maps.newHashMap();
		this.factions = Maps.newHashMap();
		this.blacklistedWord = Lists.newArrayList();
		new BlacklistedWord();
	}
	
	public HashMap<UUID, Profile> getProfile() {
		return profile;
	}
	
	public HashMap<UUID, Factions> getFactions() {
		return factions;
	}
	
	public List<String> getBlacklistedWord() {
		return blacklistedWord;
	}
	
	public List<Regions> getRegions() {
		return regions;
	}
}
