package com.facade;

public class CheckAccountNumber {
	
	private int accNumber;

	public CheckAccountNumber() {
		// TODO Auto-generated constructor stub
		accNumber = 12345;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	
	public boolean chkAccount(int accountNum) {
		
		if(accountNum == accNumber) {
			return true;
		}
		return false;
	}
}
