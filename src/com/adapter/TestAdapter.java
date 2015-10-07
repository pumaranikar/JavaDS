package com.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnemyTank tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		EnemyAdapter adapter = new EnemyAdapter(robot);
		
		tank.driveAttacker();
		tank.fireWeapon();
		
		adapter.driveAttacker();
		adapter.fireWeapon();
	}

}
