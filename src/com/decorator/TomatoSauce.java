package com.decorator;

public class TomatoSauce extends Toppings{

	public TomatoSauce(Piazza piazza) {
		super(piazza);
		// TODO Auto-generated constructor stub
	}

public String getDescription() {
		
		return tempPiazza.getDescription() + " Tomato Sauce added";
	}
	
	public int getCost() {
		
		return tempPiazza.getCost() + 1;
	}
	
	
}
