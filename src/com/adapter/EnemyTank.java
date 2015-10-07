package com.adapter;

public class EnemyTank implements EnemyAttacker{

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		System.out.println("Tank fired");
	}

	@Override
	public void driveAttacker() {
		// TODO Auto-generated method stub
		System.out.println("Driving tank");
	}
	
}
