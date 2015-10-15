package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Find setwise intersection of two sorted arrays
 * @author Pushkar
 *
 */
public class ArrayIntersection {

	List<Integer> output;
	
	public void intersection(int[] input1,int[] input2)
	{
		if(input1==null || input2==null) {
			System.out.println("No intersection found");
			return;
		}
		if(input1.length < 1 || input2.length < 1){
			System.out.println("No intersection found");
			return;
		}
		output = new ArrayList<Integer>();
		
		int len1 = 0;
		int len2 = 0;
		int i=0;
		while(len1 < input1.length && len2 < input2.length)
		{
			if(input1[len1] < input2[len2]) {
				len1++;
			}
			else if(input1[len1] > input2[len2]) {
				len2++;
			}
			else
			{
				output.add(new Integer(input1[len1]));
				len1++;
				len2++;
			}
		}
		if(output.isEmpty()) {
			System.out.println("No intersection found");
		}
		// print output array
		else {
			for(int j=0 ; j < output.size();j++){	
				System.out.print(" "+output.get(j));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input1 = {1,2,3,4,5};
		int[] input2 = {4,5,6,7};
		
		ArrayIntersection arrayIntersection = new ArrayIntersection();
		arrayIntersection.intersection(input1,input2);
	}

}
