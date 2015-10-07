package com.state;

public class TestStatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATMMachine machine = new ATMMachine();
		
		machine.insertCard();
		machine.ejectCard();
		
		machine.insertCard();
		machine.insertPin(1234);
		machine.requestCash(1000);
		machine.ejectCard();
		
		machine.ejectCard();
		machine.requestCash(200);
		
	}

}
