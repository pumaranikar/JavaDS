package com.arrays;


/**
 * Largest sum contiguous subarray
 * @author Pushkar
 *
 */
public class MaxSubArraySum {

	
	public void maxSum(int[] input)
	{
		if(input==null) {
			return;
		}
		if(input.length < 1) {
			return;
		}
		
		int sum =0, maxsum=0;
		int start=0, end=0 , startTemp=0;
		
		for(int i=0; i< input.length; i++) {
			
			if(input[i] + sum > 0) {
				sum += input[i];
			}
			else if(input[i]+sum < 0) {
				sum = 0;
				startTemp =i+1;
			}
			if (sum > maxsum) {
				maxsum =sum;
				start = startTemp;
				end = i;
			}
		}
		System.out.println("Maximum sum :"+maxsum);
		System.out.println("start index is : "+start + " end index is :"+end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		MaxSubArraySum subArray = new MaxSubArraySum();
		subArray.maxSum(input);
	}

}
