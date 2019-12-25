package com.cg;

import java.util.Scanner;

/**
 * 
 * @author JBRD
 * @Date 25/12/2019 Find out the biggest element from the given array.
 *
 */
public class FindBiggestElementInArrayIterative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[23];
		System.out.println("Enter the size of array");
		int iSize = sc.nextInt();
		for (int iCount = 0; iCount < iSize; iCount++) {

			System.out.print((iCount+1)+" element is: ");
			arr[iCount] = sc.nextInt();
		}

		int iBigElement = findBiggestElement(arr);
		System.out.println("Biggest Element to the given array is: " + iBigElement);
	}

	private static int findBiggestElement(int[] arr) {

		int iBiggestElement = arr[0];
		for (int iCount = 1; iCount < arr.length - 1; iCount++) {

			if (iBiggestElement < arr[iCount]) {
				iBiggestElement = arr[iCount];
			}
		}
		return iBiggestElement;
	}

}
