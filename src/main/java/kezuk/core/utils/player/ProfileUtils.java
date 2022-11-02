package kezuk.core.utils.player;

import java.util.UUID;

import kezuk.core.HCF;
import kezuk.core.player.Profile;
import kezuk.core.registering.Collection;

public class ProfileUtils {
	
	private static Collection collection = HCF.getInstance().getCollection();
	
	public static void addProfileByUUID(final UUID uuid, final Profile profile) {
		collection.getProfile().putIfAbsent(uuid, profile);
	}
	
	public static void getProfileByUUID(final UUID uuid) {
		collection.getProfile().get(uuid);
	}
	
	public static void removeProfileByUUID(final UUID uuid, final Profile profile) {
		collection.getProfile().remove(uuid, profile);
	}

}
