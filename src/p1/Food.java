package p1;

import java.util.Objects;

public class Food implements Comparable<Food>{

	private String foodName;
	private int foodPrice;
	private String foodCategory;
	
	public Food() {
		super();
	}

	public Food(String foodName, int foodPrice, String foodCategory) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodCategory = foodCategory;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodCategory=" + foodCategory + "]";
	}

	@Override
	public int hashCode() {
		return foodName.length()+foodPrice*3+3;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Food) {
			Food food = (Food)obj;
			boolean a=food.equals(this.getFoodName());
			boolean b = food.foodPrice==this.foodPrice;
			boolean c = food.foodCategory==this.foodCategory;
			
			
			return a && b && c;
		}
		else {
			return false;
		}
		}
		
	

	@Override
	public int compareTo(Food o) {
		
		return this.getFoodName().compareTo(o.getFoodName());
	}
	
	
}
