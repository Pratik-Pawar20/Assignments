package com.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SmartphoneApp {

	public static void main(String[] args) {
		
		TreeSet<Smartphone> allSmartphones = new TreeSet<>();
		
		Smartphone S1 = new Smartphone("Samsung", "S23 Ultra", 79000, 12, 256, 4.6f);
		Smartphone S2 = new Smartphone("Apple", "IPhone 13", 65000, 8, 128, 4.3f);
		Smartphone S3 = new Smartphone("OnePlus", "OnePlus Nord 3", 35000, 8, 256, 3.3f);
		Smartphone S4 = new Smartphone("Samsung", "A53 Plus", 25000, 12, 64, 4.1f);
		Smartphone S5 = new Smartphone("Redmi", "Note 12", 12000, 4, 64, 2.6f);
		Smartphone S6 = new Smartphone("Apple", "IPhone 15", 90000, 12, 556, 5.0f);
		
		allSmartphones.add(S1);
		allSmartphones.add(S2);
		allSmartphones.add(S3);
		allSmartphones.add(S4);
		allSmartphones.add(S5);
		allSmartphones.add(S6);
		
		for (Smartphone smartphone : allSmartphones) {
			
			System.out.println(smartphone);
		}
		System.out.println();
		System.out.println("********** Smartphones (Low to High) **********");
		System.out.println();
		getSmartphonesBasedOnPriceLowToHigh(allSmartphones);
		
		System.out.println();
		System.out.println("************ Smartphones (High to Low)  ***********");
		System.out.println();
		getSmartphonesBasedOnPriceHighToLow(allSmartphones);
		
		
	}
	
	public static void getSmartphonesBasedOnPriceHighToLow(TreeSet<Smartphone> allSmartphones) {
		
		//converted set to List
				List<Smartphone> tempList = new ArrayList<>();// or pass as constructor argument
				tempList.addAll(allSmartphones);
				
				//created Comprator class Object
				SortSmartphoneBasedOnCostHighToLow sortCode = new SortSmartphoneBasedOnCostHighToLow();
				
				Collections.sort(tempList, sortCode);
				
				for (Smartphone smartphone : tempList) {
					System.out.println(smartphone);
				}
	}
	
	public static void getSmartphonesBasedOnPriceLowToHigh(TreeSet<Smartphone> allSmartphones) {
		
		//converted set to List
				List<Smartphone> tempList = new ArrayList<>();// or pass as constructor argument
				tempList.addAll(allSmartphones);
				
				//created Comprator class Object
				SortSmartphoneBasedOnCostLowToHigh sortCode = new SortSmartphoneBasedOnCostLowToHigh();
				
				Collections.sort(tempList, sortCode);
				
				for (Smartphone smartphone : tempList) {
					System.out.println(smartphone);
				}
	}
}
