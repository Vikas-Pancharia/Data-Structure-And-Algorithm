package com.cg;

import java.util.Scanner;

/**
 * 
 * @author JBRD
 * Date 25/12/2019
 * Factorial of a non-negative integer n
 * denoted by n!
 * it is a product of all positive integer from 1 to n
 * Example:-
 * 5! = 5*4*3*2*1
 *
 */
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a non-negative nuber which you want to perform Factorial");
		int iNumber = sc.nextInt();
		int calValue = factorial(iNumber);
		System.out.println("Factorial Value is: "+calValue);
		
	}

	private static int factorial(int iNumber) {
		
		if(iNumber < 1)
			return 1;
		return iNumber*factorial(iNumber-1);
		
	}
}
