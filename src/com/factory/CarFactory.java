package com.factory;

public class CarFactory {

	
	public Cars makeCar(String type) {
		
		if(type.equalsIgnoreCase("SUV")){
			
			return new SUV();
		}
		else if(type.equalsIgnoreCase("Sedan")){
			
			return new Sedan();
		}
		else
		return null;
	}

}
