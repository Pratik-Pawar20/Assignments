package com.p1;

import java.util.Comparator;

public class SortSmartphoneBasedOnCostLowToHigh implements Comparator<Smartphone>{

	@Override
	public int compare(Smartphone smartphone1, Smartphone smartphone2) {
		
		return smartphone1.getPrice()-smartphone2.getPrice();
	}

}
