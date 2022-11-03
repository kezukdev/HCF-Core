package kezuk.core.player;

import java.util.UUID;

import kezuk.core.utils.player.ProfileUtils;

public class Profile {
	
	public Profile(final UUID uuid) {
		ProfileUtils.addProfileByUUID(uuid, this);
	}
}
