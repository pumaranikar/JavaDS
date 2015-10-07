package com.decorator;

public class PlainPiazza implements Piazza{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is plain Piazza";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 4;
	}

}
