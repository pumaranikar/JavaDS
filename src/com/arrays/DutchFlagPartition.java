package com.arrays;

public class DutchFlagPartition {

	
	public int[] rearrange(int pivot, int[] arr)
	{
		int index = pivot;
		int small=0,equal=0, large = arr.length-1;
		
		while(equal <= large)
		{
			if(arr[equal] < index)
			{
				//swap a[small] and a[equal]
				swap(small++,equal++,arr);
			}
			else if(arr[equal]==index) {
				equal++;
			}
			else {
				//swap a[equal] and a[large] - decrement only large
				swap(equal,large--,arr);
			}
		}
		return arr;
	}
	
	public void display(int[] arr)
	{
		System.out.println();
		for(int i=0;i < arr.length;i++ )
		{
			System.out.print("  "+arr[i]);
		}
	}
	
	public void swap(int a, int b, int[] arr)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DutchFlagPartition partition = new DutchFlagPartition();
		int[] arr={2,4,3,3,5,2,7,6};
		int[] result=partition.rearrange(3, arr);
		partition.display(result);
	}

}
