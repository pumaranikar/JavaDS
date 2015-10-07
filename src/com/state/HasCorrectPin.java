package com.state;

public class HasCorrectPin implements ATMstate{

	ATMMachine machine;
	
	public HasCorrectPin(ATMMachine machine)
	{
		this.machine = machine;
	}	
	
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Card already inserted");
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Card ejected");
		machine.setState(machine.getejectCardState());
	}

	@Override
	public void insertPin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("Already entered pin");
	}

	@Override
	public void requestCash(int amount) {
		// TODO Auto-generated method stub
		if(amount < machine.initAmount) {
			
			System.out.println("amount withdrawn");
			amount -= machine.initAmount;
			machine.setState(machine.getejectCardState());
		}
		else {
			System.out.println("Not enough balance");
			machine.setState(machine.getejectCardState());
		}
	}

}
