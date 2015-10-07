package com.facade;

public class CheckBalance {

	private int amount;
	
	public CheckBalance() {
		// TODO Auto-generated constructor stub
		amount = 1000;
	}
	
	public boolean withdrawn(int withdraw)
	{
		if(withdraw < amount){
			
			amount -= withdraw;
			System.out.println(" amount withdrawn : "+withdraw);
			System.out.println(" New account balance is :"+ amount);
			return true;
		}
		else
		{
			System.out.println("Not enough balance");
			return false;
		}
	}
	
}
