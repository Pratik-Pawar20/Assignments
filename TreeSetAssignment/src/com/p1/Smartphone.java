package com.p1;

import java.util.Objects;

public class Smartphone implements Comparable<Smartphone>{
	
	private String brandName;
	private String modelName;
	private int price;
	private int ram;
	private int storageMemory;
	private float starRating;
	
	public Smartphone() {
		super();
	}

	public Smartphone(String brandName, String modelName, int price, int ram, int storageMemory, float starRating) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
		this.ram = ram;
		this.storageMemory = storageMemory;
		this.starRating = starRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelname(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorageMemory() {
		return storageMemory;
	}

	public void setStorageMemory(int storageMemory) {
		this.storageMemory = storageMemory;
	}

	public float getStarRating() {
		return starRating;
	}

	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "Smartphone [brandName=" + brandName + ", modelName=" + modelName + ", price=" + price + ", ram=" + ram
				+ ", storageMemory=" + storageMemory + ", starRating=" + starRating + "]";
	}

	@Override
	public int hashCode() {
		return brandName.length()+modelName.length()+price+storageMemory*3+3;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Smartphone) {
			
			Smartphone smartphone = (Smartphone)obj;
			boolean a=smartphone.equals(this.getBrandName());
			boolean b = smartphone.price==this.price;
			boolean c = smartphone.storageMemory==this.storageMemory;
			boolean d = smartphone.modelName.equals(this.getModelName());
			boolean e = smartphone.ram==this.getRam();
			
			return a && b && c && d && e;
		}
		else {
			return false;
		}
		
		
	}

	@Override
	public int compareTo(Smartphone smartphone) {
		
		return this.getBrandName().compareTo(smartphone.getBrandName());
	}
	
	
	
	

}
