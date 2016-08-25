package com;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class Test {

	public int countVowelsRegex(String str) {
        int count = 0;
		
        if (str.length() > 0) {
                // Create a pattern that detects vowels.
                Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
                Matcher vowelMatcher = vowelPattern.matcher(str);

                // Look for the next match and if found, add to count and repeat.
                while (vowelMatcher.find()) 
                        count++;
		}
		
		return count;
}

	
	void printRepeatingEven(int arr[], int n)
	{
	    long  _xor = 0L;
	    long pos;
	 
	    // do for each element of array
	    for( int i = 0; i < n; ++i)
	    {
	        // right pos 1 by value of current element
	        pos = 1 << arr[i];
	 
	        // Toggle the bit everytime element gets repeated
	        _xor ^= pos;
	    }
	 
	    // Traverse array again and use _xor to find even
	    // occuring elements
	    for (int i = 0; i < n; ++i)
	    {
	        // right shift 1 by value of current element
	        pos = 1 << arr[i];
	 
	        // Each 0 in _xor represents an even occurrence
	        if (!((pos & _xor) > 0))
	        {
	            // print the even occurring numbers
	           System.out.println(arr[i]);
	 
	            // set bit as 1 to avoid printing duplicates
	            _xor ^= pos;
	        }
	    }
	}

	public static void main(String[] args)
	{
//		String s1="abc";
//		String s2="def";
//		String s3=s1.concat(s2.toUpperCase());
//	//	StringBuffer str = new StringBuffer();
//	
//		//System.out.println(s1+s2+s3);
//		
		int[] arr={1,1,2};
		Test test = new Test();
		test.printRepeatingEven(arr,3);
		
//		Set<Short> set = new HashSet<>();
//		
//		for(short i=0; i<=50;i++) {
//			set.add(i);
//			set.remove(i-1);
//		}
//		System.out.println("set size :"+set.size());
	}
}
