package p1;

import java.util.Comparator;

public class SortFoodBasedOnCostHighToLow implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		
		return o2.getFoodPrice() - o1.getFoodPrice();
	}

}
