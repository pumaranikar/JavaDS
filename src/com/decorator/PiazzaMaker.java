package com.decorator;

public class PiazzaMaker {
	
	
	public static void main(String[] args) {
	
		Piazza plain = new TomatoSauce(new PlainPiazza());
		
		System.out.println(plain.getDescription());
		System.out.println(plain.getCost());
	}

}
