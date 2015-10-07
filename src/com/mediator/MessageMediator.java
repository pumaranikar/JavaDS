package com.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MessageMediator implements Mediator{

	Map<Integer,Colleague> cList = new HashMap<>(2);
	
	public void send(String message, int colleagueId) {
		// TODO Auto-generated method stub
		
			for (Map.Entry<Integer, Colleague> entry : cList.entrySet()){
		        int id =  entry.getKey();
		        Colleague c =  entry.getValue();
		        if(id!=colleagueId) {
		        	c.receieve(message, colleagueId);
		        }
		   }
	}
	
	

	
	public void addColleague(Colleague colleague) {
		
		System.out.println(" in add :"+ colleague.id);
		cList.put(colleague.id,colleague);
	}

}
