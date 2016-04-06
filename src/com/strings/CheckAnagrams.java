package com.strings;

/*
 * Checks if two strings are anagrams of each other
 * It uses counting number of unique characters technique
 */
public class CheckAnagrams {

	
	public boolean isAnagram(String input1, String input2){
		
		if(input1.length()!=input2.length())
			return false;
		
		int[] charCount = new int[256]; 
		int uniqueChar=0, completed=0;
		char[] input1Arr = input1.toCharArray();
		
		for(int i=0;i<input1Arr.length;i++){
			if(charCount[input1Arr[i]] ==0)
				uniqueChar++;
			charCount[input1Arr[i]]++;
		}
		
		char[] input2Arr = input2.toCharArray();
		for(int j=0; j < input2Arr.length; j++){
			
			if(charCount[input2Arr[j]] == 0) 
				return false;
			else {
				charCount[input2Arr[j]]--;
				completed++;
				if(charCount[input2Arr[j]] == 0){
					
					if(completed == uniqueChar){					
						return (j == (input2Arr.length-1)); 
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 ="abcde";
		String input2 ="cdedb";
		CheckAnagrams anagrams = new CheckAnagrams();
		System.out.println(anagrams.isAnagram(input1, input2));
		
	}

}
