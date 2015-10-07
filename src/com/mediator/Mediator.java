package com.mediator;

public interface Mediator {
	
	void send(String message, int colleagueId);

	void addColleague(Colleague colleague);
}
