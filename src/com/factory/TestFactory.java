package com.factory;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = new CarFactory();
		
		Cars car = factory.makeCar("sedan");
		System.out.println(" Name : "+ car.getName() + " color :" + car.getColor());
		
		Cars newCar = factory.makeCar("SUV");
		System.out.println(" Name : "+ newCar.getName() + " color :" + newCar.getColor());		
	}

}
