package kezuk.core.player;

import java.util.UUID;

import kezuk.core.utils.ProfileUtils;

public class Profile {
	
	private UUID uuid;
	
	public Profile(final UUID uuid) {
		this.uuid = uuid;
		ProfileUtils.addProfileByUUID(uuid, this);
	}

}
