package com.proxy;

public class ATMMachineImpl implements ATMMachine{

	int amount = 2000;
	
	@Override
	public int getAmountInfo(int AccNo) {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public String getAccountHolderName(int AccNo) {
		// TODO Auto-generated method stub
		return "Pushkar";
	}
	
	public void setAmount(int amt) {
		
		this.amount = amt;
	}
}
