package kezuk.core.region;

import java.util.List;

import org.bukkit.Location;

import kezuk.core.HCF;

public abstract class Regions {
	
	public abstract String displayName();
	public abstract boolean isBanable();
	public abstract List<Location> locations();
	public abstract List<Location> kothLocations();
	public abstract boolean isOnKoth();
	public abstract boolean setKoth(boolean bool);
	
    public static Regions getRegionsByName(final String displayName) {
        return HCF.getInstance().getCollection().getRegions().stream().filter(regions -> regions.displayName().equals(displayName)).findFirst().orElse(null);
    }

}
