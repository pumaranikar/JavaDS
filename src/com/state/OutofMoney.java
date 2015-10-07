package com.state;

public class OutofMoney implements ATMstate{

	ATMMachine machine;
	
	public OutofMoney(ATMMachine machine)
	{
		this.machine = machine;
	}
	
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println(" We don't have money");
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println(" You didn't enter a card");
	}

	@Override
	public void insertPin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("We don't have money");
	}

	@Override
	public void requestCash(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Not enough money");
	}

}
