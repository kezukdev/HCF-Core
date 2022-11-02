package kezuk.core.registering;

import java.util.HashMap;
import java.util.UUID;

import kezuk.core.player.Profile;
import net.minecraft.util.com.google.common.collect.Maps;

public class Collection {
	
	private HashMap<UUID, Profile> profile;
	
	public Collection() {
		this.profile = Maps.newHashMap();
	}
	
	public void getProfileByUUID(final UUID uuid) {
		this.profile.get(uuid);
	}
}
