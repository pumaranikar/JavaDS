package com.strings;


/*
 * Implements function which removes duplicates from string without
 * using additional storage
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abbbbbd";
		RemoveDuplicates rmDuplicates = new RemoveDuplicates();
		System.out.println(rmDuplicates.getUniquechars(input));
	}

}
