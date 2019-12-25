package com.cg;

import java.util.Scanner;

/**
 * 
 * @author JBRD
 * @Date 25/12/2019 Find out the biggest element from the given array by using
 *       Recursion.
 *
 */
public class FindBiggestElementInArrayRecursion {

	static int hightest = Integer.MIN_VALUE;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int iSize = sc.nextInt();
		int arr[] = new int[iSize];
		for (int iCount = 0; iCount < iSize; iCount++) {

			System.out.print((iCount + 1) + " element is: ");
			arr[iCount] = sc.nextInt();
		}

		int iBigElement = findBiggestElement(arr, iSize - 1);
		System.out.println("Biggest Element to the given array is: " + iBigElement);
	}

	private static int findBiggestElement(int[] arr, int iSize) {

		if (iSize < 0)
			return hightest;
		else if (arr[iSize] > hightest)
			hightest = arr[iSize];
		return findBiggestElement(arr, iSize - 1);
	}
}
