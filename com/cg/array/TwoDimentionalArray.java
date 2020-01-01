package com.cg.array;

public class TwoDimentionalArray {

	int arr[][] = null;

	// Constructor
	public TwoDimentionalArray(int numberOfRows, int numberOfColumns) {

		this.arr = new int[numberOfColumns][numberOfColumns];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	// Traverse the array
	public void traverseArray() {

		try {
			System.out.println("Printing the array now...");
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println("\n");
			}
		} catch (Exception e) {
			System.out.println("Array does not exists");
		}
	}

	// Inserting value in the Array
	public void insertValueInTheArray(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Successfully inserted " + value + " in the array");
			} else {
				System.out.println("This cell is already occupied by another value");
			}
		} catch (Exception e) {
			System.out.println("Invaild index to access array !");
		}
	}

	// Accessing Single value from given array
	public void accessingCell(int row, int col) {
		System.out.println("\nAccessing Row#" + row + ", col#" + col);
		try {
			System.out.println("Cell value is: " + arr[row][col]);
		} catch (Exception e) {
			System.out.println("Invaild index to access array !");
		}
	}

	// Searching a single value from the Array
	public void searchingSingleValue(int value) {
		System.out.println("\nSearching value " + value + " in the array");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] == value) {
					System.out.println("Value is found at location  Row#" + row + " ,Col#" + col + "\n\n");
					return;
				}
			}
		}
		System.out.println("Value id not found in Array\n");
	}

	// Deleting a value from Array
	public void deleteValueFromArray(int deleteValueFromThisRow, int deleteValueFromThisCol) {
		System.out.println(
				"Deleting value from Row#" + deleteValueFromThisRow + " & Col#" + deleteValueFromThisCol + "...");
		try {
			System.out.println("Successfully deleted: " + arr[deleteValueFromThisRow][deleteValueFromThisCol]);
			arr[deleteValueFromThisRow][deleteValueFromThisCol] = Integer.MIN_VALUE;
		} catch (Exception e) {
			System.out.println();
			System.out.println("Can't delete the value as cell# provided is not in the range of array !");
		}
	}
	
	//Delete the entire Array
	public void deleteThisArray() {
		arr=null;
		System.out.println("Array has been successfully deleted");
	}
}
