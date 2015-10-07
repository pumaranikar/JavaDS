package com.arrays;

/**
 * Count frequencies of all elements in array in O(1) extra space and O(n) time
 * @author Pushkar
 *
 */
public class CountFrequency {

	
	public void countElements(int[] array)
	{
		int n= array.length;
		int i = 0;
		
		while(i<n)
		{
			 if(array[i] <= 0)
			 {
				 i++;
				 continue;
			 }
			 
			 int indexValue = array[i]-1;
			 
			 if(array[indexValue] > 0)
			 {
				 array[i] = array[indexValue];
				 array[indexValue] = -1;
			 }
			 else
			 {
				 array[indexValue] -= 1;
				 array[i] = 0;
				 i++;
			 }
		}
		
		for(int j=0 ; j< array.length;j++)
		{
			System.out.print(" "+Math.abs(array[j]));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {2, 3, 3, 2, 5};
		CountFrequency cntFrq = new CountFrequency();
		cntFrq.countElements(array);
	}
	
}
