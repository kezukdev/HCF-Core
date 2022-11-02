package kezuk.core.region.subregions;

import java.util.List;

import org.bukkit.Location;

import kezuk.core.region.Regions;

public class WarzoneRegions extends Regions {

	private boolean onKoth = false;
	
	@Override
	public String displayName() {
		return "Warzone";
	}

	@Override
	public boolean isBanable() {
		return true;
	}

	@Override
	public List<Location> kothLocations() {
		return null;
	}

	@Override
	public boolean isOnKoth() {
		return this.onKoth;
	}
	
	@Override
	public boolean setKoth(final boolean bool) {
		return this.onKoth = bool;
	}

}
