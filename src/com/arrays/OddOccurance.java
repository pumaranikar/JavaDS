package com.arrays;

/**
 * Given an array where all elements appear even number of times except one. 
 * All repeating occurrences of elements appear in pairs and these pairs are not adjacent 
 * (there cannot be more than two consecutive occurrences of any element). Find the element that appears odd number of times.
 * @author Pushkar
 */
public class OddOccurance {

	/**
	 * 
	 * @param array
	 * @param start
	 * @param end
	 */
	public void oddSearch(int[] array, int start, int end)
	{
		int mid = (start+end)/2;
		
		if(start==end)
		{
			System.out.println("Element with odd occurance "+array[start]);
			return;
		}
		
		if(mid%2==0)
		{
			if(array[mid]==array[mid+1])
				oddSearch(array, mid+2, end);
			else
				oddSearch(array, start, mid-1);
		}
		else
		{
			if(array[mid]==array[mid-1])
				oddSearch(array, mid+1, end);
			else
				oddSearch(array, start, mid-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		int[] array = {1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40, 13, 13};
		OddOccurance oddOcc = new OddOccurance();
		oddOcc.oddSearch(array, 0, array.length-1);
	}

}
