package com.proxy;

public class ATMProxy implements ATMMachine{

	@Override
	public int getAmountInfo(int AccNo) {
		
		ATMMachineImpl machineImpl = new ATMMachineImpl();
		
		return machineImpl.getAmountInfo(AccNo);
	}

	@Override
	public String getAccountHolderName(int AccNo) {
		// TODO Auto-generated method stub
		ATMMachineImpl machineImpl = new ATMMachineImpl();
		
		return machineImpl.getAccountHolderName(AccNo);
	}	
}
