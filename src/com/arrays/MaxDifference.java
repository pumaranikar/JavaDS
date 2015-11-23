package com.arrays;


/**
 * @author Pushkar
 * Maximum difference between two elements such that larger element appears after the smaller number
 */
public class MaxDifference {

	
	public void maxDiff(int[] input)
	{
		if(input == null || input.length < 1)
		{
			System.out.println("No elements in array");
			return;
		}
		int max_diff = input[1] - input[0];
		int min_element = input[0];
		
		for(int i=1; i < input.length ; i++) {
			
			if((input[i] - min_element) > max_diff) {
				max_diff = input[i] - min_element;
			}
			if(input[i] < min_element) {
				min_element = input[i];
			}
		}
		
		System.err.println("Maximum difference is :"+max_diff);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {1, 2, 6, 80, 100};
		
		MaxDifference diff = new MaxDifference();
		diff.maxDiff(input);
		
	}

}
