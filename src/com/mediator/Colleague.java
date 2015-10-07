package com.mediator;

public abstract class Colleague {

	Mediator mediator;
	static int count;
	int id;
	
	public Colleague(Mediator mediator) {
		
		this.mediator = mediator;
		count++;
		this.id = count;
	}
	
	public abstract void send(String message, int colleagueId);


	public abstract void receieve(String message,int colleagueId);
		
}
