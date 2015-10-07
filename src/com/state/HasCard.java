package com.state;

public class HasCard implements ATMstate{

	ATMMachine machine;
	
	public HasCard(ATMMachine machine)
	{
		this.machine = machine;
	}	
	
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You cannot enter more than one card");
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
		if(pin == 1234) {
			System.out.println("Correct pin entered");
			machine.isPinCorrect = true;
			machine.setState(machine.getinsertPinState());
		}
		else
		{
			System.out.println("Worng pin");
			machine.isPinCorrect = false;
			System.out.println("Card ejected");
			machine.setState(machine.getejectCardState());
		}
	}

	@Override
	public void requestCash(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Cannnot withdrawn cash. Enter pin first");
	}

}
