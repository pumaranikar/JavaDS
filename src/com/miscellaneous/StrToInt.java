package com.miscellaneous;

import java.security.InvalidParameterException;

/**
 * @author Pushkar
 * Convert string to integer
 */

public class StrToInt {

	/**
	 * Converts input string to integer.
	 * @param input represents number in string format.
	 */
	public void convertToInt(String input){

	if(input==null || input.isEmpty()){
		System.out.println("Invalid input");
		return;
	}
	int result=0;
	boolean isNegative = false;
	for(int i=0;i<input.length();i++) {
		
		char c = input.charAt(i);
		
		if(i==0 && c=='-') {
			isNegative = true;
			continue;
		}
		if(c - '0' < 0 || c - '0' > 10){
            throw new InvalidParameterException();
        }
		int num = c - '0';
		result = result	* 10 + num;
	}
	if(isNegative) {
		result = result * -1;
	}
	System.out.println("Number :"+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StrToInt strInt = new StrToInt();
	strInt.convertToInt("12345");
		
	}

}
