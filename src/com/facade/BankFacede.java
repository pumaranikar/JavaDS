package com.facade;

public class BankFacede {

	int AccountNumber;
	CheckAccountNumber accountChk;
	CheckBalance balanceChk;
	
	public BankFacede(int AccoutNumber) {
	
		this.AccountNumber = AccoutNumber;
		
		accountChk = new CheckAccountNumber();
		balanceChk = new CheckBalance();
	}
	
	public void withdrawn(int amount)
	{
		if(accountChk.chkAccount(AccountNumber)) {
		
			balanceChk.withdrawn(amount);
		}
	}
	
}
