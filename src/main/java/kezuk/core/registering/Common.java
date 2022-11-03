package kezuk.core.registering;

import kezuk.core.HCF;
import kezuk.core.command.SelectorCommand;

public class Common {
	
	private HCF plugin = HCF.getInstance();
	
	public Common() {
		this.registerCommand();
	}

	private void registerCommand() {
		plugin.getCommand("selector").setExecutor(new SelectorCommand());
	}

}
