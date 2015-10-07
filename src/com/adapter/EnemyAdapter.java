package com.adapter;

public class EnemyAdapter implements EnemyAttacker {

	EnemyRobot robot;
	
	public EnemyAdapter(EnemyRobot newRobot) {
		robot = newRobot;
	}
	
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		robot.fire();
	}

	@Override
	public void driveAttacker() {
		// TODO Auto-generated method stub
		robot.moveForward();
	}

	
	
}
