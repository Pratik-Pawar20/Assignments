package com.p1;

import java.util.Comparator;

public class SortSmartphoneBasedOnCostHighToLow implements Comparator<Smartphone>{

	@Override
	public int compare(Smartphone o1, Smartphone o2) {
		
		return o2.getPrice() - o1.getPrice();
	}

}
