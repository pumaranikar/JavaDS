package com.strings;


/*
 * Implements function which removes duplicates from string 
 */
public class RemoveDuplicates {

	
	public String getUniquechars(String input) {
		
		if (input==null || input.isEmpty()){
			return null;
		}
	    
		if(input.length() < 2) {
			return input;
		}
		
		int end=1;
		char[] strArr = input.toCharArray();
		
		for(int i=1;i < strArr.length;i++){
			
			int j;
			for(j=0; j < end; j++) {
			      	if(strArr[j]==strArr[i]) break;
			}
			if(j==end){
				strArr[end] = strArr[i];
				end++;
			}
		}
		return new String(strArr).substring(0,end);
	}
	
	
	public String removeWithStorage(String input) {
		
		if(input==null || input.isEmpty()) {
			return null;
		}
		if(input.length() < 2) {
			return input;
		}
		
		boolean[] check = new boolean[256];
		int end=1;
		char[] strArray = new char[input.length()];
		strArray = input.toCharArray();
		check[strArray[0]] = true;
		
		for(int i=1; i < strArray.length; i++) {
		       	
			     if(!check[strArray[i]]) {
			    	 
			    	 strArray[end] = strArray[i];
			    	 end++;
			    	 check[strArray[i]] = true; 
			     }   
		}
		
		return new String(strArray).substring(0,end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abbbd";
		RemoveDuplicates rmDuplicates = new RemoveDuplicates();
		System.out.println(rmDuplicates.getUniquechars(input));
		
		System.out.println("Using additional storage:" +  rmDuplicates.removeWithStorage(input));
	}

}
