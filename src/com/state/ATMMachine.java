package com.state;

public class ATMMachine {

	ATMstate state;
	
	ATMstate hasCard;
	ATMstate noCard;
	ATMstate hasCorrectPin;
	ATMstate outOfMoney;
	
	int initAmount = 2000;
	boolean isPinCorrect = false;
	
	public ATMMachine() {
		
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
	    hasCorrectPin = new HasCorrectPin(this);
		outOfMoney = new OutofMoney(this);
		
		state = noCard; 
	
		if(this.initAmount < 0) {
			state = outOfMoney;
		}
	}
	
	public void setState(ATMstate state)
	{
		this.state = state;
	}
	
	public void insertCard() 
	{
		state.insertCard();
	}
	
	public void insertPin(int pin)
	{
		state.insertPin(pin);
	}
	
	public void ejectCard()
	{
		state.ejectCard();
	}
	public void requestCash(int amount)
	{
		state.requestCash(amount);
	}
	
	public ATMstate getinsertCardState() { return hasCard;}
	public ATMstate getejectCardState() { return noCard;}
	public ATMstate getinsertPinState() { return hasCorrectPin;}
	public ATMstate getNoCashState() { return outOfMoney;}
}
