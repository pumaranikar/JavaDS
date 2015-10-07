package com.mediator;

public class ConColleague2 extends Colleague{

	public ConColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void send(String message, int colleagueId) {
		// TODO Auto-generated method stub
		mediator.send(message, id);
	}

	@Override
	public void receieve(String message, int colleagueId) {
		// TODO Auto-generated method stub
		System.out.println(colleagueId + " says :"+message);
	}

}
