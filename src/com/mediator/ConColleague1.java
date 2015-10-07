package com.mediator;

public class ConColleague1 extends Colleague{

	public ConColleague1(Mediator mediator) {
		super(mediator);
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
