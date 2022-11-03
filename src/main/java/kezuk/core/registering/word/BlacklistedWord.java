package kezuk.core.registering.word;

import kezuk.core.HCF;
import kezuk.core.registering.Collection;

public class BlacklistedWord {
	
	private Collection collection = HCF.getInstance().getCollection();
	
	public BlacklistedWord() {
		this.collection.getBlacklistedWord().add("juif");
		this.collection.getBlacklistedWord().add("ntm");
		this.collection.getBlacklistedWord().add("hitler");
		this.collection.getBlacklistedWord().add("nazi");
		this.collection.getBlacklistedWord().add("vivitlair");
		this.collection.getBlacklistedWord().add("nique");
	}

}
