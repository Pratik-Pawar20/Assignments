package p1;

import java.util.Comparator;

public class SortFoodBasedOnCostLowToHigh implements Comparator<Food>{

	@Override
	public int compare(Food food1, Food food2) {
		
		return food1.getFoodPrice()-food2.getFoodPrice();
	}

}
