package com.arrays;

import java.util.Arrays;

public class DecimalEncoding {

	int[] arr={9,9,9};
	
	public void display()
	{
		System.out.println();
		for(int i=0;i < arr.length;i++ )
		{
			System.out.print("  "+arr[i]);
		}
	}
	
	public void plusOne()
	{
		int carry=0;
		for(int i=(arr.length-1); i > 0 ; i--)
		{
			if(i == (arr.length-1))
			arr[i]++;
			if(arr[i] >=10)
			{
				int temp = arr[i];
				arr[i] = temp%10;
				carry = temp/10;
				arr[i-1] =arr[i-1]+carry;
			}
		}
		if(arr[0] >=10)
		{
			int tempCarry = arr[0];
			arr[0]=0;
			createNew(tempCarry/10);
		}
	}
	
	public void createNew(int lastCarry)
	{
		int[] temp = new int[arr.length+1];
		temp[0] = lastCarry;
		
		for(int i=1;i < arr.length;i++)
		{
			temp[i] = arr[i];
		}
		arr= Arrays.copyOf(temp, temp.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalEncoding dEncode = new DecimalEncoding();
		dEncode.plusOne();
		dEncode.display();
	}

}
