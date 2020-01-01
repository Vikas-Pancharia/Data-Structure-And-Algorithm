package com.cg.array;

public class SingleDimentionalArray {

	int arr[] = null;

	// Constructor
	public SingleDimentionalArray(int iSize) {
		arr = new int[iSize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// Traverse
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception ex) {
			System.out.println("Array no longer exists !");
		}
	}

	// Insert value in the Array
	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Sucessfully inserted " + valueToBeInserted + " at location " + location);
			} else {
				System.out.println("This cell is already occupied by another value.");
			}
		} catch (Exception e) {
			System.out.println("Invalid index to access array !");
		}
	}

	public void accessingCell(int cellNumber) {

		try {
			System.out.println(arr[cellNumber]);
		} catch (Exception e) {
			System.out.println("invaild index to access the array!");
		}
	}

	// search for an element in the given Array
	public void searchInAnArray(int valueToSearch) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToSearch) {
				System.out.println("value found !");
				System.out.println("Index of " + valueToSearch + " is: " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found!!");
	}
	
	//Delete value from given Array
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		} catch (Exception e) {
			System.out.println();
			System.out.println("Can't delete the value as cell# "+deleteValueFromThisCell);
		}
	}
}
