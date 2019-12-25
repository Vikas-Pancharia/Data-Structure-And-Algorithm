package com.cg;

import java.util.Scanner;

/**
 * 
 * @author JBRD
 * @Date 25/12/2019
 * A series of number in which each number is the sum of the two preceding number
 * First 2 numbers by definition are 0 and 1
 * It is always take positive number
 * Example:-
 * 0,1,1,2,3,5,8,13,21,34,55,89,144,...
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number to find the fibonacci series number");
		int iNumber = sc.nextInt();
		int iFibNumber = toCalculateFibonacciNumber(iNumber);
		if(iFibNumber > 0)
			System.out.println("Entered "+iNumber+" th Fibonnaci Number: "+iFibNumber);
		else
			System.out.println("Please enter positive integer number");
	}

	private static int toCalculateFibonacciNumber(int iNumber) {
		
		if(iNumber < 1)
			return -1;
		else if(iNumber == 1 || iNumber ==2) 
			return iNumber-1;
		else
			return toCalculateFibonacciNumber(iNumber-1) + toCalculateFibonacciNumber(iNumber-2);
	}
}
