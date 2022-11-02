package kezuk.core.registering;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import kezuk.core.player.Profile;
import kezuk.core.region.Regions;
import kezuk.core.region.subregions.EndRegions;
import kezuk.core.region.subregions.SpawnRegions;
import kezuk.core.region.subregions.WarzoneRegions;
import net.minecraft.util.com.google.common.collect.Maps;

public class Collection {
	
	private List<Regions> regions;
	private HashMap<UUID, Profile> profile;
	
	public Collection() {
		this.regions = Arrays.asList(new SpawnRegions(), new WarzoneRegions(), new EndRegions());
		this.profile = Maps.newHashMap();
	}
	
	public HashMap<UUID, Profile> getProfile() {
		return profile;
	}
	
	public List<Regions> getRegions() {
		return regions;
	}
}
