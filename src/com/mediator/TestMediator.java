package com.mediator;

import java.awt.PageAttributes.MediaType;

public class TestMediator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mediator mediator = new MessageMediator();
		
		Colleague col1 = new ConColleague1(mediator);
		mediator.addColleague(col1);
		Colleague col2 = new ConColleague2(mediator);
		mediator.addColleague(col2);
		
	
		//System.out.println("col1 id " +col1.id + "col2 id " +col2.id );
		
		col1.send("Hi from Colleague 1", col1.id);
		col2.send("Hi from Colleague 2", col2.id);
	}
}
