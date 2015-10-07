package com;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

	Deque<Float> numStack = new ArrayDeque<Float>();
	Deque<Character> operationStack = new ArrayDeque<Character>();
	float value = 0F;
	boolean isOneNum = false;
	float first, second;
	float result=0;

	public void evaluate(String exp)
	{
		for(int i=0; i < exp.length(); i++)
		{
			if(exp.charAt(i)!='*' && exp.charAt(i)!='/' && exp.charAt(i)!='+' &&
					exp.charAt(i)!='-')
			{
				value = value * 10 + (exp.charAt(i) - '0');

			}
			else if(!isOneNum)
			{
				numStack.push(value);
				value=0F;
				operationStack.push(exp.charAt(i));
				isOneNum = true;
			}
			else
			{
				calculate();
				operationStack.push(exp.charAt(i));
			}
		}
		calculate();
		if((float)Math.floor(result) == result)
		{
			System.out.println((int)result);
		}
		else
		{
			System.out.println(result);
		}
	}

	public void calculate()
	{
		switch(operationStack.pop())
		{
		case '*' :
			first = numStack.pop();
			second = value;
			result = first * second ;
			numStack.push(result);
			value = 0;
			break;
		case '+' :
			first = numStack.pop();
			second = value;
			result = first + second ;
			numStack.push(result);
			value = 0 ;
			break;
		case '-' :
			first = numStack.pop();
			second = value;
			result = first - second ;
			numStack.push(result);
			value = 0;
			break;
		case '/' :
			first = numStack.pop();
			second = value;
			result = first / second ;
			numStack.push(result);
			value = 0;
			break;
		}	
	}
	
	public static void main(String[] args) {

		String exp="5*6/3+1";
		Solution solution = new Solution();
		solution.evaluate(exp);

	}

}
