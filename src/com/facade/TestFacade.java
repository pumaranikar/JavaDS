package com.facade;

public class TestFacade {

	
	public static void main(String[] args){
		
		BankFacede bankFacede = new BankFacede(12345);
		
		bankFacede.withdrawn(500);
		
	}
}
