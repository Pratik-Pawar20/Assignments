package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;





public class FoodApp {

	public static void main(String[] args) {
		
		TreeSet<Food> allFoods = new TreeSet<>();
		
		Food f1 = new Food("Pani Puri", 60, "Veg");
		Food f2 = new Food("Pav Bhaji", 120, "Veg");
		Food f3 = new Food("Chicken Roll", 90, "Non-Veg");
		Food f4 = new Food("Veg Sandwich", 70, "Veg");
		Food f5 = new Food("Chicken Sandwich", 140, "Non-Veg");
		Food f6 = new Food("Tea", 30, "Veg");
		
		allFoods.add(f1);
		allFoods.add(f2);
		allFoods.add(f3);
		allFoods.add(f4);
		allFoods.add(f5);
		allFoods.add(f6);
		
		for (Food food : allFoods) {
			System.out.println(food);
		}
		
		System.out.println();
		System.out.println("********** Food Price (Low to High) **********");
		System.out.println();
		getFoodBasedOnPriceLowToHigh(allFoods);
		
		System.out.println();
		System.out.println("************ Food Price (High to Low)  ***********");
		System.out.println();
		getFoodBasedOnPriceHighToLow(allFoods);
		
		
	}
	
	public static void getFoodBasedOnPriceHighToLow(TreeSet<Food> allFoods) {
		
		//converted set to List
				List<Food> tempList = new ArrayList<>();// or pass as constructor argument
				tempList.addAll(allFoods);
				
				//created Comprator class Object
				SortFoodBasedOnCostHighToLow sortCode = new SortFoodBasedOnCostHighToLow();
				
				Collections.sort(tempList, sortCode);
				
				for (Food food : tempList) {
					System.out.println(food);
				}
	}
	
	public static void getFoodBasedOnPriceLowToHigh(TreeSet<Food> allFoods) {
		
		//converted set to List
				List<Food> tempList = new ArrayList<>();// or pass as constructor argument
				tempList.addAll(allFoods);
				
				//created Comprator class Object
				SortFoodBasedOnCostLowToHigh sortCode = new SortFoodBasedOnCostLowToHigh();
				
				Collections.sort(tempList, sortCode);
				
				for (Food food : tempList) {
					System.out.println(food);
				}
	}


		
		
	}

