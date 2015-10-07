package com.state;

public interface ATMstate {

	void insertCard();
	void ejectCard();
	void insertPin(int pin);
	void requestCash(int amount);
}
