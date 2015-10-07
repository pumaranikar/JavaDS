package com.proxy;

public class TestProxyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATMMachine secureProxy = new ATMProxy(); 
		
		System.out.println(secureProxy.getAmountInfo(123));
		System.out.println(secureProxy.getAccountHolderName(123));
		
	}

}
