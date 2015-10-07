package com.state;

public class NoCard implements ATMstate {

ATMMachine machine;
	
	public NoCard(ATMMachine machine)
	{
		this.machine = machine;
	}
	
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Card Inserted");
		machine.setState(machine.getinsertCardState());
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Error !!! No card in the System");
	}

	@Override
	public void insertPin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("No card in the system");
	}

	@Override
	public void requestCash(int amount) {
		// TODO Auto-generated method stub
		System.out.println("No card in the system");
	}

}
