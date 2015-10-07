package com.decorator;

public abstract class Toppings implements Piazza{
	
	Piazza tempPiazza;

	public Toppings(Piazza piazza) {
	
		tempPiazza =piazza;
	}
	
	public String getDescription() {
		
		return tempPiazza.getDescription();
	}
	
	public int getCost() {
		
		return tempPiazza.getCost();
	}
}
