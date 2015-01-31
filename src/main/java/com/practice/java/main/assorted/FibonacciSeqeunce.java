package com.practice.java.main.assorted;

public class FibonacciSeqeunce {
	private static int index = 0;
	private static int stoppingPoint = 10;
	static int first=0,second=1,sum;
	public static void fibonacciIterator(int stoppingPoint) {
		//Fn = Fn-1 + Fn-2
		//0, 1, 1, 2 ,3, 5, 8, ..
		int oldOldValue,oldValue, newValue ;
		oldOldValue = newValue = 0;
		oldValue =  1;
		for(int index = 0 ; index <stoppingPoint ; index++ )
		{
			System.out.println("index: " + index + " -> " + newValue);
			newValue = oldValue + oldOldValue;
			oldOldValue = oldValue;
			oldValue = newValue;
			
		}
	}
	
	public static void fibonacciRecursion(int end)
	{
		index = 0;
		stoppingPoint  = end;
		int n1 = 0;  
		int n2 = 1;  
		System.out.println("index: " + index + " -> " +n1);  
		fibonacciRec(n1, n2);
	}	
	private static void fibonacciRec(int n1, int n2)  
	{  
		System.out.println("index: " + index + " -> " + n2);
		// make sure we have set an ending point so this Java recursion  
		// doesn't go on forever.  
		if (index == stoppingPoint)  
			return;  
    
		// make sure we increment our index so we make progress  
		// toward the end.  
		index++;  
    
		fibonacciRec(n2, n1+n2);
	}
	
	public static void printFibonacciReg(int n) {

	    if(n>0){
	         sum = first + second;
	         first = second;
	         second = sum;
	         //printf("%ld ",sum);
	         System.out.println("index: " + n + " -> " + sum);
	         printFibonacciReg(n-1);
	    }
	}
	public static void printFibonacci(int n){

	    int first=0,second=1,sum;

	    while(n>0){
	         sum = first + second;
	         first = second;
	         second = sum;
	         System.out.println("index: " + n + " -> " + sum);
	         n--;
	    }
	}
}
